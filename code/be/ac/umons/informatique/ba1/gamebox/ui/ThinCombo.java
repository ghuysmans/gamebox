package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Dimension;

import javax.swing.JComboBox;

/**
 * ComboBox with the smallest possible height.
 * This uses generics to facilitate Java 7 migration.
 */

@SuppressWarnings({ "serial", "rawtypes" })
public class ThinCombo<T> extends JComboBox {

	@SuppressWarnings("unchecked")
	public ThinCombo(Object[] arr) {
		super(arr);
	}
	
	@Override
	public Dimension getMaximumSize() {
		Dimension ret = getPreferredSize();
		ret.width = super.getMaximumSize().width;
		return ret;
	}

}
