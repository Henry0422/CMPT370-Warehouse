package warehouseui;

import database.gui.GuiDB;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Xianming
 */
public class LocateBinPopup extends javax.swing.JFrame {

    JPanel tempPanel;

    /**
     * Creates new form LocateBinPopup
     */
    public LocateBinPopup(JPanel p1) {
        initComponents();
        this.tempPanel = p1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Item ID");

        jButton1.setText("Locate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locateBin(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(layout.createSequentialGroup()
                .add(jButton1)
                .add(18, 18, 18)
                .add(jButton2)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel1)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton1)
                .add(jButton2))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
        //centralize the window
        this.setLocationRelativeTo(null);
    }

    private void locateBin(java.awt.event.ActionEvent evt) {
        String itemId = jTextField1.getText();
        int id = 0;
        try {
        id = Integer.valueOf(itemId);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Item ID Format (They are all numbers)");
            return;
        }
        GuiDB temp = new GuiDB();
        Integer[] bins = temp.getItemLocation(id);
        for (int i = 0; i < bins.length; i++) {
            String[] binsXY = temp.getBinIndicesFromID(bins[i]);
            MainUI.highlightBin(Integer.valueOf(binsXY[0]), Integer.valueOf(binsXY[1]));
        }
        tempPanel.repaint();
        this.setVisible(false);
    }

    private void cancel(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}
