/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author gsric
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class animationPage extends javax.swing.JFrame {
    /**
     * Creates new form animationPage
     */
    public animationPage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    static int count=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        t = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        loadingvalue = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        tap = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(780, 480));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(760, 460));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        t.setFont(new java.awt.Font("Magneto", 3, 36)); // NOI18N
        t.setForeground(new java.awt.Color(255, 204, 0));
        t.setText("TRAVEL ");

        c.setFont(new java.awt.Font("Magneto", 3, 36)); // NOI18N
        c.setForeground(new java.awt.Color(255, 204, 0));
        c.setText("COMPANION");

        loadingvalue.setBackground(new java.awt.Color(255, 204, 0));
        loadingvalue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadingvalue.setForeground(new java.awt.Color(255, 255, 255));
        loadingvalue.setText("0%");

        loading.setBackground(new java.awt.Color(255, 204, 0));
        loading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading...");

        tap.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tap.setForeground(new java.awt.Color(255, 255, 255));

        k.setFont(new java.awt.Font("Algerian", 3, 14)); // NOI18N
        k.setForeground(new java.awt.Color(255, 204, 0));
        k.setText("Feel the best fly...");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gsric\\Downloads\\output-onlinegiftools (3).gif")); // NOI18N

        progress.setForeground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(loading)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loadingvalue)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 221, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(214, 214, 214))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(k)
                                    .addGap(118, 118, 118))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(263, 263, 263)))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tap, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c)
                .addGap(18, 18, 18)
                .addComponent(k)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(tap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(loadingvalue)
                        .addGap(7, 7, 7)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loading))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        if(count==1){
        login rgf = new login();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setBounds(500,800,800,500);
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    public static void main(String args[]) {
        animationPage ani = new animationPage(); 
        ani.setVisible(true); 
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(50);
                ani.loadingvalue.setText(i+"%");
                if(i==0){
                    ani.t.setText("");
                  ani.c.setText("");
                   ani.k.setText("");
                }
                if(i==10){
                  ani.loading.setText("Turning on Modules...");       
                }
                if(i==1){
                     ani.t.setText("T");
                }              
                if(i==3){
                ani.t.setText("TR");   
                }
                if(i==6){
                     ani.t.setText("TRA");  
                }
                 if(i==9){
                    ani.t.setText("TRAV");                 
                }
                  if(i==11){
                    ani.t.setText("TRAVE");                
                }
                 if(i==14){
                    ani.t.setText("TRAVEL");  
                }if(i==17){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("C");
                }   if(i==20){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("CO");
                }  if(i==23){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("COM");
                }   if(i==26){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("COMP");
                }    if(i==29){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("COMPA");
                }    if(i==32){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("COMPAN");
                }    if(i==35){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("COMPANI");
                }   if(i==38){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("COMPANIO");
                }   if(i==41){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("COMPANION");
                }   if(i==44){
                    ani.t.setText("TRAVEL");
                  ani.c.setText("COMPANION");
                }                                                  
                if(i==30){
                  ani.loading.setText("Loading Modules...");             
                }               
                if(i==50){
                  ani.loading.setText("Connecting to Database...");               
                }             
                if(i==50){
                    ani.k.setText("F");
                }
                if(i==51){
                    ani.k.setText("FE");
                }
                if(i==52){
                    ani.k.setText("FEE");
                }
                if(i==53){
                    ani.k.setText("FEEL");
                }
                if(i==54){
                    ani.k.setText("FEEL T");
                }
                if(i==55){
                    ani.k.setText("FEEL TH");
                }
                if(i==56){
                    ani.k.setText("FEEL THE");
                }
                if(i==57){
                    ani.k.setText("FEEL THE B");
                }
                if(i==58){
                    ani.k.setText("FEEL THE BE");
                }
                if(i==59){
                    ani.k.setText("FEEL THE BES");
                }
                if(i==60){
                    ani.k.setText("FEEL THE BEST");
                }
                if(i==61){
                    ani.k.setText("FEEL THE BEST F");
                }
                if(i==62){
                    ani.k.setText("FEEL THE BEST FL");
                }
                if(i==63){
                    ani.k.setText("FEEL THE BEST FLY");
                }
                if(i==64){
                    ani.k.setText("FEEL THE BEST FLY.");
                }
                if(i==65){
                    ani.k.setText("FEEL THE BEST FLY..");
                }
                if(i==66){
                    ani.k.setText("FEEL THE BEST FLY...");
                }
                if(i==70){
                  ani.loading.setText("Connection Successful...");            
                }
                if(i==80){               
                }
                if(i==90){
                  ani.loading.setText("Launching Application");
                }
                if(i==100){
                    count=1;
                    ani.loading.setText("");
                    ani.loadingvalue.setText("");
                    ani.progress.setVisible(false);
                    for(int j=0;j<10000000;j++){                        
                    ani.tap.setText("TAP ANY WHERE TO START");
                    Thread.sleep(800);
                    ani.tap.setText("");
                    Thread.sleep(400);
                    }
                } 
                ani.progress.setValue(i);
            }           
        }
        catch(Exception e){           
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel k;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel loadingvalue;
    private javax.swing.JProgressBar progress;
    private javax.swing.JLabel t;
    private javax.swing.JLabel tap;
    // End of variables declaration//GEN-END:variables
}
