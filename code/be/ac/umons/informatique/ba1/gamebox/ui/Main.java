package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.Timer;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/** 
 * Main application window.
 */

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener {
	
	protected final GameContext context;
	protected final JMenuBar menuBar = new JMenuBar();
	protected ActionListener newGame;
	protected boolean showLegal;
	protected boolean debug;
	protected Timer tmrPlay;
	//protected Timer tmrClock;
	
	protected final JMenu games = new JMenu("Jeux");
	protected final JMenu pls = new JMenu("Joueurs");
	protected final HumanPlayerMenu p1, p2;
	protected final JMenuItem valPls = new JMenuItem("Lancer le jeu");
	protected final JMenuItem mngPls = new JMenuItem("Gérer");
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

	protected final JMenuItem res = new JMenuItem("Résultats");
	protected final JMenuItem graph = new JMenuItem("Graphique");
	protected final JMenuItem itv = new JMenuItem("Interactif");
	
	protected final JMenuItem manual = new JMenuItem("Manuel");
	protected final JMenuItem about = new JMenuItem("À propos de...");
	
	protected final JMenuItem dbg = new JMenuItem("DEBUG");
	
	
	
	/**
	 * Sets the enabled state of menus used for player selection
	 * @param e True for enabled
	 */
	protected void enablePlayersSelection(boolean e) {
		p1.setVisible(e);
		p2.setVisible(e);
		valPls.setVisible(e);
	}
	
	/**
	 * Initializes menus
	 */
	private void initMenus() {
		//FIXME implement GameMenu and GameMenuItem...
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
		
		pls.add(p1); pls.add(p2);
		pls.add(valPls); valPls.addActionListener(this);
		pls.add(mngPls); mngPls.addActionListener(this);
		
		enablePlayersSelection(false);
		
		pls.add(ach); ach.addActionListener(this);
		menuBar.add(pls);
		
		stats.add(res);
		stats.add(graph);
		stats.add(itv);
		menuBar.add(stats);
		
		if (debug) {
			help.add(dbg);
			dbg.addActionListener(this);
		}
		help.add(manual);
		help.add(about); about.addActionListener(this);
		menuBar.add(help);

		setJMenuBar(menuBar);
	}
	
	/**
	 * Loads a board panel, displays it and resizes the JFrame.
	 * Both exception are declared to avoid ignoring an NPE thrown because of an unknown game.
	 * @throws URISyntaxException Invalid texture path
	 * @throws IOException        Can't read a texture
	 */
	private void loadBoardPanel() throws URISyntaxException, IOException {
		BoardPanel bp = null;
		if (context.game instanceof Connect4)
			setContentPane(bp = new BoardPanel("fiar/board", "fiar/yellow", "fiar/red", true));
		else if (context.game instanceof TicTacToe)
			setContentPane(bp = new BoardPanel("ttt/board", "ttt/o", "ttt/x", false));
		else if (context.game instanceof Othello)
			setContentPane(bp = new BoardPanel("oth/board", "oth/black", "oth/white", false));
		setSize(bp.pieceSize*context.game.board.getWidth()+50, bp.pieceSize*context.game.board.getHeight()+80);
		revalidate();
	}
	
	public Main(boolean dbg) {
		debug = dbg;
		setSize(800, 600);
		setTitle("Game box");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				try {
					context.saveContext("savegame.dat");
				} catch (Exception e) {
					Logging.getGlobal().severe("Couldn't save the context!");
					e.printStackTrace();
				}
			}
		});
		
		newGame = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() == trd1)
						context.game = new TicTacToe(3, 3, 3);
					else if (e.getSource() == trd2)
						context.game = new Connect4(7, 6, 4);
					else if (e.getSource() == trd3)
						context.game = new Othello(8, 8);
					enablePlayersSelection(true);
					loadBoardPanel();
				}
				catch (URISyntaxException|IOException ex) {
					//FIXME better exception handling? logging?
					ex.printStackTrace();
				}
			}
		};
		
		context = GameContext.loadContext("savegame.dat");
		//this must be done here because these constructors need a valid context
		p1 = new HumanPlayerMenu(this, "Joueur 1", 0);
		p2 = new HumanPlayerMenu(this, "Joueur 2", 1);
		initMenus();
		
		if (context.game != null)
			try {
				loadBoardPanel();
			} catch (URISyntaxException | IOException ex) {
				//FIXME better exception handling? logging?
				ex.printStackTrace();
			}
		
		tmrPlay = new Timer(800, this);
		
		setVisible(true);
	}

	/**
	 * Computer autoplay if we're in the right mode 
	 */
	private void doPlay() {
		if (context.mode==GameMode.DEMO_AUTOMATIC && (context.game.getCurrentPlayer() instanceof ComputerPlayer) && !context.game.hasFinished())
				((ComputerPlayer)context.game.getCurrentPlayer()).play();
	}
	
	/**
	 * Debug menu action...
	 */
	private void doDebug() {
		System.out.println("doDebug()");
	}
	
	/**
	 * Shows the achievements dialog
	 */
	private void showAchievements() {
		if (context.humans.isEmpty())
			JOptionPane.showMessageDialog(this, "Il n'existe aucun profil de joueur !");
		else
			new AchievementsDialog(context.humans, this, true);
	}
	
	/**
	 * Validates the players selection
	 */
	private void doValPlayersSel() {
		if (context.isPlayerSelectionValid()) {
			enablePlayersSelection(false);
			context.game.setPlayers(context.selPlayers[0], context.selPlayers[1]);
		}
		else
			JOptionPane.showMessageDialog(this, "Veuillez sélectionner deux joueurs distincts...", "Attention", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Shows players management dialog and refreshes menus after it's closed
	 */
	private void showPlayers() {
		new PlayersDialog(context, this, true);
		p1.refresh();
		p2.refresh();
	}
	
	/**
	 * Shows the about dialog
	 */
	private void showAbout() {
		new AboutDialog(this, true);
	}

	/**
	 * Handles timers and some menus, always calls private methods?
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tmrPlay) doPlay();
		else if (e.getSource() == dbg) doDebug();
		else if (e.getSource() == ach) showAchievements();
		else if (e.getSource() == valPls) doValPlayersSel();
		else if (e.getSource() == mngPls) showPlayers();
		else if (e.getSource() == about) showAbout();
	}
	
	
	
	/**
	 * Menu presenting a list of human players for selection.
	 */
	class HumanPlayerMenu extends JMenu {
		protected JFrame frame;
		protected int id;
		protected ButtonGroup grp;
		
		/**
		 * Creates a player(s) menu
		 * @param caption Displayed text
		 * @param id      Player index (in context.selPlayers)
		 */
		public HumanPlayerMenu(JFrame frm, String caption, int id) {
			super(caption);
			frame = frm;
			this.id = id;
			refresh();
		}
		
		/**
		 * (Re)populates the menu with human players and a special AI menu
		 */
		public void refresh() {
			//reverse order to avoid shift when removing items
			for (int i=getItemCount()-1; i>=0; i--)
				remove(i);
			//populate it
			PlayerMenuItem it;
			grp = new ButtonGroup();
			for (HumanPlayer p: context.humans) {
				it = new PlayerMenuItem(frame, p.toString(), id, p); 
				grp.add(it);
				add(it);
			}
			//special item
			it = new PlayerMenuItem(frame, "[IA]", id, null);
			grp.add(it);
			add(it);
		}
	}

	
	
	/**
	 * Menu item holding informations about a player object and/or id.
	 */
	class PlayerMenuItem extends JRadioButtonMenuItem implements ActionListener {
		public final Player player;
		public final int id;
		protected final JFrame frame;
		
		/**
		 * Creates a player menu item
		 * @param frm     Parent frame
		 * @param caption Displayed text
		 * @param id      Player index (in context.selPlayers)
		 * @param p       Human player OR null if this item is used to select an AI
		 */
		public PlayerMenuItem(JFrame frm, String caption, int id, HumanPlayer p) {
			super(caption);
			this.id = id;
			player = p;
			frame = frm;
			addActionListener(this);
			//the following alternative could be shortened into one line but it would be less readable
			if (p == null)
				setSelected(context.selPlayers[id] instanceof ComputerPlayer);
			else
				setSelected(context.selPlayers[id] == p);
		}

		/**
		 * Handles player selection (shows the AI window if needed)
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (player == null) {
				//AI selection dialog
				AiDialog dlg = new AiDialog(frame, true);
				if (!dlg.getCancelled())
					context.selPlayers[id] = new ComputerPlayer(null, dlg.getName(), dlg.getDifficulty());
				else
					//cancel selection!
					setSelected(false);
			}
			else {
				//Direct selection of a human player
				context.selPlayers[id] = player;
			}
		}
	}

	
	
	/**
	 * Responsible for making a game playable.
	 * We'll need to use different classes later if we want to handle animations.
	 */
	class BoardPanel extends JPanel implements MouseListener {
		/**
		 * Maximum piece size, in pixels. Corresponds to a tile's size.
		 * This constant avoids displaying ugly "overzoomed" tiles...
		 */
		private static final int PIECE_MAX_SIZE = 100;

		/**
		 * Current size of tiles
		 */
		protected int pieceSize = PIECE_MAX_SIZE;
		
		/**
		 * Preloaded images
		 */
		protected Image imgBoard, imgP1, imgP2;
		
		/**
		 * Do we need to display the piece in the background? 
		 */
		protected boolean reversed;
		
		/**
		 * Loads an image from the res folder. Typically called from the constructor.
		 * @param name Image name, without extension nor absolute path
		 * @return Usable Image object
		 */
		protected Image getImage(String name) throws URISyntaxException, IOException {
			return ImageIO.read(getClass().getResourceAsStream("/res/"+name+".png"));
		}
		
		/**
		 * Registers listeners and preloads images
		 * @param b  Board image name
		 * @param p1 Player1's piece name
		 * @param p2 Player2's piece name
		 * @param r  Reversed display
		 */
		public BoardPanel(String b, String p1, String p2, boolean r) throws URISyntaxException, IOException {
			addMouseListener(this);
			addComponentListener(new ComponentAdapter() {
				@Override
				public void componentResized(ComponentEvent arg0) {
					adjustSize();
				}
			});
			imgBoard = getImage(b);
			imgP1 = getImage(p1);
			imgP2 = getImage(p2);
			reversed = r;
		}
		
		/**
		 * Paints a piece using pieceSize and the right image
		 * @param g  Graphics object (typically given by {@link #paintComponent(Graphics)})
		 * @param pc Piece to extract the owner from
		 * @param x  Cell's X coordinate
		 * @param y  Cell's Y coordinate
		 */
		private void paintPiece(Graphics g, Piece pc, int x, int y) {
			if (pc != null) {
				Image img = (pc.getOwner()==context.game.players[0] ? imgP1 : imgP2);
				g.drawImage(img, x*pieceSize, y*pieceSize, (x+1)*pieceSize, (y+1)*pieceSize, 0, 0, PIECE_MAX_SIZE, PIECE_MAX_SIZE, null);
			}
		}
		
		/**
		 * Paints a part of the board at the given position
		 * @param g  Graphics object (typically given by {@link #paintComponent(Graphics)})
		 * @param x  Cell's X coordinate
		 * @param y  Cell's Y coordinate
		 */
		private void paintBoard(Graphics g, int x, int y) {
			g.drawImage(imgBoard, x*pieceSize, y*pieceSize, (x+1)*pieceSize, (y+1)*pieceSize, 0, 0, PIECE_MAX_SIZE, PIECE_MAX_SIZE, null);
		}
		
		/**
		 * Paints the whole board taking account of legal moves (to display or not)
		 */
		@Override
		public void paintComponent(Graphics g){ 
			super.paintComponent(g); //paint the background
			for (int x=0; x<context.game.board.getWidth(); x++) {
				for (int y=0; y<context.game.board.getHeight(); y++) {
					boolean lm = false;
					if (context.game.getLegalMoves() != null)
						lm = context.game.getLegalMoves().contains(context.game.createMove(x, y)) && showLegal;
					Piece pc = context.game.board.getPiece(x, y);
					//If we have a legal move to show, use a fake piece
					if (lm)
						pc = new Piece(context.game.getCurrentPlayer());
					//Display in the right order
					if (reversed) {
						paintPiece(g, pc, x, y);
						paintBoard(g, x, y);
					}
					else {
						paintBoard(g, x, y);
						paintPiece(g, pc, x, y);
					}
					//Add a green circle if we drew a legal move
					if (lm) {
						g.setColor(Color.GREEN);
						g.fillOval(x*pieceSize+pieceSize/2-15, y*pieceSize+pieceSize/2-15, 30, 30);
					}
				}
			}
		}

		/**
		 * Displays legal moves
		 */
		@Override public void mouseReleased(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON3) {
				showLegal = false;
				repaint();
			}
		}
		
		/**
		 * Hides legal moves
		 */
		@Override public void mousePressed(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON3) {
				showLegal = true;
				repaint();
			}
		}
		
		@Override public void mouseExited(MouseEvent arg0) {}
		@Override public void mouseEntered(MouseEvent arg0) {}

		/**
		 * Handles player's moves via left click, checking its legality
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton()==MouseEvent.BUTTON1 && context.mode==GameMode.NORMAL && !context.game.hasFinished() && context.game.getCurrentPlayer()!=null) {
				if (context.game.getCurrentPlayer() instanceof ComputerPlayer) {
					((ComputerPlayer)context.game.getCurrentPlayer()).play();
				}
				else {
					Move mv = context.game.createMove(e.getPoint().x/pieceSize, e.getPoint().y/pieceSize);
					if (context.game.getLegalMoves().contains(mv))
						mv.play(true);
				}
				repaint();
				if (context.game.hasFinished()) {
					if (context.game.getScore(context.game.players[0]) == Game.SCORE_WON)
						JOptionPane.showMessageDialog(null, context.game.players[0].name+" a gagné !");
					else if (context.game.getScore(context.game.players[1]) == Game.SCORE_WON)
						JOptionPane.showMessageDialog(null, context.game.players[1].name+" a gagné !");
					else
						JOptionPane.showMessageDialog(null, "Match nul !");
				}
			}
		}
		
		/**
		 * Adjusts pieceSize from the pane's dimensions
		 */
		public void adjustSize() {
			//if (pieceSize*game.board.getWidth()>getWidth() || pieceSize*game.board.getHeight()>getHeight())
			pieceSize = Math.min(PIECE_MAX_SIZE, Math.min(getWidth()/context.game.board.getWidth(), getHeight()/context.game.board.getHeight()));
		}
	}
	
	
	
	public static void main(String[] args) {
		new Main(args.length==1 && args[0].equals("-d"));
	}

}
