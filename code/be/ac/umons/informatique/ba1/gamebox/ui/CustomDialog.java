package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CustomDialog extends JDialog implements ActionListener {
	
	protected boolean cancelled = true; //by default (to avoid handling the window's closing)
	protected static final boolean MODAL = true;
	protected final JTextField width = new ThinTextField("", 3);
	protected final JTextField height = new ThinTextField("", 3);
	protected final JButton btnOK = new JButton("OK");
	protected final JButton btnCcl = new JButton("Annuler");
	
	public CustomDialog(JFrame parent) {
		super(parent, "Personnalisation", MODAL);
		setSize(160, 120);
		setLocationRelativeTo(parent);
		setResizable(false);
		setLayout(new FlowLayout());
		
		Box box = Box.createHorizontalBox();
		box.add(new JLabel("Largeur : "));
		box.add(width);
		add(box);
		
		box = Box.createHorizontalBox();
		box.add(new JLabel("Hauteur : "));
		box.add(height);
		add(box);
		
		box = Box.createHorizontalBox();
		btnOK.addActionListener(this);
		btnCcl.addActionListener(this);
		box.add(btnOK);
		box.add(Box.createHorizontalStrut(10));
		box.add(btnCcl);
		add(box);
		
		setVisible(true);	
	}
	
	/**
	 * Returns whether the frame has been closed without clicking OK
	 * @return false if the user has clicked on OK
	 */
	public boolean getCancelled() {
		return cancelled;
	}
	
	public int getTypedWidth() {
		return Integer.parseInt(width.getText());
	}
	
	public int getTypedHeight() {
		return Integer.parseInt(height.getText());
	}
	
	protected boolean validateInput() {
		try {
			return (getTypedHeight()>0) && (getTypedWidth()>0);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Les valeurs doivent être positives et entières !", "Erreur", JOptionPane.WARNING_MESSAGE);
			return false;
		}
	}
	
	/**
	 * Handles buttons, validating data if needed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == btnOK) {
				if (validateInput()) {
					cancelled = false;
					setVisible(false);
				}
			}
			else //cancelled (closed the dialog OR clicked cancel)
				setVisible(false);
		}	
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
			
	}
	
}
