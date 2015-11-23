package warehouseui;

import shipper.futureShipment;

/**
 *
 * @author Xianming
 */
public class FuturePlanPopup extends javax.swing.JFrame {

    /**
     * Creates new form FuturePlanPopup
     */
    public FuturePlanPopup() {
        newfurture = new futureShipment();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        shipmentTitle = new String[]{"Number", "Name", "Quantity"};
        dateTitle = new String[]{"Date"};

        jTable1.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newfurture.getFurtureShip(), shipmentTitle));
        jScrollPane1.setViewportView(jTable1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)));

        pack();
        //centralize the window
        this.setLocationRelativeTo(null);
    }
    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private String shipmentTitle[];
    private String dateTitle[];
    private futureShipment newfurture;

    // End of variables declaration
}
