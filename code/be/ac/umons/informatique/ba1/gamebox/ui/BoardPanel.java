package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * Responsible for making a game playable.
 * We'll need to use different classes later if we want to handle animations.
 */
@SuppressWarnings("serial")
class BoardPanel extends JPanel implements SavedObserver, MouseListener {
	
	/**
	 * Maximum piece size, in pixels. Corresponds to a tile's size.
	 * This constant avoids displaying ugly "overzoomed" tiles...
	 */
	private static final int PIECE_MAX_SIZE = 100;

	/**
	 * Minimum piece size, in pixels. Corresponds to a tile's size.
	 * This constant avoids displaying a useless patch on the screen...
	 */
	private static final int PIECE_MIN_SIZE = 16;

	/**
	 * Current context (game, players...)
	 */
	protected final GameContext context;
	
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
	 * Do we have to display legal moves, too?
	 */
	protected boolean showLegal;
	
	/**
	 * Is an AI working NOW?
	 */
	protected boolean working;
	
	/**
	 * Is the debug mode enabled?
	 */
	protected boolean debug;
	
	
	/**
	 * Loads an image from the res folder. Typically called from the constructor.
	 * @param name Image name, without extension nor absolute path
	 * @return Usable Image object
	 */
	protected Image getImage(String name) throws URISyntaxException, IOException {
		return ImageIO.read(getClass().getResourceAsStream("/res/"+name+".png"));
	}
	
	/**
	 * Creates a panel object associated to the given context.
	 * @param  ctx Game context
	 * @param  d   Debug mode
	 * @return A Panel to be used in {@link Main}
	 * @throws URISyntaxException Invalid texture path
	 * @throws IOException        Can't read a texture
	 */
	public static BoardPanel create(GameContext ctx, boolean d) throws URISyntaxException, IOException {
		for (UiGame g: UiGame.values())
			if (g.cls == ctx.game.getClass())
				return new BoardPanel(ctx, g.txBoard, g.txP1, g.txP2, g.txRev, d);
		return null; //not found
	}
	
	/**
	 * Registers listeners and preloads images
	 * @param c  Context
	 * @param b  Board image name
	 * @param p1 Player1's piece name
	 * @param p2 Player2's piece name
	 * @param r  Reversed display
	 * @param d  Debug mode
	 */
	private BoardPanel(GameContext c, String b, String p1, String p2, boolean r, boolean d) throws URISyntaxException, IOException {
		addMouseListener(this);
		c.game.addTmpObserver(this);
		
		context = c;
		imgBoard = getImage(b);
		imgP1 = getImage(p1);
		imgP2 = getImage(p2);
		reversed = r;
		debug = d;
		
		setMaximumSize(new Dimension(PIECE_MAX_SIZE * context.game.board.getWidth(), PIECE_MAX_SIZE * context.game.board.getHeight()));
		setMinimumSize(new Dimension(PIECE_MIN_SIZE * context.game.board.getWidth(), PIECE_MIN_SIZE * context.game.board.getHeight()));
	}
	
	/**
	 * Paints a piece using pieceSize and the right image
	 * @param g  Graphics object (typically given by {@link #paintComponent(Graphics)})
	 * @param pc Piece to extract the owner from
	 * @param x  Cell's X coordinate
	 * @param y  Cell's Y coordinate
	 */
	private void paintPiece(Graphics2D g, Piece pc, int x, int y) {
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
	private void paintBoard(Graphics2D g, int x, int y) {
		g.drawImage(imgBoard, x*pieceSize, y*pieceSize, (x+1)*pieceSize, (y+1)*pieceSize, 0, 0, PIECE_MAX_SIZE, PIECE_MAX_SIZE, null);
	}
	
	/**
	 * Paints the whole board taking account of legal moves (to display or not)
	 */
	@Override
	public void paintComponent(Graphics g){ 
		//Compute pieces' size before doing anything
		pieceSize = Math.min(PIECE_MAX_SIZE, Math.min(getWidth()/context.game.board.getWidth(), getHeight()/context.game.board.getHeight()));
		//Enable anti-aliasing
		Graphics2D g2d = (Graphics2D)g;
		Main.enableAntiAliasing(g2d);
		//Create an AI object if needed
		AI ai = null;
		if (debug && !working) { //avoid a nasty error condition...
			int lvl = -1; //invalid
			if (context.game.players[0] instanceof ComputerPlayer)
				lvl = ((ComputerPlayer)context.game.players[0]).level-2;
			else if (context.game.players[1] instanceof ComputerPlayer)
				lvl = ((ComputerPlayer)context.game.players[1]).level-2;
			if (lvl < 0) //invalid level?
				lvl = 5; //set a default one...
			ai = new NegamaxAI(context.game, lvl);
		}
		//Actually start painting...
		super.paintComponent(g); //paint the background
		//For each piece,
		for (int x=0; x<context.game.board.getWidth(); x++) {
			for (int y=0; y<context.game.board.getHeight(); y++) {
				boolean lm = false;
				Move mv = context.game.createMove(x, y);
				Piece pc = context.game.board.getPiece(x, y);
				//Determine if we have to show whether this move is legal
				if (context.game.getLegalMoves() != null)
					lm = context.game.getLegalMoves().contains(mv) && showLegal;
				//If so, use a fake piece (the previously read value was null)
				if (lm)
					pc = new Piece(context.game.getCurrentPlayer());
				//Display in the right order
				if (reversed) {
					paintPiece(g2d, pc, x, y);
					paintBoard(g2d, x, y);
				}
				else {
					paintBoard(g2d, x, y);
					paintPiece(g2d, pc, x, y);
				}
				//Add a green circle if we drew a legal move
				if (lm) {
					g.setColor(Color.GREEN);
					//TODO find a better way to compute its position and size
					g.fillOval(x*pieceSize+pieceSize/2-15, y*pieceSize+pieceSize/2-15, 30, 30); 
					//Display the score (if needed)
					if (ai != null) {
						//Compute the score
						//XXX warning reentrancy due to callback
						mv.play(false);
						int v = -ai.computeNode();
						context.game.history.undo(false);
						//Display it
						g.setColor(Color.BLACK);
						//TODO find a better way to compute its position
						g.drawString(Integer.toString(v), x*pieceSize+pieceSize/2-8, y*pieceSize+pieceSize/2+6);
					}
				}
			}
		}
	}

	/**
	 * Hides legal moves
	 */
	@Override public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON3) {
			showLegal = false;
			repaint();
		}
	}
	
	/**
	 * Displays legal moves
	 */
	@Override public void mousePressed(MouseEvent e) {
		if (e.getButton()==MouseEvent.BUTTON3 && !context.game.hasFinished()) {
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
		if (working) return; //avoid reentrancy!
		if (e.getButton()==MouseEvent.BUTTON1 && //left click 
				context.mode==GameMode.NORMAL && //not automatic 
				context.game.getCurrentPlayer()!=null) { //there's a current player
			working = true;
			if (e.isShiftDown()) {
				if (context.game.history.size() != 0)
					context.game.history.undo(true);
			}
			else if (!context.game.hasFinished())
			{
				if (context.game.getCurrentPlayer() instanceof ComputerPlayer && !(e.isControlDown() && debug))
					//it's a computer player, just ask it to play
					((ComputerPlayer)context.game.getCurrentPlayer()).play();
				else if (!context.game.hasFinished()) {
					try {
						//it's a human player, let's convert the current mouse position to coordinates
						Move mv = context.game.createUserMove(e.getPoint().x/pieceSize, e.getPoint().y/pieceSize);
						//if the given move is legal, play it
						if (context.game.getLegalMoves().contains(mv))
							mv.play(true);
						//automatically asks for the computer player to play
						if (!context.game.hasFinished() && context.game.getCurrentPlayer() instanceof ComputerPlayer && !debug)
							((ComputerPlayer)context.game.getCurrentPlayer()).play();
					}
					catch (Exception ex) {
						//nothing to do
					}
				}
			}
			if (context.game.hasFinished()) {
				if (context.game.getResult(context.game.players[0]) == Game.RESULT_WON)
					JOptionPane.showMessageDialog(null, context.game.players[0].name+" a gagné !");
				else if (context.game.getResult(context.game.players[1]) == Game.RESULT_WON)
					JOptionPane.showMessageDialog(null, context.game.players[1].name+" a gagné !");
				else
					JOptionPane.showMessageDialog(null, "Match nul !");
			}
			working = false;
		}
	}

	@Override
	public void update(SavedObservable g, Object param) {
		if (param.equals("chg") || param.equals("stp"))
			repaint();
	}
}
