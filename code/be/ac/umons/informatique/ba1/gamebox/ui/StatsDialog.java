package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

/**
 * AI's selection dialog featuring two (!) JSliders.
 * Simply adapted from AiDialog...
 */

@SuppressWarnings("serial")
class StatsDialog extends AiAbstractDialog implements ActionListener { 
	
	protected static final boolean MODAl = true;
	protected final JSlider lvl1, lvl2;
	protected JLabel occt = new JLabel("Nombre de parties à tester : ");
	protected ThinTextField occ = new ThinTextField(4);
	
	public StatsDialog(JFrame parent) {
		super(parent, "Choix des niveaux d'IA");
		setSize(250, 195);
		setLocationRelativeTo(parent);
		setLayout(new FlowLayout());
		setResizable(false);
		
		lvl1 = createAiLevelSlider(-1); //FIXME
		lvl2 = createAiLevelSlider(-1); //FIXME
		
		//Box field = new Box();
		
		add(lvl1);
		add(lvl2);
		Box add = Box.createHorizontalBox();
		add.add(occt);
		add.add(occ);
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
		String str = occ.getText();
		int res = Integer.parseInt(str);
		return res;
	}
}
