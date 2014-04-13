package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Dimension;

import javax.swing.JComboBox;

/**
 * ComboBox with the smallest possible height
 */

@SuppressWarnings("serial")
public class ThinCombo<E> extends JComboBox<E> {

	public ThinCombo(E[] arr) {
		super(arr);
	}
	
	@Override
	public Dimension getMaximumSize() {
		Dimension ret = getPreferredSize();
		ret.width = super.getMaximumSize().width;
		return ret;
	}

}
