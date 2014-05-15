package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.Insets;
import java.awt.geom.Rectangle2D;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 * A non-modal help dialog (HTML)
 */

@SuppressWarnings("serial")
class HelpDialog extends JDialog {

	/**
	 * Default frame width
	 */
	public static final int WIDTH = 370;
	
	public HelpDialog(JFrame parent) throws IOException {
		super(parent, "Aide", false);
		JEditorPane ep = new JEditorPane(getClass().getResource("/res/help.html"));
		ep.setEditable(false);
		ep.setMargin(new Insets(-20, 5, 5, 5));
		add(new JScrollPane(ep));
		
		//Stick it to the parent window
		Rectangle2D rect = parent.getBounds();
		setSize(WIDTH, (int)rect.getHeight());
		setLocation((int)rect.getMaxX(), (int)rect.getMinY());
		setResizable(true);
		
		setVisible(true);
	}
	
}
