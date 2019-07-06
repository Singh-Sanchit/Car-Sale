package CarSales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public Registration() {
        initComponents();
        setLocationRelativeTo(null);
        String dbname="carsales";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String sqlServer="jdbc:mysql://localhost:3306/"+dbname;
            conn=DriverManager.getConnection(sqlServer, "root", "040916030411");
            System.out.println("Connected");
        }
        catch(Exception e){
            System.out.println("Connection Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        emailid = new javax.swing.JTextField();
        mobileno = new javax.swing.JTextField();
        proof = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        aadharcard = new javax.swing.JRadioButton();
        pancard = new javax.swing.JRadioButton();
        terms = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setText("<Enter Your Full Name>");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
        });
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 230, 30));

        address.setText("<Enter Your Address>");
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
        });
        address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressMouseClicked(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 230, 30));

        emailid.setText("<Enter Your EmailID>");
        emailid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailidFocusLost(evt);
            }
        });
        emailid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailidMouseClicked(evt);
            }
        });
        getContentPane().add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 230, 30));

        mobileno.setText("Enter Your Mobile NO>");
        mobileno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobilenoFocusGained(evt);
            }
        });
        mobileno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobilenoMouseClicked(evt);
            }
        });
        getContentPane().add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 230, 30));

        proof.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                proofFocusGained(evt);
            }
        });
        getContentPane().add(proof, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 230, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarSales/Assets/Images/PNGPIX-COM-Blue-Jaguar-F-PACE-Side-View-Car-PNG-Image.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 550));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Address -");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 100, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Email ID -");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 110, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Mobile NO -");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 130, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Address Proof -");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 160, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Number -");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 100, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Name -");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 100, 30));

        aadharcard.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        aadharcard.setText("Aadhar Card");
        aadharcard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aadharcardMouseClicked(evt);
            }
        });
        jPanel1.add(aadharcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        pancard.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pancard.setText("PanCard");
        pancard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pancardMouseClicked(evt);
            }
        });
        pancard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pancardActionPerformed(evt);
            }
        });
        jPanel1.add(pancard, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, -1));

        terms.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        terms.setSelected(true);
        terms.setText(" Are You Sure You Want To Proceed And Confirm Your Registration");
        terms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termsActionPerformed(evt);
            }
        });
        jPanel1.add(terms, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 470, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 180, 60));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel2.setText("Registration");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 190, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 230, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 230, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 230, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 230, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 180, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 230, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 554));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void pancardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pancardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pancardActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
                String query = "INSERT INTO Registration(Name,Address,Emailid,MobileNo,AddressProof,Number) VALUES (?,?,?,?,?,?)";
                ps=conn.prepareStatement(query);
                ps.setString(1,name.getText());
                ps.setString(2,address.getText());
                ps.setString(3,emailid.getText());
                ps.setString(4,mobileno.getText());
                if(aadharcard.isSelected())
                    ps.setString(5,"Aadhar Card");
                else
                    ps.setString(5,"Pan Card");
                ps.setString(6,proof.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this,"Register Succesfull... Proceed For Amount Transfer", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                new Selection().setVisible(true);
                this.setVisible(false);
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Enter All Data Correctly", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        name.setText("");
    }//GEN-LAST:event_nameMouseClicked

    private void addressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressMouseClicked
        address.setText("");
    }//GEN-LAST:event_addressMouseClicked

    private void emailidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailidMouseClicked
        emailid.setText("");
    }//GEN-LAST:event_emailidMouseClicked

    private void mobilenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobilenoMouseClicked
        mobileno.setText("");
    }//GEN-LAST:event_mobilenoMouseClicked

    private void emailidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailidFocusLost
        if(!Pattern.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",emailid.getText()))
       {
           JOptionPane.showMessageDialog(null,"Please Enter a Valid Email ID","Error",JOptionPane.ERROR_MESSAGE);
           jButton2.setEnabled(false);
       }
       else
       {
         jButton2.setEnabled(true);      
       }
    }//GEN-LAST:event_emailidFocusLost

    private void termsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termsActionPerformed
        if(!terms.isSelected())
        {
            jButton2.setEnabled(false);
        }
        else
        {
            jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_termsActionPerformed

    private void aadharcardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aadharcardMouseClicked
        if(pancard.isEnabled())
        pancard.setEnabled(false);
    }//GEN-LAST:event_aadharcardMouseClicked

    private void pancardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pancardMouseClicked
        if(aadharcard.isEnabled())
        aadharcard.setEnabled(false);
    }//GEN-LAST:event_pancardMouseClicked

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        name.setText("");
    }//GEN-LAST:event_nameFocusGained

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        address.setText("");
    }//GEN-LAST:event_addressFocusGained

    private void emailidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailidFocusGained
        emailid.setText("");
    }//GEN-LAST:event_emailidFocusGained

    private void mobilenoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobilenoFocusGained
        mobileno.setText("");
    }//GEN-LAST:event_mobilenoFocusGained

    private void proofFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proofFocusGained
        proof.setText("");
    }//GEN-LAST:event_proofFocusGained

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aadharcard;
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailid;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField mobileno;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton pancard;
    private javax.swing.JTextField proof;
    private javax.swing.JCheckBox terms;
    // End of variables declaration//GEN-END:variables
}
