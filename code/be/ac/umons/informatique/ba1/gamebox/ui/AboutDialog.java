package be.ac.umons.informatique.ba1.gamebox.ui;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * Mini-game consisting of squares to rotate with the mouse;
 * their directions are randomized on the JDialog's opening.
 */

@SuppressWarnings("serial")
class AboutDialog extends JDialog {
	
	//TODO "Allez, Mathieu, vas-y !"
	
	public AboutDialog(JFrame parent, boolean modal) {
		super(parent, "À propos de...", modal);
		setSize(400, 400);
		setLocationRelativeTo(parent);
		setResizable(false);
		setVisible(true);
	}

}
