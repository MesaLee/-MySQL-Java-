/*
 * Receipt.java
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
public class Receipt extends javax.swing.JPanel {

	/** Creates new form Receipt */
	public Receipt() {
		initComponents();

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton10 = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jButton12 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jTextField14 = new javax.swing.JTextField();

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setText("\u8fdb\u8d27\u5355\u4fe1\u606f");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null } },
				new String[] { "��������", "��Ʒ����", "����", "����", "�ܼ�", "��������", "����ʱ��" }));
		jTable1.setToolTipText("\u8fdb\u8d27\u5355\u4fe1\u606f");
		jTable1.setRowHeight(24);
		jScrollPane1.setViewportView(jTable1);

		jButton10.setText("\u5f55\u5165");

		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jLabel16.setText("\u67e5\u8be2\uff08\u8fdb\u8d27\u5355\u53f7\uff09\uff1a");

		jButton12.setText("\u67e5\u8be2");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jButton14.setText("\u5220\u9664");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton15.setText("\u4fee\u6539");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(216,
																		216,
																		216)
																.addComponent(
																		jLabel1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(29, 29,
																		29)
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		520,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(42, 42,
																		42)
																.addComponent(
																		jLabel16)
																.addGap(22, 22,
																		22)
																.addComponent(
																		jTextField14,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		89,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(40, 40,
																		40)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jButton12)
																				.addComponent(
																						jButton10))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		48,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jButton15)
																				.addComponent(
																						jButton14))
																.addGap(86, 86,
																		86)))
								.addContainerGap(103, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										149,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel16)
												.addComponent(
														jTextField14,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton12)
												.addComponent(jButton15))
								.addGap(32, 32, 32)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton10)
												.addComponent(jButton14))
								.addContainerGap(45, Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		// ɾ��
		DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
		int row;
		int rid_tmp = 0;
		if (jTable1.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(this, "��ѡ����Ҫɾ�����У�");
		} else {
			row = jTable1.getSelectedRow();
			Object obj = jTable1.getValueAt(row, 0);
			tableModel.removeRow(row);
			System.out.println(obj);
			rid_tmp = Integer.parseInt(String.valueOf(obj));
			Statement st = null;
			st = Utils.getSt();
			try {
				//4��ִ��

				String sql2 ="delete from receipt where Rid ='" + rid_tmp + "';";
				st.executeUpdate(sql2);
				JOptionPane.showMessageDialog(this, "ɾ���ɹ���");
				//5������ִ�н��
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
		//�޸�
		new ReceiptAlter().setVisible(true);
	}

	private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		//��ѯ

		if (this.jTextField14.getText().isEmpty()) {
			int row = 0;
			Statement st = null;
			st = Utils.getSt();
			DefaultTableModel tableModel = (DefaultTableModel) jTable1
					.getModel();
			int i = 0;

			try {
				//5������ִ�н��
				while (i < jTable1.getRowCount()) {
					tableModel.removeRow(0); //ɾ����
				}
				String sql2 = "select * from receipt";
				ResultSet rs = st.executeQuery(sql2);

				//5������ִ�н��
				while (rs.next()) {

					if (jTable1.getRowCount() - 1 < row) {
						tableModel.addRow(new Object[] { "" });
					}

					int rid1 = rs.getInt(1);
					jTable1.setValueAt(rid1, row, 0);
					String gname = rs.getString(2);
					jTable1.setValueAt(gname, row, 1);
					int rnumber_tmp = rs.getInt(3);
					jTable1.setValueAt(rnumber_tmp, row, 2);
					float rprice_tmp = rs.getFloat(4);
					jTable1.setValueAt(rprice_tmp, row, 3);
					float sum_tmp = rs.getFloat(5);
					jTable1.setValueAt(sum_tmp, row, 4);
					String sname_tmp = rs.getString(6);
					jTable1.setValueAt(sname_tmp, row, 5);
					String rdate_tmp = rs.getString(7);
					jTable1.setValueAt(rdate_tmp, row, 6);
					row++;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			int rid_temp = Integer.parseInt(this.jTextField14.getText());
			Statement st = null;
			DefaultTableModel tableModel = (DefaultTableModel) jTable1
					.getModel();
			int i = 0;

			st = Utils.getSt();
			try {
				//4��ִ��
				while (i < jTable1.getRowCount()) {
					tableModel.removeRow(0); //ɾ����
				}
				String sql = "select * from receipt where Rid ='" + rid_temp
						+ "';";
				ResultSet rs = st.executeQuery(sql);

				int row = 0;
				//5������ִ�н��
				while (rs.next()) {
					if (jTable1.getRowCount() - 1 < row) {
						tableModel.addRow(new Object[] { "" });
					}
					int rid1 = rs.getInt(1);
					jTable1.setValueAt(rid1, row, 0);
					String gname = rs.getString(2);
					jTable1.setValueAt(gname, row, 1);
					int rnumber_tmp = rs.getInt(3);
					jTable1.setValueAt(rnumber_tmp, row, 2);
					float rprice_tmp = rs.getFloat(4);
					jTable1.setValueAt(rprice_tmp, row, 3);
					float sum_tmp = rs.getFloat(5);
					jTable1.setValueAt(sum_tmp, row, 4);
					String sname_tmp = rs.getString(6);
					jTable1.setValueAt(sname_tmp, row, 5);
					String rdate_tmp = rs.getString(7);
					jTable1.setValueAt(rdate_tmp, row, 6);
					++row;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		//��ת¼�����
		new ReceiptInput().setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField14;
	// End of variables declaration//GEN-END:variables

}