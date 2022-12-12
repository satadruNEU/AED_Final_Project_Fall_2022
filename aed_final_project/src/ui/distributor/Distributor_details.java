/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.distributor;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import ui.onboarding.EnterEnterprise;

/**
 *
 * @author shubh
 */
public class Distributor_details extends javax.swing.JFrame {

    /**
     * Creates new form Distributor_city
     */
    public Distributor_details() {
        initComponents();
    }
    
    public class Cdetails{
        public static void createCdetails(String dname,int contact,int cityId, String cityName, String cityState){
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
                java.sql.Statement statement = connection.createStatement();
                
                statement.executeUpdate("insert into supply_chain_management.city_details" + "(dist_name,dist_contact,city_id,city_name,state)" + "values ('"+dname+"','"+contact+"','"+cityId+"','"+cityName+"', '"+cityState+"')");
                JOptionPane.showMessageDialog(null, "City successfully added!");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        views = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cityidTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        citynameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stateTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contactTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dnameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        logoutBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        views.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        views.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Distributor Name", "Distributor Contact No", "City ID", "City Name", "State"
            }
        ));
        views.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(views);

        jLabel4.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel4.setText("City ID:");

        cityidTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        cityidTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cityidTxtKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel2.setText("City Name:");

        citynameTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        citynameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citynameTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel6.setText("State:");

        stateTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        createBtn.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Product Sans", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Distributor Details");

        jLabel5.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel5.setText("Contact No:");

        contactTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel7.setText("Distributor Name:");

        dnameTxt.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        logoutBtn2.setBackground(new java.awt.Color(255, 128, 101));
        logoutBtn2.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        logoutBtn2.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn2.setText("Logout");
        logoutBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(576, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(createBtn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(viewBtn))
                                        .addComponent(citynameTxt)
                                        .addComponent(stateTxt)
                                        .addComponent(cityidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(73, 73, 73))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cityidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(citynameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createBtn)
                            .addComponent(viewBtn))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void citynameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citynameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citynameTxtActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if(dnameTxt.getText().trim().isEmpty() && contactTxt.getText().trim().isEmpty()&& cityidTxt.getText().trim().isEmpty() && citynameTxt.getText().trim().isEmpty() && stateTxt.getText().trim().isEmpty()  )
            { jLabel8.setText("Empty");
              jLabel10.setText("Empty");
              jLabel11.setText("Empty");
              jLabel9.setText("Empty");
              jLabel12.setText("Empty");
            }

        else if (dnameTxt.getText().trim().isEmpty())
            { jLabel8.setText("Empty");
            }


        else if (contactTxt.getText().trim().isEmpty())
            { jLabel10.setText("Empty");
            }
        
        else if (cityidTxt.getText().trim().isEmpty())
            { jLabel11.setText("Empty");
            }
        
         else if (citynameTxt.getText().trim().isEmpty())
            { jLabel9.setText("Empty");
            }
         
         else if (stateTxt.getText().trim().isEmpty())
            { jLabel12.setText("Empty");
            }
         
        else{

        
        
         String dname = dnameTxt.getText();
         int contact = Integer.parseInt(contactTxt.getText());
         int cityId = Integer.parseInt(cityidTxt.getText());
        String cityName = citynameTxt.getText();
        String cityState = stateTxt.getText();
      
        Cdetails.createCdetails(dname,contact,cityId,cityName, cityState);
        
          dnameTxt.setText("");
          contactTxt.setText("");
         cityidTxt.setText("");
        citynameTxt.setText("");
        stateTxt.setText("");
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        
          DefaultTableModel profModel = (DefaultTableModel)views.getModel();
        profModel.setRowCount(0);
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM supply_chain_management.city_details";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);
            
            
            
            while(profData.next()){
                
                 String dname = profData.getString("dist_name");
                 int contact = profData.getInt("dist_contact");
                int cityid = profData.getInt("city_id");
                String cityname = profData.getString("city_name");
                String state = profData.getString("state");
              
               
                
                Object tbData[] = {dname,contact,cityid,cityname,state};
                
                profModel.addRow(tbData);    
            }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
         }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void viewsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewsMouseClicked

    private void cityidTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityidTxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c))
            {cityidTxt.setEditable(false);
            jLabel3.setText("Enter Valid Digits");}
        else  {cityidTxt.setEditable(true);}

    }//GEN-LAST:event_cityidTxtKeyPressed

    private void logoutBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn2ActionPerformed
        // TODO add your handling code here:
        EnterEnterprise user = new EnterEnterprise();
        setVisible(false);
        user.setVisible(true);
    }//GEN-LAST:event_logoutBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(Distributor_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Distributor_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Distributor_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Distributor_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Distributor_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityidTxt;
    private javax.swing.JTextField citynameTxt;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField dnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn2;
    private javax.swing.JTextField stateTxt;
    private javax.swing.JButton viewBtn;
    private javax.swing.JTable views;
    // End of variables declaration//GEN-END:variables
}
