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

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * AI's selection dialog featuring two JSliders
 */

@SuppressWarnings("serial")
class AiAbstractDialog extends JDialog implements ActionListener {

	//FIXME margins here?
	
	protected boolean cancelled = true; //by default (to avoid handling the window's closing)
	protected final JButton btnOK = new JButton("OK");
	protected final JButton btnCcl = new JButton("Annuler");
	
	/**
	 * Initializes a slider with appropriate levels for the different difficulty levels.
	 * @param diff Slider used by the user to select the difficulty level
	 */
	protected void initAiLevelSlider(JSlider diff) {
		diff.setMajorTickSpacing(1); diff.setMinorTickSpacing(1);
		diff.setPaintTicks(true);
		Dictionary<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
		labelTable.put(new Integer(AI.LEVEL_MIN), new JLabel("Facile"));
		labelTable.put(new Integer(AI.LEVEL_MAX), new JLabel("Difficile"));
		diff.setLabelTable(labelTable);
		diff.setPaintLabels(true);
	}
	
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
	
	public AiAbstractDialog(JFrame parent, String caption, boolean modal) {
		super(parent, caption, modal);
	}

}
