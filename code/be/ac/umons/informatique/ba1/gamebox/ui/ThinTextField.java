package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.text.Document;

public class ThinTextField extends JTextField {

	public ThinTextField(String arg0) {
		super(arg0);
	}

	public ThinTextField(int arg0) {
		super(arg0);
	}

	public ThinTextField(String arg0, int arg1) {
		super(arg0, arg1);
	}
	
	@Override
	public Dimension getMaximumSize() {
		Dimension ret = getPreferredSize();
		ret.width = super.getMaximumSize().width;
		return ret;
	}

}
