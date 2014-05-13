package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

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

	private static final int ANGLE_STEP = 30;
	private final BufferedImage original;
	private final int original_s, original_hs;
	
	
	/**
	 * Preloads the image (stored once in memory) and keeps its size
	 * @param parent Parent frame
	 * @param modal  Modal?
	 * @throws Exception If the image can't be loaded
	 */
	public AboutDialog(JFrame parent, boolean modal) throws Exception {
		super(parent, "À propos de...", modal);
		setResizable(false);
		
		//Load the original image (to be clipped...)
		original = ImageIO.read(getClass().getResourceAsStream("/res/about.png"));
		//Store the frequently used size (it's a square)
		original_s = original.getWidth();
		original_hs = original_s>>1;
		//TODO find a more reliable method to compute an offset
		setSize(original_s+10, original_s+20);
		//Use it!
		setContentPane(new MyPanel());
		
		setLocationRelativeTo(parent);
		setVisible(true);
	}
	
	
	
	private class MyPanel extends JPanel implements MouseListener {
		
		private double angle = 0;
		//FIXME refactor this shit a modular way!
		private double angle1 = 0;
		private double angle2 = 0;
		private double angle3 = 0;
		private double angle4 = 0;
		private double angle5 = 0;
		
		
		public MyPanel() throws Exception {
			addMouseListener(this);
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
			super.paintComponent(g); //background color
			Graphics2D g2d = (Graphics2D)g;
			Main.enableAntiAliasing(g2d);
			//FIXME display each ring
			drawDisk(g2d, 175, angle);
			drawDisk(g2d, 175, angle5);
			drawDisk(g2d, 150, angle4);
			drawDisk(g2d, 125, angle3);
			drawDisk(g2d, 100, angle2);
			drawDisk(g2d, 75, angle1);
			drawDisk(g2d, 50, 0); 
		}
	
		/**
		 * Handles clicks and detects "victory"
		 * @param e MouseEvent
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
			double step = (e. getButton()==MouseEvent.BUTTON1 ? 1 : -1) * Math.toRadians(ANGLE_STEP);
			if (e.isShiftDown()) {
				//rotate the whole disk
				angle += step;
			}
			else {
				//rotate the selected ring
				Point target = e.getPoint();
				System.out.println(target); //FIXME debug
				//FIXME identify the clicked ring
				//FIXME modify its angle
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
