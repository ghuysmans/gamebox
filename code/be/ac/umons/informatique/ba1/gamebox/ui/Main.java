package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/** 
 * Main class launched by the JVM  
 */

public class Main extends JFrame implements ActionListener {

	protected final JMenuBar menuBar = new JMenuBar();
	
	protected final JMenu games = new JMenu("Jeux");
	protected final JMenu p1 = new JMenu("Joueur 1");
	protected final JMenu p2 = new JMenu("Joueur 2");
	protected final JMenu stats = new JMenu("Statistiques");
	protected final JMenu help = new JMenu("Aide");
	protected final JMenuItem ttt = new JMenuItem("Tic-Tac-Toe");
	protected final JMenuItem fiar = new JMenuItem("Puissance 4");
	protected final JMenuItem oth = new JMenuItem("Othello");
	
	protected final JMenu hmn1 = new JMenu("Humain");
	protected final JMenu ai1 = new JMenu("Ai");
	protected final JMenu hmn2 = new JMenu("Humain");
	protected final JMenu ai2 = new JMenu("Ai");

	protected final JMenuItem res = new JMenuItem("Résultats");
	protected final JMenuItem graph = new JMenuItem("Graphique");
	protected final JMenuItem itv = new JMenuItem("Interactif");
	
	protected final JMenuItem manual = new JMenuItem("Manuel");
	protected final JMenuItem about = new JMenuItem("À propos de...");
	
	protected final JMenuItem dbg = new JMenuItem("DEBUG");
	
	
	public Main() {
		setSize(800, 600);
		setTitle("Game box");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //FIXME save
		setContentPane(new BoardPanel());
		
		games.add(ttt);
		games.add(fiar);
		games.add(oth);
		menuBar.add(games);
		
		p1.add(hmn1);
		p1.add(ai1);
		menuBar.add(p1);
		
		p2.add(hmn2);
		p2.add(ai2);
		menuBar.add(p2);
		
		stats.add(res);
		stats.add(graph);
		stats.add(itv);
		menuBar.add(stats);
		
		help.add(manual);
		help.add(about);
		menuBar.add(help);
		
		menuBar.add(dbg);
		
		dbg.addActionListener(this);
		setJMenuBar(menuBar);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == dbg) {
			AchievementsDialog ad = new AchievementsDialog(this, true);
		}
		else
			System.out.println(e.getSource());
	}
	
	class BoardPanel extends JPanel {
		public void paintComponent(Graphics g){ 
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Main wnd = new Main();
	}

}
