package warehouseui;

import manager.orderStock;

/**
 *
 * @author Xianming
 */
public class OrderStockUI extends javax.swing.JPanel {

    /**
     * Creates new form OrderStockUI
     */
    public OrderStockUI() {
        newOrder = new orderStock();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        numberTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        sizeTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();

        jLabel1.setText("Item Name");

        jLabel2.setText("Item Number");

        jLabel3.setText("Quantity");

        jLabel4.setText("Size");

        jLabel5.setText("Weight");

        jButton1.setText("Confirm");

        jButton2.setText("Search");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                confirm(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search(evt);
            }
        });


        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jLabel4)
                .add(jLabel5)
                .add(layout.createSequentialGroup()
                .add(jButton1)
                .add(18, 18, 18)
                .add(jButton2))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(nameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jLabel2)
                .add(jLabel3))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(quantityTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(numberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(sizeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(weightTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel1)
                .add(nameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel2)
                .add(numberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel3)
                .add(quantityTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel4)
                .add(sizeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel5)
                .add(weightTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 33, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton1)
                .add(jButton2))
                .addContainerGap()));

    }

    private void search(java.awt.event.ActionEvent evt) {

        if (nameTextField.getText().compareTo("") != 0 && newOrder.getProductNumber(nameTextField.getText()) != -1) {
            int ProductNumber = newOrder.getProductNumber(nameTextField.getText());
            sizeTextField.setText(String.valueOf(newOrder.getItemSize(ProductNumber)));
            weightTextField.setText(String.valueOf(newOrder.getItemWeight(ProductNumber)));
            numberTextField.setText(String.valueOf(ProductNumber));

        } else if (numberTextField.getText().compareTo("") != 0 && newOrder.getProductName(Integer.parseInt(numberTextField.getText())).compareTo("") != 0) {
            int ProductNumber = Integer.parseInt(numberTextField.getText());
            nameTextField.setText(newOrder.getProductName(ProductNumber));
            sizeTextField.setText(String.valueOf(newOrder.getItemSize(ProductNumber)));
            weightTextField.setText(String.valueOf(newOrder.getItemWeight(ProductNumber)));
        }

    }

    private void confirm(java.awt.event.ActionEvent evt) {
        //if all textfield are inputted
        if (nameTextField.getText().compareTo("") != 0 && numberTextField.getText().compareTo("") != 0 && quantityTextField.getText().compareTo("") != 0 && sizeTextField.getText().compareTo("") != 0 && weightTextField.getText().compareTo("") != 0) {
            newOrder.createOrder(nameTextField.getText(), Integer.parseInt(numberTextField.getText()), Integer.parseInt(quantityTextField.getText()), Float.parseFloat(sizeTextField.getText()), Float.parseFloat(weightTextField.getText()));
        }

    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JTextField sizeTextField;
    private javax.swing.JTextField weightTextField;
    private orderStock newOrder;
    // End of variables declaration
}
