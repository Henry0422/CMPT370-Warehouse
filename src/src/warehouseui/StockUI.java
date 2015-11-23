package warehouseui;

import database.stockhandler.StockhandlerDB;
import javax.swing.JComboBox;
import stockHandler.StockPickerTable;

/**
 *
 * @author Xianming
 */
public class StockUI extends javax.swing.JPanel {

    /**
     * Creates new form ShockUI
     */
    public StockUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");
        StockhandlerDB stker;
        stker = new StockhandlerDB();
        Integer[] dog = stker.getReadyOrderNumbers();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(stker.getReadyOrderNumbers()));



        jButton1.setLabel("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
                new String[]{
            // "Label", "Start Time", "End Time"
            "Object number", "location", "Name", "Quantity", "Completed", "Comments"
        }));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Stock");
        jLabel2.setToolTipText("");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(220, 220, 220)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButton1))
                .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jButton1)
                .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 600, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        StockPickerTable stkTable = new StockPickerTable();

        if (evt.getActionCommand() == "Print") {
            stkTable.printTable(jTable1);
        } else if (evt.getActionCommand() == "comboBoxChanged") {
            JComboBox cb = (JComboBox) evt.getSource();
            Integer orderNumber;
            orderNumber = (Integer) cb.getSelectedItem();

            jTable1.setModel(new javax.swing.table.DefaultTableModel((Object[][]) stkTable.loadTable(orderNumber), new String[]{"Object number", "location", "Name", "Quantity", "Completed", "Comments"}));
        }

    }

    public void jComboBox1ActionPerformed(java.awt.event.ActionEvent e) {
        StockPickerTable stkTable;
        stkTable = new StockPickerTable();

    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
