package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * AI selection dialog featuring a JSlider
 */

@SuppressWarnings("serial")
class AiDialog extends AiAbstractDialog implements ActionListener {

	protected static final String DEFAULT_NAME = "Ordinateur"; 
	
	protected final JTextField name = new ThinTextField(DEFAULT_NAME, 8);
	protected final JSlider diff = new JSlider(JSlider.HORIZONTAL, AI.LEVEL_MIN, AI.LEVEL_MAX, (AI.LEVEL_MAX+AI.LEVEL_MIN)/2);

	public AiDialog(JFrame parent, boolean modal) {
		super(parent, "Choix de l'IA", modal);
		setSize(250, 145);
		setLocationRelativeTo(parent);
		setLayout(new FlowLayout());
		setResizable(false);
		
		initAiLevelSlider(diff);
		
		Box sup = Box.createHorizontalBox();
		sup.add(new JLabel("Nom donné à l'IA : "));
		sup.add(name);
		
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

}
