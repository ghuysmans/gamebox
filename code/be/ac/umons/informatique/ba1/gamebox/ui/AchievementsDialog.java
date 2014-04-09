package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import be.ac.umons.informatique.ba1.gamebox.core.Achievement;
import be.ac.umons.informatique.ba1.gamebox.core.Event;
import be.ac.umons.informatique.ba1.gamebox.core.HumanPlayer;
import be.ac.umons.informatique.ba1.gamebox.core.Player;

public class AchievementsDialog extends JDialog {
	
	protected ArrayList<Player> players; //FIXME
	protected JPanel list;
	protected JComboBox<Object> cmbPlayer;

	protected void populateList() {
		list.removeAll();
		for (Event evt: players.get(0).events)
			list.add(new AchievementPanel(evt));
	}
	
	public AchievementsDialog(Main parent, boolean modal) {
		super(parent, "Succès débloqués", modal);
		setSize(500, 400);
		setLocationRelativeTo(parent);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		//FIXME
		players = new ArrayList<Player>();
		players.add(new HumanPlayer(null, "Mathieu"));
		players.get(0).notifyEvent("mv");
		players.add(new HumanPlayer(null, "Guillaume"));
		players.add(new HumanPlayer(null, "Antoine"));
		players.add(new HumanPlayer(null, "Charlotte"));
		
		Box sup = Box.createHorizontalBox();
		sup.add(Box.createHorizontalGlue());
		sup.add(new JLabel("Profil de joueur : "));
		sup.add(new ThinCombo<>(players.toArray()));
		sup.add(Box.createHorizontalGlue());
		//sup.add(new ThinCombo<>((Player[]) players.toArray()));
		
		list = new JPanel();
		list.setLayout(new BoxLayout(list, BoxLayout.Y_AXIS));
		populateList();
		
		add(sup);
		add(new JScrollPane(list));
		
		setVisible(true);
	}
	
	protected class AchievementPanel extends JPanel {
		public AchievementPanel(Event evt) {
			if (evt instanceof Achievement)
				add(new JButton(evt.toString()));
		}
		
		@Override
		public Dimension getMaximumSize() {
			return getPreferredSize();
		}
	}
	
}
