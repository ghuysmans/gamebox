package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import be.ac.umons.informatique.ba1.gamebox.core.Connect4;
import be.ac.umons.informatique.ba1.gamebox.core.Game;
import be.ac.umons.informatique.ba1.gamebox.core.HumanPlayer;
import be.ac.umons.informatique.ba1.gamebox.core.Othello;
import be.ac.umons.informatique.ba1.gamebox.core.TicTacToe;

/** 
 * Main class launched by the JVM  
 */

public class Main extends JFrame implements ActionListener {
	
	protected Game game;
	protected ArrayList<HumanPlayer> humans = new ArrayList<HumanPlayer> ();
	protected final JMenuBar menuBar = new JMenuBar();
	
	protected final JMenu games = new JMenu("Jeux");
	protected final JMenu pls = new JMenu("Joueurs");
	protected final JMenu p1 = new JMenu("Joueur 1");
	protected final JMenu p2 = new JMenu("Joueur 2");
	protected final JMenuItem ach = new JMenuItem("Succès");
	protected final JMenu stats = new JMenu("Statistiques");
	protected final JMenu help = new JMenu("Aide");
	protected final JMenu ttt = new JMenu("Tic-Tac-Toe");
	protected final JMenu fiar = new JMenu("Puissance 4");
	protected final JMenu oth = new JMenu("Othello");
	
	protected final JMenuItem trd1 = new JMenuItem("Traditionnel");
	protected final JMenuItem pers1 = new JMenuItem("Personnalisé");
	protected final JMenuItem trd2 = new JMenuItem("Traditionnel");
	protected final JMenuItem pers2 = new JMenuItem("Personnalisé");
	protected final JMenuItem trd3 = new JMenuItem("Traditionnel");
	protected final JMenuItem pers3 = new JMenuItem("Personnalisé");

	protected final JMenu hmn1 = new JMenu("Humain");
	protected final JMenuItem ai1 = new JMenuItem("Ai");
	protected final JMenu hmn2 = new JMenu("Humain");
	protected final JMenuItem ai2 = new JMenuItem("Ai");

	protected final JMenuItem res = new JMenuItem("Résultats");
	protected final JMenuItem graph = new JMenuItem("Graphique");
	protected final JMenuItem itv = new JMenuItem("Interactif");
	
	protected final JMenuItem manual = new JMenuItem("Manuel");
	protected final JMenuItem about = new JMenuItem("À propos de...");
	
	protected final JMenuItem dbg = new JMenuItem("DEBUG");
	
	
	
	public void fillPlayersMenu (JMenu m) {
		for (HumanPlayer h: humans) {
			m.add(new JMenuItem(h.toString()));
		}
	}
	
	public Main() {
		setSize(800, 600);
		setTitle("Game box");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //FIXME save
		setContentPane(new BoardPanel());
		
		humans.add(new HumanPlayer(null,"Mathieu"));
		humans.add(new HumanPlayer(null,"Guillaume"));
		humans.add(new HumanPlayer(null,"Charlotte"));
		humans.add(new HumanPlayer(null,"Antoine"));
		
		ttt.add(trd1); trd1.addActionListener(this);
		ttt.add(pers1);
		fiar.add(trd2); trd2.addActionListener(this);
		fiar.add(pers2);
		oth.add(trd3); trd3.addActionListener(this);
		oth.add(pers3);
		
		games.add(ttt);
		games.add(fiar);
		games.add(oth);
		menuBar.add(games);
		
		p1.add(hmn1);
		fillPlayersMenu(hmn1);
		p1.add(ai1); ai1.addActionListener(this);
		pls.add(p1);
		
		p2.add(hmn2);
		fillPlayersMenu(hmn2);
		p2.add(ai2); ai2.addActionListener(this);
		pls.add(p2);
		
		pls.add(ach);
		menuBar.add(pls);
		
		stats.add(res);
		stats.add(graph);
		stats.add(itv);
		menuBar.add(stats);
		
		help.add(manual);
		help.add(about);
		menuBar.add(help);
		
		menuBar.add(dbg); dbg.addActionListener(this);
		
		
		setJMenuBar(menuBar);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == dbg) {
			System.out.println(game);
			AchievementsDialog ad = new AchievementsDialog(this, true);
		}
		//Tic-Tac-Toe (3,3,3)
		else if (e.getSource() == trd1) {
			game = new TicTacToe(3, 3, 3);
		}
		//Connect 4 (7,6,4)
		else if (e.getSource() == trd2) {
			game = new Connect4(7, 6, 4);
		}
		//Othello (8,8)
		else if (e.getSource() == trd3) {
			game = new Othello(8,8);
		}
		else if (e.getSource() == ai1) {
			AiDialog aiDial = new AiDialog(this, true);
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
