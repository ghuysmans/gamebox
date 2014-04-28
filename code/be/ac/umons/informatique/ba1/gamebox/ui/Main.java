package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

<<<<<<< HEAD
=======
import javax.imageio.ImageIO;
<<<<<<< HEAD
import javax.swing.Action;
>>>>>>> Started refactoring of games selection
=======
>>>>>>> Moved BoardPanel outside of Main; continued refactoring
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.Timer;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/** 
 * Main application window.
 */

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener {
	
	protected final GameContext context;
<<<<<<< HEAD
=======
	protected ActionListener newGame;
>>>>>>> Moved BoardPanel outside of Main; continued refactoring
	protected ArrayList<UiGame> games;
	protected boolean debug;
	
	protected Timer tmrPlay;
	//protected Timer tmrClock;
	protected final JMenuBar menuBar = new JMenuBar();
	
	protected final JMenu gamesMenu = new JMenu("Jeux");
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
		for (UiGame gd: games)
			gamesMenu.add(new GameMenu(gd));
		menuBar.add(gamesMenu);
		
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
	 * @see UiGame#createPanel(GameContext)
	 */
	private void loadBoardPanel() throws URISyntaxException, IOException {
		BoardPanel bp = null;
<<<<<<< HEAD
		if (context.game instanceof Connect4)
			setContentPane(bp = new BoardPanel("fiar/board", "fiar/yellow", "fiar/red", true));
		else if (context.game instanceof TicTacToe)
			setContentPane(bp = new BoardPanel("ttt/board", "ttt/o", "ttt/x", false));
		else if (context.game instanceof Othello)
			setContentPane(bp = new BoardPanel("oth/board", "oth/black", "oth/white", false));
		setSize(bp.pieceSize*context.game.board.getWidth()+50, bp.pieceSize*context.game.board.getHeight()+80);
		//revalidate(); //FIXME find a way to do it without revalidate()
=======
		setContentPane(bp = UiGame.createPanel(games, context));
		setSize(bp.pieceSize*context.game.board.getWidth()+50, bp.pieceSize*context.game.board.getHeight()+80); //FIXME
<<<<<<< HEAD
		revalidate(); //FIXME
>>>>>>> Finished games list refactoring
=======
		revalidate(); //FIXME not present in Java 6
>>>>>>> Made menus display correctly
	}
	
	/**
	 * Creates a main window
	 * @param dbg Debug mode
	 */
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
		
<<<<<<< HEAD
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
				catch (Exception ex) {
					//FIXME better exception handling? logging?
					ex.printStackTrace();
				}
			}
		};
=======
		games = new ArrayList<UiGame>();
		games.add(new UiGame("Puissance 4", Connect4.class, 7, 6, "fiar/board", "fiar/yellow", "fiar/red", true));
		games.add(new UiGame("Tic-tac-toe", TicTacToe.class, 3, 3, "ttt/board", "ttt/o", "ttt/x", false));
		games.add(new UiGame("Othello", Othello.class, 8, 8, "oth/board", "oth/black", "oth/white", false));
>>>>>>> Finished games list refactoring
		
		context = GameContext.loadContext("savegame.dat");
		//this must be done here because these constructors need a valid context
		p1 = new HumanPlayerMenu(this, "Joueur 1", 0);
		p2 = new HumanPlayerMenu(this, "Joueur 2", 1);
		
		initMenus();
		
		if (context.game != null) {
			try {
				loadBoardPanel();
			} catch (Exception ex) {
				//FIXME better exception handling? logging?
				ex.printStackTrace();
			}
		}
<<<<<<< HEAD
=======
		
>>>>>>> Finished games list refactoring
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
		System.out.println(context.game.getResult(context.game.players[0]));
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

<<<<<<< HEAD
<<<<<<< HEAD
	
	
=======
>>>>>>> Moved BoardPanel outside of Main; continued refactoring
	/**
	 * Information bar displaying scores, time (to be implemented)...
	 */
	class InfoBar extends JPanel {
		protected final ScoreLabel sp1 = new ScoreLabel(context.game.players[0]);
		protected final ScoreLabel sp2 = new ScoreLabel(context.game.players[1]);
		
		public InfoBar() {
			add(sp1);
			add(sp2);
		}

		class ScoreLabel extends ZoomedLabel {
			public ScoreLabel(Player p) {
				super(Integer.toString(context.game.getScore(p)), 2);
			}
		}
	}
	
<<<<<<< HEAD
=======
>>>>>>> Moved BoardPanel outside of Main; continued refactoring
=======
>>>>>>> Started refactoring of games selection
	/**
	 * Menu allowing selection of a game and customization of its board
	 */
	class GameMenu extends JMenu {
<<<<<<< HEAD
<<<<<<< HEAD
		class GameMenuItemNormal extends JMenuItem implements ActionListener {
=======
		public class GameMenuItemNormal extends JMenuItem implements ActionListener {
>>>>>>> Moved BoardPanel outside of Main; continued refactoring
			UiGame descriptor;
			
			/**
			 * Creates a game variant menu item
			 * @param gd Game descriptor
			 * @param caption Displayed text
			 */
			public GameMenuItemNormal(UiGame gd, String caption) {
<<<<<<< HEAD
				super(caption);
				descriptor = gd;
				addActionListener(this);
			}

			/**
			 * Handles clicks
			 */
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					context.game = descriptor.createGame();
					enablePlayersSelection(true);
					loadBoardPanel();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		class GameMenuItemCustom extends GameMenuItemNormal {
			public GameMenuItemCustom(UiGame gd, String caption) {
				super(gd, caption);
			}
			
			/**
			 * Shows a dialog asking for board size
			 */
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Manquant"); //FIXME
			}
		}

		public GameMenu(UiGame gd) {
			super(gd.desc);
			add(new GameMenuItemNormal(gd, "Traditionnel"));
			add(new GameMenuItemCustom(gd, "Personnalisé"));
=======
		public class GameMenuItemNormal extends JMenuItem {
			public GameMenuItemNormal(Class<Game> game, String caption) {
=======
>>>>>>> Moved BoardPanel outside of Main; continued refactoring
				super(caption);
				descriptor = gd;
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		}
		
		public class GameMenuItemCustom extends GameMenuItemNormal {
			public GameMenuItemCustom(UiGame gd, String caption) {
				super(gd, caption);
			}
		}

<<<<<<< HEAD
		public GameMenu(GameDescriptor gd) {
			add(new GameMenuItemNormal(gd.cls, "Traditionnel"));
			add(new GameMenuItemCustom(gd.cls, "Personnalisé"));
>>>>>>> Started refactoring of games selection
=======
		public GameMenu(UiGame gd) {
			add(new GameMenuItemNormal(gd, "Traditionnel"));
			add(new GameMenuItemCustom(gd, "Personnalisé"));
>>>>>>> Moved BoardPanel outside of Main; continued refactoring
		}
	}
	
	
	
	public static void main(String[] args) {
		new Main(args.length==1 && args[0].equals("-d"));
	}

}
