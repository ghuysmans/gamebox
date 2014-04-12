package be.ac.umons.informatique.ba1.gamebox.ui;

import javax.swing.JDialog;
import javax.swing.JFrame;

@SuppressWarnings("serial")
class AboutDialog extends JDialog {
	public AboutDialog(JFrame parent, boolean modal) {
		super(parent, "À propos de...", modal);
		setSize(400, 400);
		setLocationRelativeTo(parent);
		setResizable(false);
		setVisible(true);
	}

}
