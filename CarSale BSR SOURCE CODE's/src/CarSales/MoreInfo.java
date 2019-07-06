package CarSales;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MoreInfo extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    static String carname,price1;
    
    public MoreInfo(){
    }
    
    public MoreInfo(String s) {
        initComponents();
        setLocationRelativeTo(null);
        carname=s;
        String dbname="carsales";
       try{
            Class.forName("com.mysql.jdbc.Driver");
            String sqlServer="jdbc:mysql://localhost:3306/"+dbname;
            conn=DriverManager.getConnection(sqlServer, "root", "040916030411");
            System.out.println("Connected");
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            String query="select * from cardetails where Name=?";
            ps=conn.prepareStatement(query);
            ps.setString(1,carname);
            rs=ps.executeQuery();
            if(rs.next()){
                name.setText(rs.getString("Name"));
                modelno.setText(rs.getString("ModelNo"));
                l1.setText(rs.getString("F1"));
                l2.setText(rs.getString("F2"));
                l3.setText(rs.getString("F3"));
                l4.setText(rs.getString("F4"));
                l5.setText(rs.getString("F5"));
                l6.setText(rs.getString("F6"));
                l7.setText(rs.getString("F7"));
                l8.setText(rs.getString("F8"));
                l9.setText(rs.getString("F9"));
                l10.setText(rs.getString("F10"));
                price1=rs.getString("Price");
                byte[] img1=rs.getBytes("FrontPic");
                byte[] img2=rs.getBytes("SidePic");
                byte[] img3=rs.getBytes("BackPic");
                ImageIcon image1=new ImageIcon(img1);
                ImageIcon image2=new ImageIcon(img2);
                ImageIcon image3=new ImageIcon(img3);
                Image im1=image1.getImage();
                Image im2=image2.getImage();
                Image im3=image3.getImage();
                Image myImp1=im1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                Image myImp2=im2.getScaledInstance(jLabel2.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                Image myImp3=im3.getScaledInstance(jLabel3.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage1=new ImageIcon(myImp1);
                ImageIcon newImage2=new ImageIcon(myImp2);
                ImageIcon newImage3=new ImageIcon(myImp3);
                jLabel1.setIcon(newImage1);
                jLabel2.setIcon(newImage2);
                jLabel3.setIcon(newImage3);
            }
            price.setText(price1);
         }
        catch(Exception e){
                JOptionPane.showMessageDialog(this, "Data Not Found", "SORRY", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getPrice1() {
        return price1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        modelno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 4, 4, new java.awt.Color(204, 153, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(410, 260));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 260));

        jTabbedPane1.addTab("Front Image", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 260));

        jTabbedPane1.addTab("Side Image", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 260));

        jTabbedPane1.addTab("Back Image", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 320));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Take A Test Drive");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 180, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("BUY NOW !");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 180, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Model No -");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 120, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Car Name -");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 120, 40));

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 150, 30));

        modelno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(modelno, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 180, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("FEATURES -");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 220, 30));

        l4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 204, 0));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 220, 30));

        l5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 204, 0));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 220, 30));

        l6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 204, 0));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 220, 30));

        l3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 204, 0));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 220, 30));

        l7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 204, 0));
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 220, 30));

        l8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 204, 0));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 220, 30));

        l9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 204, 0));
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 220, 30));

        l10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l10.setForeground(new java.awt.Color(255, 204, 0));
        l10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 220, 30));

        l1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(250, 195, 7));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 220, 30));

        l2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 204, 0));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 220, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 150, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 180, 10));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 40, 30));

        price.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        price.setForeground(new java.awt.Color(0, 255, 255));
        price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 200, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Price :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 110, 40));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarSales/Assets/Images/california-road-highway-mountains-63324.jpeg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 554));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 554));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Registration().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TestDrive().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Welcome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoreInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField modelno;
    private javax.swing.JTextField name;
    private javax.swing.JLabel price;
    // End of variables declaration//GEN-END:variables
}
