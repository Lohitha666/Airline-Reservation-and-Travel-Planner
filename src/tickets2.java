import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gsric
 */
public class tickets2 extends javax.swing.JFrame {

    /**
     * Creates new form tickets2
     */
    
    public tickets2() {
        initComponents();
        autoId();
        ticketId();
        
    }
    Connection conn;
    PreparedStatement pst;
     static String gender ="";
     static String name="";
     static String age="";
     static String passport="";
     static String contact="";
     static String ticketid="";
     static int i=0;
     static int c=1;
     static String id="";
     static String id1="";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupgender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtpassenger = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtpassport = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtticketid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setText("Book Ticket");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel8)
                .addContainerGap(496, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(242, 38, 19));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtpassenger.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpassenger.setForeground(new java.awt.Color(255, 255, 255));
        txtpassenger.setText("Passenger :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");

        txtname.setBackground(new java.awt.Color(204, 204, 204));
        txtname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnameMouseClicked(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age:");

        txtage.setBackground(new java.awt.Color(204, 204, 204));
        txtage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtageMouseClicked(evt);
            }
        });
        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact:");

        txtcontact.setBackground(new java.awt.Color(204, 204, 204));
        txtcontact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcontactMouseClicked(evt);
            }
        });
        txtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactActionPerformed(evt);
            }
        });

        r1.setBackground(new java.awt.Color(0, 51, 51));
        groupgender.add(r1);
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("Male");

        r2.setBackground(new java.awt.Color(0, 51, 51));
        groupgender.add(r2);
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Female");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Passport No:");

        txtpassport.setBackground(new java.awt.Color(204, 204, 204));
        txtpassport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassportMouseClicked(evt);
            }
        });
        txtpassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassportActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ticket Id:");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtticketid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtticketid, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtpassenger)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(138, 138, 138))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtname)
                            .addComponent(txtage)
                            .addComponent(txtcontact)
                            .addComponent(txtpassport)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))
                        .addGap(295, 295, 295))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtpassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(r1)
                            .addComponent(r2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtpassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addGap(60, 60, 60))
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
        public void autoId(){   
            txtpassenger.setText("Passenger"+" "+c);
            c++;
        }
        public void ticketId(){
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/travelcompanion","root","");
            Statement st=conn.createStatement();
            ResultSet rs= st.executeQuery("select MAX(ticketid) from transactions");
            rs.next();
            String coustomerid =rs.getString("MAX(ticketid)");
            if( coustomerid == null){
                
                txtticketid.setText("77AT001");
                
            }
            else{
                long id= Long.parseLong(rs.getString("MAX(ticketid)").substring(4,rs.getString("MAX(ticketid)").length()));
                id++;
                
                txtticketid.setText("77AT"+String.format("%03d",id));
               
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             int q=0;
                if(q==0){
                JOptionPane.showMessageDialog(null, "Enter Valid Details");
                q=1;
                }
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int seats = tickets1.seats;   
        if(i<(seats-1)){
            i++;
        name =txtname.getText();
        age =txtage.getText();  
        if(r1.isSelected()){ 
            gender="Male";
        }
        if(r2.isSelected()){
            gender="Female";           
        }
        contact =txtcontact.getText();
        passport =txtpassport.getText();
        ticketid= txtticketid.getText();
        String flightname=tickets.flightname;
        String flightnumber=tickets.flightnumber;
        String source = tickets.source;
        String departure = tickets.departure;
        String takeoff = tickets.takeoff;
        String landing = tickets.landing;
        String journey = tickets.journey;
        String cost = tickets.cost;
        String date=tickets1.date;
        String lass=tickets1.Class;
        id1 = RegistrationForm.custid;
        if(id1==null){
             id=login.custid;
             int count=0;
             while(count==0){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/travelcompanion","root","");
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Name");
                count=1;
            }
            else if(age.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Age");
                count=1;
            }
            else if(gender.isEmpty()){
                JOptionPane.showMessageDialog(null, "Choose gender");
                count=1;
            }
            else if(contact.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Contact");
                count=1;
            }
            else if( passport.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Passport Number");
                count=1;
            }
            
            while(count==0){
            pst=conn.prepareStatement("insert into transactions(ticketid,flightname,flightnumber,source,departure,takeoff,landing,journey,cost,name,age,gender,contact,passport,id,date,class)value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,ticketid);
            pst.setString(2,flightname);
            pst.setString(3,flightnumber);
            pst.setString(4,source);
            pst.setString(5,departure);
            pst.setString(6,takeoff);
            pst.setString(7,landing);
            pst.setString(8,journey);
            pst.setString(9,cost);
            pst.setString(10,name);
            pst.setString(11,age);
            pst.setString(12,gender);
            pst.setString(13,contact);
            pst.setString(14,passport);
            pst.setString(15,id);
            pst.setString(16, date);
            pst.setString(17, lass);
            pst.executeUpdate();
            pst=conn.prepareStatement("insert into sampleticket(ticketid)value(?)");
            pst.setString(1,ticketid);
            pst.executeUpdate();
            conn.close();
            count=1;
            tickets2 tkt3 = new tickets2();
            tkt3.setVisible(true);
            tkt3.pack();
            tkt3.setLocationRelativeTo(null);
            tkt3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose(); 
            
            }           
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }}
        else{
            int count=0;
            while(count==0){
            try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/travelcompanion","root","");
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Name");
                count=1;
            }
            else if(age.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Age");
                count=1;
            }
            else if(gender.isEmpty()){
                JOptionPane.showMessageDialog(null, "Choose gender");
                count=1;
            }
            else if(contact.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Contact");
                count=1;
            }
            else if( passport.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Passport Number");
                count=1;
            }
            
            while(count==0){
            pst=conn.prepareStatement("insert into transactions(ticketid,flightname,flightnumber,source,departure,takeoff,landing,journey,cost,name,age,gender,contact,passport,id,date,class)value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,ticketid);
            pst.setString(2,flightname);
            pst.setString(3,flightnumber);
            pst.setString(4,source);
            pst.setString(5,departure);
            pst.setString(6,takeoff);
            pst.setString(7,landing);
            pst.setString(8,journey);
            pst.setString(9,cost);
            pst.setString(10,name);
            pst.setString(11,age);
            pst.setString(12,gender);
            pst.setString(13,contact);
            pst.setString(14,passport);
            pst.setString(15,id1);
            pst.setString(16, date);
            pst.setString(17, lass);
            pst.executeUpdate();
            pst=conn.prepareStatement("insert into sampleticket(ticketid)value(?)");
            pst.setString(1,ticketid);
            pst.executeUpdate();
            conn.close();
            count=1;
            tickets2 tkt3 = new tickets2();
            tkt3.setVisible(true);
            tkt3.pack();
            tkt3.setLocationRelativeTo(null);
            tkt3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose(); 
            
            }           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }}
       else{  
        i++;
        name =txtname.getText();
        age =txtage.getText();  
        if(r1.isSelected()){ 
            gender="Male";
        }
        if(r2.isSelected()){
            gender="Female";           
        }
        contact =txtcontact.getText();
        passport =txtpassport.getText();
        ticketid= txtticketid.getText();
        String flightname=tickets.flightname;
        String flightnumber=tickets.flightnumber;
        String source = tickets.source;
        String departure = tickets.departure;
        String takeoff = tickets.takeoff;
        String landing = tickets.landing;
        String journey = tickets.journey;
        String cost = tickets.cost;
        String date=tickets1.date;
        String lass=tickets1.Class;
        id1 = RegistrationForm.custid;
        
        if(id1==null){
             id=login.custid;
             int count=0;
             while(count==0){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/travelcompanion","root","");
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Name");
                count=1;
            }
            else if(age.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Age");
                count=1;
            }
            else if(gender.isEmpty()){
                JOptionPane.showMessageDialog(null, "Choose gender");
                count=1;
            }
            else if(contact.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Contact");
                count=1;
            }
            else if( passport.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Passport Number");
                count=1;
            }
            
            while(count==0){
            pst=conn.prepareStatement("insert into transactions(ticketid,flightname,flightnumber,source,departure,takeoff,landing,journey,cost,name,age,gender,contact,passport,id,date,class)value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  
            pst.setString(1,ticketid);
            pst.setString(2,flightname);
            pst.setString(3,flightnumber);
            pst.setString(4,source);
            pst.setString(5,departure);
            pst.setString(6,takeoff);
            pst.setString(7,landing);
            pst.setString(8,journey);
            pst.setString(9,cost);
            pst.setString(10,name);
            pst.setString(11,age);
            pst.setString(12,gender);
            pst.setString(13,contact);
            pst.setString(14,passport);
            pst.setString(15,id);
            pst.setString(16, date);
            pst.setString(17, lass);
            pst.executeUpdate();
            pst=conn.prepareStatement("insert into sampleticket(ticketid)value(?)");
            pst.setString(1,ticketid);
            pst.executeUpdate();
            conn.close();
            count=1; 

            tickets3 tct = new tickets3();
            tct.setVisible(true);
            tct.pack();
            tct.setLocationRelativeTo(null);
            tct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            }           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }  }                                                           
        else{
            int count=0;
            while(count==0){
            try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/travelcompanion","root","");
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Name");
                count=1;
            }
            else if(age.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Age");
                count=1;
            }
            else if(gender.isEmpty()){
                JOptionPane.showMessageDialog(null, "Choose gender");
                count=1;
            }
            else if(contact.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Contact");
                count=1;
            }
            else if( passport.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Passport Number");
                count=1;
            }
            
            while(count==0){
            pst=conn.prepareStatement("insert into transactions(ticketid,flightname,flightnumber,source,departure,takeoff,landing,journey,cost,name,age,gender,contact,passport,id,date,class)value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,ticketid);
            pst.setString(2,flightname);
            pst.setString(3,flightnumber);
            pst.setString(4,source);
            pst.setString(5,departure);
            pst.setString(6,takeoff);
            pst.setString(7,landing);
            pst.setString(8,journey);
            pst.setString(9,cost);
            pst.setString(10,name);
            pst.setString(11,age);
            pst.setString(12,gender);
            pst.setString(13,contact);
            pst.setString(14,passport);
            pst.setString(15,id1);
            pst.setString(16, date);
            pst.setString(17, lass);
            pst.executeUpdate();
            pst=conn.prepareStatement("insert into sampleticket(ticketid)value(?)");
            pst.setString(1,ticketid);
            pst.executeUpdate();
            conn.close();
            count=1; 
            
            tickets3 tct = new tickets3();
            tct.setVisible(true);
            tct.pack();
            tct.setLocationRelativeTo(null);
            tct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            }           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }          
       }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/travelcompanion","root","");
            Statement st=conn.createStatement();
            ResultSet rs= st.executeQuery("select * from sampleticket");
            while(rs.next()){
               String un=rs.getString("ticketid");
               pst=conn.prepareStatement("DELETE from transactions where ticketid=?");
               pst.setString(1,un);
               pst.executeUpdate();    
            }         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tickets2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tickets2.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/travelcompanion","root","");
            Statement st=conn.createStatement();
            ResultSet rs= st.executeQuery("select * from sampleticket");
            while(rs.next()){
               String un=rs.getString("ticketid");
               pst=conn.prepareStatement("DELETE from sampleticket where ticketid=?");
               pst.setString(1,un);
               pst.executeUpdate();    
            }         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tickets2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             int q=0;
                if(q==0){
                JOptionPane.showMessageDialog(null, "Enter Valid Details");
                q=1;
                }
            Logger.getLogger(tickets2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        tickets1 tkt = new tickets1();
        tkt.setVisible(true);
        tkt.pack();
        tkt.setLocationRelativeTo(null);
        tkt.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
        c=1;
        i=0;
        // TODO adSd your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameMouseClicked

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageMouseClicked

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtcontactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactMouseClicked

    private void txtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactActionPerformed

    private void txtpassportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassportMouseClicked

    private void txtpassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassportActionPerformed

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
            java.util.logging.Logger.getLogger(tickets2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tickets2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tickets2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tickets2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tickets2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup groupgender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtname;
    private javax.swing.JLabel txtpassenger;
    private javax.swing.JTextField txtpassport;
    private javax.swing.JLabel txtticketid;
    // End of variables declaration//GEN-END:variables
}
