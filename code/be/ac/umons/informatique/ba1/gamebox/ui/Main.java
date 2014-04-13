package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import be.ac.umons.informatique.ba1.gamebox.core.Connect4;
import be.ac.umons.informatique.ba1.gamebox.core.Game;
import be.ac.umons.informatique.ba1.gamebox.core.HumanPlayer;
import be.ac.umons.informatique.ba1.gamebox.core.Move;
import be.ac.umons.informatique.ba1.gamebox.core.Othello;
import be.ac.umons.informatique.ba1.gamebox.core.TicTacToe;

/** 
 * Main application window.
 */

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener {
	
	protected static final int PIECE_SIZE = 100;
	
	protected Game game;
	protected ActionListener newGame;
	protected ArrayList<HumanPlayer> humans = new ArrayList<HumanPlayer> ();
	protected final JMenuBar menuBar = new JMenuBar();
	protected ArrayList<Move> legal;
	protected boolean showLegal;
	
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
	protected final JMenuItem cus1 = new JMenuItem("Personnalisé");
	protected final JMenuItem trd2 = new JMenuItem("Traditionnel");
	protected final JMenuItem cus2 = new JMenuItem("Personnalisé");
	protected final JMenuItem trd3 = new JMenuItem("Traditionnel");
	protected final JMenuItem cus3 = new JMenuItem("Personnalisé");

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
	
	private void initMenus() {
		ttt.add(trd1); trd1.addActionListener(newGame);
		ttt.add(cus1); cus1.addActionListener(newGame);
		fiar.add(trd2); trd2.addActionListener(newGame);
		fiar.add(cus2); cus2.addActionListener(newGame);
		oth.add(trd3); trd3.addActionListener(newGame);
		oth.add(cus3); cus3.addActionListener(newGame);
		
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
		
		pls.add(ach); ach.addActionListener(this);
		menuBar.add(pls);
		
		stats.add(res);
		stats.add(graph);
		stats.add(itv);
		menuBar.add(stats);
		
		help.add(manual);
		help.add(about); about.addActionListener(this);
		menuBar.add(help);
		
		menuBar.add(dbg); dbg.addActionListener(this);

		setJMenuBar(menuBar);
	}
	
	public Main() {
		setSize(800, 600);
		setTitle("Game box");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				//FIXME save data
				System.out.println("Window closing...");
			}
		});
		
		newGame = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() == trd1) {
						game = new TicTacToe(3, 3, 3);
						setContentPane(new TttBoardPanel());
					}
					else if (e.getSource() == trd2) {
						game = new Connect4(7, 6, 4);
						setContentPane(new FiarBoardPanel());
					}
					else if (e.getSource() == trd3) {
						game = new Othello(8, 8);
						setContentPane(new OthBoardPanel());
					}
					
					//FIXME
					game.setPlayers(humans.get(0), humans.get(1));
					legal = game.getLegalMoves();
	
					revalidate();
				}
				catch (Exception ex) {
					//FIXME better exception handling?
					ex.printStackTrace();
				}
			}
		};
		initMenus();
		
		humans.add(new HumanPlayer("Mathieu"));
		humans.add(new HumanPlayer("Guillaume"));
		humans.add(new HumanPlayer("Charlotte"));
		humans.add(new HumanPlayer("Antoine"));
		
		setVisible(true);
	}
	
	protected void selectAI(int pid) {
		//TODO complete this
		new AiDialog(this, true);
	}

	private void doDebug() {
		System.out.println("doDebug()");
		try {
			FileOutputStream fos = new FileOutputStream("savegame.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(game);
			oos.close(); fos.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == dbg)
			doDebug();
		else if (e.getSource() == ach)
			new AchievementsDialog(humans, this, true);
		else if (e.getSource() == ai1)
			selectAI(1);
		else if (e.getSource() == about)
			new AboutDialog(this, true);

	}
	
	abstract class BoardPanel extends JPanel implements MouseListener {
		protected Image imgBoard, imgP1, imgP2;
		protected boolean reversed;
		
		protected Image getImage(String name) throws URISyntaxException, IOException {
			File file = new File(getClass().getResource("/res/"+name+".png").toURI());
			return ImageIO.read(file);
		}
		
		public BoardPanel(String b, String p1, String p2, boolean r) throws URISyntaxException, IOException {
			addMouseListener(this);
			imgBoard = getImage(b);
			imgP1 = getImage(p1);
			imgP2 = getImage(p2);
			reversed = r;
		}
		
		private void paintPiece(Graphics g, int x, int y) {
			if (game.board.getPiece(x, y) != null) {
				Image img = (game.board.getPiece(x, y).getOwner()==game.players[0] ? imgP1 : imgP2);
				g.drawImage(img, x*PIECE_SIZE, y*PIECE_SIZE, (x+1)*PIECE_SIZE, (y+1)*PIECE_SIZE, 0, 0, PIECE_SIZE, PIECE_SIZE, null);
			}
		}
		
		private void paintBoard(Graphics g, int x, int y) {
			g.drawImage(imgBoard, x*PIECE_SIZE, y*PIECE_SIZE, (x+1)*PIECE_SIZE, (y+1)*PIECE_SIZE, 0, 0, PIECE_SIZE, PIECE_SIZE, null);
		}
		
		@Override
		public void paintComponent(Graphics g){ 
			super.paintComponent(g); //paint the background
			for (int x=0; x<game.board.getWidth(); x++) {
				for (int y=0; y<game.board.getHeight(); y++) {
					if (reversed) {
						paintPiece(g, x, y);
						paintBoard(g, x, y);
					}
					else {
						paintBoard(g, x, y);
						paintPiece(g, x, y);
					}
					if (legal.contains(game.createMove(x, y)) && showLegal) {
						g.setColor(Color.GREEN);
						g.fillOval(x*PIECE_SIZE+10, y*PIECE_SIZE+10, PIECE_SIZE-20, PIECE_SIZE-20);
					}
				}
			}
		}

		@Override public void mouseReleased(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON3) {
				showLegal = false;
				repaint();
			}
		}
		
		@Override public void mousePressed(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON3) {
				showLegal = true;
				repaint();
			}
		}
		
		@Override public void mouseExited(MouseEvent arg0) {}
		@Override public void mouseEntered(MouseEvent arg0) {}

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton()==MouseEvent.BUTTON1 && !game.hasFinished()) {
				Move mv = game.createMove(e.getPoint().x/PIECE_SIZE, e.getPoint().y/PIECE_SIZE);
				if (legal.contains(mv)) {
					mv.play();
					repaint();
					legal = game.getLegalMoves();
					if (game.hasFinished()) {
						if (game.getScore(game.players[0]) == Game.SCORE_WON)
							JOptionPane.showMessageDialog(null, game.players[0].name+" a gagné !");
						else if (game.getScore(game.players[1]) == Game.SCORE_WON)
							JOptionPane.showMessageDialog(null, game.players[1].name+" a gagné !");
						else
							JOptionPane.showMessageDialog(null, "Match nul !");
					}
				}
			}
		}
		
	}
	
	//FIXME do we really need to use 3 different objects?
	
	class FiarBoardPanel extends BoardPanel {

		public FiarBoardPanel() throws URISyntaxException, IOException {
			super("fiar/board", "fiar/yellow", "fiar/red", true);
		}

	}
	
	class TttBoardPanel extends BoardPanel {

		public TttBoardPanel() throws URISyntaxException, IOException {
			super("ttt/board", "ttt/o", "ttt/x", false);
		}

	}
	
	class OthBoardPanel extends BoardPanel {
		
		public OthBoardPanel() throws URISyntaxException, IOException {
			super("oth/board", "oth/black", "oth/white", false);
		}

	}
	
	public static void main(String[] args) {
		new Main();
	}

}
