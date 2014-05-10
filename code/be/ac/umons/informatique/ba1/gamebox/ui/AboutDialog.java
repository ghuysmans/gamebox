package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
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
	
	private class MyPanel extends JPanel implements MouseListener {
		private double angle = 0;
		
		public MyPanel() throws Exception {
			addMouseListener(this);
		}

		/**
		 * Enables anti-aliasing when drawing on g
		 * @param g Graphics2D object
		 */
		private void enableAntiAliasing(Graphics2D g) {
			RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	        g.addRenderingHints(rh);
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
			enableAntiAliasing(graphics);
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
			enableAntiAliasing(g2d);
			//FIXME display each ring
			drawDisk(g2d, 100, angle);
			drawDisk(g2d, 50, 0); 
		}
		
		/**
		 * Handles clicks and detects "victory"
		 * @param e MouseEvent
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
			double delta = (e.getButton()==MouseEvent.BUTTON1 ? 1 : -1) * Math.toRadians(ANGLE_STEP);
			//FIXME Mathieu, you can do it!
			if (e.isShiftDown()) {
				//rotate the whole disk
				//TODO
			}
			else {
				//rotate the selected ring
				angle += delta;
			}
			//redraw
			repaint();
		}

		@Override public void mouseEntered(MouseEvent arg0) {}
		@Override public void mouseExited(MouseEvent arg0) {}
		@Override public void mousePressed(MouseEvent arg0) {}
		@Override public void mouseReleased(MouseEvent arg0) {}
	}
	
	/**
	 * Preloads the image (stored once in memory) and keeps its size
	 * @param parent Parent frame
	 * @param modal  Modal?
	 * @throws Exception If the image can't be loaded
	 */
	public AboutDialog(JFrame parent, boolean modal) throws Exception {
		super(parent, "À propos de...", modal);
		setLocationRelativeTo(parent);
		setResizable(false);
		
		//Load the original image (to be clipped...)
		original = ImageIO.read(getClass().getResourceAsStream("/res/about.png"));
		//Store the frequently used size (it's a square)
		original_s = original.getWidth();
		original_hs = original_s>>1;
		setSize(original_s, original_s); //FIXME take window's borders into account?
		//Use it!
		setContentPane(new MyPanel());
		
		setVisible(true);
	}

}
