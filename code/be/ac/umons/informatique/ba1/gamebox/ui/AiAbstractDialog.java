package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * AI's selection dialog featuring two JSliders
 */

@SuppressWarnings("serial")
class AiAbstractDialog extends JDialog implements ActionListener {
	
	
	protected boolean cancelled = true; //by default (to avoid handling the window's closing)
	protected final JButton btnOK = new JButton("OK");
	protected final JButton btnCcl = new JButton("Annuler");
	protected JLabel occ = new JLabel("Nombres de parties à tester : ");
	protected JTextField fieldocc = new JTextField();
	public AiAbstractDialog(JFrame parent, String caption, boolean modal) {
		super(parent, caption, modal);
	}
	
	/**
	 * Creates a slider with labels for the different difficulty levels.
	 * @param value Default value (-1 means default)
	 */
	protected JSlider createAiLevelSlider(int value) {
		JSlider diff = new JSlider(JSlider.HORIZONTAL, AI.LEVEL_MIN, AI.LEVEL_MAX, value==-1 ? AI.LEVEL_MID : value);
		diff.setMajorTickSpacing(1); diff.setMinorTickSpacing(1);
		diff.setPaintTicks(true);
		Dictionary<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
		labelTable.put(new Integer(AI.LEVEL_MIN), new JLabel("Facile"));
		labelTable.put(new Integer(AI.LEVEL_MID), new JLabel("Moyenne"));
		labelTable.put(new Integer(AI.LEVEL_MAX), new JLabel("Difficile"));
		diff.setLabelTable(labelTable);
		diff.setPaintLabels(true);
		return diff;
	}
	
	/**
	 * Creates a box with a label and a field 
	 * @return Box to be added to the layout
	 */
	/**protected Box createFieldBox(){
		Box ctl = Box.createHorizontalBox();
		ctl.add(occ);
		ctl.add(fieldocc);
		return ctl;
	}*/
	
	
	/**
	 * Creates a box with OK and Cancel controls.
	 * @return Box to be added to the layout
	 */
	protected Box createControlsBox() {
		Box ctl = Box.createHorizontalBox();
		btnOK.addActionListener(this);
		btnCcl.addActionListener(this);
		ctl.add(btnOK);
		ctl.add(Box.createHorizontalStrut(10));
		ctl.add(btnCcl);
		return ctl;
	}
	
	/**
	 * Returns whether the frame has been closed without clicking OK
	 * @return false if the user has clicked on OK
	 */
	public boolean getCancelled() {
		return cancelled;
	}

	
	@Override
	public final void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOK)
			cancelled = false;
		setVisible(false);
	}

}
