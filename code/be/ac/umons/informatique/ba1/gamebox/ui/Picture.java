package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Color;
import java.awt.Dimension;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Picture object to be integrated in a JPanel.
 * @see AchievementsDialog
 */

@SuppressWarnings("serial")
public class Picture extends JLabel {

	protected int x, y;
	
	public Picture(String name, int width, int height) {
		super();
		try {
			setIcon(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/res/"+name+".png"))));
		} catch (Exception e) {
			setBackground(Color.MAGENTA);
			setOpaque(true);
			setText("ERROR");
			setHorizontalAlignment(JLabel.CENTER);
		}
		setSize(x=width, y=height);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(x, y);
	}

}
