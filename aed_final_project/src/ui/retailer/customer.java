/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.retailer;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shubh
 */
public class customer extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
    }
    
     public class Cusdetails{
        public static void createCusdetails(int cusid,String cusname, int cusno, String email){
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
                java.sql.Statement statement = connection.createStatement();
                
                statement.executeUpdate("insert into supply_chain_management.customer" + "(cus_id,cus_name,cus_contact,cus_email)" + "values ('"+cusid+"','"+cusname+"','"+cusno+"','"+email+"')");
                JOptionPane.showMessageDialog(null, "Customer successfully added!");
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,e);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        views5 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cuidTxt = new javax.swing.JTextField();
        cunameTxt = new javax.swing.JTextField();
        cunoTxt = new javax.swing.JTextField();
        cuemailTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        views = new javax.swing.JTable();
        ViewBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        views5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Id", "Customer Name", "Contact No", "Email Id"
            }
        ));
        jScrollPane1.setViewportView(views5);

        jLabel1.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel1.setText("Customer Name:");

        jLabel2.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel2.setText("Customer ID:");

        jLabel3.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel3.setText("Contact No:");

        jLabel4.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel4.setText("Email ID:");

        cuidTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        cunameTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        cunoTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        cuemailTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jButton1.setText("VIew");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cunameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(cunoTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cuemailTxt)
                                    .addComponent(cuidTxt)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cunameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cunoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuemailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customer Details", jPanel2);

        views.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Brand Name", "Product Name", "Price", "Product ID"
            }
        ));
        jScrollPane2.setViewportView(views);

        ViewBtn.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        ViewBtn.setText("View Products");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Products", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
       
          int cusid = Integer.parseInt(cuidTxt.getText());
          String cusname = cunameTxt.getText();
          int cusno = Integer.parseInt(cunoTxt.getText());
        String email = cuemailTxt.getText();
      
        Cusdetails.createCusdetails(cusid,cusname,cusno,email);
        
          cuidTxt.setText("");
          cunameTxt.setText("");
         cunoTxt.setText("");
        cuemailTxt.setText("");
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                
          DefaultTableModel profModel = (DefaultTableModel)views5.getModel();
        profModel.setRowCount(0);
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM supply_chain_management.customer";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);
            
            
            
            while(profData.next()){
                
                
                 int cusid = profData.getInt("cus_id");
                String cusname = profData.getString("cus_name");
                  int cusno = profData.getInt("cus_contact");
                String email = profData.getString("cus_email");
                 
              
               
                
                Object tbData[] = {cusid,cusname,cusno,email};
                
                profModel.addRow(tbData);    
            }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        // TODO add your handling code here:

        DefaultTableModel profModel = (DefaultTableModel)views.getModel();
        profModel.setRowCount(0);

        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM supply_chain_management.stocks";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);

            while(profData.next()){
                String brandname = profData.getString("brand_name");
                String pname = profData.getString("phone_name");
                int quantity = profData.getInt("price");
                int pid = profData.getInt("phone_id");

                Object tbData[] = {brandname,pname,quantity,pid};

                profModel.addRow(tbData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
        }

    }//GEN-LAST:event_ViewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
//            product= Font.createFont(Font.TRUETYPE_FONT, new file("Product_Sans_Regular.ttf"));
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewBtn;
    private javax.swing.JTextField cuemailTxt;
    private javax.swing.JTextField cuidTxt;
    private javax.swing.JTextField cunameTxt;
    private javax.swing.JTextField cunoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable views;
    private javax.swing.JTable views5;
    // End of variables declaration//GEN-END:variables
}
