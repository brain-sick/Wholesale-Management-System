
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Settings extends javax.swing.JFrame {

    Connection conn = null;
    String a;
    String x;
    public Settings() {
        initComponents();
    }
    public Settings(String name,String email){
        initComponents();
        try{
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "localhost";
            String serverPort = "1523";
            String sid = "Oracle";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            conn = DriverManager.getConnection(url,"system","Aayush0631");
            System.out.println("connected");
          
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("could not find databse driver "+e.getMessage());
        } catch(SQLException e){
            System.out.println("connection failed "+e.getMessage());
        }
       
        a = email;
        x = name;
        head.setText(name+"'s");
        
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        
        logout.setOpaque(false);
        logout.setContentAreaFilled(false);
        logout.setBorderPainted(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        head = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contact_num = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JTextArea();
        answer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sec_quest = new javax.swing.JComboBox<>();
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory-management-blog.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 310, 500, 480);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 120, 1920, 20);

        head.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 48)); // NOI18N
        head.setForeground(new java.awt.Color(255, 255, 255));
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setText("jLabel1");
        getContentPane().add(head);
        head.setBounds(150, 20, 1620, 100);

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Wholesale Management System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1550, 130, 350, 50);

        settings.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        settings.setOpaque(false);
        settings.setLayout(null);

        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton9.setText("Forget password");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        settings.add(jButton9);
        jButton9.setBounds(245, 560, 190, 40);

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        settings.add(jButton8);
        jButton8.setBounds(470, 560, 85, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("First name");
        settings.add(jLabel3);
        jLabel3.setBounds(60, 87, 76, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Last name");
        settings.add(jLabel4);
        jLabel4.setBounds(60, 128, 75, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email");
        settings.add(jLabel5);
        jLabel5.setBounds(60, 172, 41, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        settings.add(jLabel6);
        jLabel6.setBounds(60, 213, 70, 22);

        fn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settings.add(fn);
        fn.setBounds(239, 88, 320, 30);

        ln.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settings.add(ln);
        ln.setBounds(239, 129, 320, 30);

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settings.add(email);
        email.setBounds(240, 170, 320, 30);

        pw.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settings.add(pw);
        pw.setBounds(240, 210, 320, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Company's name");
        settings.add(jLabel7);
        jLabel7.setBounds(60, 254, 125, 22);

        c_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settings.add(c_name);
        c_name.setBounds(240, 250, 320, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Contact number");
        settings.add(jLabel8);
        jLabel8.setBounds(60, 295, 116, 22);

        contact_num.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settings.add(contact_num);
        contact_num.setBounds(240, 290, 320, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Contact address");
        settings.add(jLabel9);
        jLabel9.setBounds(60, 336, 115, 22);

        address.setColumns(20);
        address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address.setRows(5);
        settings.add(address);
        address.setBounds(240, 340, 320, 89);

        answer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settings.add(answer);
        answer.setBounds(240, 510, 320, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Security question");
        settings.add(jLabel10);
        jLabel10.setBounds(60, 470, 124, 22);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Answer");
        settings.add(jLabel11);
        jLabel11.setBounds(60, 510, 55, 22);

        sec_quest.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sec_quest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Name of your first pet", "Favourite place", "Favourite food", "Favourite colour" }));
        settings.add(sec_quest);
        sec_quest.setBounds(240, 460, 320, 40);

        getContentPane().add(settings);
        settings.setBounds(650, 190, 660, 670);

        logout.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(1770, 30, 80, 80);

        back.setFont(new java.awt.Font("Georgia", 0, 15)); // NOI18N
        back.setForeground(new java.awt.Color(204, 0, 0));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-go-back-64 (1).png"))); // NOI18N
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(40, 30, 105, 70);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Teal-Blue-Desktop-Backgrounds-HD.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(1, 0, 2170, 1060);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         try{
            Statement stmt=conn.createStatement();
            String n = fn.getText();
            String b = ln.getText();
            String c = email.getText();
            String d = pw.getText();
            String e = c_name.getText();
            int f = Integer.parseInt(contact_num.getText());
            String g = address.getText();
            String h = (String)sec_quest.getSelectedItem();
            String i = answer.getText();
            // stmt.executeQuery("insert into signup values ('dfdsf','fdsf','hgdfgdf','fsdfsd')");
            if(h.equals("Select")||n.equals("")||b.equals("")||c.equals("")||d.equals("")||e.equals("")
                ||g.equals("")||i.equals("")){
                JOptionPane.showMessageDialog(null,"Uh-oh! Something's wrong!");
            }

            else{
                stmt.executeUpdate("update signup set first_name = "+"'"+n+"'"+","+"last_name = "+"'"+b+"'"+","+"email = "+"'"+c+"'"
                +","+"password = "+"'"+d+"'"+","+"Company_name = "+"'"+e+"'"+","+"contact_num = "+f+","+"Address ="+"'"+g+"'"+","+
                        "Security_Question="+"'"+h+"'"+","+"Security_Answer="+"'"+i+"'"+"where email = "+"'"+a+"'");
                stmt.executeQuery("commit");
               
                JOptionPane.showMessageDialog(null,"Details successfully updated!");
                Settings settings = new Settings(e,c);
                settings.setVisible(true);
                this.setVisible(false);
               // conn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from signup where email = "+"'"+a+"'");
            if(rs.next())
            {
               String n=rs.getString("First_name");
                String n1=rs.getString("Last_name");
              //  String n2=rs.getString("Email");
                String n3 = rs.getString("Password");
                String n4 = rs.getString("Company_name");
                int n5 = rs.getInt("Contact_num");
                String n6 = rs.getString("Address");
                String n7 = rs.getString("Security_Question");
                String n8 = rs.getString("Security_Answer");
               fn.setText(n);
               ln.setText(n1);
               email.setText(a);
               pw.setText(n3);
               c_name.setText(n4);
               contact_num.setText(""+n5);
               address.setText(n6);
               sec_quest.setSelectedItem(n7);
               answer.setText(n8);
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
       
            try{
            Statement stmt=conn.createStatement();
            
                stmt.executeQuery("delete from current_user");
                stmt.executeQuery("commit");
                JOptionPane.showMessageDialog(null,"Password removed from login page!");
        }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"Error!");
            }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        First first = new First(x,a);
        first.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField answer;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField contact_num;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel head;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField ln;
    private javax.swing.JButton logout;
    private javax.swing.JPasswordField pw;
    private javax.swing.JComboBox<String> sec_quest;
    private javax.swing.JPanel settings;
    // End of variables declaration//GEN-END:variables
}
