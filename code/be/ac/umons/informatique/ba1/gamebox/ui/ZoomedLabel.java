package be.ac.umons.informatique.ba1.gamebox.ui;

import javax.swing.JLabel;

/**
 * Label with a zoom feature (applied to the Font)
 */

@SuppressWarnings("serial")
public class ZoomedLabel extends JLabel {

	public ZoomedLabel(String txt, float zoom) {
		super(txt);
		setFont(getFont().deriveFont(getFont().getSize2D() * zoom));
	}

}
