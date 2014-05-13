package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

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
class StatsDialog extends AiAbstractDialog implements ActionListener { 
	
	protected final JSlider lvl1, lvl2;
	protected final boolean hasCount;
	protected final JLabel occt = new JLabel("Nombre de parties à tester : ");
	protected final ThinTextField occ = new ThinTextField(4);
	
	public StatsDialog(JFrame parent, boolean ct) {
		super(parent, "Choix des niveaux d'IA");
		
		if (hasCount = ct) setSize(250, 195);
		else setSize(250, 165);
		setLocationRelativeTo(parent);
		setLayout(new FlowLayout());
		setResizable(false);
		
		lvl1 = createAiLevelSlider(-1); 
		lvl2 = createAiLevelSlider(-1); 
		
		
		add(lvl1);
		add(lvl2);
		Box add = Box.createHorizontalBox();
		if (hasCount) {	
			add.add(occt);
			add.add(occ);
		}
		add(add);
		add(createControlsBox());
		
		setVisible(true);
	}
	
	public int getLevel1() {
		return lvl1.getValue();
	}
	
	public int getLevel2() {
		return lvl2.getValue();
	}
	
	public int getNumberOfTest() {
		return Integer.parseInt(occ.getText());
	}

	protected boolean validateInput() {
		try {
			return (!hasCount || getNumberOfTest()>0);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Le nombre de tests doit être positif et entier !", "Erreur", JOptionPane.WARNING_MESSAGE);
			return false;
		}
	}
	
}
