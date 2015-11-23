package warehouseui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import shipper.makeShipment;

/**
 *
 * @author Xianming
 */
public class ShippingConfirmPopup extends javax.swing.JFrame {

    /**
     * Creates new form ShippingConfirmPopup
     *
     * @param newShipment
     */
    public ShippingConfirmPopup(makeShipment newShipment) {
        this.newShipment = newShipment;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();


        jTable1.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newShipment.pickerRequire(), new String[]{"Number", "Stock Handler"}));


        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Tracking Number");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmShipping(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newShipment.companyRequire(), new String[]{"Number", "Shipping Company"}));

        jScrollPane2.setViewportView(jTable2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(layout.createSequentialGroup()
                .add(jButton1)
                .add(18, 18, 18)
                .add(jButton2)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel1)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton1)
                .add(jButton2))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
        //centralize the window
        this.setLocationRelativeTo(null);
    }

    private void cancel(java.awt.event.ActionEvent evt) {
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

    private void confirmShipping(java.awt.event.ActionEvent evt) {
        String wayBill = jTextField1.getText();
        int choosenItem1 = jTable1.getSelectedRow();
        int choosenItem2 = jTable2.getSelectedRow();
        if ((choosenItem1 != -1) && (wayBill.compareTo("") != 0) && (choosenItem2 != -1)) {
            makeNewShipment(wayBill, choosenItem1, choosenItem2);
            newShipment.writeToDatabase(); //write the new task to database

            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));

            ConfirmPopup popup = new ConfirmPopup("Shipping Requirement has been created");
            popup.setVisible(true);
            popup.addWindowListener(new WindowAdapter() {
                public void windowDeactivated(WindowEvent e) {
                    closeThis();
                }
            });

        } else {
            new ConfirmPopup("Please input all the information").setVisible(true);
        }
    }

    public void closeThis() {

        this.setVisible(false);
    }

    /**
     * @author Xingze
     * @param wayBill
     * @param choosen
     */
    private void makeNewShipment(String wayBill, int choosen1, int choosen2) {

        newShipment.setPicker((String) jTable1.getValueAt(choosen1, 1));
        newShipment.setCompany((String) jTable2.getValueAt(choosen2, 1), wayBill);
    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private makeShipment newShipment;
    private String pickertTitle[];
    // End of variables declaration
}
