package be.ac.umons.informatique.ba1.gamebox.ui;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ZoomedLabel extends JLabel {

	public ZoomedLabel(String txt, float zoom) {
		super(txt);
		setFont(getFont().deriveFont(getFont().getSize2D() * zoom));
	}

}
