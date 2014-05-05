package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JSlider;
import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * AI's selection dialog featuring two (!) JSliders.
 * Simply adapted from AiDialog...
 */

@SuppressWarnings("serial")
class StatsDialog extends AiAbstractDialog implements ActionListener { 
	
	protected final JSlider lvl1 = new JSlider(JSlider.HORIZONTAL, AI.LEVEL_MIN, AI.LEVEL_MAX, (AI.LEVEL_MAX+AI.LEVEL_MIN)/2);
	protected final JSlider lvl2 = new JSlider(JSlider.HORIZONTAL, AI.LEVEL_MIN, AI.LEVEL_MAX, (AI.LEVEL_MAX+AI.LEVEL_MIN)/2);

	public StatsDialog(JFrame parent, boolean modal) {
		super(parent, "Choix des niveaux d'IA", modal);
		setSize(400, 300);
		setLocationRelativeTo(parent);
		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		setResizable(false);
		
		initAiLevelSlider(lvl1);
		initAiLevelSlider(lvl2);
		
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
