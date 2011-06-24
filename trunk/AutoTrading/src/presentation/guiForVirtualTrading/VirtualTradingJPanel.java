/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VirtualTradingJPanel.java
 *
 * Created on Jun 8, 2011, 11:12:31 AM
 */

package presentation.guiForVirtualTrading;

import javax.swing.JDialog;
import javax.swing.JSpinner;
import presentation.mainJFrame;

/**
 *
 * @author Dinh
 */
public class VirtualTradingJPanel extends javax.swing.JPanel {

    /** Creates new form VirtualTradingJPanel */
    public VirtualTradingJPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJLabel = new javax.swing.JLabel();
        userJComboBox = new javax.swing.JComboBox();
        removeUserJButton = new javax.swing.JButton();
        addUserJButton = new javax.swing.JButton();
        addCashJButton = new javax.swing.JButton();
        todayOrderJLabel = new javax.swing.JLabel();
        ganiLossJLabel = new javax.swing.JLabel();
        gainLossJTextField = new javax.swing.JTextField();
        cashRemainJLabel = new javax.swing.JLabel();
        cashRemainJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        todayOrderJTable = new javax.swing.JTable(new OrderTableModel());
        portfolioJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        portfolioJTable = new javax.swing.JTable();
        orderLogJLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderLogJTable = new javax.swing.JTable(new OrderTableModel());
        addOrderJButton = new javax.swing.JButton();
        removeOrderJButton = new javax.swing.JButton();
        addCashJSpinner = new javax.swing.JSpinner();
        vndJLabel = new javax.swing.JLabel();
        portfolioDateJSpinner = new javax.swing.JSpinner();
        portfolioDatejLabel = new javax.swing.JLabel();
        orderDatejLabel = new javax.swing.JLabel();
        orderLogDateJSpinner = new javax.swing.JSpinner();

        userJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        userJLabel.setText("User:");

        userJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        removeUserJButton.setText("Remove");

        addUserJButton.setText("Add");
        addUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserJButtonActionPerformed(evt);
            }
        });

        addCashJButton.setText("Add Cash");

        todayOrderJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        todayOrderJLabel.setText("Today's Order");

        ganiLossJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        ganiLossJLabel.setText("Gain/Loss (%):");

        gainLossJTextField.setEditable(false);

        cashRemainJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        cashRemainJLabel.setText("Cash Remain:");

        cashRemainJTextField.setEditable(false);

        jScrollPane1.setViewportView(todayOrderJTable);

        portfolioJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        portfolioJLabel.setText("User Portfolio:");

        portfolioJTable.setModel(new PortfolioTableModel());
        jScrollPane2.setViewportView(portfolioJTable);

        orderLogJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        orderLogJLabel.setText("Order Log:");

        jScrollPane3.setViewportView(orderLogJTable);

        addOrderJButton.setText("Add");
        addOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderJButtonActionPerformed(evt);
            }
        });

        removeOrderJButton.setText("Remove");
        removeOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOrderJButtonActionPerformed(evt);
            }
        });

        addCashJSpinner.setModel(new javax.swing.SpinnerNumberModel(Long.valueOf(0L), null, null, Long.valueOf(1000L)));

        vndJLabel.setText("VND");

        portfolioDateJSpinner.setModel(new javax.swing.SpinnerDateModel());
        portfolioDateJSpinner.setEditor(new JSpinner.DateEditor(portfolioDateJSpinner, "MM/dd/yyyy"));

        portfolioDatejLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        portfolioDatejLabel.setText("Date:");

        orderDatejLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        orderDatejLabel.setText("Date:");

        orderLogDateJSpinner.setModel(new javax.swing.SpinnerDateModel());
        orderLogDateJSpinner.setEditor(new JSpinner.DateEditor(orderLogDateJSpinner, "MM/dd/yyyy"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todayOrderJLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(userJLabel)
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(userJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(addUserJButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addCashJButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(addCashJSpinner)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vndJLabel)
                                .addComponent(removeUserJButton)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(addOrderJButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(removeOrderJButton))))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cashRemainJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashRemainJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ganiLossJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gainLossJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderLogJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                        .addComponent(orderDatejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderLogDateJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(portfolioJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                        .addComponent(portfolioDatejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(portfolioDateJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addUserJButton, removeUserJButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addOrderJButton, removeOrderJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userJLabel)
                            .addComponent(addUserJButton)
                            .addComponent(removeUserJButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addCashJButton)
                            .addComponent(cashRemainJLabel)
                            .addComponent(cashRemainJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ganiLossJLabel)
                            .addComponent(gainLossJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCashJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vndJLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(todayOrderJLabel)
                            .addComponent(portfolioJLabel)
                            .addComponent(portfolioDateJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(portfolioDatejLabel))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeOrderJButton)
                            .addComponent(addOrderJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderLogJLabel)
                            .addComponent(orderLogDateJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderDatejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addUserJButton, removeUserJButton});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addOrderJButton, removeOrderJButton});

    }// </editor-fold>//GEN-END:initComponents

    private void addUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserJButtonActionPerformed
        addNewUserJDialog.setVisible(true);
    }//GEN-LAST:event_addUserJButtonActionPerformed

    private void addOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderJButtonActionPerformed
        addNewOrderJDialog.setVisible(true);
    }//GEN-LAST:event_addOrderJButtonActionPerformed

    private void removeOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOrderJButtonActionPerformed
        OrderTableModel portfolioTableModel = (OrderTableModel) this.todayOrderJTable.getModel();
        portfolioTableModel.deleteRows(todayOrderJTable.getSelectedRows());
        todayOrderJTable.updateUI();
    }//GEN-LAST:event_removeOrderJButtonActionPerformed

    public JDialog getAddNewUserJDialog() {
        return addNewUserJDialog;
    }

    public JDialog getAddNewOrderJDialog() {
        return addNewOrderJDialog;
    }

    public JDialog newAddNewUserJDialog() {
        JDialog jDialog = new JDialog(mainJFrame.mainFrame, true);
        AddNewUserJPanel panel = new AddNewUserJPanel(jDialog);
        jDialog.add(panel);
        jDialog.pack();
        return jDialog;
    }

    public JDialog newAddNewOrderJDialog() {
        JDialog jDialog = new JDialog(mainJFrame.mainFrame, true);
        AddNewOrderJPanel panel = new AddNewOrderJPanel(jDialog);
        jDialog.add(panel);
        jDialog.pack();
        return jDialog;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCashJButton;
    private javax.swing.JSpinner addCashJSpinner;
    private javax.swing.JButton addOrderJButton;
    private javax.swing.JButton addUserJButton;
    private javax.swing.JLabel cashRemainJLabel;
    private javax.swing.JTextField cashRemainJTextField;
    private javax.swing.JTextField gainLossJTextField;
    private javax.swing.JLabel ganiLossJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel orderDatejLabel;
    private javax.swing.JSpinner orderLogDateJSpinner;
    private javax.swing.JLabel orderLogJLabel;
    private javax.swing.JTable orderLogJTable;
    private javax.swing.JSpinner portfolioDateJSpinner;
    private javax.swing.JLabel portfolioDatejLabel;
    private javax.swing.JLabel portfolioJLabel;
    private javax.swing.JTable portfolioJTable;
    private javax.swing.JButton removeOrderJButton;
    private javax.swing.JButton removeUserJButton;
    private javax.swing.JLabel todayOrderJLabel;
    private javax.swing.JTable todayOrderJTable;
    private javax.swing.JComboBox userJComboBox;
    private javax.swing.JLabel userJLabel;
    private javax.swing.JLabel vndJLabel;
    // End of variables declaration//GEN-END:variables

    private JDialog addNewUserJDialog = newAddNewUserJDialog();
    private JDialog addNewOrderJDialog = newAddNewOrderJDialog();
}
