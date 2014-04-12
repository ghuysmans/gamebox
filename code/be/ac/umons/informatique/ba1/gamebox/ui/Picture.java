package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Picture extends JLabel {

	protected int x, y;
	
	public Picture(String name, int width, int height) {
		super();
		try {
			File file = new File(getClass().getResource("/res/"+name+".png").toURI());
			BufferedImage image = ImageIO.read(file);
			setIcon(new ImageIcon(image));
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
