
import java.awt.Color;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
public class Home extends javax.swing.JFrame {
    
 Connection conn = null;
        
    public Home() {
        initComponents();
       try{
           forgot_pw.setVisible(false);
            forgot_new_pw.setEnabled(false);
            forgot_confirm_pw.setEnabled(false);
            fn_c.setVisible(false);
            fn_w.setVisible(false);
            ln_c.setVisible(false);
            ln_w.setVisible(false);
            email_c.setVisible(false);
            email_w.setVisible(false);
            pw_c.setVisible(false);
            pw_w.setVisible(false);
            c_name_c.setVisible(false);
            c_name_w.setVisible(false);
            contact_num_c.setVisible(false);
            contact_num_w.setVisible(false);
            address_c.setVisible(false);
            address_w.setVisible(false);
            answer_c.setVisible(false);
            answer_w.setVisible(false);
            forgot_new_pw_w.setVisible(false);
            forgot_new_pw_c.setVisible(false);
            forgot_confirm_pw_w.setVisible(false);
            forgot_confirm_pw_c.setVisible(false);
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
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        forgot_pw = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        forgot_sec_quest = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        forgot_answer = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        forgot_new_pw = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        forgot_confirm_pw = new javax.swing.JPasswordField();
        update = new javax.swing.JButton();
        forgot_new_pw_w = new javax.swing.JLabel();
        forgot_confirm_pw_c = new javax.swing.JLabel();
        forgot_new_pw_c = new javax.swing.JLabel();
        forgot_confirm_pw_w = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        login_email = new javax.swing.JTextField();
        login_pw = new javax.swing.JPasswordField();
        forgot = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        remember_pw = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contact_num = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextArea();
        address_c = new javax.swing.JLabel();
        address_w = new javax.swing.JLabel();
        ln_c = new javax.swing.JLabel();
        email_c = new javax.swing.JLabel();
        pw_c = new javax.swing.JLabel();
        c_name_c = new javax.swing.JLabel();
        contact_num_c = new javax.swing.JLabel();
        fn_c = new javax.swing.JLabel();
        fn_w = new javax.swing.JLabel();
        ln_w = new javax.swing.JLabel();
        email_w = new javax.swing.JLabel();
        pw_w = new javax.swing.JLabel();
        c_name_w = new javax.swing.JLabel();
        contact_num_w = new javax.swing.JLabel();
        answer_w = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        answer_c = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sec_quest = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory-img.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(660, 240, 470, 510);

        forgot_pw.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Forgot password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        forgot_pw.setOpaque(false);
        forgot_pw.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Security question");
        forgot_pw.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 73, -1, -1));

        forgot_sec_quest.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        forgot_sec_quest.setForeground(new java.awt.Color(255, 255, 255));
        forgot_sec_quest.setText("jLabel13");
        forgot_pw.add(forgot_sec_quest, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 64, 241, 41));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Answer");
        forgot_pw.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 118, -1, -1));

        forgot_answer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        forgot_answer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                forgot_answerFocusLost(evt);
            }
        });
        forgot_pw.add(forgot_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 118, 241, 33));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("New password");
        forgot_pw.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 158, -1, -1));

        forgot_new_pw.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        forgot_new_pw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                forgot_new_pwFocusLost(evt);
            }
        });
        forgot_pw.add(forgot_new_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 158, 241, 33));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Confirm password");
        forgot_pw.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 203, -1, -1));

        forgot_confirm_pw.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        forgot_confirm_pw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                forgot_confirm_pwFocusLost(evt);
            }
        });
        forgot_pw.add(forgot_confirm_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 199, 243, 33));

        update.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        forgot_pw.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 262, 98, 41));

        forgot_new_pw_w.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgot_new_pw_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        forgot_pw.add(forgot_new_pw_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        forgot_confirm_pw_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        forgot_pw.add(forgot_confirm_pw_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 30, 30));

        forgot_new_pw_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        forgot_pw.add(forgot_new_pw_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 30, 30));

        forgot_confirm_pw_w.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgot_confirm_pw_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        forgot_pw.add(forgot_confirm_pw_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        getContentPane().add(forgot_pw);
        forgot_pw.setBounds(60, 500, 490, 360);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");

        login_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        login_pw.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        forgot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        forgot.setForeground(new java.awt.Color(255, 0, 51));
        forgot.setText("Forgot password?");
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotMouseExited(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        remember_pw.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        remember_pw.setForeground(new java.awt.Color(255, 255, 255));
        remember_pw.setText("Remember password");
        remember_pw.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(login_email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(login_pw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(remember_pw)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(login_pw, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(forgot)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remember_pw)))
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 150, 490, 250);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Signup", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Sign up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, -1, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 87, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 128, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 172, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 213, -1, -1));

        fn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnFocusLost(evt);
            }
        });
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 88, 320, 30));

        ln.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ln.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnFocusLost(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 129, 320, 30));

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 320, 30));

        pw.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwFocusLost(evt);
            }
        });
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 320, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Company's name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 254, -1, -1));

        c_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        c_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                c_nameFocusLost(evt);
            }
        });
        jPanel1.add(c_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 320, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contact number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 295, -1, -1));

        contact_num.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contact_num.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contact_numFocusLost(evt);
            }
        });
        jPanel1.add(contact_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 320, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Contact address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 336, -1, -1));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address.setRows(5);
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 320, -1));

        address_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        jPanel1.add(address_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 30, 30));

        address_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        jPanel1.add(address_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 30, 30));

        ln_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        jPanel1.add(ln_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 30, 30));

        email_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        jPanel1.add(email_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 30, 30));

        pw_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        jPanel1.add(pw_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 30, 30));

        c_name_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        jPanel1.add(c_name_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 30, 30));

        contact_num_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        jPanel1.add(contact_num_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 30, 30));

        fn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        jPanel1.add(fn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 30, 30));

        fn_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        jPanel1.add(fn_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 30, 30));

        ln_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        jPanel1.add(ln_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 30, 30));

        email_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        jPanel1.add(email_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 30, 30));

        pw_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        jPanel1.add(pw_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 30, 30));

        c_name_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        jPanel1.add(c_name_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 30, 30));

        contact_num_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        jPanel1.add(contact_num_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 30, 30));

        answer_w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrong.png"))); // NOI18N
        jPanel1.add(answer_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 30, 30));

        answer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        answer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                answerFocusLost(evt);
            }
        });
        jPanel1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 320, 30));

        answer_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correct.png"))); // NOI18N
        jPanel1.add(answer_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 30, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Security question");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Answer");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        sec_quest.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sec_quest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Name of your first pet", "Favourite place", "Favourite food", "Favourite colour" }));
        jPanel1.add(sec_quest, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 320, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1250, 190, 640, 700);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Teal-Blue-Desktop-Backgrounds-HD.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 2171, 1060);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            Statement stmt=conn.createStatement();
            String a = fn.getText();
            String b = ln.getText();
            String c = email.getText();
            String d = pw.getText();
            String e = c_name.getText();
            int f = Integer.parseInt(contact_num.getText());
            String g = address.getText();
            String h = (String)sec_quest.getSelectedItem();
            String i = answer.getText();
          
            if(email_w.isVisible()||h.equals("Select")||a.equals("")||b.equals("")||c.equals("")||d.equals("")||e.equals("")
                    ||contact_num_w.isVisible()||g.equals("")||i.equals("")){
               JOptionPane.showMessageDialog(null,"Uh-oh! Something's wrong!"); 
            }
          
            else{
                stmt.executeQuery("insert into signup values("+"'"+a+"'"+","+"'"+b+"'"+","+"'"+c+"'"+","+"'"+d+"'"+","+"'"+e+"'"+","+
                        f+","+"'"+g+"'"+","+"'"+h+"'"+","+"'"+i+"'"+")");
          
                JOptionPane.showMessageDialog(null,"Account successfully created!");
                Home home = new Home();
                home.setVisible(true);
                this.setVisible(false);
             
                conn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnFocusLost
        // TODO add your handling code here:
        if(fn.getText().equals("")){
            fn_w.setVisible(true);
            fn_c.setVisible(false);
        }
        else{
               fn_c.setVisible(true);
               fn_w.setVisible(false);
        }
            
    }//GEN-LAST:event_fnFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
     //   forgot_pw.setVisible(false);
       
                    try{
                        Statement stmt=conn.createStatement();

                        ResultSet rs=stmt.executeQuery("select * from current_user");
                        if(rs.next())
                        {
                           String z=rs.getString("Email");
                           String z1=rs.getString("Password");
                                           login_email.setText(z);
                                           login_pw.setText(z1);
                        }
                       
                    }
                    catch(SQLException e)
                    {
                       
                    }
    }//GEN-LAST:event_formWindowOpened

    private void lnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnFocusLost
        // TODO add your handling code here:
        if(ln.getText().equals("")){
               ln_w.setVisible(true);
               ln_c.setVisible(false);
        }
        else{
               ln_c.setVisible(true);
               ln_w.setVisible(false);
        }
    }//GEN-LAST:event_lnFocusLost

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
         String a = email.getText();
         if(a.equals("")){
             email_w.setVisible(true);
             email_c.setVisible(false);
         }
         else{
                    try{
                        Statement stmt=conn.createStatement();

                        ResultSet rs=stmt.executeQuery("select email from signup where email = "+"'"+a+"'");
                        if(rs.next())
                        {
                           String z=rs.getString("Email");
                                           if(z.equals(a)){
                                           email_w.setVisible(true);
                                           email_c.setVisible(false);
                            }              
                        }
                        else{
                                            email_c.setVisible(true);
                                            email_w.setVisible(false);
                                           }

                    }
                    catch(SQLException e)
                    {
                        System.out.println(e.getMessage());
                    }
         }
    }//GEN-LAST:event_emailFocusLost

    private void pwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwFocusLost
        // TODO add your handling code here:
        if(pw.getText().equals("")){
              pw_w.setVisible(true);
              pw_c.setVisible(false);
        }
             
        else{
            pw_c.setVisible(true);
            pw_w.setVisible(false);
        }
               
    }//GEN-LAST:event_pwFocusLost

    private void c_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_nameFocusLost
        // TODO add your handling code here:
        if(c_name.getText().equals("")){
            c_name_w.setVisible(true);
            c_name_c.setVisible(false);
        }          
        else{
             c_name_c.setVisible(true);
             c_name_w.setVisible(false);
        }
              
    }//GEN-LAST:event_c_nameFocusLost

    private void contact_numFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contact_numFocusLost
        // TODO add your handling code here:
        if(contact_num.getText().equals("")){
            contact_num_w.setVisible(true);
            contact_num_c.setVisible(false);
        }
               
        else{
             contact_num_c.setVisible(true);
             contact_num_w.setVisible(false);
        }
              
    }//GEN-LAST:event_contact_numFocusLost

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        // TODO add your handling code here:
        if(address.getText().equals("")){
            address_w.setVisible(true);
            address_c.setVisible(false);
        }
               
        else{
             address_c.setVisible(true);
             address_w.setVisible(false);
        }
              
    }//GEN-LAST:event_addressFocusLost

    private void answerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusLost
        // TODO add your handling code here:
        if(answer.getText().equals("")){
            answer_w.setVisible(true);
            answer_c.setVisible(false);
        }
               
        else{
             answer_c.setVisible(true);
             answer_w.setVisible(false);
        }
    }//GEN-LAST:event_answerFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String a = login_email.getText();
        String b = login_pw.getText();
        
        
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from signup where email = "+"'"+a+"'");
            if(rs.next())
            {
               String n=rs.getString("Email");
                String n1=rs.getString("Password");
                String n2=rs.getString("First_name");
                String n3 = rs.getString("Company_name");
                if(a.equals(n)&&b.equals(n1)){
                    JOptionPane.showMessageDialog(null,"Welcome"+" "+n2+"!");
                    First ae1=new First(n3,n);
                    ae1.setVisible(true);
                    this.setVisible(false);
                    if(remember_pw.isSelected()){
                        try{
                      
                            stmt.executeQuery("delete from current_user");
                            stmt.executeQuery("commit");
                            stmt.executeQuery("insert into current_user values("+"'"+a+"'"+","+"'"+b+"'"+")");
                        }
                        catch(SQLException e)
                        {
                            System.out.println(e.getMessage());
                            JOptionPane.showMessageDialog(null,"Error!");
                        }
                    }
          
                }
                 else{
                    JOptionPane.showMessageDialog(null,"Incorect email or password!");
                }
            }
           
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void forgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseEntered
        // TODO add your handling code here:
        forgot.setForeground(Color.BLUE);
    }//GEN-LAST:event_forgotMouseEntered

    private void forgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseExited
        // TODO add your handling code here:
        forgot.setForeground(Color.RED);
    }//GEN-LAST:event_forgotMouseExited

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
        // TODO add your handling code here:
        
        String a = login_email.getText();
        if(a.equals("")){
            JOptionPane.showMessageDialog(null,"Enter your email!");
        }
        else{
            forgot_pw.setVisible(true);
            try{
                Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery("select * from signup where email = "+"'"+a+"'");
                if(rs.next())
                {
                   String n=rs.getString("Security_Question");
                   forgot_sec_quest.setText(n);
                }
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_forgotMouseClicked

    private void forgot_answerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_forgot_answerFocusLost
        // TODO add your handling code here:
         String a = login_email.getText();
        String b = forgot_answer.getText();
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from signup where email = "+"'"+a+"'");
            if(rs.next())
            {
               String n=rs.getString("Security_Question");
               forgot_sec_quest.setText(n);
                String n1=rs.getString("Security_Answer");
                if(b.equalsIgnoreCase(n1)){
                    forgot_new_pw.setEnabled(true);
                    forgot_confirm_pw.setEnabled(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect answer!");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_forgot_answerFocusLost

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String a = login_email.getText();
        String b = forgot_new_pw.getText();
        String c = forgot_confirm_pw.getText();
        if(b.equals(c)){
            try{
               Statement stmt=conn.createStatement();
               stmt.executeQuery("update signup set Password ="+"'"+b+"'"+"where Email ="+"'"+a+"'");
               JOptionPane.showMessageDialog(null,"Password updated successfully!");
               forgot_pw.setVisible(false);
           }
           catch(SQLException e)
           {
               System.out.println(e.getMessage());
           }
        }
        else{
            JOptionPane.showMessageDialog(null,"Password didn't match!");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void forgot_new_pwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_forgot_new_pwFocusLost
        // TODO add your handling code here:
        if(forgot_new_pw.getText().equals("")){
            forgot_new_pw_w.setVisible(true);
            forgot_new_pw_c.setVisible(false);
        }
        else{
            forgot_new_pw_w.setVisible(false);
            forgot_new_pw_c.setVisible(true);
        }
    }//GEN-LAST:event_forgot_new_pwFocusLost

    private void forgot_confirm_pwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_forgot_confirm_pwFocusLost
        // TODO add your handling code here:
        
         if(forgot_confirm_pw.getText().equals(forgot_new_pw.getText())){
            forgot_confirm_pw_w.setVisible(false);
            forgot_confirm_pw_c.setVisible(true);
        }
        else{
            forgot_confirm_pw_w.setVisible(true);
            forgot_confirm_pw_c.setVisible(false);
        }
    }//GEN-LAST:event_forgot_confirm_pwFocusLost

   
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel address_c;
    private javax.swing.JLabel address_w;
    private javax.swing.JTextField answer;
    private javax.swing.JLabel answer_c;
    private javax.swing.JLabel answer_w;
    private javax.swing.JLabel background;
    private javax.swing.JTextField c_name;
    private javax.swing.JLabel c_name_c;
    private javax.swing.JLabel c_name_w;
    private javax.swing.JTextField contact_num;
    private javax.swing.JLabel contact_num_c;
    private javax.swing.JLabel contact_num_w;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_c;
    private javax.swing.JLabel email_w;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel fn_c;
    private javax.swing.JLabel fn_w;
    private javax.swing.JLabel forgot;
    private javax.swing.JTextField forgot_answer;
    private javax.swing.JPasswordField forgot_confirm_pw;
    private javax.swing.JLabel forgot_confirm_pw_c;
    private javax.swing.JLabel forgot_confirm_pw_w;
    private javax.swing.JPasswordField forgot_new_pw;
    private javax.swing.JLabel forgot_new_pw_c;
    private javax.swing.JLabel forgot_new_pw_w;
    private javax.swing.JPanel forgot_pw;
    private javax.swing.JLabel forgot_sec_quest;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField ln;
    private javax.swing.JLabel ln_c;
    private javax.swing.JLabel ln_w;
    private javax.swing.JTextField login_email;
    private javax.swing.JPasswordField login_pw;
    private javax.swing.JPasswordField pw;
    private javax.swing.JLabel pw_c;
    private javax.swing.JLabel pw_w;
    private javax.swing.JCheckBox remember_pw;
    private javax.swing.JComboBox<String> sec_quest;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
