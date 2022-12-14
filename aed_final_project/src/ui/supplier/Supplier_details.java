/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.supplier;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shubh
 */
public class Supplier_details extends javax.swing.JFrame {

    /**
     * Creates new form Supplier_details
     */
    public Supplier_details() {
        initComponents();
    }
    
    public class Sdetails{
        public static void createSdetails(int compid,String compname, int phoneno, String email){
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
                java.sql.Statement statement = connection.createStatement();
                
                statement.executeUpdate("insert into supply_chain_management.supplier_details" + "(company_id,company_name,phone_no,email_id)" + "values ('"+compid+"','"+compname+"', '"+phoneno+"', '"+email+"')");
                JOptionPane.showMessageDialog(null, "Details successfully added!");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        views = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cnameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cidTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        logoutBtn4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Details");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 49);

        views.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        views.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company ID", "Company Name", "Phone No", "Email ID"
            }
        ));
        jScrollPane1.setViewportView(views);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(6, 55, 788, 116);

        jLabel2.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel2.setText("Phone No:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 300, 145, 33);

        jLabel3.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel3.setText("Company Name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 250, 145, 33);

        jLabel4.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel4.setText("Email Id:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 350, 145, 33);

        cnameTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jPanel2.add(cnameTxt);
        cnameTxt.setBounds(340, 250, 167, 21);

        phoneTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        phoneTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneTxtKeyPressed(evt);
            }
        });
        jPanel2.add(phoneTxt);
        phoneTxt.setBounds(340, 310, 167, 21);

        emailTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        jPanel2.add(emailTxt);
        emailTxt.setBounds(340, 360, 167, 21);

        createBtn.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        createBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                createBtnKeyPressed(evt);
            }
        });
        jPanel2.add(createBtn);
        createBtn.setBounds(340, 410, 72, 22);

        viewBtn.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewBtn);
        viewBtn.setBounds(440, 410, 72, 22);

        jLabel5.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel5.setText("Company ID:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 200, 145, 33);

        cidTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        cidTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cidTxtKeyPressed(evt);
            }
        });
        jPanel2.add(cidTxt);
        cidTxt.setBounds(340, 200, 167, 21);

        jLabel6.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(540, 200, 108, 33);

        jLabel7.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(540, 250, 100, 33);

        jLabel8.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(540, 300, 100, 33);

        jButton1.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jButton1.setText("Verify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(630, 360, 95, 22);

        jLabel9.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(530, 360, 74, 17);

        logoutBtn4.setBackground(new java.awt.Color(255, 128, 101));
        logoutBtn4.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        logoutBtn4.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn4.setText("Logout");
        logoutBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(logoutBtn4);
        logoutBtn4.setBounds(670, 400, 80, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if(cidTxt.getText().trim().isEmpty() && cnameTxt.getText().trim().isEmpty() && phoneTxt.getText().trim().isEmpty() && emailTxt.getText().trim().isEmpty())
            { jLabel6.setText("Empty");
              jLabel7.setText("Empty");
              jLabel8.setText("Empty");
              jLabel9.setText("Empty");
            
            }

        else if (cidTxt.getText().trim().isEmpty())
            { jLabel6.setText("Empty");
            }


        else if (cnameTxt.getText().trim().isEmpty())
            { jLabel7.setText("Empty");
            }
        
        else if (phoneTxt.getText().trim().isEmpty())
            { jLabel8.setText("Empty");
            }
        else if (emailTxt.getText().trim().isEmpty())
            { jLabel9.setText("Empty");
            }
        else{
        
       
       
         int compid = Integer.parseInt(cidTxt.getText());
        String compname = cnameTxt.getText();
        int phoneno = Integer.parseInt(phoneTxt.getText());
        String email = emailTxt.getText();
      
        Sdetails.createSdetails(compid,compname, phoneno, email);
        
         cidTxt.setText("");
        cnameTxt.setText("");
        phoneTxt.setText("");
        emailTxt.setText("");
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        
        
         DefaultTableModel profModel = (DefaultTableModel)views.getModel();
        profModel.setRowCount(0);
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM supply_chain_management.supplier_details";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);
            
            
            
            while(profData.next()){
                int compid = profData.getInt("company_id");
                String compname = profData.getString("company_name");
                int phone = profData.getInt("phone_no");
                String email = profData.getString("email_id");
               
                
                Object tbData[] = {compid,compname,phone,email};
                
                profModel.addRow(tbData);    
            }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
         }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void cidTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidTxtKeyPressed
        // TODO add your handling code here:
        String phoneNumber = cidTxt.getText();
        int length = phoneNumber.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<5){
                cidTxt.setEditable(true);
            }else
            {
                cidTxt.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE ){
                cidTxt.setEditable(true);
            }else{
                cidTxt.setEditable(false);
            }
        }

    }//GEN-LAST:event_cidTxtKeyPressed

    private void phoneTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTxtKeyPressed
        // TODO add your handling code here:
        String phoneNumber = phoneTxt.getText();
        int length = phoneNumber.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<10){
                phoneTxt.setEditable(true);
            }else
            {
                phoneTxt.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE ){
                phoneTxt.setEditable(true);
            }else{
                phoneTxt.setEditable(false);
            }
        }

    }//GEN-LAST:event_phoneTxtKeyPressed

    private void createBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_createBtnKeyPressed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_createBtnKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailTxt.getText()))) 
{
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "The email is valid", "Good!", JOptionPane.INFORMATION_MESSAGE);

            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void logoutBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtn4ActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Supplier_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cidTxt;
    private javax.swing.JTextField cnameTxt;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn4;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton viewBtn;
    private javax.swing.JTable views;
    // End of variables declaration//GEN-END:variables
}
