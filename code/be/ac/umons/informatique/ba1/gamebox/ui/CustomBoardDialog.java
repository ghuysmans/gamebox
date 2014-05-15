package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import be.ac.umons.informatique.ba1.gamebox.core.Board;

@SuppressWarnings("serial")
public class CustomBoardDialog extends JDialog implements ActionListener {
	
	/**
	 * Allows detecting the user's input has been cancelled 
	 */
	protected boolean cancelled = true; //by default (to avoid handling the window's closing)
	
	/**
	 * {@link Board}'s width textfield
	 */
	protected final JTextField width = new ThinTextField("", 3);
	
	/**
	 * {@link Board}'s height textfield
	 */
	protected final JTextField height = new ThinTextField("", 3);
	
	/**
	 * OK button
	 */
	protected final JButton btnOK = new JButton("OK");
	
	/**
	 * Cancel button
	 */
	protected final JButton btnCcl = new JButton("Annuler");
	
	
	public CustomBoardDialog(JFrame parent) {
		super(parent, "Personnalisation", true);
		setSize(190, 120);
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
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				width.requestFocus();
			}
		});
		
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
	
	/**
	 * Checks typed dimensions are valid using {@link Board#isValidSize(int, int)}
	 * @return true if valid
	 */
	protected boolean validateInput() {
		try {
			if (Board.isValidSize(getTypedHeight(), getTypedWidth()))
				return true;
			else {
				JOptionPane.showMessageDialog(this, "Les valeurs doivent être positives et entières !", "Erreur", JOptionPane.WARNING_MESSAGE);
				return false;
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Les valeurs doivent être des nombres !", "Erreur", JOptionPane.WARNING_MESSAGE);
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
