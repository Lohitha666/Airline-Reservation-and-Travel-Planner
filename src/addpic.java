
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gsric
 */
public class addpic extends javax.swing.JFrame {

    /**
     * Creates new form addpic
     */
    String path=null;
    byte[] userimage=null;
    byte[] userimage1=null;
    byte[] userimage2=null;
    byte[] userimage3=null;
    byte[] userimage4=null;
    byte[] userimage5=null;
    byte[] userimage6=null;
    byte[] userimage7=null;
    
     PreparedStatement pst;
    public addpic() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hi2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        hi = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        hii = new javax.swing.JLabel();
        hii3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        hii4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        from1 = new javax.swing.JTextField();
        place = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();

        hi2.setText("jLabel1");

        jButton4.setText("browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        hi.setText("jLabel1");

        jButton1.setText("browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        hii.setText("jLabel1");

        hii3.setText("jLabel1");

        jButton7.setText("browse");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        hii4.setText("jLabel1");

        jButton9.setText("browse");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("browse");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        from1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(hi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(hii, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(59, 59, 59))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(hii3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hii4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(65, 65, 65)
                        .addComponent(jButton7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(from1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hii, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(from1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hii4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hii3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton9))
                        .addContainerGap(145, Short.MAX_VALUE))))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            JFileChooser picchooser = new JFileChooser();
            picchooser.showOpenDialog(null);
            File pic = picchooser.getSelectedFile();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","png","jpg","gif");
            picchooser.addChoosableFileFilter(filter);
            path=pic.getAbsolutePath();
            BufferedImage img;
            img=ImageIO.read(picchooser.getSelectedFile());
            ImageIcon imageIcon = new ImageIcon(new
            ImageIcon(img).getImage().getScaledInstance(111,86,Image.SCALE_DEFAULT));
            hi.setIcon(imageIcon);
            
            File image = new File(path);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            for(int readNum;(readNum=fis.read(buff))!=-1;){
                baos.write(buff,0,readNum);
            }
            userimage=baos.toByteArray();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(addpic.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
             try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/travelcompanion","root","");
                  pst=conn.prepareStatement("insert into loads(img)values(?)");
                 
                  pst.setBytes(3,userimage);

                  pst.executeUpdate();
                  JOptionPane.showMessageDialog(null, "This username is already exist");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(addpic.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(addpic.class.getName()).log(Level.SEVERE, null, ex);
             }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void from1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_from1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try{
            JFileChooser picchooser = new JFileChooser();
            picchooser.showOpenDialog(null);
            File pic = picchooser.getSelectedFile();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","png","jpg");
            picchooser.addChoosableFileFilter(filter);
            path=pic.getAbsolutePath();
            BufferedImage img;
            img=ImageIO.read(picchooser.getSelectedFile());
            ImageIcon imageIcon = new ImageIcon(new
                ImageIcon(img).getImage().getScaledInstance(111,86,Image.SCALE_DEFAULT));
            hii3.setIcon(imageIcon);

            File image = new File(path);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            for(int readNum;(readNum=fis.read(buff))!=-1;){
                baos.write(buff,0,readNum);
            }
            userimage4=baos.toByteArray();

        } catch (IOException ex) {
            Logger.getLogger(addpic.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        try{
            JFileChooser picchooser = new JFileChooser();
            picchooser.showOpenDialog(null);
            File pic = picchooser.getSelectedFile();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","png","jpg");
            picchooser.addChoosableFileFilter(filter);
            path=pic.getAbsolutePath();
            BufferedImage img;
            img=ImageIO.read(picchooser.getSelectedFile());
            ImageIcon imageIcon = new ImageIcon(new
                ImageIcon(img).getImage().getScaledInstance(111,86,Image.SCALE_DEFAULT));
            hii4.setIcon(imageIcon);

            File image = new File(path);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            for(int readNum;(readNum=fis.read(buff))!=-1;){
                baos.write(buff,0,readNum);
            }
            userimage5=baos.toByteArray();

        } catch (IOException ex) {
            Logger.getLogger(addpic.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        try{
            JFileChooser picchooser = new JFileChooser();
            picchooser.showOpenDialog(null);
            File pic = picchooser.getSelectedFile();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","png","jpg");
            picchooser.addChoosableFileFilter(filter);
            path=pic.getAbsolutePath();
            BufferedImage img;
            img=ImageIO.read(picchooser.getSelectedFile());
            ImageIcon imageIcon = new ImageIcon(new
                ImageIcon(img).getImage().getScaledInstance(111,86,Image.SCALE_DEFAULT));
            hii.setIcon(imageIcon);

            File image = new File(path);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            for(int readNum;(readNum=fis.read(buff))!=-1;){
                baos.write(buff,0,readNum);
            }
            userimage1=baos.toByteArray();

        } catch (IOException ex) {
            Logger.getLogger(addpic.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments;
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
            java.util.logging.Logger.getLogger(addpic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addpic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addpic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addpic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addpic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cost;
    private javax.swing.JTextField from1;
    private javax.swing.JLabel hi;
    private javax.swing.JLabel hi2;
    private javax.swing.JLabel hii;
    private javax.swing.JLabel hii3;
    private javax.swing.JLabel hii4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField place;
    // End of variables declaration//GEN-END:variables
}
