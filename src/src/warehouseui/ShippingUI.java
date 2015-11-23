package warehouseui;

import shipper.makeShipment;

/**
 *
 * @author Xianming
 */
public class ShippingUI extends javax.swing.JPanel {

    /**
     * Creates new form ShippingUI
     */
    public ShippingUI() {
        newShipment = new makeShipment();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        shipmentTitle = new String[]{"Number", "Name", "Quantity"};
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jButton1.setText("Future Plan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFuturePlanPopup(evt);
            }
        });

        jButton2.setText("Ship");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openShippingPopup(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newShipment.shipRequire(), shipmentTitle));

        jScrollPane1.setViewportView(jTable1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton2)
                .addContainerGap(199, Short.MAX_VALUE))
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton1)
                .add(jButton2))
                .addContainerGap()));
    }

    /**
     * Open future plan pop-up window
     *
     * @param evt
     */
    private void openFuturePlanPopup(java.awt.event.ActionEvent evt) {
        FuturePlanPopup futurePopup = new FuturePlanPopup();
        futurePopup.setVisible(true);
    }

    /**
     * Open shipping pop-up window
     *
     * @param evt
     */
    private void openShippingPopup(java.awt.event.ActionEvent evt) {
        //if do not choose an shipment, ship button is not available
        int choosenItem = jTable1.getSelectedRow();
        if (choosenItem != -1) {
            ShippingConfirmPopup shippingPopup = new ShippingConfirmPopup(newShipment);
            setShipmentInfo(choosenItem);
            shippingPopup.setVisible(true);

        }
    }

    /**
     * @author Xingze Guo
     * @param choosen from UI
     */
    private void setShipmentInfo(int choosen) {
        newShipment.inputItemInfor((Integer) jTable1.getValueAt(choosen, 0), (String) jTable1.getValueAt(choosen, 1), (Integer) jTable1.getValueAt(choosen, 2),
                null,null);
    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private makeShipment newShipment;
    private String shipmentTitle[];
    // End of variables declaration
}
