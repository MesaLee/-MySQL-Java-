/*
 * Loss.java
 *
 * Created on __DATE__, __TIME__
 */

package UI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import com.jdbc.Utils;

/**
 *
 * @author  __USER__
 */
public class Loss extends javax.swing.JPanel {

	/** Creates new form Loss */

	public Loss() {
		initComponents();

		int row = 0;
		Statement st = null;
		st = Utils.getSt();
		try {
			//5������ִ�н��
			String sql2 = "select * from loss";
			ResultSet rs = st.executeQuery(sql2);

			//5������ִ�н��
			while (rs.next()) {

				if (jTable1.getRowCount() - 1 < row) {
					DefaultTableModel tableModel = (DefaultTableModel) jTable1
							.getModel();
					tableModel.addRow(new Object[] { "" });
				}

				String gid_tmp = Integer.toString(rs.getInt(2));
				jTable1.setValueAt(gid_tmp, row, 0);
				String lnumber_tmp = rs.getString(3);
				jTable1.setValueAt(lnumber_tmp, row, 1);
				String lreason_tmp = rs.getString(4);
				jTable1.setValueAt(lreason_tmp, row, 2);
				row++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jTextField3 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jLabel2.setText("\u5546\u54c1\u53f7\uff1a");

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setText("\u62a5\u635f\u5355");

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jLabel3.setText("\u5546\u54c1\u6570\u91cf\uff1a");

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jLabel4.setText("\u62a5\u635f\u539f\u56e0\uff1a");

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton1.setText("\u5f55\u5165");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null } },
				new String[] { "��Ʒ��", "��Ʒ����", "����ԭ��" }));
		jTable1.setRowHeight(24);
		jScrollPane1.setViewportView(jTable1);

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
																.addContainerGap()
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		427,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(29, 29,
																		29)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel3)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel4)
																												.addComponent(
																														jLabel2))
																								.addGap(23,
																										23,
																										23)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jTextField2,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														145,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jTextField1,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														145,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jTextField3,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														201,
																														javax.swing.GroupLayout.PREFERRED_SIZE)))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(181,
																		181,
																		181)
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		104,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(134,
																		134,
																		134)
																.addComponent(
																		jButton1)))
								.addContainerGap(22, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(8, 8, 8)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										29,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										130,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														37,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														37,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton1)
								.addContainerGap(35, Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//¼��(ֻ��¼�����ݿ⣬û�ڱ�����ʾ)
		int gid = Integer.parseInt(jTextField1.getText());
		int lnumber = Integer.parseInt(jTextField2.getText());
		String lreason = jTextField3.getText();

		Statement st = null;
		st = Utils.getSt();
		try {
			//4��ִ��
			String sql1 = "insert into loss(Gid,Lnumber,Lreason) values('"
					+ gid + "','" + lnumber + "','" + lreason + "');";
			st.executeUpdate(sql1);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//����(�ڱ�����ʾ������Ϣ)

		int row = 0;
		int i = 0;

		DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

		while (i < jTable1.getRowCount()) {
			tableModel.removeRow(0);
		}

		try {
			//5������ִ�н��
			String sql2 = "select * from loss";
			ResultSet rs = st.executeQuery(sql2);

			//5������ִ�н��
			while (rs.next()) {

				if (jTable1.getRowCount() - 1 < row) {
					tableModel.addRow(new Object[] { "" });
				}
				String gid_t = Integer.toString(rs.getInt(2));
				jTable1.setValueAt(gid_t, row, 0);
				String lnumber_t = Integer.toString(rs.getInt(3));
				jTable1.setValueAt(lnumber_t, row, 1);
				String lreason_t = rs.getString(4);
				jTable1.setValueAt(lreason_t, row, 2);

				row++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}