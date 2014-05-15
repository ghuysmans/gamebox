package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Mini-game consisting of concentric circles rotated using the mouse;
 * their directions are randomized on the JDialog's opening. 
 */

@SuppressWarnings("serial")
class AboutDialog extends JDialog {

	/**
	 * Angular steps count
	 */
	private final int stp;
	
	/**
	 * Rings' thickness
	 */
	private final int tks;
	
	/**
	 * Original image
	 */
	private final BufferedImage original;
	
	/**
	 * Original image's dimension and half-dimension
	 */
	private final int original_s, original_hs;
	
	
	/**
	 * Preloads the image (stored once in memory) and keeps its size
	 * @param parent    Parent frame
	 * @param step      Angular steps count
	 * @param thickness Rings' thickness
	 * @throws Exception If the image can't be loaded
	 */
	public AboutDialog(JFrame parent, int step, int thickness) throws Exception {
		super(parent, "À propos de...", true);
		setResizable(false);
		//save the contructor's values
		stp = step;
		tks = thickness;
		//Load the original image (to be clipped...)
		original = ImageIO.read(getClass().getResourceAsStream("/res/aboutShuffled.png"));
		//Store the frequently used size (it's a square)
		original_s = original.getWidth();
		original_hs = original_s>>1;
		//TODO find a more reliable method to compute an offset
		setSize(original_s+10, original_s+20);
		//Use it!
		setContentPane(new GamePanel());
		
		setLocationRelativeTo(parent);
		setVisible(true);
	}
	
	
	/**
	 * Panel which actually makes the mini-game working
	 */
	private class GamePanel extends JPanel implements MouseListener {
		
		/**
		 * Angular offsets
		 */
		private int offsets[];
		
		/**
		 * Has the user ever clicked on the panel?
		 */
		private boolean firstClick = true;
		
		
		public GamePanel() throws Exception {
			addMouseListener(this);	
			offsets = new int[original_hs/tks];
		}

		/**
		 * Draws a disk from {@link AboutDialog#original}
		 * @param dest   Destination surface
		 * @param radius Disk radius
		 * @param angle  Angle offset (clockwise)
		 */
		private void drawDisk(Graphics2D dest, int radius, double angle) {
			//Image to be created; same width/height
			BufferedImage newImage = new BufferedImage(original_s, original_s, BufferedImage.TYPE_INT_ARGB);
			//Get a handle to an object for manipulating newImage
			Graphics2D graphics = (Graphics2D)newImage.getGraphics();
			Main.enableAntiAliasing(graphics);
			//Use a circle as clipping shape
			int start=original_hs-radius, hr=radius<<1;
			graphics.setClip(new Ellipse2D.Float(start, start, hr, hr));
			//Rotate from the middle
			graphics.rotate(angle, original_hs, original_hs);
			//Copy oldImage to newImage (applying transformations)
			graphics.drawImage(original, 0, 0, original_s, original_s, null);
			//Copy newImage to dest
			dest.drawImage(newImage, 0, 0, original_s, original_s, null);
		}
		
		/**
		 * Paints rings
		 */
		@Override
		protected void paintComponent(Graphics g) {
			if (hasWon() && !firstClick) {
				try {
					BufferedImage bim = ImageIO.read(getClass().getResourceAsStream("/res/about.png"));
					g.drawImage(bim, 0, 0, bim.getWidth(), bim.getHeight(), null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else {
				super.paintComponent(g); //background color
				Graphics2D g2d = (Graphics2D)g;
				Main.enableAntiAliasing(g2d);
				double angle_step = (Math.PI*2)/stp;
				for (int i=offsets.length-1; i>=0; i--)
					drawDisk(g2d, tks*(i+1), angle_step*offsets[i]);
			}
		}
		
		/**
		 * Checks whether all rings have a null offset 
		 * @return true means "won"
		 */
		private boolean hasWon() {
			for (int k=0; k<offsets.length; k++) {
				if (offsets[k] != 0)
					return false;		
			}
			return true;	
		}
		
		/**
		 * Handles clicks and detects "victory"
		 * @param e MouseEvent
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
			if (firstClick) {
				for (int k=0; k<offsets.length; k++)
					offsets[k] = (int)(Math.random()*offsets.length);
				firstClick = false;
			}
			else if (!hasWon()) {
				int step = (e. getButton()==MouseEvent.BUTTON1 ? 1 : -1);
				if (e.isShiftDown()) {
					//rotate the whole disk
					for (int i=0; i<offsets.length; i++)
						offsets[i] = (offsets[i] + step) % stp;
				}
				else {
					//rotate the selected ring
					Point target = e.getPoint();
					int id = ((int)target.distance(getWidth()/2, getHeight()/2)) / tks;
					if (id<offsets.length)
						offsets[id] = (offsets[id] + step) % stp;
				}
			}	
			//redraw
			repaint();
		}

		@Override public void mouseEntered(MouseEvent arg0) {}
		@Override public void mouseExited(MouseEvent arg0) {}
		@Override public void mousePressed(MouseEvent arg0) {}
		@Override public void mouseReleased(MouseEvent arg0) {}
	}
	
}
