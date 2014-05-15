package be.ac.umons.informatique.ba1.gamebox.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * Allows players management (creation/deletion)
 */

@SuppressWarnings("serial")
class PlayersDialog extends JDialog {
	
	/**
	 * Player name textfield
	 */
	protected ThinTextField name = new ThinTextField(20);
	
	/**
	 * Human players list model
	 */
	protected PlayersModel mod;
	
	/**
	 * Attached context
	 */
	protected GameContext context;
	
	
	/**
	 * Creates a {@link PlayersDialog}
	 * @param ctx    Current context
	 * @param parent Parent frame
	 */
	public PlayersDialog(GameContext ctx, Main parent) {
		super(parent, "Profils de joueurs", true);
		
		context = ctx;
		
		setSize(250, 300);
		setLocationRelativeTo(parent);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		Box add = Box.createHorizontalBox();
		add.add(new JLabel("Nom : "));
		add.add(name);
		JButton btn = new JButton("Ajouter");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String n = name.getText().trim();
				if (n.isEmpty())
					JOptionPane.showMessageDialog(null, "Veuillez saisir un nom de joueur !");
				else {
					mod.addItem(new HumanPlayer(n));
					name.setText("");
				}
			}
		});
		add.add(btn);
		
		add(new JScrollPane(new JTable(mod = new PlayersModel(ctx.humans))));
		add(add);
		
		setVisible(true);
	}
	
	/**
	 * Human players list model
	 */
	class PlayersModel extends AbstractTableModel {

		/**
		 * Internal human players list
		 */
		protected ArrayList<HumanPlayer> al;
		
		/**
		 * Creates a model working on p
		 * @param p Human players list
		 */
		public PlayersModel(ArrayList<HumanPlayer> p) {
			al = p;
		}
		
		/**
		 * Gets the column count
		 */
		@Override
		public int getColumnCount() {
			return 1;
		}
		
		/**
		 * Gets the column name
		 */
		@Override
		public String getColumnName(int c) {
			return "Nom du joueur";
		}

		/**
		 * Gets the human players count
		 */
		@Override
		public int getRowCount() {
			return al.size();
		}

		/**
		 * Gets a cell value
		 */
		@Override
		public Object getValueAt(int row, int col) {
			return al.get(row).name;
		}
		
		/**
		 * Allows nicknames editing
		 */
		@Override
		public boolean isCellEditable(int row, int col) {
			return true; //only displayed cell is editable
		}
		
		/**
		 * Actually edits nicknames
		 */
		@Override
		public void setValueAt(Object val, int row, int col) {
			if (val != null) {
				String n = ((String)val).trim();
				if (n.isEmpty()) {
					//delete
					if (context.isPlayerSelected(al.get(row)))
						JOptionPane.showMessageDialog(null, "Vous ne pouvez pas retirer un joueur utilisé de la liste !", "Erreur", JOptionPane.ERROR_MESSAGE);
					else if (JOptionPane.showConfirmDialog(null, "Voulez-vous réellement retirer "+al.get(row).name+" de la liste des joueurs ?") == JOptionPane.YES_OPTION)
						removeItem(row);
				}
				else {
					//rename
					al.get(row).setName(n);
					fireTableCellUpdated(row, 1);
				}
			}
		}
		
		/**
		 * Adds a human player to the list
		 * @param p New human player
		 */
		public void addItem(HumanPlayer p) {
			al.add(p);
			fireTableRowsInserted(al.size()-1, al.size()-1);
		}
		
		/**
		 * Removes a human player by id
		 * @param id Index
		 */
		public void removeItem(int id) {
			al.remove(id);
			fireTableRowsDeleted(id, id);
		}
		
	}
	
}
