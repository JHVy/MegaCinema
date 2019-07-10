/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCViews;

import MCControllers.CinemaController;
import MCControllers.StorageController;
import MCControllers.UnitController;
import MCControllers.WarehouseController;
import MCModels.ArrayListComboBoxModel;
import MCModels.Cinema;
import MCModels.Storage;
import MCModels.Warehouse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class StorageMCView extends javax.swing.JFrame {

    StorageController sc = new StorageController();
    CinemaController cinemaC = new CinemaController();
    UnitController uc = new UnitController();
    private List<String> warehouseList = new ArrayList<>();
    private List<String> productList = new ArrayList<>();
    private ArrayListComboBoxModel modelCinema;
    private ArrayListComboBoxModel modelProduct;

    List<Storage> tempP = null;

    /**
     * Creates new form StorageMCView
     */
    public StorageMCView() {
        initComponents();
        loadWarehouse();
        loadProduct();
    }

    public void loadWarehouse() {
        WarehouseController warehouseC = new WarehouseController();
        List<Warehouse> temp = null;
        temp = warehouseC.loadWarehouses();

        for (int i = 0; i < temp.size(); i++) {
            warehouseList.add(Integer.toString(temp.get(i).getId()) + " - " + cinemaC.IDtoName(temp.get(i).getCinemaId()));
        }
        modelCinema = new ArrayListComboBoxModel((ArrayList<String>) warehouseList);
//        modelStatus.setSelectedItem(modelStatus.getElementAt(0));
        cbWarehouse.setModel(modelCinema);
    }

    public void loadProduct() {

        tempP = sc.loadProducts();

        for (int i = 0; i < tempP.size(); i++) {
            productList.add(tempP.get(i).getProductName());
        }

        modelProduct = new ArrayListComboBoxModel((ArrayList<String>) productList);
//        modelStatus.setSelectedItem(modelStatus.getElementAt(0));
        cbProduct.setModel(modelProduct);
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
        tbStorage = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        cbWarehouse = new javax.swing.JComboBox();
        cbProduct = new javax.swing.JComboBox();
        txtQuan = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        idLbl = new javax.swing.JLabel();
        warehouseLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        storageLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Storage Management");
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(142, 68, 173));
        kGradientPanel1.setkStartColor(new java.awt.Color(1, 50, 67));
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

        tbStorage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Warehouse", "Product", "Quantity", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbStorage);

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtId.setText("product ID");

        cbWarehouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbWarehouse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbProduct.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtQuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtQuan.setOpaque(false);

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MCImage/addIcon32px.png"))); // NOI18N
        btAdd.setText("Add");
        btAdd.setBorder(null);
        btAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAdd.setForeground(new java.awt.Color(255, 255, 255));
        btAdd.setMaximumSize(new java.awt.Dimension(115, 45));
        btAdd.setMinimumSize(new java.awt.Dimension(115, 45));
        btAdd.setOpaque(false);
        btAdd.setPreferredSize(new java.awt.Dimension(115, 45));
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MCImage/refeshIcon32px.png"))); // NOI18N
        btRefresh.setText("Refresh");
        btRefresh.setBorder(null);
        btRefresh.setBorderPainted(false);
        btRefresh.setFocusable(false);
        btRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btRefresh.setMaximumSize(new java.awt.Dimension(115, 45));
        btRefresh.setMinimumSize(new java.awt.Dimension(115, 45));
        btRefresh.setOpaque(false);
        btRefresh.setPreferredSize(new java.awt.Dimension(115, 45));
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        idLbl.setText("ID: ");
        idLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLbl.setForeground(new java.awt.Color(255, 255, 255));

        warehouseLbl.setText("Warehouse: ");
        warehouseLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        warehouseLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Product:");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Quantity:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        storageLbl.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        storageLbl.setForeground(new java.awt.Color(255, 255, 255));
        storageLbl.setText("Storage");

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

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(storageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLbl)
                            .addComponent(warehouseLbl)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(storageLbl)
                        .addGap(76, 76, 76)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLbl))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warehouseLbl))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(54, 54, 54)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbStorage.getModel();
        List<Storage> storageList = sc.loadStorages();
        Object rowData[] = new Object[5];

        for (int i = 0; i < storageList.size(); i++) {
            rowData[0] = storageList.get(i).getId();
            rowData[1] = Integer.toString(storageList.get(i).getWarehouseId());
            rowData[2] = storageList.get(i).getProductName();
            rowData[3] = storageList.get(i).getQuantity();
            rowData[4] = uc.IDtoName(storageList.get(i).getUnit());

            model.addRow(rowData);
        }
        tbStorage.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // do some actions here, for example
                // print first column value from selected row

//            txtId.setText(tbStorage.getValueAt(tbStorage.getSelectedRow(), 0).toString());
//            modelCinema = new ArrayListComboBoxModel((ArrayList<String>) cinemaList);
//           
//            modelCinema.setSelectedItem(tbWarehouse.getValueAt(tbWarehouse.getSelectedRow(), 1).toString());
//            
//            cbCinema.setModel(modelCinema);
            }
        });
        cbProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtId.setText(Integer.toString(cbProduct.getSelectedIndex() + 1));
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
//        txtId.setText(Integer.toString(wc.getNextID()));
    }//GEN-LAST:event_formComponentShown

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        Storage temp = new Storage(Integer.parseInt(txtId.getText()), cbWarehouse.getSelectedIndex() + 1, cbProduct.getSelectedItem().toString(), Integer.parseInt(txtQuan.getText()), tempP.get(Integer.parseInt(txtId.getText()) - 1).getUnit());

        int res = sc.AddQuantity(Integer.parseInt(txtId.getText()), cbWarehouse.getSelectedIndex() + 1, Integer.parseInt(txtQuan.getText()));

        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Saved");
            //new NewJFrame().setVisible(true);
            //this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save");
        }

        btRefreshActionPerformed(evt);
    }//GEN-LAST:event_btAddActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        // TODO add your handling code here:
        tbStorage.clearSelection();

        DefaultTableModel model = (DefaultTableModel) tbStorage.getModel();

        model.setRowCount(0);

        List<Storage> storageList = sc.loadStorages();
        Object rowData[] = new Object[5];

        for (int i = 0; i < storageList.size(); i++) {
            rowData[0] = storageList.get(i).getId();
            rowData[1] = Integer.toString(storageList.get(i).getWarehouseId());
            rowData[2] = storageList.get(i).getProductName();
            rowData[3] = storageList.get(i).getQuantity();
            rowData[4] = uc.IDtoName(storageList.get(i).getUnit());

            model.addRow(rowData);
        }
    }//GEN-LAST:event_btRefreshActionPerformed

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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StorageMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StorageMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StorageMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StorageMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StorageMCView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btRefresh;
    private javax.swing.JComboBox cbProduct;
    private javax.swing.JComboBox cbWarehouse;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel storageLbl;
    private javax.swing.JTable tbStorage;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JLabel warehouseLbl;
    // End of variables declaration//GEN-END:variables
}
