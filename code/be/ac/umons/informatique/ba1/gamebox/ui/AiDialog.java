package be.ac.umons.informatique.ba1.gamebox.ui;

import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;



import javax.swing.JTextField;

import be.ac.umons.informatique.ba1.gamebox.core.AI;

public class AiDialog extends JDialog {
	
	protected final JTextField jtf;


	public AiDialog(JFrame parent, boolean modal) {
		super(parent, "Choix de l'ia", modal);
		setSize(400, 200);
		setLocationRelativeTo(parent);
		this.setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		setResizable(false);
		JSlider diff = new JSlider(JSlider.HORIZONTAL,AI.LEVEL_MIN, AI.LEVEL_MAX, (AI.LEVEL_MAX+AI.LEVEL_MIN)/2);
		diff.setMajorTickSpacing(1);
		diff.setPaintTicks(true);
		diff.setMinorTickSpacing(1);
		Dictionary<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
		labelTable.put( new Integer( AI.LEVEL_MIN ), new JLabel("Facile") );
		labelTable.put( new Integer( AI.LEVEL_MAX ), new JLabel("Difficile") );
		diff.setLabelTable( labelTable );
		diff.setPaintLabels(true);
		
		Box sup = Box.createHorizontalBox();
		jtf = new JTextField("Valeur par défaut", 20);
		sup.add(new JLabel("Nom de l'ai : "));
		sup.add(jtf);
		this.add(sup);
		this.add(diff);
		
		
		
		setVisible(true);

	}

}
