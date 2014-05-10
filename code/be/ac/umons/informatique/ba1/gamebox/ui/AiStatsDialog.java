package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import be.ac.umons.informatique.ba1.gamebox.core.ComputerPlayer;
import be.ac.umons.informatique.ba1.gamebox.core.Game;

@SuppressWarnings("serial")
public class AiStatsDialog extends JDialog implements Observer, ActionListener {
	
	StatsComputer sc;
	protected static final int COUNT = 5;
	protected JProgressBar pgb = new JProgressBar(0, COUNT);
	protected JLabel won = new JLabel("Pourcentage de parties gagnées : ");
	protected JLabel lost = new JLabel("Pourcentage de parties perdues : ");
	protected JLabel draw = new JLabel("Pourcentage d'égalités : ");
	protected JLabel count = new JLabel("Nombre de parties jouées : ");
	protected JLabel wonval = new JLabel("-");
	protected JLabel lostval = new JLabel("-");
	protected JLabel drawval = new JLabel("-");
	protected JLabel countval = new JLabel("-");
	protected ZoomedLabel notice = new ZoomedLabel("Les résultats sont présentés selon la première IA", 0.85f);
	protected JButton ccl = new JButton("Annuler");
	
	public AiStatsDialog(Class<? extends Game> g, ComputerPlayer p1, ComputerPlayer p2, Main parent, boolean modal) {
		super(parent, "Statistiques des IA", modal);
		ccl.addActionListener(this);
		setSize(275, 188);
		setLocationRelativeTo(parent);
		setLayout(new BorderLayout());
		setResizable(true);
		sc = new StatsComputer(g, p1, p2, COUNT);
		sc.addObserver(this);
		sc.run();
		pgb.setStringPainted(true);

		
		JPanel b1 = new JPanel();
		
		b1.setLayout(new BoxLayout(b1, BoxLayout.PAGE_AXIS));
		won.setAlignmentX(RIGHT_ALIGNMENT);
		lost.setAlignmentX(RIGHT_ALIGNMENT);
		count.setAlignmentX(RIGHT_ALIGNMENT);
		draw.setAlignmentX(RIGHT_ALIGNMENT);
		b1.add(won);
		b1.add(lost);
		b1.add(draw);
		b1.add(count);
		
		JPanel b2 = new JPanel();
		b2.setLayout(new BoxLayout(b2, BoxLayout.PAGE_AXIS));
		b2.add(wonval);
		b2.add(lostval);
		b2.add(drawval);
		b2.add(countval);
		
		//FIXME
		
		JPanel b3 = new JPanel();
		b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		add(ccl);
		
		JPanel ba = new JPanel();
		setLayout(new FlowLayout());
		ba.add(b1);
		ba.add(b2);
		
		JPanel bb = new JPanel();
		setLayout(new FlowLayout());
		bb.add(pgb);
		bb.add(ccl);
		
		
		add(ba, BorderLayout.NORTH);
		add(notice, BorderLayout.CENTER);
		add(bb, BorderLayout.SOUTH);
	
		setVisible(true);
	}

	/**
	 * Updates displayed data
	 */
	@Override
	public void update(Observable obs, Object obj) {
		AiStats as = (AiStats)obj;
		countval.setText((Integer.toString((as.getCount()))));
		wonval.setText((Double.toString((as.getWon()*100)))+"%");
		lostval.setText((Double.toString((as.getLost()*100)))+"%");
		drawval.setText((Double.toString((as.getDraw()*100)))+"%");
		pgb.setValue(as.getCount());
	}

	/**
	 * Closes the window and stops the {@link Thread} (if it isn't yet)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//FIXME stop the thread
		setVisible(false);
	}
	
	/**
	 * Computes statistics in a separate Thread
	 */
	protected class StatsComputer extends Observable implements Runnable {
		protected Class<? extends Game> gc;
		protected int count;
		protected AiStats as;
		
		/**
		 * Creates a StatsComputer instance.
		 * @param g  Game class
		 * @param p1 AI1
		 * @param p2 AI2
		 * @param n  Tests count
		 */
		public StatsComputer(Class<? extends Game> g, ComputerPlayer p1, ComputerPlayer p2, int n) {
			gc = g;
			as = new AiStats(p1, p2);
			count = n;
		}

		/**
		 * Asks AiStats to let players play {@link #count} times against each other 
		 * and notifies {@link Observer}'s each time a {@link Game} finishes.
		 */
		@Override
		public void run() {
			int i = count;
			while (i-- > 0) {
				Game game;
				try {
					game = gc.newInstance();
				}
				catch (Exception e) {
					//we should never reach this point:
					//all games implement a default constructor
					e.printStackTrace();
					return; //abort!
				}
				as.playGame(game, false);
				setChanged();
				notifyObservers(as);
			}
		}
	}
	
}
