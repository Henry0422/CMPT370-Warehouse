package warehouseui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import manager.manageProduct;
import receiver.receiveOrder;

/**
 *
 * @author Xianming
 */
public class ReceiverUI extends javax.swing.JPanel {

    private JLabel locationjLabel;
    private JTextField locationTextField;

    /**
     * Creates new form ReceiverUI
     */
    public ReceiverUI() {
        newOrder = new receiveOrder();
        initComponents();
    }

    ReceiverUI(int i) {
        newOrder = new receiveOrder();
        newProduct = new manageProduct();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

       
        

        nameTextField = new javax.swing.JTextField();   
        orderNumberTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        sizeTextField = new javax.swing.JTextField();
        //descriptionTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        locationTextField = new javax.swing.JTextField();
        
        namejLabel = new javax.swing.JLabel();
        numberjLabel = new javax.swing.JLabel();
        quantityjLabel3 = new javax.swing.JLabel();
        categoryjLabel = new javax.swing.JLabel();
        pricejLabel = new javax.swing.JLabel();
        sizejLabel = new javax.swing.JLabel();
        //descriptionjLabel = new javax.swing.JLabel();
        weightjLabel = new javax.swing.JLabel();
        locationjLabel = new javax.swing.JLabel();  // for location
        

        
        
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        
        namejLabel.setText("Name");
        numberjLabel.setText("Item Number");

        quantityjLabel3.setText("Quantity");

        categoryjLabel.setText("Category");

        pricejLabel.setText("Price");

        sizejLabel.setText("Size");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(newOrder.getCategoryList()));

        //descriptionjLabel.setText("Description");

        weightjLabel.setText("Weight");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmReceive(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1)
                .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(numberjLabel)
                .add(quantityjLabel3)
                .add(namejLabel))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(nameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(categoryjLabel))
                .add(layout.createSequentialGroup()
                .add(orderNumberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(pricejLabel))
                .add(layout.createSequentialGroup()
                .add(quantityTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(sizejLabel)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(sizeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(weightjLabel))
                .add(layout.createSequentialGroup()
                .add(priceTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)))
                //.add(weightjLabel)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                //.add(weightTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(weightTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .add(jPanel1)
                .add(layout.createSequentialGroup()
                .add(jButton1)
                .add(18, 18, 18)
                .add(jButton2)))
                .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(namejLabel)
                .add(nameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(categoryjLabel)
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(weightjLabel)
                .add(weightTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(numberjLabel)
                .add(orderNumberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(pricejLabel)
                .add(priceTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                //.add(weightjLabel)
                //.add(weightTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(quantityjLabel3)
                .add(quantityTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(sizejLabel)
                .add(sizeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 440, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton1)
                .add(jButton2))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        nameTextField.getAccessibleContext().setAccessibleName("");
        add(locationTextField);

        // set a border for this panel
        setBorder(BorderFactory.createLineBorder(Color.white));
    }

    private void confirmReceive(java.awt.event.ActionEvent evt) {
        if (nameTextField.getText().compareTo("") != 0
                && quantityTextField.getText().compareTo("") != 0
                && priceTextField.getText().compareTo("") != 0
                && sizeTextField.getText().compareTo("") != 0
                //&& descriptionTextField.getText().compareTo("") != 0
                && weightTextField.getText().compareTo("") != 0) {
            if (this.function == 0) {
                newOrder.setItemName(nameTextField.getText());
                newOrder.setItemQuantity(Integer.valueOf(quantityTextField.getText()));
                newOrder.setPrice(Float.valueOf(priceTextField.getText()));
                newOrder.setSize(Float.valueOf(sizeTextField.getText()));
                //newOrder.setDescription(descriptionTextField.getText());
                newOrder.setItemCategory(jComboBox1.getSelectedIndex() + 1);
                newOrder.setWeight(Float.valueOf(weightTextField.getText()));
                newOrder.createOrder();

                // Check if order number is empty.
                // If user input order number, add the product into exist order
                // If order number is not empty, create a new order


                int newOrderNumber = -1;
                if (orderNumberTextField.getText().compareTo("") != 0) {
                    newOrder.setOrderID(Integer.valueOf(orderNumberTextField.getText()));
                    newOrder.addItemsToOrder();
                } else {
                    newOrderNumber = newOrder.addProduct();
                }

                new ConfirmPopup("Item has been recorded").setVisible(true);

                nameTextField.setText("");
                quantityTextField.setText("");
                priceTextField.setText("");
                sizeTextField.setText("");
                //descriptionTextField.setText("");
                weightTextField.setText("");

                if (newOrderNumber != -1) {
                    orderNumberTextField.setText(String.valueOf(newOrderNumber));
                }

            } // end if function =0

//            if(this.function ==1){
//                newProduct
//            } //end if function =1

        }
    }

    private void cancel(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }
    // Variables declaration - do not modify
    //private javax.swing.JTextField descriptionTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JLabel numberjLabel;
    private javax.swing.JLabel quantityjLabel3;
    private javax.swing.JLabel categoryjLabel;
    private javax.swing.JLabel pricejLabel;
    private javax.swing.JLabel sizejLabel;
    //private javax.swing.JLabel descriptionjLabel;
    private javax.swing.JLabel weightjLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField orderNumberTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JTextField sizeTextField;
    private javax.swing.JTextField weightTextField;
    private receiveOrder newOrder;
    private int function = 0;  // function for UI. 0 for receiver, 1 for add product list,2 for edit product 
    private manageProduct newProduct;
    // End of variables declaration
}
