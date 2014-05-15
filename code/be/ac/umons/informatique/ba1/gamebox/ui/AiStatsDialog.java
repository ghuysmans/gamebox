package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

/**
 * AI's selection dialog featuring two (!) JSliders.
 * Simply adapted from AiDialog...
 */

@SuppressWarnings("serial")
class AiStatsDialog extends AiAbstractDialog implements ActionListener { 
	
	/**
	 * Default rounds count
	 */
	protected final int DEFAULT_ROUNDS = 10;
	
	/**
	 * Sliders used to select AI levels
	 */
	protected final JSlider lvl1, lvl2;
	
	/**
	 * Do we need to ask about rounds to play?
	 */
	protected final boolean hasRounds;
	
	/**
	 * Rounds label
	 */
	protected final JLabel rounds = new JLabel("Nombre de parties à tester : ");
	
	/**
	 * Rounds textfield
	 */
	protected final ThinTextField roundsField = new ThinTextField(Integer.toString(DEFAULT_ROUNDS), 4);
	
	
	/**
	 * Creates an {@link AiStatsDialog}
	 * @param parent Parent frame
	 * @param ct     Ask for rounds count?
	 */
	public AiStatsDialog(JFrame parent, boolean ct) {
		super(parent, "Choix des niveaux d'IA");
		
		if (hasRounds = ct)
			setSize(280, 195);
		else
			setSize(280, 165);
		setLocationRelativeTo(parent);
		setLayout(new FlowLayout());
		setResizable(false);
		
		lvl1 = createAiLevelSlider(-1); 
		lvl2 = createAiLevelSlider(-1); 
		
		
		add(lvl1);
		add(lvl2);
		Box add = Box.createHorizontalBox();
		if (hasRounds) {	
			add.add(rounds);
			add.add(roundsField);
		}
		add(add);
		add(createControlsBox());
		
		if (hasRounds)
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowOpened(WindowEvent arg0) {
					roundsField.requestFocus();
				}
			});
		
		setVisible(true);
	}
	
	/**
	 * Gets the selected level for AI1
	 * @return Level
	 */
	public int getLevel1() {
		return lvl1.getValue();
	}
	
	/**
	 * Gets the selected level for AI2
	 * @return Level
	 */
	public int getLevel2() {
		return lvl2.getValue();
	}
	
	/**
	 * Gets the given rounds count. Fails if !{@link #hasRounds} 
	 * @return Count
	 */
	public int getRoundsCount() {
		return Integer.parseInt(roundsField.getText());
	}

	/**
	 * Checks whether {@link #roundsField} contains a valid value
	 */
	protected boolean validateInput() {
		try {
			return (!hasRounds || getRoundsCount()>0);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Le nombre de tests doit être positif et entier !", "Erreur", JOptionPane.WARNING_MESSAGE);
			return false;
		}
	}
	
}
