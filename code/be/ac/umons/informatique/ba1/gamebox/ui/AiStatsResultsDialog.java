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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import be.ac.umons.informatique.ba1.gamebox.core.ComputerPlayer;
import be.ac.umons.informatique.ba1.gamebox.core.Game;

/**
 * Computes (in a separate {@link Thread}) and shows AI statistics
 */
@SuppressWarnings("serial")
public class AiStatsResultsDialog extends JDialog implements Observer, ActionListener {
	
	/**
	 * Working thread
	 */
	protected final Thread thread;
	
	/**
	 * Stop flag (for {@link #thread})
	 */
	protected boolean stop = false;
	
	/**
	 * Count of rounds to play
	 */
	protected int rounds;
	
	/**
	 * Progressbar (not initialized here because the tests count is unknown at this moment)
	 */
	protected final JProgressBar pgb;
	
	/**
	 * Won rounds label
	 */
	protected final JLabel won = new JLabel("Pourcentage de parties gagnées : ");

	/**
	 * Lost rounds label
	 */
	protected final JLabel lost = new JLabel("Pourcentage de parties perdues : ");

	/**
	 * Draw rounds label
	 */
	protected final JLabel draw = new JLabel("Pourcentage d'égalités : ");

	/**
	 * Played rounds label
	 */
	protected final JLabel countlbl = new JLabel("Nombre de parties jouées : ");

	/**
	 * Won rounds percentage
	 */
	protected final JLabel wonval = new JLabel("-");

	/**
	 * Lost rounds percentage
	 */
	protected final JLabel lostval = new JLabel("-");

	/**
	 * Draw rounds percentage
	 */
	protected final JLabel drawval = new JLabel("-");

	/**
	 * Played rounds percentage
	 */
	protected final JLabel countval = new JLabel("-");
	
	/**
	 * Important notice
	 */
	protected final ZoomedLabel notice = new ZoomedLabel("Les résultats sont présentés selon la première IA", 0.85f);
	
	/**
	 * Cancel button
	 */
	protected final JButton ccl = new JButton("Annuler");
	
	
	/**
	 * Creates an instance of {@link AiStatsResultsDialog}
	 * @param g      Game class
	 * @param p1     First player
	 * @param p2     Second player
	 * @param parent Parent frame
	 * @param ct     Rounds count
	 */
	public AiStatsResultsDialog(Class<? extends Game> g, ComputerPlayer p1, ComputerPlayer p2, JFrame parent, int ct) {
		super(parent, "Statistiques des IA", true);
		
		rounds = ct;
		StatsComputer sc = new StatsComputer(g, p1, p2, rounds);
		sc.addObserver(this);
		thread = new Thread(sc);
		thread.start();
		
		//must be done here because pgb is final
		pgb = new JProgressBar(0, rounds);
		pgb.setStringPainted(true); 

		initUI(parent);
	}
	
	/**
	 * Initializes controls
	 */
	protected void initUI(JFrame parent) {
		setSize(275, 188);
		setLocationRelativeTo(parent);
		setLayout(new BorderLayout());
		setResizable(false);
		
		//left column
		JPanel b1 = new JPanel();
		b1.setLayout(new BoxLayout(b1, BoxLayout.PAGE_AXIS));
		won.setAlignmentX(RIGHT_ALIGNMENT); b1.add(won);
		draw.setAlignmentX(RIGHT_ALIGNMENT); b1.add(draw);
		lost.setAlignmentX(RIGHT_ALIGNMENT); b1.add(lost);
		countlbl.setAlignmentX(RIGHT_ALIGNMENT); b1.add(countlbl);
		
		//right column
		JPanel b2 = new JPanel();
		b2.setLayout(new BoxLayout(b2, BoxLayout.PAGE_AXIS));
		b2.add(wonval);
		b2.add(drawval);
		b2.add(lostval);
		b2.add(countval);
		
		//statistics
		JPanel ba = new JPanel();
		setLayout(new FlowLayout());
		ba.add(b1);
		ba.add(b2);
		
		//progress bar and button
		JPanel bb = new JPanel();
		setLayout(new FlowLayout());
		bb.add(pgb);
		bb.add(ccl); ccl.addActionListener(this);
		
		add(ba, BorderLayout.NORTH);
		add(notice, BorderLayout.CENTER);
		add(bb, BorderLayout.SOUTH);
	
		setVisible(true);
	}
	
	/**
	 * Displays completion in percent into dest
	 * @param dest Destination label
	 * @param value Value in range [0;1]
	 */
	protected void setCompletion(JLabel dest, double value) {
		dest.setText(Double.toString(Math.floor(value*10000)/100)+"%");
	}

	/**
	 * Updates displayed data
	 */
	@Override
	public void update(Observable obs, Object obj) {
		AiStats as = (AiStats)obj;
		countval.setText(Integer.toString(as.getCount()));
		pgb.setValue(as.getCount());
		setCompletion(wonval, as.getWon());
		setCompletion(lostval, as.getLost());
		setCompletion(drawval, as.getDraw());
		if (as.getCount() == rounds)
			ccl.setText("Fermer");
	}

	/**
	 * Closes the window, interrupting the {@link Thread} if needed.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		stop = true;
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
			while (i-->0 && !stop) {
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
