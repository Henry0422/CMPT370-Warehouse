package warehouseui;

import database.gui.GuiDB;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

/**
 *
 * @author Xianming
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI(int permission) {
        super("Warehouse System");
        initComponents(permission);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents(int permission) {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MapButton = new javax.swing.JButton();
        ReceiveButton = new javax.swing.JButton();
        shippingButton = new javax.swing.JButton();
        StockButton = new javax.swing.JButton();
        ManageButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new MainUI.WarehouseMap();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        existHighlightBin = false;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MAP");

        MapButton.setText("Map");
        MapButton.setToolTipText("Overview and inventory locations");
        MapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapButtonActionPerformed(evt);
            }
        });

        ReceiveButton.setText("Receive");
        ReceiveButton.setToolTipText("Process newly received shipments");
        ReceiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiveButtonActionPerformed(evt);
            }
        });

        shippingButton.setText("Shipping");
        shippingButton.setToolTipText("Process customer orders");
        shippingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shippingButtonActionPerformed(evt);
            }
        });

        StockButton.setText("Stock");
        StockButton.setToolTipText("Print out assigned stocking tasks");
        StockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockButtonActionPerformed(evt);
            }
        });

        ManageButton.setText("Management");
        ManageButton.setToolTipText("Manage inventory and employees");
        ManageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageButtonActionPerformed(evt);
            }
        });
        
        LogoutButton.setText("Logout");
        LogoutButton.setToolTipText("Logout the system");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        switch (permission) {
            // Manager
            case 1:
                // can access eveything
                break;
            // Stock Handler
            case 2:
                ManageButton.setEnabled(false);
                shippingButton.setEnabled(false);
                ReceiveButton.setEnabled(false);
                StockButton.setEnabled(true);
                break;
            // Shipper
            case 3:
                ManageButton.setEnabled(false);
                shippingButton.setEnabled(true);
                ReceiveButton.setEnabled(false);
                StockButton.setEnabled(false);
                break;
            // Receiver
            case 4:
                ManageButton.setEnabled(false);
                shippingButton.setEnabled(false);
                ReceiveButton.setEnabled(true);
                StockButton.setEnabled(false);
                break;
        }

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(MapButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(ReceiveButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(shippingButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(StockButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(ManageButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(LogoutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(MapButton)
                .add(18, 18, 18)
                .add(ReceiveButton)
                .add(18, 18, 18)
                .add(shippingButton)
                .add(18, 18, 18)
                .add(StockButton)
                .add(18, 18, 18)
                .add(ManageButton)
                .add(360, 360, 360)
                .add(LogoutButton)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        MapButton.getAccessibleContext().setAccessibleName("MapButton");
        ReceiveButton.getAccessibleContext().setAccessibleName("ReceiveButton");
        StockButton.getAccessibleContext().setAccessibleName("StockButton");
        ManageButton.getAccessibleContext().setAccessibleName("ManageButton");

        jPanel2.setLayout(new java.awt.CardLayout());

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 785, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 500, Short.MAX_VALUE));

        jPanel2.add(jPanel3, "card1");

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 785, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 500, Short.MAX_VALUE));

        jPanel2.add(new ReceiverUI(), "card2");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 785, Short.MAX_VALUE));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 500, Short.MAX_VALUE));

        jPanel2.add(new ShippingUI(), "card3");

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 785, Short.MAX_VALUE));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 500, Short.MAX_VALUE));

        jPanel2.add(new StockUI(), "card4");

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 785, Short.MAX_VALUE));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(0, 500, Short.MAX_VALUE));

        jPanel2.add(new ManagerUI(), "card5");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        this.cardLayout = (CardLayout) (jPanel2.getLayout());
        pack();
        //centralize the window
        this.setLocationRelativeTo(null);
    }

    private void MapButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        cardLayout.show(jPanel2, "card1");
        jLabel1.setText("MAP");
    }

    private void ReceiveButtonActionPerformed(java.awt.event.ActionEvent evt) {

        cardLayout.show(jPanel2, "card2");
        jLabel1.setText("RECEIVE");
    }

    private void shippingButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        cardLayout.show(jPanel2, "card3");
        jLabel1.setText("SHIPPING");
    }

    private void StockButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        cardLayout.show(jPanel2, "card4");
        jLabel1.setText("STOCK");
    }

    private void ManageButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        cardLayout.show(jPanel2, "card5");
        jLabel1.setText("MANAGEMENT");
    }
    
    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new LoginUI().setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    /*
     * Bins for the warehouse map system as a place holder
     */
    private class Bin {
        // ----- Instance Variables -----

        boolean isExist;
        boolean isHightlighted;

        // ----- Class Methods -----
        Bin() {
            isExist = false;
            isHightlighted = false;
        }
    }
    static MainUI.Bin[][] bins;
    WarehouseMap temp = new WarehouseMap();

    static void highlightBin(int X, int Y) {
        if (bins[Y - 1][X - 1].isExist == true) {
            bins[Y - 1][X - 1].isHightlighted = true;
        }
        existHighlightBin = true;
    }
    
    private void unhighlightBin() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {
                bins[i][j].isHightlighted = false;
            }
        }
        existHighlightBin = false;
    }

    private class WarehouseMap extends JPanel {
        // ----- Instance Variables -----

        Dimension dim = new Dimension(930, 630); // size of the map
        final int NUM_BIN_X = 30;
        final int NUM_BIN_Y = 20;
        int mouseX; // current location of mouse in x-axis
        int mouseY; // current location of mouse in y-axis
        int draggedX; // location of dragged bin in x-axis
        int draggedY; // location of dragged bin in y-axis
        int preDraggedX; // the original location of dragged bin in x-axis
        int preDraggedY; // the original locaiton of dragged bin in y-axis
        boolean isDragged = false; // whether a bin is dragged
        Rectangle rectX = new Rectangle(); // coordinate rectangle for x-axis
        Rectangle rectY = new Rectangle(); // coordinate rectangle for y-axis
        boolean onDragged = false; // whether mouse is dragging a bin
        boolean isConflict = false; // whether there is conflict when moving a bin
        private GuiDB database;

        // ----- Class Methods -----
        public WarehouseMap() {
            bins = new MainUI.Bin[NUM_BIN_Y][NUM_BIN_X];
            for (int i = 0; i < NUM_BIN_Y; i++) {
                for (int j = 0; j < NUM_BIN_X; j++) {
                    bins[i][j] = new MainUI.Bin();
                }
            }
            addMouseMotionListener(new MainUI.WarehouseMap.MyMouseAdapter());
            addMouseListener(new MainUI.WarehouseMap.MyMouseAdapter());
            database = new GuiDB();
            reloadBins();
        }

        @Override
        public Dimension getPreferredSize() {
            return dim;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.white);
            drawLine(g);
            drawCoordinate(g);
            drawRect(g);
            // if the user is dragging the bin, draw the coordinate rectangle
            if (isDragged) {
                rectX.setBounds(31, draggedY * 30 + 1, 900, 29);
                rectY.setBounds(draggedX * 30 + 1, 31, 29, 600);
                Graphics2D g2d = (Graphics2D) g;
                if (!isConflict) {
                    // set rectangle to green
                    g2d.setColor(new Color(0, 255, 126));
                } else {
                    // set rectangle to red
                    g2d.setColor(new Color(255, 98, 94));
                }
                g2d.fill(rectX);
                g2d.fill(rectY);
            }
        }

        /**
         * Draw the grid for the map system
         *
         * @param g
         */
        private void drawLine(Graphics g) {
            // draw horizontal line
            for (int i = 0; i <= 630; i += 30) {
                g.drawLine(0, i, 930, i);
            }

            // draw vertical line
            for (int i = 0; i <= 930; i += 30) {
                g.drawLine(i, 0, i, 630);
            }
        }

        /**
         * Draw the coordinate model for the map system
         *
         * @param g
         */
        private void drawCoordinate(Graphics g) {
            // draw horizontal coordinate
            int number = 0;
            for (int i = 10; i < 930; i += 30) {
                g.drawString(String.valueOf(number), i, 20);
                number++;
            }
            // draw vertical line
            number = 1;
            for (int i = 50; i < 630; i += 30) {
                g.drawString(String.valueOf(number), 10, i);
                number++;
            }
        }

        /**
         * Draw the bin by filling up the cell according to the bins array
         *
         * @param g
         */
        private void drawRect(Graphics g) {
            for (int i = 0; i < NUM_BIN_Y; i++) {
                for (int j = 0; j < NUM_BIN_X; j++) {
                    if (bins[i][j].isExist == true && bins[i][j].isHightlighted == false) {
                        g.setColor(new Color(0, 150, 255)); // set the color as blue
                        g.fillRect((j + 1) * 30 + 1, (i + 1) * 30 + 1, 29, 29);
                    } else if (bins[i][j].isExist == true && bins[i][j].isHightlighted == true) {
                        g.setColor(new Color(0, 255, 126)); // set the color as green
                        g.fillRect((j + 1) * 30 + 1, (i + 1) * 30 + 1, 29, 29);
                    }
                }
            }
        }

        private void reloadBins() {
            String[] currentBins = database.getBinLocations();
            for (int i = 0; i < currentBins.length; i++) {
                String currBin = currentBins[i];
                bins[Integer.parseInt(currBin.split(" ")[0]) - 1][Integer.parseInt(currBin.split(" ")[1]) - 1].isExist = true;
            }
        }

        /**
         * Draw the bin by setting the bin element to be true and repaint the
         * component
         *
         * @param X location of bin in x-axis
         * @param Y location of bin in y-axis
         */
        private void drawOnClickBin(int X, int Y) {
            if (bins[Y - 1][X - 1].isExist == false) {
                bins[Y - 1][X - 1].isExist = true;
                database.createBin(Y, X);
            }
            repaint();
        }

        private class MyMouseAdapter extends MouseAdapter {

            /**
             * For delete the cell
             */
            int deletedX;
            int deletedY;

            /**
             * delete the cell according to the recorded deletedX and deletedY
             */
            void deleteCell() {
                bins[deletedY - 1][deletedX - 1].isExist = false;
                database.removeBin(deletedY, deletedX);
                repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                int X = mouseX / 30;
                int Y = mouseY / 30;

                // check if mouse event is right click
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20)
                        && (bins[Y - 1][X - 1].isExist)
                        && SwingUtilities.isRightMouseButton(e)) {
                    deletedX = X;
                    deletedY = Y;
                    MainUI.WarehouseMap.MyMouseAdapter.PopupMenu popupMenu = new MainUI.WarehouseMap.MyMouseAdapter.PopupMenu(false);
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    return;
                }

                // check if mouse event is right click
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20)
                        && (!bins[Y - 1][X - 1].isExist)
                        && SwingUtilities.isRightMouseButton(e)) {
                    deletedX = X;
                    deletedY = Y;
                    MainUI.WarehouseMap.MyMouseAdapter.PopupMenu popupMenu = new MainUI.WarehouseMap.MyMouseAdapter.PopupMenu(true);
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    return;
                }
                
                // check if mouse event is right click for unhighlight bins
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20)
                        && (MainUI.existHighlightBin)
                        && SwingUtilities.isRightMouseButton(e)) {
                    deletedX = X;
                    deletedY = Y;
                    MainUI.WarehouseMap.MyMouseAdapter.PopupMenu popupMenu = new MainUI.WarehouseMap.MyMouseAdapter.PopupMenu(true);
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    return;
                }

                // double click for showing the product info if the cell is
                // already existed
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20)
                        && (bins[Y - 1][X - 1].isExist)
                        && e.getClickCount() == 2) {
                    // show up the product details
                    ProductPopup productPopup = new ProductPopup();
                    productPopup.setVisible(true);
                    return;
                }

                // double click for adding a cell
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20)
                        && e.getClickCount() == 2) {
                    drawOnClickBin(X, Y);
                }
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                draggedX = mouseX / 30;
                draggedY = mouseY / 30;
                if ((draggedX > 0 && draggedY > 0)
                        && (draggedX <= 30 && draggedY <= 20)) {
                    if (bins[draggedY - 1][draggedX - 1].isExist && !onDragged) {
                        preDraggedX = draggedX;
                        preDraggedY = draggedY;
                        bins[draggedY - 1][draggedX - 1].isExist = false;
                        onDragged = true;
                        isDragged = true;
                    }
                    if (bins[draggedY - 1][draggedX - 1].isExist) {
                        isConflict = true;
                    } else {
                        isConflict = false;
                    }
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                int X = mouseX / 30;
                int Y = mouseY / 30;
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20) && isDragged) {
                    if (!bins[Y - 1][X - 1].isExist) {
                        drawOnClickBin(X, Y);
                    } else {
                        drawOnClickBin(preDraggedX, preDraggedY);
                    }
                    isDragged = false;
                    onDragged = false;
                    repaint();
                }
            }

            private class PopupMenu extends JPopupMenu {

                JMenuItem info;
                JMenuItem delete;
                JMenuItem locate;
                JMenuItem unlocated;

                PopupMenu(boolean isEmpty) {
                    info = new JMenuItem("Info");
                    delete = new JMenuItem("Delete");
                    locate = new JMenuItem("Locate Bins");
                    unlocated = new JMenuItem("Cancel Located");

                    info.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            // show up the product details
                            ProductPopup productPopup = new ProductPopup();
                            productPopup.setVisible(true);
                        }
                    });
                    delete.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            deleteCell();
                        }
                    });
                    locate.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            new LocateBinPopup(jPanel3).setVisible(true);
                        }
                    });
                    unlocated.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            unhighlightBin();
                            jPanel3.repaint();
                        }
                    });
                    if (!isEmpty) {
                        add(info);
                        add(delete);
                    }
                    add(locate);
                    if (existHighlightBin) {
                        add(unlocated);
                    }
                }
            }
        }
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton ManageButton;
    private javax.swing.JButton MapButton;
    private javax.swing.JButton ReceiveButton;
    private javax.swing.JButton StockButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private MainUI.WarehouseMap jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton shippingButton;
    private CardLayout cardLayout;
    private static boolean existHighlightBin;
    // End of variables declaration                   
}
