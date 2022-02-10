/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inventory.ui;

import com.inventory.dao.CustomerDAO;
import com.inventory.dto.CustomerDTO;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Customers extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Customers
     */
    public Customers() {
        initComponents();
        loadDatas();
    //    table.getColumn("customercode").setMaxWidth(0);
        customerCodeTxt.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        searchByLab = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        inputPanel = new javax.swing.JPanel();
        customersNameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        locationTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addBttn = new javax.swing.JLabel();
        editBttn = new javax.swing.JLabel();
        deleteBttn = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        customerCodeTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        editLab = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deleteLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        searchByLab.setText("SEARCH");

        searchTxt.setToolTipText("Search using Full Name Location, Phone OR Customer Code");
        searchTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        inputPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        customersNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersNameTxtActionPerformed(evt);
            }
        });

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        locationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer's name");

        jLabel3.setText("Location");

        jLabel5.setText("Phone");

        addBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/addPeople.png"))); // NOI18N
        addBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttnMouseClicked(evt);
            }
        });

        editBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/editPeople.png"))); // NOI18N
        editBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBttnMouseClicked(evt);
            }
        });

        deleteBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/deletelarge.png"))); // NOI18N
        deleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBttnMouseClicked(evt);
            }
        });

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/clear.png"))); // NOI18N
        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        customerCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerCodeTxtActionPerformed(evt);
            }
        });

        jLabel11.setText("Clear");

        editLab.setText("Edit");

        jLabel6.setText("Add");

        deleteLab.setText("Delete");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(locationTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(phoneTxt)
                            .addComponent(customersNameTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(addBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editLab)
                                .addGap(19, 19, 19)))
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBttn)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(deleteLab)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clearBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(customerCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customersNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clearBttn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editLab)
                            .addComponent(jLabel6)
                            .addComponent(deleteLab)
                            .addComponent(jLabel11))))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CUSTOMERS", inputPanel);

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("CUSTOMERS");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(387, 387, 387)
                        .addComponent(searchByLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(560, 560, 560)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)))
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchByLab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPane1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 4, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void locationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTxtActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void customersNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customersNameTxtActionPerformed

    private void addBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttnMouseClicked
        if(customersNameTxt.getText().equals("") || locationTxt.getText().equals("") || phoneTxt.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Please fill all the fields!");
        }else{
        
            CustomerDTO customerdto=new CustomerDTO(); 
            customerdto.setFullName(customersNameTxt.getText());
            customerdto.setLocation(locationTxt.getText());
            customerdto.setPhone(phoneTxt.getText());
            new CustomerDAO().addCustomerDAO(customerdto);
            loadDatas();
        }
    }//GEN-LAST:event_addBttnMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        int column = table.getColumnCount();
        Object[] val = new Object[column];
        for(int i = 0; i < column; i++) {
            val[i]=table.getValueAt(row, i);
        }
        customerCodeTxt.setText((String) val[0]);
        customersNameTxt.setText((String) val[1]);
        locationTxt.setText((String) val[2]);
        phoneTxt.setText((String) val[3]);
    }//GEN-LAST:event_tableMouseClicked

    private void customerCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerCodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerCodeTxtActionPerformed

    private void editBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBttnMouseClicked
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Select a table data first!");
        }else{
            if(customersNameTxt.getText().equals("") || locationTxt.getText().equals("") || phoneTxt.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please fill all the fields!");
            }else{

                CustomerDTO customerdto=new CustomerDTO(); 
                customerdto.setCustomerCode(customerCodeTxt.getText());
                customerdto.setFullName(customersNameTxt.getText());
                customerdto.setLocation(locationTxt.getText());
                customerdto.setPhone(phoneTxt.getText()); 
                new CustomerDAO().editCustomerDAO(customerdto);
                loadDatas();
          //      table.getColumn("customercode").setMaxWidth(0);
            }
        }
    }//GEN-LAST:event_editBttnMouseClicked

    private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBttnMouseClicked
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Select a table data first!");
        }else{
            new CustomerDAO().deleteCustomerDAO(table.getValueAt(table.getSelectedRow(),0).toString());
            loadDatas();
        }
    }//GEN-LAST:event_deleteBttnMouseClicked

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttnMouseClicked
        customerCodeTxt.setText("");
        customersNameTxt.setText("");
        locationTxt.setText("");
        phoneTxt.setText("");
    }//GEN-LAST:event_clearBttnMouseClicked

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        String text=searchTxt.getText();
        loadSearchCustomersDatas(text);
    }//GEN-LAST:event_searchTxtKeyReleased

    private void mainPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseClicked
        customerCodeTxt.setText("");
        customersNameTxt.setText("");
        locationTxt.setText("");
        phoneTxt.setText("");
    }//GEN-LAST:event_mainPanelMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    public void loadDatas(){
            try{
                CustomerDAO customerDAO=new CustomerDAO();
                table.setModel(customerDAO.buildTableModel(customerDAO.getQueryResult()));
            }catch(SQLException ex){
                ex.printStackTrace();
            }
    }
    
    public void loadSearchCustomersDatas(String text){
            try{
                CustomerDAO customerDAO=new CustomerDAO();
                table.setModel(customerDAO.buildTableModel(customerDAO.getSearchCustomersQueryResult(text)));
            }catch(SQLException ex){
                ex.printStackTrace();
            }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBttn;
    private javax.swing.JLabel clearBttn;
    private javax.swing.JTextField customerCodeTxt;
    private javax.swing.JTextField customersNameTxt;
    private javax.swing.JLabel deleteBttn;
    private javax.swing.JLabel deleteLab;
    private javax.swing.JLabel editBttn;
    private javax.swing.JLabel editLab;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField locationTxt;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel searchByLab;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
