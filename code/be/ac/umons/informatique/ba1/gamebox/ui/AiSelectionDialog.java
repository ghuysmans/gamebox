package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import be.ac.umons.informatique.ba1.gamebox.core.ComputerPlayer;

/**
 * AI selection dialog featuring a JSlider
 */

@SuppressWarnings("serial")
class AiSelectionDialog extends AiAbstractDialog implements ActionListener {

	/**
	 * Default computer player name
	 */
	protected static final String DEFAULT_NAME = "Ordinateur"; 
	
	/**
	 * Textfield containing the {@link ComputerPlayer}'s nickname
	 */
	protected final JTextField name = new ThinTextField(DEFAULT_NAME, 8);
	
	/**
	 * Difficulty level slider
	 */
	protected final JSlider diff;
	
	
	/**
	 * Creates a pre-filled AI selection dialog
	 * @param parent
	 * @param gc Current game context
	 * @param plid	index in {@link GameContext#selPlayers} 
	 */
	public AiSelectionDialog(JFrame parent, GameContext gc, int plid) {
		super(parent, "Choix de l'IA");
		setSize(250, 145);
		setLocationRelativeTo(parent);
		setLayout(new FlowLayout());
		setResizable(false);
		
		Box sup = Box.createHorizontalBox();
		sup.add(new JLabel("Nom donné à l'IA : "));
		sup.add(name);
		
		int lvl = -1; //default level
		if (gc.selPlayers[plid] instanceof ComputerPlayer)
			lvl = ((ComputerPlayer)gc.selPlayers[plid]).level;
		diff = createAiLevelSlider(lvl);
		
		add(sup);
		add(Box.createVerticalStrut(5));
		add(diff);
		add(createControlsBox());
		
		setVisible(true);
	}
	
	/**
	 * Gets the typed name 
	 * @return Entered name or {@link #DEFAULT_NAME} if it's empty
	 */
	public String getName() {
		String s = name.getText().trim();
		if (s.equals(""))
			return DEFAULT_NAME;
		else
			return s;
	}
	
	/**
	 * Gets the selected difficulty level
	 * @return Value in the right range
	 */
	public int getDifficulty() {
		return diff.getValue();
	}
	
	/**
	 * Nothing needs to be validated here
	 * @return true
	 */
	protected boolean validateInput() {
		return true;
	}

}
