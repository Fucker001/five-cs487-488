/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DecisionAlgorithmEvaluationJPanel.java
 *
 * Created on Jun 23, 2011, 4:40:37 PM
 */
package presentation.guiForDecisionAlgorithmEvaluation;

import business.algorithm.decisionAlgorithm.AbstractDecisionAlgorithm;
import business.algorithm.decisionAlgorithm.Order;
import business.decisionAlgorithmEvaluation.DecisionCriteria;
import business.virtualTrading.PortfolioEntry;
import business.virtualTrading.User;
import dataAccess.databaseManagement.entity.AssetEntity;
import dataAccess.databaseManagement.entity.ExchangeEntity;
import dataAccess.databaseManagement.entity.OrderEntity;
import dataAccess.databaseManagement.entity.PriceEntity;
import dataAccess.databaseManagement.manager.PriceManager;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import layout.TableLayout;
import presentation.ComboKeyHandler;
import presentation.guiForDataVisualization.DataVisualizationJPanel;
import presentation.guiForVirtualTrading.PortfolioTableModel;
import presentation.mainJFrame;

/**
 *
 * @author Dinh
 */
public class DecisionAlgorithmEvaluationJPanel extends javax.swing.JPanel {

    /** Creates new form DecisionAlgorithmEvaluationJPanel */
    public DecisionAlgorithmEvaluationJPanel() {
        initComponents();
        initOtherComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateJPanel = new javax.swing.JPanel();
        fromDateJLabel = new javax.swing.JLabel();
        toDateJLabel = new javax.swing.JLabel();
        fromDatejSpinner = new javax.swing.JSpinner();
        toDatejSpinner = new javax.swing.JSpinner();
        algorithmjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        decAlgsJList = new javax.swing.JList();
        addDecAlgjButton = new javax.swing.JButton();
        removeDecAlgjButton = new javax.swing.JButton();
        initalPortfolioJPanel = new javax.swing.JPanel();
        cashRemainjLabel = new javax.swing.JLabel();
        portfoliojLabel = new javax.swing.JLabel();
        cashRemainjTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        portfolioJTable = new javax.swing.JTable();
        importJButton = new javax.swing.JButton();
        comparisonTableJPanel = new javax.swing.JPanel();
        tableJPanel = new javax.swing.JPanel();
        refreshJButton = new javax.swing.JButton();
        evaluationCriteriaJPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        decEvaCrisJList = new javax.swing.JList();
        addDecEvaCriteriajButton = new javax.swing.JButton();
        removeDecEvaCriteriajButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        exchangeJLabel = new javax.swing.JLabel();
        exchangeJComboBox = new javax.swing.JComboBox();
        assetJLabel = new javax.swing.JLabel();
        assetJComboBox = new javax.swing.JComboBox();

        dateJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        fromDateJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        fromDateJLabel.setText("From:");

        toDateJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        toDateJLabel.setText("To:");

        fromDatejSpinner.setModel(new javax.swing.SpinnerDateModel());
        fromDatejSpinner.setEditor(new JSpinner.DateEditor(fromDatejSpinner, "MM/dd/yyyy"));
        fromDatejSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fromDatejSpinnerStateChanged(evt);
            }
        });

        toDatejSpinner.setModel(new javax.swing.SpinnerDateModel());
        toDatejSpinner.setEditor(new JSpinner.DateEditor(toDatejSpinner, "MM/dd/yyyy"));
        toDatejSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                toDatejSpinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout dateJPanelLayout = new javax.swing.GroupLayout(dateJPanel);
        dateJPanel.setLayout(dateJPanelLayout);
        dateJPanelLayout.setHorizontalGroup(
            dateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fromDateJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromDatejSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(toDateJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toDatejSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );

        dateJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fromDatejSpinner, toDatejSpinner});

        dateJPanelLayout.setVerticalGroup(
            dateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateJPanelLayout.createSequentialGroup()
                .addGroup(dateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromDateJLabel)
                    .addComponent(fromDatejSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDateJLabel)
                    .addComponent(toDatejSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dateJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fromDatejSpinner, toDatejSpinner});

        algorithmjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DECISION ALGORITHM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        decAlgsJList.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(decAlgsJList);

        addDecAlgjButton.setText("Add");
        addDecAlgjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDecAlgjButtonActionPerformed(evt);
            }
        });

        removeDecAlgjButton.setText("Remove");
        removeDecAlgjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDecAlgjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout algorithmjPanelLayout = new javax.swing.GroupLayout(algorithmjPanel);
        algorithmjPanel.setLayout(algorithmjPanelLayout);
        algorithmjPanelLayout.setHorizontalGroup(
            algorithmjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(algorithmjPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(algorithmjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDecAlgjButton)
                    .addComponent(removeDecAlgjButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        algorithmjPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addDecAlgjButton, removeDecAlgjButton});

        algorithmjPanelLayout.setVerticalGroup(
            algorithmjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(algorithmjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(algorithmjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(algorithmjPanelLayout.createSequentialGroup()
                        .addComponent(addDecAlgjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeDecAlgjButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        algorithmjPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addDecAlgjButton, removeDecAlgjButton});

        initalPortfolioJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INITAL STATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cashRemainjLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        cashRemainjLabel.setText("Cash Remain:");

        portfoliojLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        portfoliojLabel.setText("Portfolio:");

        cashRemainjTextField.setEditable(false);

        portfolioJTable.setModel(new PortfolioTableModel());
        jScrollPane2.setViewportView(portfolioJTable);

        importJButton.setText("Import");
        importJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout initalPortfolioJPanelLayout = new javax.swing.GroupLayout(initalPortfolioJPanel);
        initalPortfolioJPanel.setLayout(initalPortfolioJPanelLayout);
        initalPortfolioJPanelLayout.setHorizontalGroup(
            initalPortfolioJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initalPortfolioJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(initalPortfolioJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addGroup(initalPortfolioJPanelLayout.createSequentialGroup()
                        .addGroup(initalPortfolioJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portfoliojLabel)
                            .addGroup(initalPortfolioJPanelLayout.createSequentialGroup()
                                .addComponent(cashRemainjLabel)
                                .addGap(18, 18, 18)
                                .addComponent(cashRemainjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(importJButton)))
                .addContainerGap())
        );
        initalPortfolioJPanelLayout.setVerticalGroup(
            initalPortfolioJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initalPortfolioJPanelLayout.createSequentialGroup()
                .addGroup(initalPortfolioJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashRemainjLabel)
                    .addComponent(cashRemainjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(portfoliojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comparisonTableJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COMPARISON TABLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        javax.swing.GroupLayout tableJPanelLayout = new javax.swing.GroupLayout(tableJPanel);
        tableJPanel.setLayout(tableJPanelLayout);
        tableJPanelLayout.setHorizontalGroup(
            tableJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        tableJPanelLayout.setVerticalGroup(
            tableJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout comparisonTableJPanelLayout = new javax.swing.GroupLayout(comparisonTableJPanel);
        comparisonTableJPanel.setLayout(comparisonTableJPanelLayout);
        comparisonTableJPanelLayout.setHorizontalGroup(
            comparisonTableJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comparisonTableJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comparisonTableJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comparisonTableJPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tableJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(refreshJButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        comparisonTableJPanelLayout.setVerticalGroup(
            comparisonTableJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comparisonTableJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        evaluationCriteriaJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DECISION ALGORITHM CRITERIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        decEvaCrisJList.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(decEvaCrisJList);

        addDecEvaCriteriajButton.setText("Add");
        addDecEvaCriteriajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDecEvaCriteriajButtonActionPerformed(evt);
            }
        });

        removeDecEvaCriteriajButton.setText("Remove");
        removeDecEvaCriteriajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDecEvaCriteriajButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout evaluationCriteriaJPanelLayout = new javax.swing.GroupLayout(evaluationCriteriaJPanel);
        evaluationCriteriaJPanel.setLayout(evaluationCriteriaJPanelLayout);
        evaluationCriteriaJPanelLayout.setHorizontalGroup(
            evaluationCriteriaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evaluationCriteriaJPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(evaluationCriteriaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDecEvaCriteriajButton)
                    .addComponent(removeDecEvaCriteriajButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        evaluationCriteriaJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addDecEvaCriteriajButton, removeDecEvaCriteriajButton});

        evaluationCriteriaJPanelLayout.setVerticalGroup(
            evaluationCriteriaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evaluationCriteriaJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(evaluationCriteriaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(evaluationCriteriaJPanelLayout.createSequentialGroup()
                        .addComponent(addDecEvaCriteriajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeDecEvaCriteriajButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        evaluationCriteriaJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addDecEvaCriteriajButton, removeDecEvaCriteriajButton});

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ASSET", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        exchangeJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        exchangeJLabel.setText("Exchange:");

        exchangeJComboBox.setEditable(true);
        exchangeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangeJComboBoxActionPerformed(evt);
            }
        });

        assetJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        assetJLabel.setText("Asset:");

        assetJComboBox.setEditable(true);
        assetJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exchangeJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exchangeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assetJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assetJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exchangeJLabel)
                    .addComponent(exchangeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assetJLabel)
                    .addComponent(assetJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(evaluationCriteriaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(algorithmjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(initalPortfolioJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comparisonTableJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {algorithmjPanel, dateJPanel, evaluationCriteriaJPanel, jPanel1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comparisonTableJPanel, initalPortfolioJPanel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(initalPortfolioJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comparisonTableJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(algorithmjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(evaluationCriteriaJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void importJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importJButtonActionPerformed
        importPortfolioJPanel.getParentDialog().setVisible(true);

        if (!importPortfolioJPanel.isOk()) {
            return;
        }

        currentUser = importPortfolioJPanel.getNewUser();
        updateUserInfo();
    }//GEN-LAST:event_importJButtonActionPerformed

    private void removeDecAlgjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDecAlgjButtonActionPerformed
        DefaultListModel model = (DefaultListModel) this.decAlgsJList.getModel();
        int[] selectedIndices = decAlgsJList.getSelectedIndices();
        int j = 0;
        for (int i : selectedIndices) {
            model.remove(i - j);
            ++j;
        }
        decAlgsJList.updateUI();
    }//GEN-LAST:event_removeDecAlgjButtonActionPerformed

    private void addDecAlgjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDecAlgjButtonActionPerformed
        addNewDecAlgJPanel.getParentDialog().setVisible(true);

        if (!addNewDecAlgJPanel.isOk()) {
            return;
        }

        AbstractDecisionAlgorithm decAlgo = addNewDecAlgJPanel.getDecAlg();
        DefaultListModel model = (DefaultListModel) this.decAlgsJList.getModel();
        model.addElement(decAlgo);

        //add new algorithm
    }//GEN-LAST:event_addDecAlgjButtonActionPerformed

    private void addDecEvaCriteriajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDecEvaCriteriajButtonActionPerformed
        addNewDecEvaCriteriaJPanel.getParentDialog().setVisible(true);

        if (!addNewDecEvaCriteriaJPanel.isOk()) {
            return;
        }

        DefaultListModel model = (DefaultListModel) this.decEvaCrisJList.getModel();
        model.addElement(addNewDecEvaCriteriaJPanel.getDecisionCriteria());    }//GEN-LAST:event_addDecEvaCriteriajButtonActionPerformed

    private void removeDecEvaCriteriajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDecEvaCriteriajButtonActionPerformed
        DefaultListModel model = (DefaultListModel) this.decEvaCrisJList.getModel();
        int[] selectedIndices = decEvaCrisJList.getSelectedIndices();
        int j = 0;
        for (int i : selectedIndices) {
            model.remove(i - j);
            ++j;
        }
        decEvaCrisJList.updateUI();
    }//GEN-LAST:event_removeDecEvaCriteriajButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        updateComparisonTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void exchangeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchangeJComboBoxActionPerformed
        if (exchangeJComboBox.getSelectedIndex() == -1) {
            return;
        }

        assetJComboBox.setModel(new javax.swing.DefaultComboBoxModel(DataVisualizationJPanel.mappingExchangeID_Assets.get((ExchangeEntity) exchangeJComboBox.getSelectedItem())));
        assetComboKeyHandler.updateListObjects();
        assetJComboBox.setSelectedIndex(0);
}//GEN-LAST:event_exchangeJComboBoxActionPerformed

    private void assetJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetJComboBoxActionPerformed
        if (assetJComboBox.getSelectedIndex() == -1) {
            return;
        }

        asset = (AssetEntity) assetJComboBox.getSelectedItem();
}//GEN-LAST:event_assetJComboBoxActionPerformed

    private void fromDatejSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fromDatejSpinnerStateChanged
        fromDate = (Date) fromDatejSpinner.getValue();
    }//GEN-LAST:event_fromDatejSpinnerStateChanged

    private void toDatejSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_toDatejSpinnerStateChanged
        toDate = (Date) toDatejSpinner.getValue();
    }//GEN-LAST:event_toDatejSpinnerStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDecAlgjButton;
    private javax.swing.JButton addDecEvaCriteriajButton;
    private javax.swing.JPanel algorithmjPanel;
    private javax.swing.JComboBox assetJComboBox;
    private javax.swing.JLabel assetJLabel;
    private javax.swing.JLabel cashRemainjLabel;
    private javax.swing.JTextField cashRemainjTextField;
    private javax.swing.JPanel comparisonTableJPanel;
    private javax.swing.JPanel dateJPanel;
    private javax.swing.JList decAlgsJList;
    private javax.swing.JList decEvaCrisJList;
    private javax.swing.JPanel evaluationCriteriaJPanel;
    private javax.swing.JComboBox exchangeJComboBox;
    private javax.swing.JLabel exchangeJLabel;
    private javax.swing.JLabel fromDateJLabel;
    private javax.swing.JSpinner fromDatejSpinner;
    private javax.swing.JButton importJButton;
    private javax.swing.JPanel initalPortfolioJPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable portfolioJTable;
    private javax.swing.JLabel portfoliojLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton removeDecAlgjButton;
    private javax.swing.JButton removeDecEvaCriteriajButton;
    private javax.swing.JPanel tableJPanel;
    private javax.swing.JLabel toDateJLabel;
    private javax.swing.JSpinner toDatejSpinner;
    // End of variables declaration//GEN-END:variables
    private ComboKeyHandler exchangeComboKeyHandler;
    private ComboKeyHandler assetComboKeyHandler;
    private ImportPortfolioJPanel importPortfolioJPanel;
    private AddNewDecAlgJPanel addNewDecAlgJPanel;
    private AddNewDecEvaCriteriaJPanel addNewDecEvaCriteriaJPanel;
    private User currentUser;
    private AssetEntity asset;
    private Date fromDate, toDate;

    private JDialog newAddDecAlgJDialog() {
        JDialog jDialog = new JDialog(mainJFrame.mainFrame, true);
        addNewDecAlgJPanel = new AddNewDecAlgJPanel(jDialog);
        jDialog.add(addNewDecAlgJPanel);
        jDialog.pack();
        return jDialog;
    }

    public JDialog newImportPortfolioJDialog() {
        JDialog jDialog = new JDialog(mainJFrame.mainFrame, true);
        importPortfolioJPanel = new ImportPortfolioJPanel(jDialog);
        jDialog.add(importPortfolioJPanel);
        jDialog.pack();
        return jDialog;
    }

    private JDialog newAddCriteriaJDialog() {
        JDialog jDialog = new JDialog(mainJFrame.mainFrame, true);
        addNewDecEvaCriteriaJPanel = new AddNewDecEvaCriteriaJPanel(jDialog);
        jDialog.add(addNewDecEvaCriteriaJPanel);
        jDialog.pack();
        return jDialog;
    }

    private void initOtherComponents() {
        Calendar now = Calendar.getInstance();
        toDatejSpinner.setValue(now.getTime());
        now.add(Calendar.MONTH, -6);
        fromDatejSpinner.setValue(now.getTime());

        exchangeJComboBox.setModel(new DefaultComboBoxModel(DataVisualizationJPanel.mappingExchangeID_Assets.keySet().toArray()));
        exchangeComboKeyHandler = new ComboKeyHandler(exchangeJComboBox);
        JTextField fieldExchange = (JTextField) exchangeJComboBox.getEditor().getEditorComponent();
        fieldExchange.addKeyListener(exchangeComboKeyHandler);

        assetJComboBox.setModel(new DefaultComboBoxModel(DataVisualizationJPanel.mappingExchangeID_Assets.get((ExchangeEntity) exchangeJComboBox.getSelectedItem())));
        assetComboKeyHandler = new ComboKeyHandler(assetJComboBox);
        JTextField fieldSymbol = (JTextField) assetJComboBox.getEditor().getEditorComponent();
        fieldSymbol.addKeyListener(assetComboKeyHandler);

        asset = (AssetEntity) assetJComboBox.getSelectedItem();
        toDate = (Date) toDatejSpinner.getValue();
        fromDate = (Date) fromDatejSpinner.getValue();

        newAddDecAlgJDialog();
        newAddCriteriaJDialog();
        newImportPortfolioJDialog();

    }

    private void updateComparisonTable() {

        //create table layout
        double size[][] = new double[2][];
        size[0] = new double[decEvaCrisJList.getModel().getSize() + 1];
        for (int i = 0; i < size[0].length; ++i) {
            size[0][i] = TableLayout.PREFERRED;
        }

        size[1] = new double[decAlgsJList.getModel().getSize() + 1];
        for (int i = 0; i < size[1].length; ++i) {
            size[1][i] = TableLayout.PREFERRED;
        }

        tableJPanel.removeAll();
        tableJPanel.setLayout(new TableLayout(size));

        //add components
        for (int i = 1; i < size[0].length; ++i) {
            JLabel jLabel = new JLabel(decEvaCrisJList.getModel().getElementAt(i - 1).toString());
            jLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            tableJPanel.add(jLabel, i + ", 0");
        }

        HashMap<AbstractDecisionAlgorithm, User> decAlg_ResultMap = new HashMap<AbstractDecisionAlgorithm, User>();
        
        DefaultListModel algListModel = (DefaultListModel) decAlgsJList.getModel();
        DefaultListModel criteriaListModel = (DefaultListModel) decEvaCrisJList.getModel();
        System.out.println(asset.getAssetID());
        System.out.println(toDate);
        System.out.println(fromDate);
        ArrayList<PriceEntity> prices = (new PriceManager()).getPriceInInterval(asset.getAssetID(), new java.sql.Date(fromDate.getTime()), new java.sql.Date(toDate.getTime()));
        ArrayList<Double> list = new ArrayList<Double>();
        for (PriceEntity priceEntity : prices) {
            list.add(priceEntity.getClose());
        }

        for (int algIndex = 0; algIndex < size[1].length - 1; ++algIndex) {
            //set price list for algorithm
            AbstractDecisionAlgorithm alg = (AbstractDecisionAlgorithm) algListModel.getElementAt(algIndex);
            alg.setPriceList(list);
            System.out.println(list.size());

            User user = new User(alg.toString(), currentUser.getCash());
            for (PortfolioEntry portfolioEntry : currentUser.getCurPortfolioList()) {
                user.addPortfolio(portfolioEntry);
            }

            decAlg_ResultMap.put(alg, user);

            for (int criteriaIndex = 0; criteriaIndex < size[0].length - 1; ++criteriaIndex) {
                DecisionCriteria curCriteria = (DecisionCriteria) criteriaListModel.getElementAt(criteriaIndex);

                curCriteria.setParametersValue(user, fillDateForOrderList(alg.runAlgorithm(), prices), (AssetEntity) assetJComboBox.getSelectedItem());

                CriteriaOutputJPanel criteriaOutputJPanel = new CriteriaOutputJPanel(curCriteria.evaluate());
                criteriaOutputJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                tableJPanel.add(criteriaOutputJPanel, (criteriaIndex + 1) + ", " + (algIndex + 1));
            }
        }

        for (int i = 1; i < size[1].length; ++i) {
            AbstractDecisionAlgorithm decAlg = (AbstractDecisionAlgorithm) decAlgsJList.getModel().getElementAt(i - 1);
            RowHeaderJPanel rowHeaderJPanel = new RowHeaderJPanel(decAlg, new ArrayList<OrderEntity>(), decAlg_ResultMap.get(decAlg).getCurPortfolioList());
            rowHeaderJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            tableJPanel.add(rowHeaderJPanel, "0, " + i);
        }

        tableJPanel.updateUI();
    }

    private ArrayList<Order> fillDateForOrderList(ArrayList<Order> result, ArrayList<PriceEntity> prices) {

        ArrayList<Order> temp = new ArrayList<Order>();
        for (Order order : result) {
            int k = order.getNth_day_in_future();
            if (k < prices.size()) {
                temp.add(order);
            }
        }

        for (Order order : temp) {
            order.setDate(prices.get(order.getNth_day_in_future() - 1).getDate());
        }

        return temp;
    }

    private void updateUserInfo() {
        cashRemainjTextField.setText((new DecimalFormat("###,###")).format(currentUser.getCash() * 1000) + " VND");

        PortfolioTableModel portfolioTableModel = (PortfolioTableModel) portfolioJTable.getModel();
        portfolioTableModel.setData(currentUser.getCurPortfolioList());
        portfolioJTable.updateUI();

    }
}