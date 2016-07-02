/*
 * GoodsInformation.java
 *
 * Created on __DATE__, __TIME__
 */

package UI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.jdbc.Utils;

/**
 *
 * @author  __USER__
 */
public class GoodsInformation extends javax.swing.JPanel {

	/** Creates new form GoodsInformation */
	public GoodsInformation() {
		initComponents();

		int row = 0;
		Statement st = null;
		st = Utils.getSt();
		try {
			//5������ִ�н��
			String sql2 = "select * from goods";
			ResultSet rs = st.executeQuery(sql2);

			//5������ִ�н��
			while (rs.next()) {

				if (jTable1.getRowCount() - 1 < row) {
					DefaultTableModel tableModel = (DefaultTableModel) jTable1
							.getModel();
					tableModel.addRow(new Object[] { "" });
				}

				String gid_t = Integer.toString(rs.getInt(1));
				jTable1.setValueAt(gid_t, row, 0);
				String gname_t = rs.getString(2);
				jTable1.setValueAt(gname_t, row, 1);
				String saleprice_t = Float.toString(rs.getFloat(3));
				jTable1.setValueAt(saleprice_t, row, 2);
				String inventory = Integer.toString(rs.getInt(4));
				jTable1.setValueAt(inventory, row, 3);
				String sid_t = Integer.toString(rs.getInt(5));
				jTable1.setValueAt(sid_t, row, 4);
				row++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null } }, new String[] {
						"��Ʒ���", "��Ʒ��", "�ۼ�", "���", "��Ӧ��" }));
		jTable1.setRowHeight(24);
		jScrollPane1.setViewportView(jTable1);

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jButton1.setText("\u67e5\u8be2\uff08\u5546\u54c1\u53f7\uff09");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5220\u9664");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u4fee\u6539");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jTextField1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		121,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(27, 27,
																		27)
																.addComponent(
																		jButton1)
																.addGap(27, 27,
																		27)
																.addComponent(
																		jButton3)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jButton2))
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														432,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(66, 66, 66)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										181,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(31, 31, 31)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1)
												.addComponent(jButton3)
												.addComponent(jButton2))
								.addGap(43, 43, 43)));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// ɾ��
		DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
		int row;
		int gid_tmp = 0;
		if (jTable1.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(this, "��ѡ����Ҫɾ�����У�");
		} else {
			row = jTable1.getSelectedRow();
			Object obj = jTable1.getValueAt(row, 0);
			tableModel.removeRow(row);
			System.out.println(obj);
			gid_tmp = Integer.parseInt(String.valueOf(obj));
			Statement st = null;
			st = Utils.getSt();
			try {
				//4��ִ��

				String sql2 ="delete from goods where Gid ='" + gid_tmp + "';";
				st.executeUpdate(sql2);
				JOptionPane.showMessageDialog(this, "ɾ���ɹ���");
				//5������ִ�н��
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//��ѯ
		int gid = Integer.parseInt(this.jTextField1.getText());
		Statement st = null;
		int i = 0;
		st = Utils.getSt();
		DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

		while (i < jTable1.getRowCount()) {
			tableModel.removeRow(0);
		}
		try {
			//4��ִ��
			String sql = "select * from goods where Gid ='" + gid + "';";
			ResultSet rs = st.executeQuery(sql);

			int row = 0;
			//5������ִ�н��
			while (rs.next()) {
				if (jTable1.getRowCount() - 1 < row) {
					tableModel.addRow(new Object[] { "" });
				}

				String gid_t = Integer.toString(rs.getInt(1));
				jTable1.setValueAt(gid_t, row, 0);
				String gname_t = rs.getString(2);
				jTable1.setValueAt(gname_t, row, 1);
				String saleprice_t = Float.toString(rs.getFloat(3));
				jTable1.setValueAt(saleprice_t, row, 2);
				String inventory = Integer.toString(rs.getInt(4));
				jTable1.setValueAt(inventory, row, 3);
				String sid_t = Integer.toString(rs.getInt(5));
				jTable1.setValueAt(sid_t, row, 4);
				++row;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// ��Ʒ�޸İ�ť
		new GoodsAlter().setVisible(true);
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}