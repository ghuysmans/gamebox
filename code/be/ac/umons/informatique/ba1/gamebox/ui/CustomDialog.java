package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CustomDialog extends JDialog implements ActionListener {
	
	protected boolean ok;
	
	protected final JTextField width = new ThinTextField("", 20);
	protected final JTextField height = new ThinTextField("", 20);
	protected final JButton btnOK = new JButton("OK");
	protected final JButton btnCcl = new JButton("Annuler");
	
	public CustomDialog(JFrame parent, boolean modal) {
		super(parent, "Personnalisation", modal);
		setSize(350, 100);
		setLocationRelativeTo(parent);
		setResizable(false);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
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
	
	public boolean getOK() {
		return ok;
	}
	
	public int getTypedWidth() {
		return Integer.parseInt(width.getText());
	}
	
	public int getTypedHeight() {
		return Integer.parseInt(height.getText());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == btnOK) {
				ok = true;
				@SuppressWarnings("unused")
				int test = getTypedHeight()+getTypedWidth();
			}
			setVisible(false);
		}	
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
			
	}
	
}
