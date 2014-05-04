package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * AI selection dialog featuring a JSlider
 */

@SuppressWarnings("serial")
class AiDialog extends JDialog implements ActionListener {

	//FIXME margins
	protected static final String DEFAULT_NAME = "Ordinateur"; 
	
	protected boolean cancelled;
	protected final JTextField name = new ThinTextField(DEFAULT_NAME, 20);
	protected final JSlider diff = new JSlider(JSlider.HORIZONTAL, AI.LEVEL_MIN, AI.LEVEL_MAX, (AI.LEVEL_MAX+AI.LEVEL_MIN)/2);
	protected final JButton btnOK = new JButton("OK");
	protected final JButton btnCcl = new JButton("Annuler");

	public AiDialog(JFrame parent, boolean modal) {
		super(parent, "Choix de l'IA", modal);
		setSize(400, 150);
		setLocationRelativeTo(parent);
		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		setResizable(false);
		
		diff.setMajorTickSpacing(1); diff.setMinorTickSpacing(1);
		diff.setPaintTicks(true);
		Dictionary<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
		labelTable.put(new Integer(AI.LEVEL_MIN), new JLabel("Facile"));
		labelTable.put(new Integer(AI.LEVEL_MAX), new JLabel("Difficile"));
		diff.setLabelTable(labelTable);
		diff.setPaintLabels(true);
		
		Box sup = Box.createHorizontalBox();
		sup.add(new JLabel("Nom donné à l'IA : "));
		sup.add(name);
		
		Box ctl = Box.createHorizontalBox();
		
		btnOK.addActionListener(this);
		btnCcl.addActionListener(this);
		ctl.add(btnOK);
		ctl.add(Box.createHorizontalStrut(10));
		ctl.add(btnCcl);
				
		add(sup);
		add(Box.createVerticalStrut(5));
		add(diff);
		add(ctl);
		
		setVisible(true);
	}
	
	public boolean getCancelled() {
		return cancelled;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCcl)
			cancelled = true;
		setVisible(false);
	}

}
