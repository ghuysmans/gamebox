package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;

import be.ac.umons.informatique.ba1.gamebox.core.Achievement;
import be.ac.umons.informatique.ba1.gamebox.core.Event;
import be.ac.umons.informatique.ba1.gamebox.core.HumanPlayer;
import be.ac.umons.informatique.ba1.gamebox.core.Player;

public class AchievementsDialog extends JDialog implements ActionListener {
	
	protected ArrayList<Player> players; //FIXME
	protected JPanel list;
	protected JComboBox<Object> cmbPlayer;

	protected void populateList(int idx) {
		list.removeAll();
		for (Event evt: players.get(idx).events)
			if (evt instanceof Achievement)
				list.add(new AchievementPanel((Achievement)evt));
		list.revalidate();
		list.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		populateList(cmbPlayer.getSelectedIndex());
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
		sup.add(cmbPlayer = new ThinCombo<Object>(players.toArray()));
		cmbPlayer.addActionListener(this);
		sup.add(Box.createHorizontalGlue());
		
		list = new JPanel();
		list.setLayout(new BoxLayout(list, BoxLayout.Y_AXIS));
		populateList(0);
		
		add(sup);
		add(new JScrollPane(list));
		
		setVisible(true);
	}
	
	protected class AchievementPanel extends JPanel {
		public AchievementPanel(Achievement ach) {
			add(new Picture(ach.icon ? ach.name : "no_icon", 64, 64));
			Box txt = Box.createVerticalBox();
			txt.add(new ZoomedLabel(ach.message, 1.5F));
			txt.add(new JLabel(ach.description));
			txt.add(Box.createVerticalStrut(5));
			JProgressBar pgr = new JProgressBar(0, 1000);
			pgr.setValue((int)(ach.getCompletion()*1000));
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
