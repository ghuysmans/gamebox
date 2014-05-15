package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

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
	
	/**
	 * Default frame width
	 */
	protected static final int DEFAULT_WIDTH  = 600;
	
	/**
	 * Default frame height
	 */
	protected static final int DEFAULT_HEIGHT = 600;
	
	/**
	 * Game context, saved when the application is closed 
	 */
	protected final GameContext context;
	
	/**
	 * Debug mode flag
	 */
	protected boolean debug;
	
	/**
	 * Timer used by {@link #doPlay()}
	 */
	protected Timer tmrPlay;
	
	/**
	 * Flag avoiding concurrent {@link #doPlay()} calls
	 */
	protected boolean tmrPlayWorking;
	
	/**
	 * Menu bar
	 */
	protected final JMenuBar menuBar = new JMenuBar();
	
	/**
	 * Main menus
	 */
	protected final JMenu 	gamesMenu = new JMenu("Jeux"),
							stats = new JMenu("Statistiques"),
							help = new JMenu("Aide");

	/**
	 * Players sub-menu
	 */
	protected final JMenu pls = new JMenu("Joueurs");
	
	/**
	 * Players
	 */
	protected final PlayerMenu p1, p2;
	
	/**
	 * Game menu items
	 */
	protected final JMenuItem 	valPls = new JMenuItem("Lancer le jeu"), 
								mngPls = new JMenuItem("Gérer"),
								ach = new JMenuItem("Succès");
	
	/**
	 * String used to identify both stats menus.
	 * @see #doStats(ActionEvent)
	 */
	protected final String ACTION_STATS = "STATS";
	
	/**
	 * Stats menu items
	 */
	protected final JMenuItem 	res = new JMenuItem("Résultats"),
								graph = new JMenuItem("Graphique");
	
	/**
	 * Help menu items
	 */
	protected final JMenuItem manual = new JMenuItem("Manuel");
	protected final JMenuItem about = new JMenuItem("À propos de...");
	
	/**
	 * Debug menu item
	 * @see #doDebug()
	 */
	protected final JMenuItem dbg = new JMenuItem("DEBUG");
	
	
	/**
	 * Creates a main window
	 * @param dbg Debug mode
	 */
	public Main(boolean dbg) {
		debug = dbg;
		
		//this must be done here because these attributes are final
		context = GameContext.loadContext("savegame.dat");
		
		//this must be done before creating players menus... 
		if (context.firstLaunch)
			showFirstLaunch();
		
		p1 = new PlayerMenu(this, "Joueur 1", 0);
		p2 = new PlayerMenu(this, "Joueur 2", 1);
		
		initUI();

		tmrPlay = new Timer(800, this);
		tmrPlay.start();
		setVisible(true);
	}

	
	/**
	 * Enables anti-aliasing when drawing on g. We've put it here to avoid redundancy.
	 * @param g Graphics2D object
	 */
	public static void enableAntiAliasing(Graphics2D g) {
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.addRenderingHints(rh);
	}
		
	/**
	 * Sets the enabled state of menus used for player selection
	 * @param e True for enabled
	 */
	protected void enablePlayersSelection(boolean e) {
		p1.setVisible(e);
		p2.setVisible(e);
		valPls.setVisible(e);
		stats.setVisible(e);
	}
	
	/**
	 * Initializes menus
	 */
	private void initMenus() {
		for (UiGame gd: UiGame.values())
			gamesMenu.add(new GameMenu(gd));
		menuBar.add(gamesMenu);
		
		pls.add(p1); pls.add(p2);
		pls.add(valPls); valPls.addActionListener(this);
		pls.add(mngPls); mngPls.addActionListener(this);
		
		enablePlayersSelection(false);
		
		pls.add(ach); ach.addActionListener(this);
		menuBar.add(pls);
		
		stats.add(res); res.addActionListener(this); res.setActionCommand(ACTION_STATS);
		stats.add(graph); graph.addActionListener(this); graph.setActionCommand(ACTION_STATS);
		menuBar.add(stats);
		
		if (debug) {
			help.add(dbg);
			dbg.addActionListener(this);
		}
		help.add(manual); manual.addActionListener(this);
		help.add(about); about.addActionListener(this);
		menuBar.add(help);

		setJMenuBar(menuBar);
	}
	
	/**
	 * Loads a board panel, displays it and resizes the JFrame.
	 * Both exception are declared to avoid ignoring an NPE thrown because of an unknown game.
	 * @see BoardPanel#create(GameContext, boolean)
	 */
	private void loadBoardPanel() {
		try {
			getContentPane().removeAll(); //removeAll() would have removed the menus, too!
			add(BoardPanel.create(context, debug), BorderLayout.CENTER);
			add(new InfoBar(), BorderLayout.SOUTH);
			//manual revalidate() for Java 6 
			getContentPane().validate();
			validate();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Impossible d'afficher le jeu sauvegardé !\nMessage : "+ex.getMessage(), 
												"Erreur", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Initializes the user interface, creating menus, registering listeners...
	 */
	private void initUI() {
		setTitle("Game box");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		//move & size it a smart way
		setSize(DEFAULT_WIDTH+HelpDialog.WIDTH, DEFAULT_HEIGHT);
		setLocationRelativeTo(null);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

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
		
		initMenus();
		
		if (context.game != null)
			loadBoardPanel();
	}
	
	/**
	 * Asks the user to create profiles, etc.
	 */
	private void showFirstLaunch() {
		int ans = JOptionPane.showConfirmDialog(this, 
					"Bienvenue ! Voulez-vous créer un profil de joueur ? \n"+
					"Cela vous permettra de jouer vous-même et \n"+
					"d'enregistrer les succès que vous débloquerez. \n\n"+
					"Cette option est disponible à tout moment \n"+
					"depuis le menu Joueurs>Gérer.", 
					"Premier lancement", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (ans == JOptionPane.YES_OPTION)
			new PlayersDialog(context, this);
		context.firstLaunch = false;
	}
	
	/**
	 * Computer autoplay if we're in the right mode 
	 */
	private void doPlay() {
		if (!tmrPlayWorking && //avoid concurrent computing
			context.mode==GameMode.AUTOMATIC && //right mode? 
			(context.game.getCurrentPlayer() instanceof ComputerPlayer) && //something to do? 
			!context.game.hasFinished()) { //not finished?
				tmrPlayWorking = true;
				((ComputerPlayer)context.game.getCurrentPlayer()).play();
				tmrPlayWorking = false;
		}
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
			new AchievementsDialog(context.humans, this);
	}
	
	/**
	 * Validates the players selection
	 */
	private void doValPlayersSel() {
		if (context.isPlayerSelectionValid()) {
			enablePlayersSelection(false);
			context.game.setPlayers(context.selPlayers[0], context.selPlayers[1]);
			context.mode = GameMode.NORMAL;
		}
		else
			JOptionPane.showMessageDialog(this, "Veuillez sélectionner deux joueurs distincts...", 
												"Attention", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Shows players management dialog and refreshes menus after it's closed
	 */
	private void showPlayers() {
		new PlayersDialog(context, this);
		p1.refresh();
		p2.refresh();
	}
	
	/**
	 * Shows the about dialog
	 */
	private void showAbout() {
		try {
			new AboutDialog(this, 8, 50);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Impossible de charger l'image de la boite de dialogue !\n"+
												"Les images sont-elles présentes ?\nMessage : "+e.getMessage(), 
												"Erreur", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Shows the manual
	 */
	private void showManual() {
		try {
			new HelpDialog(this);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Impossible de charger le fichier d'aide !\nMessage : "+e.getMessage(), 
												"Erreur", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Asks the user for the AI's to compare and starts working!
	 * @param e Clicked menu
	 */
	private void doStats(ActionEvent e) {
		try {
			assert(context.game != null): "A game must be selected";
			StatsDialog sd;
				if (e.getSource() == graph) {
					sd = new StatsDialog(this, false);
					if (!sd.cancelled) {
						ComputerPlayer ai1 = new ComputerPlayer(context.game, "AI1", sd.getLevel1());
						ComputerPlayer ai2 = new ComputerPlayer(context.game, "AI2", sd.getLevel2());
						context.game.setPlayers(ai1, ai2);
						context.mode = GameMode.AUTOMATIC;
						enablePlayersSelection(false);
					}
				}
				else if (e.getSource() == res) {
					sd = new StatsDialog(this, true);
					if (!sd.cancelled) {
						ComputerPlayer ai1 = new ComputerPlayer(context.game, "AI1", sd.getLevel1());
						ComputerPlayer ai2 = new ComputerPlayer(context.game, "AI2", sd.getLevel2());
						new AiStatsResultsDialog(context.game.getClass(), ai1, ai2, this, sd.getRoundsCount());
					}
				}
			
		}
		catch (NumberFormatException i) {
			JOptionPane.showMessageDialog(this, i.getCause().getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
		}
		catch (Exception i) {
			JOptionPane.showMessageDialog(this, i.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
		}
	}

	
	/**
	 * Handles timers and some menus, deferring work to private methods
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tmrPlay) doPlay();
		else if (e.getSource() == dbg) doDebug();
		else if (e.getSource() == ach) showAchievements();
		else if (e.getSource() == valPls) doValPlayersSel();
		else if (e.getSource() == mngPls) showPlayers();
		else if (e.getSource() == manual) showManual();
		else if (e.getSource() == about) showAbout();
		else if (e.getActionCommand() == ACTION_STATS) doStats(e);
	}
	
	
	
	/**
	 * Menu presenting a list of human players for selection.
	 */
	class PlayerMenu extends JMenu {
		
		/**
		 * Frame passed to {@link PlayerMenuItem}
		 */
		protected JFrame frame;
		
		/**
		 * Player index in {@link GameContext#selPlayers}
		 */
		protected int id;
		
		
		/**
		 * Creates a player(s) menu
		 * @param caption Displayed text
		 * @param id      Player index (in context.selPlayers)
		 */
		public PlayerMenu(JFrame frm, String caption, int id) {
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
			ButtonGroup grp = new ButtonGroup();
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
		
		/**
		 * Attached player (null if this item is used to select an AI)
		 */
		public final Player player;
		
		/**
		 * Player index in {@link GameContext#selPlayers}
		 */
		public final int id;
		
		/**
		 * Parent frame for {@link AiSelectionDialog}
		 */
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
				AiSelectionDialog dlg = new AiSelectionDialog(frame, context, id);
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
	 * Information bar displaying scores, time (to be implemented)...
	 */
	class InfoBar extends JPanel implements SavedObserver {
		
		/**
		 * Score panels (one for each player) 
		 */
		protected final ScorePanel sp1, sp2;
		
		
		/**
		 * Creates an information bar and attaches it to the current {@link Game}
		 */
		public InfoBar() {
			setLayout(new BorderLayout());
			add(sp1 = new ScorePanel(0, false), BorderLayout.WEST);
			add(sp2 = new ScorePanel(1, true), BorderLayout.EAST);
			context.game.addTmpObserver(this);
		}

		/**
		 * Updates both score panels
		 */
		@Override
		public void update(SavedObservable g, Object param) {
			if (param.equals("chg") || param.equals("stp")) {
				sp1.update();
				sp2.update();
			}
		}
		
		/**
		 * Displays information about one player
		 */
		protected class ScorePanel extends JPanel {
			
			/**
			 * Player index in {@link GameContext#selPlayers}
			 */
			protected int playerId;
			
			/**
			 * Score label
			 */
			protected ZoomedLabel score;
			
			/**
			 * Nickname label
			 */
			protected ZoomedLabel nick;
			
			
			/**
			 * Creates a score panel
			 * @param pid Player index in {@link Game#players}
			 * @param ll  Place the name label on the left? 
			 */
			public ScorePanel(int pid, boolean ll) {
				playerId = pid;
				
				setLayout(new FlowLayout());
				score = new ZoomedLabel("0", 4);
				nick = new ZoomedLabel("???", 2);
				if (ll) {
					add(nick);
					add(score);
				}
				else {
					add(score);
					add(nick);
				}
				
				update();
			}
			
			/**
			 * Updates nickname and score labels
			 */
			public void update() {
				Player p = context.game.players[playerId];
				if (p != null) {
					score.setForeground(p==context.game.getCurrentPlayer() ? Color.RED : Color.BLACK);
					score.setText(Integer.toString(context.game.getDisplayableScore(p)));
					nick.setText(p.name); //just in case it has changed...
				}
				else {
					score.setText("0");
					nick.setText("???");
				}
			}
		}
	}
	
	
	
	/**
	 * Game creation menu
	 */
	class GameMenu extends JMenu {
		
		/**
		 * Classic board selection
		 */
		class GameMenuItemNormal extends JMenuItem implements ActionListener {
			
			/**
			 * Associated descriptor
			 */
			UiGame descriptor;
			
			
			/**
			 * Creates a classic game menu item
			 * @param gd      Game descriptor
			 * @param caption Displayed text
			 */
			public GameMenuItemNormal(UiGame gd, String caption) {
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
				}
				catch(InvocationTargetException e) {
					JOptionPane.showMessageDialog(this, e.getCause().getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		
		/**
		 * Customized board selection
		 */
		class GameMenuItemCustom extends GameMenuItemNormal {
			
			/**
			 * Creates a game variant menu item
			 * @param gd      Game descriptor
			 * @param caption Displayed text
			 */
			public GameMenuItemCustom(UiGame gd, String caption) {
				super(gd, caption);
			}
			
			/**
			 * Shows a dialog asking for board size
			 */
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					CustomBoardDialog dlg = new CustomBoardDialog(null);
					if (!dlg.getCancelled()) {
						context.game = descriptor.createGame(dlg.getTypedWidth(), dlg.getTypedHeight());
						enablePlayersSelection(true);
						loadBoardPanel();
					}
				}
				catch(InvocationTargetException e) {
					JOptionPane.showMessageDialog(this, e.getCause().getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
				}
			}
		}

		/**
		 * Creates classical/customized game menus
		 * @param gd Game descriptor
		 */
		public GameMenu(UiGame gd) {
			super(gd.name);
			add(new GameMenuItemNormal(gd, "Traditionnel"));
			add(new GameMenuItemCustom(gd, "Personnalisé"));
		}
	}
	
	
	
	/**
	 * Opens the main application frame
	 * @param args "-d" enables the debug mode
	 */
	public static void main(String[] args) {
		//TODO remove this when the game is completely translated (frames, buttons, menus, etc.)
		Locale.setDefault(Locale.FRENCH);
		
		new Main(args.length==1 && args[0].equals("-d"));
	}

}
