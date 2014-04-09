package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/** 
 * Main class launched by the JVM  
 */

public class Main extends JFrame {

	protected final JMenuBar menubar = new JMenuBar();
	
	protected final JMenu games = new JMenu("Jeux");
	protected final JMenu p1 = new JMenu("Joueur 1");
	protected final JMenu p2 = new JMenu("Joueur 2");
	protected final JMenu stats = new JMenu("Statistiques");
	
	protected final JMenuItem ttt = new JMenuItem("Tic-Tac-Toe");
	protected final JMenuItem fiar = new JMenuItem("Puissance 4");
	protected final JMenuItem oth = new JMenuItem("Othello");
	
	protected final JMenu hmn1 = new JMenu("Humain");
	protected final JMenu ai1 = new JMenu("Ai");
	protected final JMenu hmn2 = new JMenu("Humain");
	protected final JMenu ai2 = new JMenu("Ai");

	
	public Main() {
		
		setSize(800, 600);
		setVisible(true);
		setTitle("Game box");
		setContentPane(new BoardPanel());
		
		
	}

	
	
	public static void main(String[] args) {
		Main wnd = new Main();
	}
	
	class BoardPanel extends JPanel {
		public void paintComponent(Graphics g){ 
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
		}
		
	}
}
