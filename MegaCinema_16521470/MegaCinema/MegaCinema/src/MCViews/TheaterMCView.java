/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCViews;

import MCControllers.CinemaController;
import MCControllers.MovieController;
import MCControllers.StatusController;
import MCControllers.TheaterController;
import MCModels.ArrayListComboBoxModel;
import MCModels.Cinema;
import MCModels.Movie;
import MCModels.Status;
import MCModels.Theater;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import keeptoo.Drag;

/**
 *
 * @author USER
 */
public final class TheaterMCView extends javax.swing.JFrame {

    /**
     * Creates new form TheaterMCView
     */
    TheaterController theaterC = new TheaterController();
    //MovieController mc = new MovieController();
    int act = 0;
    boolean tableRowClicked = false;

    public TheaterMCView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        theaterTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        modifyBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        theaterNameTextField = new javax.swing.JTextField();
        nameText = new javax.swing.JLabel();
        rowText = new javax.swing.JLabel();
        theaterRowTextField = new javax.swing.JTextField();
        availableRB = new javax.swing.JRadioButton();
        notAvailableRB = new javax.swing.JRadioButton();
        statusText = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        colText = new javax.swing.JLabel();
        theaterColTextField = new javax.swing.JTextField();
        searchTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        theaterFLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Theater Management");
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(210, 82, 127));
        kGradientPanel1.setkStartColor(new java.awt.Color(46, 49, 49));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });

        theaterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Seat Rows", "Seat Columns", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        theaterTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        theaterTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(theaterTable);
        if (theaterTable.getColumnModel().getColumnCount() > 0) {
            theaterTable.getColumnModel().getColumn(0).setPreferredWidth(3);
            theaterTable.getColumnModel().getColumn(2).setPreferredWidth(5);
            theaterTable.getColumnModel().getColumn(3).setPreferredWidth(5);
            theaterTable.getColumnModel().getColumn(4).setPreferredWidth(3);
        }

        addBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MCImage/addIcon32px.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.setBorder(null);
        addBtn.setMaximumSize(new java.awt.Dimension(115, 45));
        addBtn.setMinimumSize(new java.awt.Dimension(115, 45));
        addBtn.setOpaque(false);
        addBtn.setPreferredSize(new java.awt.Dimension(115, 45));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        modifyBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modifyBtn.setForeground(new java.awt.Color(255, 255, 255));
        modifyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MCImage/modifyIcon32px.png"))); // NOI18N
        modifyBtn.setText("Modify");
        modifyBtn.setToolTipText("");
        modifyBtn.setBorder(null);
        modifyBtn.setMaximumSize(new java.awt.Dimension(115, 45));
        modifyBtn.setMinimumSize(new java.awt.Dimension(115, 45));
        modifyBtn.setOpaque(false);
        modifyBtn.setPreferredSize(new java.awt.Dimension(115, 45));
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MCImage/deleteIcon32px.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(null);
        deleteBtn.setMaximumSize(new java.awt.Dimension(115, 45));
        deleteBtn.setMinimumSize(new java.awt.Dimension(115, 45));
        deleteBtn.setOpaque(false);
        deleteBtn.setPreferredSize(new java.awt.Dimension(115, 45));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        theaterNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        theaterNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        theaterNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        theaterNameTextField.setOpaque(false);

        nameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        nameText.setText("Name");

        rowText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rowText.setForeground(new java.awt.Color(255, 255, 255));
        rowText.setText("Seat Rows");

        theaterRowTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        theaterRowTextField.setForeground(new java.awt.Color(255, 255, 255));
        theaterRowTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        theaterRowTextField.setOpaque(false);

        availableRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        availableRB.setForeground(new java.awt.Color(255, 255, 255));
        availableRB.setText("Available");
        availableRB.setOpaque(false);

        notAvailableRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notAvailableRB.setForeground(new java.awt.Color(255, 255, 255));
        notAvailableRB.setText("Not Available");
        notAvailableRB.setOpaque(false);

        statusText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        statusText.setForeground(new java.awt.Color(255, 255, 255));
        statusText.setText("Status");

        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MCImage/saveIcon32px.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setBorder(null);
        saveBtn.setDoubleBuffered(true);
        saveBtn.setMaximumSize(new java.awt.Dimension(115, 45));
        saveBtn.setMinimumSize(new java.awt.Dimension(115, 45));
        saveBtn.setOpaque(false);
        saveBtn.setPreferredSize(new java.awt.Dimension(115, 45));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        colText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        colText.setForeground(new java.awt.Color(255, 255, 255));
        colText.setText("Seat Columns");

        theaterColTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        theaterColTextField.setForeground(new java.awt.Color(255, 255, 255));
        theaterColTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        theaterColTextField.setOpaque(false);

        searchTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(255, 255, 255));
        searchTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        searchTextField.setOpaque(false);

        searchBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MCImage/searchIcon32px.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.setBorder(null);
        searchBtn.setMaximumSize(new java.awt.Dimension(115, 45));
        searchBtn.setMinimumSize(new java.awt.Dimension(115, 45));
        searchBtn.setOpaque(false);
        searchBtn.setPreferredSize(new java.awt.Dimension(115, 45));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(240, 52, 52));
        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Back");
        exitBtn.setBorder(null);
        exitBtn.setMaximumSize(new java.awt.Dimension(30, 15));
        exitBtn.setMinimumSize(new java.awt.Dimension(30, 15));
        exitBtn.setPreferredSize(new java.awt.Dimension(30, 15));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        theaterFLbl.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        theaterFLbl.setForeground(new java.awt.Color(255, 255, 255));
        theaterFLbl.setText("Theater Management");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rowText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(theaterRowTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(theaterNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(theaterColTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(availableRB)
                                        .addGap(27, 27, 27)
                                        .addComponent(notAvailableRB))))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(theaterFLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(theaterFLbl)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText)
                    .addComponent(theaterNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rowText)
                    .addComponent(theaterRowTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colText)
                    .addComponent(theaterColTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusText)
                    .addComponent(availableRB)
                    .addComponent(notAvailableRB))
                .addGap(47, 47, 47)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        //JLayeredPane layeredP = (JLayeredPane) LayeredPane.getLayer();
        theaterNameTextField.setEditable(true);
        theaterRowTextField.setEditable(true);
        theaterColTextField.setEditable(true);

        theaterNameTextField.setText("");
        theaterRowTextField.setText("");
        theaterColTextField.setText("");

        act = 1;  //tell save button to act add
    }//GEN-LAST:event_addBtnActionPerformed

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        // TODO add your handling code here:
        if (tableRowClicked == true) {
            theaterNameTextField.setEditable(true);
            theaterRowTextField.setEditable(true);
            theaterColTextField.setEditable(true);

            theaterNameTextField.setText(theaterTable.getValueAt(theaterTable.getSelectedRow(), 1).toString());
            theaterRowTextField.setText(theaterTable.getValueAt(theaterTable.getSelectedRow(), 2).toString());
            theaterColTextField.setText(theaterTable.getValueAt(theaterTable.getSelectedRow(), 3).toString());

            act = 2;  //tell save button to save info modify
        } else {
            JOptionPane.showMessageDialog(null, "Please select a theater");
        }
    }//GEN-LAST:event_modifyBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        if (tableRowClicked == true) {
            int id = (int) theaterTable.getValueAt(theaterTable.getSelectedRow(), 0);

            int check = JOptionPane.showConfirmDialog(jScrollPane1, "Are you sure delete this theater?", "Delete", JOptionPane.YES_NO_OPTION);
            if (check == JOptionPane.YES_OPTION) {
                int res = theaterC.delete(id);
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Deleted successfully");
                } else if (res == 0) {
                    JOptionPane.showMessageDialog(null, "Unable to delete");
                }

                refresh();
                act = 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a theater");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void refresh() {

        theaterTable.clearSelection();

        DefaultTableModel model = (DefaultTableModel) theaterTable.getModel();

        model.setRowCount(0);   //clear data table

        List<Theater> theaterList = theaterC.selectAll();
        Object rowData[] = new Object[5];

        for (int i = 0; i < theaterList.size(); i++) {
            rowData[0] = theaterList.get(i).getId();
            rowData[1] = theaterList.get(i).getName();
            rowData[2] = theaterList.get(i).getRowCount();
            rowData[3] = theaterList.get(i).getRowCount();
            rowData[4] = theaterList.get(i).getStatus();
            model.addRow(rowData);
        }

        theaterNameTextField.setEditable(false);
        theaterRowTextField.setEditable(false);
        theaterColTextField.setEditable(false);

        tableRowClicked = false;

        theaterTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                tableRowClicked = true;
                theaterNameTextField.setEditable(false);
                theaterRowTextField.setEditable(false);
                theaterColTextField.setEditable(false);

            }
        });
    }

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        theaterTable.clearSelection();

        DefaultTableModel model = (DefaultTableModel) theaterTable.getModel();

        model.setRowCount(0);   //clear data table
        List<Theater> theaterList = theaterC.select("theaterName like '%" + searchTextField.getText() + "%'");
        Object rowData[] = new Object[5];

        for (int i = 0; i < theaterList.size(); i++) {
            rowData[0] = theaterList.get(i).getId();
            rowData[1] = theaterList.get(i).getName();
            rowData[2] = theaterList.get(i).getRowCount();
            rowData[3] = theaterList.get(i).getColCount();
            rowData[4] = theaterList.get(i).getStatus();
            model.addRow(rowData);
        }

        theaterTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                tableRowClicked = true;
                theaterNameTextField.setEditable(false);
                theaterRowTextField.setEditable(false);
                theaterColTextField.setEditable(false);

            }
        });
    }//GEN-LAST:event_searchBtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_formComponentShown

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (act == 1) //save add info
        {
            int status;
            if (availableRB.isSelected() == true) {
                status = 0;
            } else {
                status = 1;
            }

            Theater theater = new Theater();

            theater.setName(theaterNameTextField.getText());

            boolean checkNum = true;

            //check if input for row and column are number or not
            try {
                theater.setRowCount(Integer.parseInt(theaterRowTextField.getText()));
                theater.setColCount(Integer.parseInt(theaterColTextField.getText()));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please input number for row and column, not char!");
                checkNum = false;
            }

            if (checkNum == true) {
                theater.setStatus(status);

                int res = theaterC.add(theater);
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Saved - add new info");
                } else {
                    JOptionPane.showMessageDialog(null, "Unable to save");
                }
                refresh();
                act = 0;
                theaterNameTextField.setEditable(false);
                theaterRowTextField.setEditable(false);
                theaterColTextField.setEditable(false);
            }
        } else if (act == 2) //save modify info
        {
            int id = (int) theaterTable.getValueAt(theaterTable.getSelectedRow(), 0);
            System.out.println("id: " + id);
            String name = theaterNameTextField.getText();
            //int dur = Integer.parseInt(movieDurTextField.getText());
            int row = Integer.parseInt(theaterRowTextField.getText());
            int col = Integer.parseInt(theaterColTextField.getText());

            int status;
            if (availableRB.isSelected() == true) {
                status = 0;
            } else {
                status = 1;
            }

            Theater theater = new Theater();

            theater.setName(theaterNameTextField.getText());
            theater.setRowCount(Integer.parseInt(theaterRowTextField.getText()));
            theater.setColCount(Integer.parseInt(theaterColTextField.getText()));
            theater.setStatus(status);

            int res = theaterC.modify(theater);
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Saved info changed");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save");
            }

            refresh();
            act = 0;
            theaterNameTextField.setEditable(false);
            theaterRowTextField.setEditable(false);
            theaterColTextField.setEditable(false);

        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        // TODO add your handling code here:
        new Drag(kGradientPanel1).onPress(evt);
    }//GEN-LAST:event_kGradientPanel1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TheaterMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TheaterMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TheaterMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TheaterMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheaterMCView().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JRadioButton availableRB;
    private javax.swing.JLabel colText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JLabel nameText;
    private javax.swing.JRadioButton notAvailableRB;
    private javax.swing.JLabel rowText;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel statusText;
    private javax.swing.JTextField theaterColTextField;
    private javax.swing.JLabel theaterFLbl;
    private javax.swing.JTextField theaterNameTextField;
    private javax.swing.JTextField theaterRowTextField;
    private javax.swing.JTable theaterTable;
    // End of variables declaration//GEN-END:variables
}