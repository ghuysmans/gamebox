package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JSlider;

/**
 * AI's selection dialog featuring two (!) JSliders.
 * Simply adapted from AiDialog...
 */

@SuppressWarnings("serial")
class StatsDialog extends AiAbstractDialog implements ActionListener { 
	
	protected final JSlider lvl1, lvl2;

	public StatsDialog(JFrame parent, boolean modal) {
		super(parent, "Choix des niveaux d'IA", modal);
		setSize(250, 165);
		setLocationRelativeTo(parent);
		setLayout(new FlowLayout());
		setResizable(false);
		
		lvl1 = createAiLevelSlider(-1); //FIXME
		lvl2 = createAiLevelSlider(-1); //FIXME
		
		add(lvl1);
		add(lvl2);
		add(createControlsBox());
		
		setVisible(true);
	}
	
	public int getLevel1() {
		return lvl1.getValue();
	}
	
	public int getLevel2() {
		return lvl2.getValue();
	}

}
