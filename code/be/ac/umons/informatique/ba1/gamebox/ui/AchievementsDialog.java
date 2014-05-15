package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * Displays achievements earned by human players: computer players don't have any.
 * Demonstrates the use of JScrollPane...
 */

@SuppressWarnings("serial")
class AchievementsDialog extends JDialog implements ActionListener {
	
	/**
	 * Completion progressbar resolution
	 */
	protected static final int COMPLETION_RESOLUTION = 1000;
	
	/**
	 * Panel containing the Achievements list
	 */
	protected JPanel list;
	
	/**
	 * Human players list (in the combobox)
	 */
	protected ArrayList<HumanPlayer> players;
	
	/**
	 * Human players combobox
	 */
	protected ThinCombo<Player> cmbPlayer;

	
	public AchievementsDialog(ArrayList<HumanPlayer> humans, Main parent) {
		super(parent, "Succès débloqués", true);
		setSize(500, 400);
		setLocationRelativeTo(parent);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		players = humans;
		
		Box sup = Box.createHorizontalBox();
		sup.add(Box.createHorizontalGlue());
		sup.add(new JLabel("Profil de joueur : "));
		sup.add(cmbPlayer = new ThinCombo<Player>(players.toArray()));
		cmbPlayer.addActionListener(this);
		sup.add(Box.createHorizontalGlue());
		
		list = new JPanel();
		list.setLayout(new BoxLayout(list, BoxLayout.Y_AXIS));
		populateList(0);
		
		JScrollPane jsp = new JScrollPane(list);
		jsp.setBorder(null);
		
		add(sup);
		add(jsp);
		
		setVisible(true);
	}
	
	/**
	 * Populates the achievements list
	 * @param idx Player index in the ThinCombo
	 */
	protected void populateList(int idx) {
		list.removeAll();
		for (Event evt: players.get(idx).events)
			if (evt instanceof Achievement)
				list.add(new AchievementPanel((Achievement)evt));
		//manual revalidate() for Java 6 
		getContentPane().validate();
		validate();
	}

	/**
	 * Re-populates the achievements list when another player is selected.
	 * The code is quite trivial...
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		populateList(cmbPlayer.getSelectedIndex());
	}
	
	/**
	 * Panel displaying a single achievement with name, description and completion 
	 */
	protected class AchievementPanel extends JPanel {
		public AchievementPanel(Achievement ach) {
			add(new Picture(ach.icon ? ach.name : "no_icon", 64, 64));
			Box txt = Box.createVerticalBox();
			txt.add(new ZoomedLabel(ach.message, 1.5F));
			txt.add(new JLabel(ach.description));
			txt.add(Box.createVerticalStrut(5));
			JProgressBar pgr = new JProgressBar(0, COMPLETION_RESOLUTION);
			pgr.setValue((int)(ach.getCompletion()*COMPLETION_RESOLUTION));
			pgr.setString(Math.round(ach.getCompletion()*100)+" %");
			pgr.setStringPainted(true);
			txt.add(pgr);
			add(txt);
			setAlignmentX(LEFT_ALIGNMENT);
		}
		
		@Override
		public Dimension getMaximumSize() {
			return getPreferredSize();
		}
	}
	
}
