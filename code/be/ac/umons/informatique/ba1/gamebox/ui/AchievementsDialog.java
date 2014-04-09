package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Dialog;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JFrame;

import be.ac.umons.informatique.ba1.gamebox.core.Player;

public class AchievementsDialog extends JDialog {
	
	protected ArrayList<Player> players; //FIXME

	public AchievementsDialog(JFrame parent, String title, boolean modal) {
		super(parent, title, modal);
		setLocationRelativeTo(parent);
		setSize(100, 100);
		setVisible(true);
	}
	
}
