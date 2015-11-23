package warehouseui;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import manager.manageEmployee;
import manager.manageProduct;

/**
 *
 * @author Xianming
 */
public class ManagerUI extends javax.swing.JPanel {

    /**
     * Creates new form ManagerUI
     */
    public ManagerUI() {
        newProduct = new manageProduct();
        newEmployee = new manageEmployee();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jTabbedPane1.setToolTipText("");

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    addButton(evt);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ManagerUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton(evt);
            }
        });


        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton(evt);
            }
        });


        jTable1.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newProduct.getProductList(), new String[]{"Number", "Name", "Quantity", "Category", "Size", "Weight", "Location", "Price"}));

        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Product List", jScrollPane1);

        //set jTable2
        jTable2.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newEmployee.getEmployeeList(), new String[]{"Employee ID", "Employee Name", "Employee Title"}));


        jScrollPane2.setViewportView(jTable2);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE));

        jTabbedPane1.addTab("Employee List", jPanel1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
                new String[]{
            "Employee ID", "Employee Name", "Employee Title"
        }));
        jScrollPane3.setViewportView(jTable3);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
                new String[]{
            "Title 1", "Title 2", "Title 3", "J 4"
        }));
        jScrollPane4.setViewportView(jTable4);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE));


        jTabbedPane1.addTab("OrderStock", new OrderStockUI());

        jButton7.setText("Add");

        jButton8.setText("Edit");

        jButton9.setText("Delete");

        jTabbedPane1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                if (jTabbedPane1.getSelectedIndex() == 2) {
                    jButton7.setEnabled(false);
                    jButton8.setEnabled(false);
                    jButton9.setEnabled(false);
                }
                else {
                    jButton7.setEnabled(true);
                    jButton8.setEnabled(true);
                    jButton9.setEnabled(true);   
                }
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, jTabbedPane1)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton7)
                .add(18, 18, 18)
                .add(jButton8)
                .add(18, 18, 18)
                .add(jButton9)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 600, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton7)
                .add(jButton8)
                .add(jButton9))
                .add(0, 15, Short.MAX_VALUE)));

    }

    private void addButton(java.awt.event.ActionEvent evt) throws InterruptedException {
        EmployeeInfo employeeUI;

        //Product List Table
        if (jTabbedPane1.getSelectedIndex() == 0) {
            InventoryModifyPopup modifyInventoryUI = new InventoryModifyPopup();
            modifyInventoryUI.addWindowListener(new WindowAdapter() {
                public void windowDeactivated(WindowEvent e) {
                    addNewProduct();
                }
            });

            modifyInventoryUI.setVisible(true);
        }


        //Employee Table
        if (jTabbedPane1.getSelectedIndex() == 1) {
            employeeUI = new EmployeeInfo(1,-1, newEmployee);
            employeeUI.addWindowListener(new WindowAdapter() {
                public void windowDeactivated(WindowEvent e) {
                    addNewEmployee();
                }
            });

            employeeUI.setVisible(true);
        }

    }

    /**
     *
     * @param evt
     */
    private void editButton(java.awt.event.ActionEvent evt) {


        //Product List Table
        if (jTabbedPane1.getSelectedIndex() == 0) {
            if (jTable1.getSelectedRow() != -1) {
                int row = jTable1.getSelectedRow();

                InventoryModifyPopup modifyInventoryUI = new InventoryModifyPopup(jTable1.getValueAt(row, 0), jTable1.getValueAt(row, 1),
                        jTable1.getValueAt(row, 2), jTable1.getValueAt(row, 3),
                        jTable1.getValueAt(row, 4), jTable1.getValueAt(row, 5),
                        jTable1.getValueAt(row, 6), jTable1.getValueAt(row, 7),
                        jTable1.getValueAt(row, 8));
                modifyInventoryUI.addWindowListener(new WindowAdapter() {
                    public void windowDeactivated(WindowEvent e) {
                        addNewProduct();
                    }
                });

                modifyInventoryUI.setVisible(true);
            } else {
                new ConfirmPopup("Please select a product").setVisible(true);
            }
        }


        //Employee Table

        if (jTabbedPane1.getSelectedIndex() == 1) {
            if (jTable2.getSelectedRow() != -1) {
                    EmployeeInfo newUI;
                    newUI = new EmployeeInfo(2, (int) jTable2.getValueAt(jTable2.getSelectedRow(), 0),newEmployee);
                    newUI.setData(jTable2.getValueAt(jTable2.getSelectedRow(), 0), jTable2.getValueAt(jTable2.getSelectedRow(), 1), jTable2.getValueAt(jTable2.getSelectedRow(), 2));
                    int selectRow = jTable2.getSelectedRow();
                    newUI.addWindowListener(new WindowAdapter() {
                        public void windowDeactivated(WindowEvent e) {
                            modityEmployee();
                        }
                    });
                    newUI.setVisible(true);
            } else {
                new ConfirmPopup("Please select a employee").setVisible(true);
            }
        }

    }

    private void deleteButton(ActionEvent evt) {
        //Product List Table
        if (jTabbedPane1.getSelectedIndex() == 0) {
            int row = jTable1.getSelectedRow();
            if (row == -1) {
                new ConfirmPopup("Please Select a Product").setVisible(true);
            } else {
                newProduct.deleteProduct(jTable1.getValueAt(row, 0));
                //reset table
                jTable1.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newProduct.getProductList(), new String[]{"Number", "Name", "Quantity", "Category", "Size", "Weight", "Location", "Price", "description"}));

            }
        }


        if (jTabbedPane1.getSelectedIndex() == 1) {
            int row = jTable2.getSelectedRow();
            if (row == -1) {
                new ConfirmPopup("Please Select an Employee").setVisible(true);
            } else {
                newEmployee.deleteEmployee(jTable2.getValueAt(row, 0));
                //set jTable2
                jTable2.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newEmployee.getEmployeeList(), new String[]{"Employee ID", "Employee Name", "Employee Title"}));
            }
        }
    }

    /**
     * add new Employee
     */
    private void addNewEmployee() {
//        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
//        Object[] newE = newEmployee.getNew();
//        if (newE[0] != null) {
//            tableModel.addRow(newE);
//        }
        //reset table
        jTable2.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newEmployee.getEmployeeList(), new String[]{"Employee ID", "Employee Name", "Employee Title"}));
    }

    /**
     * add new Product
     */
    private void addNewProduct() {
        //reset table
        jTable1.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newProduct.getProductList(), new String[]{"Number", "Name", "Quantity", "Category", "Size", "Weight", "Location", "Price"}));
    }

    private void modityEmployee() {
//        Object[] newE = newEmployee.getNew();
//        jTable2.setValueAt(newE[1], row, 0);
//        jTable2.setValueAt(newE[0], row, 1);
//        jTable2.setValueAt(newE[2], row, 2);
//        
        jTable2.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newEmployee.getEmployeeList(), new String[]{"Employee ID", "Employee Name", "Employee Title"}));
    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private manageEmployee newEmployee;
    private manageProduct newProduct;
    // End of variables declaration
}
