/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.manufacturer;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.manufacturer.Brand;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.event.KeyEvent;
import ui.login.ManufactureLogin;
//import font.Product_Sans_Regular;
/**
 *
 * @author shubh
 */
public class Manufacturer_worker extends javax.swing.JFrame {

    /**
     * Creates new form worker
     */
//    Font product;
    
    public Manufacturer_worker() {
        initComponents();
    }
    
    public class Request{
        public static void  createRequest(String brand_id, String brand_name){
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
                java.sql.Statement statement = connection.createStatement();
                
//                statement.executeUpdate("insert into supply_chain_management.brand" + "(brand_id,brand_name,contact_no)" + "values ('"+brand_id+"','"+brand_name+"', '"+contact_no+"')");
                  statement.executeUpdate("insert into supply_chain_management.brand" + "(brand_id,brand_name)" + "values ('"+brand_id+"','"+brand_name+"')");
                JOptionPane.showMessageDialog(null, "Brand successfully added!");
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,e);
            }
        }
    }
    
    
//       public class Stocks{
//        public static void createStocks(String brandname, int price, String phonename, int phone_id){
//            try{
//                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
//                java.sql.Statement statement = connection.createStatement();
//                
//                statement.executeUpdate("insert into supply_chain_management.stocks" + "(brand_name,phone_name,price,phone_id)" + "values ('"+brandname+"','"+phonename+"', '"+price+"', '"+phone_id+"')");
//                JOptionPane.showMessageDialog(null, "Stocks successfully added!");
//            }catch(Exception e){
//                 JOptionPane.showMessageDialog(null,e);
//            }
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        views = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnameTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logoutBtn1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        views.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel2.setText("Product Name:");

        jLabel4.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel4.setText("Brand Name:");

        jLabel5.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel5.setText("Phone ID");

        pnameTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        priceTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        priceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceTxtKeyPressed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        ViewBtn.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apple", "Samsung", "Oneplus", "Oppo", "Vivo", "Realme" }));

        jLabel6.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel6.setText("Price:");

        idTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        idTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idTxtKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        logoutBtn1.setBackground(new java.awt.Color(255, 128, 101));
        logoutBtn1.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        logoutBtn1.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn1.setText("Logout");
        logoutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(createBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(ViewBtn))
                    .addComponent(priceTxt)
                    .addComponent(pnameTxt)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idTxt))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createBtn)
                            .addComponent(ViewBtn))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jTabbedPane1.addTab("Stocks", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if(pnameTxt.getText().trim().isEmpty() && priceTxt.getText().trim().isEmpty() && idTxt.getText().trim().isEmpty())
            { jLabel1.setText("Empty");
            jLabel3.setText("Empty");
            jLabel7.setText("Empty");
            }

        else if (pnameTxt.getText().trim().isEmpty())
            { jLabel1.setText("Empty");
            }


        else if (priceTxt.getText().trim().isEmpty())
            { jLabel3.setText("Empty");
            }
        else if (idTxt.getText().trim().isEmpty())
            { jLabel7.setText("Empty");
            }
        
        else {

        
         String brandName = (String) jComboBox1.getSelectedItem();
        int price = Integer.parseInt(priceTxt.getText());
        String phoneName = pnameTxt.getText();
        int phone_id = Integer.parseInt(idTxt.getText());
        
//        Stocks.createStocks(brandname, price, phonename, phone_id);
        Brand brand = new Brand(brandName,phoneName,price,phone_id);
            brand.addBrands();
        
        jComboBox1.setSelectedItem("");
        priceTxt.setText("");
        pnameTxt.setText("");
        idTxt.setText("");
        jLabel1.setText("");
        jLabel3.setText("");
        jLabel7.setText("");
        } 
    }//GEN-LAST:event_createBtnActionPerformed

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

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_idTxtActionPerformed

    private void idTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTxtKeyPressed
        // TODO add your handling code here:
         String phoneNumber = idTxt.getText();
        int length = phoneNumber.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<10){
                idTxt.setEditable(true);
            }else
            {
                idTxt.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE ){
                idTxt.setEditable(true);
            }else{
                idTxt.setEditable(false);
            }
        }

    }//GEN-LAST:event_idTxtKeyPressed

    private void priceTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTxtKeyPressed
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(Character.isLetter(c))
            {priceTxt.setEditable(false);
            jLabel3.setText("Enter Valid Digits");}
        else  
            {priceTxt.setEditable(true);}

    }//GEN-LAST:event_priceTxtKeyPressed

    private void logoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        try {
//            product= Font.createFont(Font.TRUETYPE_FONT, new file("Product_Sans_Regular.ttf"));
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manufacturer_worker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField idTxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logoutBtn1;
    private javax.swing.JTextField pnameTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTable views;
    // End of variables declaration//GEN-END:variables
}
