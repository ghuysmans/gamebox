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
class AiDialog extends AiAbstractDialog implements ActionListener {

	protected static final String DEFAULT_NAME = "Ordinateur"; 
	
	protected final JTextField name = new ThinTextField(DEFAULT_NAME, 8);
	protected final JSlider diff;
	
	/**
	 * Creates a pre-filled AI selection dialog
	 * @param parent
	 * @param gc Current game context
	 * @param plid	index in {@link GameContext#selPlayers} 
	 */
	public AiDialog(JFrame parent, GameContext gc, int plid) {
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
	
	public String getName() {
		String s = name.getText().trim();
		if (s.equals(""))
			return DEFAULT_NAME;
		else
			return s;
	}
	
	public int getDifficulty() {
		return diff.getValue();
	}
	
	protected boolean validateInput() {
		return true;
	}

}
