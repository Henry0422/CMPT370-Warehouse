package warehouseui;

import manager.modifyInventory;

/**
 *
 * @author Xianming
 */
public class InventoryModifyPopup extends javax.swing.JFrame {

    /**
     * Creates new form InventoryModifyPopup
     */
    public InventoryModifyPopup() {
        newModify = new modifyInventory();
        initComponents();
    }

    /**
     *
     * @param valueAt Number
     * @param valueAt0 Name
     * @param valueAt1 Quantity
     * @param valueAt2 Category
     * @param valueAt3 Size
     * @param valueAt4 Weight
     * @param valueAt5 Location
     * @param valueAt6 Price
     * @param valueAt7 Description
     */
    InventoryModifyPopup(Object valueAt, Object valueAt0, Object valueAt1, Object valueAt2, Object valueAt3, Object valueAt4, Object valueAt5, Object valueAt6, Object valueAt7) {
        newModify = new modifyInventory();
        initComponents();
        nameTextfield.setText((String) valueAt0);
        quantityTextfield.setText(String.valueOf(valueAt1));
        priceTextfield.setText(String.valueOf(valueAt6));
        categoryTextfield.setText(String.valueOf(valueAt2));
        numberTextfield.setText(String.valueOf(valueAt));
        //descriptionTextfield.setText((String) valueAt7);
        locationTextfield.setText(String.valueOf(valueAt5));
        sizeTextfield.setText(String.valueOf(valueAt3));
        weightTextfield.setText(String.valueOf(valueAt4));
        this.function = 1;
        
        
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
        nameTextfield = new javax.swing.JTextField();
        quantityTextfield = new javax.swing.JTextField();
        priceTextfield = new javax.swing.JTextField();
        categoryTextfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        //jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numberTextfield = new javax.swing.JTextField();
        //descriptionTextfield = new javax.swing.JTextField();
        locationTextfield = new javax.swing.JTextField();
        weightTextfield = new javax.swing.JTextField();
        sizeTextfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        jLabel1.setText("Name");
        
        jLabel2.setText("Quantity");
        
        jLabel3.setText("Price");
        
        jLabel4.setText("Category");
        
        jLabel5.setText("Product Number");
        
        //jLabel6.setText("Description");
        
        jLabel7.setText("Location");
        
        jLabel8.setText("Weight");
        
        jLabel9.setText("Size");
        
        jButton1.setText("Search");
        
        jButton2.setText("Confirm");
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search(evt);
            }
        });
        
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm(evt);
            }
        });
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jLabel3)
                .add(jLabel4)
                .add(layout.createSequentialGroup()
                .add(jButton1)
                .add(18, 18, 18)
                .add(jButton2))
                .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jLabel9)
                .add(jLabel2)
                .add(jLabel1))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(sizeTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(categoryTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(priceTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel8))
                .add(layout.createSequentialGroup()
                .add(nameTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel5))
                .add(layout.createSequentialGroup()
                .add(quantityTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel7))
                .add(layout.createSequentialGroup()
                .add(quantityTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)))
                //.add(jLabel8)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(numberTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(locationTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(weightTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                //.add(weightTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel1)
                .add(nameTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jLabel5)
                .add(numberTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel2)
                .add(quantityTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jLabel7)
                .add(locationTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel3)
                .add(priceTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jLabel8)
                .add(weightTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel4)
                .add(categoryTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                //.add(jLabel8)
                //.add(weightTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel9)
                .add(sizeTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 33, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton1)
                .add(jButton2))
                .addContainerGap()));
        
        
        
        pack();
        //centralize the window
        this.setLocationRelativeTo(null);
    }

    private void search(java.awt.event.ActionEvent evt) {
        
        if (nameTextfield.getText().compareTo("") != 0 && newModify.getProductNumber(nameTextfield.getText()) != -1) {
            int ProductNumber = newModify.getProductNumber(nameTextfield.getText());
            quantityTextfield.setText(String.valueOf(newModify.getProductQuantity(ProductNumber)));
            priceTextfield.setText(String.valueOf(newModify.getProductPrice(ProductNumber)));
            categoryTextfield.setText(String.valueOf(newModify.getProductCategory(ProductNumber)));
            numberTextfield.setText(String.valueOf(ProductNumber));
            //descriptionTextfield.setText(newModify.getProductDescription(ProductNumber));
            locationTextfield.setText(String.valueOf(newModify.getLocation(ProductNumber)));
            sizeTextfield.setText(String.valueOf(newModify.getSize(ProductNumber)));
            weightTextfield.setText(String.valueOf(newModify.getWeight(ProductNumber)));
            this.found = true;
        } else if (numberTextfield.getText().compareTo("") != 0 && newModify.getProductName(Integer.parseInt(numberTextfield.getText())).compareTo("") != 0) {
            int ProductNumber = Integer.parseInt(numberTextfield.getText());
            nameTextfield.setText(newModify.getProductName(ProductNumber));
            quantityTextfield.setText(String.valueOf(newModify.getProductQuantity(ProductNumber)));
            priceTextfield.setText(String.valueOf(newModify.getProductPrice(ProductNumber)));
            categoryTextfield.setText(String.valueOf(newModify.getProductCategory(ProductNumber)));
            numberTextfield.setText(String.valueOf(ProductNumber));
            //descriptionTextfield.setText(newModify.getProductDescription(ProductNumber));
            locationTextfield.setText(String.valueOf(newModify.getLocation(ProductNumber)));
            sizeTextfield.setText(String.valueOf(newModify.getSize(ProductNumber)));
            weightTextfield.setText(String.valueOf(newModify.getWeight(ProductNumber)));
            this.found = true;
        }
    }
    
    private void confirm(java.awt.event.ActionEvent evt) {
        if (nameTextfield.getText().compareTo("") != 0
                && quantityTextfield.getText().compareTo("") != 0
                && priceTextfield.getText().compareTo("") != 0
                && categoryTextfield.getText().compareTo("") != 0
                //&& descriptionTextfield.getText().compareTo("") != 0
                && locationTextfield.getText().compareTo("") != 0) {
            if (this.found == true||this.function == 1) {
                int number =  Integer.parseInt(numberTextfield.getText());
                newModify.setProductName(nameTextfield.getText(),number);
                newModify.setProductQuantity(Integer.parseInt(quantityTextfield.getText()), number);
                newModify.setProductPrice(Float.parseFloat(priceTextfield.getText()),number);
                newModify.setCategory(Integer.parseInt(categoryTextfield.getText()), number);
                //newModify.setProductDescription(descriptionTextfield.getText(), number);
                newModify.setLocation(Integer.parseInt(locationTextfield.getText()),number);
                newModify.setWeight(Float.parseFloat(weightTextfield.getText()), number);
                newModify.setSize(Float.parseFloat(sizeTextfield.getText()), number);
                
                this.found = false;
                //test
                System.out.println(newModify.toString());
            } else {
                //need change type of category
                int number;
                number = newModify.addProduct(nameTextfield.getText());
                newModify.setProductName(nameTextfield.getText(),number);
                newModify.setProductQuantity(Integer.parseInt(quantityTextfield.getText()), number);
                newModify.setProductPrice(Float.parseFloat(priceTextfield.getText()),number);
                newModify.setCategory(Integer.parseInt(categoryTextfield.getText()), number);
                //newModify.setProductDescription(descriptionTextfield.getText(), number);
                newModify.setLocation(Integer.parseInt(locationTextfield.getText()),number);
                newModify.setWeight(Float.parseFloat(weightTextfield.getText()), number);
                newModify.setSize(Float.parseFloat(sizeTextfield.getText()), number);
                
            }
            this.setVisible(false);
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
    //private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTextfield;
    private javax.swing.JTextField quantityTextfield;
    private javax.swing.JTextField priceTextfield;
    private javax.swing.JTextField categoryTextfield;
    private javax.swing.JTextField numberTextfield;
    //private javax.swing.JTextField descriptionTextfield;
    private javax.swing.JTextField locationTextfield;
    private javax.swing.JTextField weightTextfield;
    private javax.swing.JTextField sizeTextfield;
    private modifyInventory newModify;
    private boolean found = false;
    private int function = 0;  // 0 for add, 1 for edit
    // End of variables declaration
}