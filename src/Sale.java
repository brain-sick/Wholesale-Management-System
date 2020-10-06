
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Sale extends javax.swing.JFrame {

    Connection conn = null;
    String a;
    String b;
    public Sale() {
        initComponents();
    }

    public Sale(String c_name,String email){
        initComponents();
        product_table.setOpaque(false);
        ((DefaultTableCellRenderer)product_table.getDefaultRenderer(Object.class)).setOpaque(false);
        scrollpane1.setOpaque(false);
        scrollpane1.getViewport().setOpaque(false);
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
        head.setText(c_name+"'s");
        b = c_name;
        a = email;
        
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        
        logout.setOpaque(false);
        logout.setContentAreaFilled(false);
        logout.setBorderPainted(false);
    }
    
     public ArrayList<User1> userList1(){
        ArrayList<User1> usersList = new ArrayList<>();
        String query1 = "Select * from product";
         try{
            Statement stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            User1 user;
            while(rs.next()){
                user = new User1(rs.getInt("product_id"), rs.getString("product_name"));
                usersList.add(user);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
        return usersList;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        customer_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        customer_id_entry = new javax.swing.JTextField();
        customer_name_entry = new javax.swing.JTextField();
        email_entry = new javax.swing.JTextField();
        contact_entry = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        settings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        billing_id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customer_id = new javax.swing.JTextField();
        product_id = new javax.swing.JTextField();
        payment = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        next = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        quantity1 = new javax.swing.JSpinner();
        credit = new javax.swing.JRadioButton();
        paid = new javax.swing.JRadioButton();
        head = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        scrollpane1 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billing-png.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 260, 410, 370);

        customer_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Customer entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        customer_panel.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Customer id");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Customer name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Conatct");

        customer_id_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        customer_name_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        customer_name_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customer_name_entryFocusGained(evt);
            }
        });

        email_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_entryFocusGained(evt);
            }
        });

        contact_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contact_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contact_entryFocusGained(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("Enter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customer_panelLayout = new javax.swing.GroupLayout(customer_panel);
        customer_panel.setLayout(customer_panelLayout);
        customer_panelLayout.setHorizontalGroup(
            customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customer_panelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customer_id_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customer_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customer_panelLayout.createSequentialGroup()
                        .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(22, 22, 22)
                        .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customer_name_entry)
                            .addGroup(customer_panelLayout.createSequentialGroup()
                                .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contact_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        customer_panelLayout.setVerticalGroup(
            customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(customer_id_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(customer_name_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(email_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(contact_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(customer_panel);
        customer_panel.setBounds(1380, 510, 500, 360);

        settings.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Billing", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        settings.setOpaque(false);
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer id");
        settings.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 87, -1, -1));

        billing_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        billing_id.setForeground(new java.awt.Color(255, 255, 255));
        billing_id.setText("Billing id");
        settings.add(billing_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 310, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Billing id");
        settings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 128, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Product id");
        settings.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 172, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");
        settings.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 213, -1, -1));

        customer_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        customer_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                customer_idFocusLost(evt);
            }
        });
        settings.add(customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 88, 320, 30));

        product_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        product_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                product_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                product_idFocusLost(evt);
            }
        });
        settings.add(product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 320, 30));

        payment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        payment.setForeground(new java.awt.Color(255, 255, 255));
        payment.setText("Payment");
        settings.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 270, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Payment");
        settings.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_id", "Product_name", "Rate", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        settings.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 510, 110));

        next.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        settings.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 90, 40));

        enter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        settings.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 550, 90, 40));

        quantity1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        quantity1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));
        quantity1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantity1FocusGained(evt);
            }
        });
        settings.add(quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        buttonGroup1.add(credit);
        credit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        credit.setForeground(new java.awt.Color(255, 255, 255));
        credit.setText("Credit");
        credit.setOpaque(false);
        credit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                creditFocusGained(evt);
            }
        });
        settings.add(credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, -1));

        buttonGroup1.add(paid);
        paid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        paid.setForeground(new java.awt.Color(255, 255, 255));
        paid.setText("Paid");
        paid.setOpaque(false);
        paid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                paidFocusGained(evt);
            }
        });
        settings.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 70, -1));

        getContentPane().add(settings);
        settings.setBounds(640, 260, 660, 670);

        head.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 48)); // NOI18N
        head.setForeground(new java.awt.Color(255, 255, 255));
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setText("jLabel1");
        getContentPane().add(head);
        head.setBounds(150, 20, 1620, 100);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 120, 1920, 20);

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Wholesale Management System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1550, 130, 350, 50);

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
        back.setBounds(40, 30, 110, 70);

        product_table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        product_table.setForeground(new java.awt.Color(255, 255, 255));
        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product id", "Product name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpane1.setViewportView(product_table);

        getContentPane().add(scrollpane1);
        scrollpane1.setBounds(1380, 310, 500, 140);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Search customer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Search poduct");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(770, 120, 390, 120);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Teal-Blue-Desktop-Backgrounds-HD.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(1, 0, 1950, 1060);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customer_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customer_idFocusLost
        // TODO add your handling code here:
        int c_id = Integer.parseInt(customer_id.getText());
        
            try{
                Statement stmt=conn.createStatement();

                ResultSet rs=stmt.executeQuery("select customer_id from customer where customer_id = "+c_id);
                if(rs.next())
                {
                    int z=rs.getInt("customer_id");
                    if(z==(c_id)){
                        customer_panel.setVisible(false);
                        next.setEnabled(true);
                        enter.setEnabled(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"This customer_id doesn't exist, register for the same!");
                    customer_panel.setVisible(true);
                    next.setEnabled(false);
                    enter.setEnabled(false);
                }

            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"customer_id");
            }
        

    }//GEN-LAST:event_customer_idFocusLost

    private void product_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_product_idFocusLost
        // TODO add your handling code here:
        int p_id = Integer.parseInt(product_id.getText());
        
            try{
                Statement stmt=conn.createStatement();

                ResultSet rs=stmt.executeQuery("select product_id from product where product_id = "+p_id);
                if(rs.next())
                {
                    int z=rs.getInt("product_id");
                    if(z==(p_id)){
                        next.setEnabled(true);
                        enter.setEnabled(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"This product_id doesn't exist!");
                    next.setEnabled(false);
                    enter.setEnabled(false);
                }

            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"product_id");
            }
            //   }

    }//GEN-LAST:event_product_idFocusLost

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        int c = Integer.parseInt(product_id.getText());
        int d = (Integer)quantity1.getValue();
        int n=0;
        int n1=0;
        String n2 = "";
        int f = 0;
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from product where product_id = "+c);
            if(rs.next())
            {
                n=rs.getInt("Price");
                n1=rs.getInt("quantity");
                n2=rs.getString("Product_name");
            }

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Next");
        }
        int ab = n1 - d;
        if(ab >= 0){
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{c,n2,n,d,(n*d)});
            int total = n*d;
            int x = Integer.parseInt(payment.getText());
            f = x + total;
            payment.setText(""+f);
            try{
                Statement stmt=conn.createStatement();

                int y = n1-d;
                // System.out.println(""+y);
                stmt.executeUpdate("update product set quantity = "+y+"where product_id ="+c);
                stmt.executeQuery("commit");

            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"update Error!");
            }

        }
        
        else{
            JOptionPane.showMessageDialog(null,"Only "+n1+" items left.");
        }
        

    }//GEN-LAST:event_nextActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(model.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Your cart is empty!");
        }
        else{
            try{
            Statement stmt=conn.createStatement();
            int c = Integer.parseInt(customer_id.getText());
            int d = Integer.parseInt(billing_id.getText());
             String e = "";
             if(credit.isSelected())
                 e = "Credit";
             else
                 e = "Paid";
           // int f = (Integer)quantity1.getValue();
            int g = Integer.parseInt(payment.getText());
            stmt.executeQuery("insert into billing values("+c+","+d+","+g+","+"'"+e+"'"+")");
            // stmt.executeQuery("commit");
            JOptionPane.showMessageDialog(null,"Bill_id "+d+" saved!");
            //conn.close();

            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"Error!");
            }
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }

            Sale sale = new Sale(b,a);
            sale.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_enterActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            Statement stmt=conn.createStatement();
            int c = Integer.parseInt(customer_id_entry.getText());
            String d = customer_name_entry.getText();
            String e = (email_entry.getText());
            String f = contact_entry.getText();
            stmt.executeQuery("insert into customer values("+c+","+"'"+d+"'"+","+"'"+e+"'"+","+"'"+f+"'"+")");
            JOptionPane.showMessageDialog(null,"New Customer successfully registered!");
            //      conn.close();
            customer_panel.setVisible(false);
            next.setEnabled(true);
            enter.setEnabled(true);

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
        // Purchase purchase = new Purchase(b,a);
        //purchase.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        customer_id.setText("1");
        paid.setSelected(true);
        product_id.setText("1");
        customer_panel.setVisible(false);
        customer_id_entry.setEnabled(false);
        payment.setText("0");
         ArrayList<User1> list1 = userList1();
         DefaultTableModel model1 = (DefaultTableModel) product_table.getModel();
         Object[] row1 = new Object[2];
         for(int i = 0 ; i < list1.size() ; i++){
             row1[0] = list1.get(i).getproduct_id();
             row1[1] = list1.get(i).getproduct_name();
             
             model1.addRow(row1);
         }
        try{
            Statement stmt=conn.createStatement();
            String count = ("select max(billing_id)from billing");
         
            ResultSet rs = stmt.executeQuery(count);
           
            if(rs.next())
            {
               int n=(rs.getInt("max(billing_id)"));
               billing_id.setText(""+(n+1));
            }
           
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
         try{
            Statement stmt=conn.createStatement();
           
            String count1 = ("select max(customer_id)from customer");
           
            ResultSet rs1 = stmt.executeQuery(count1);
            
            if(rs1.next())
            {
               int n=(rs1.getInt("max(customer_id)"));
               customer_id_entry.setText(""+(n+1));
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        First first = new First(b,a);
        first.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String a = JOptionPane.showInputDialog("Enter mobile number: ");
        int flag = 0;
        try{
            Statement stmt=conn.createStatement();
            String count1 = ("select * from customer");
            ResultSet rs1 = stmt.executeQuery(count1);

            while(rs1.next())
            {
               
                String n1 = rs1.getString("contact");
                if(a.equalsIgnoreCase(n1)){
                    int n=(rs1.getInt("customer_id"));
                    customer_id.setText(""+(n));
                    flag = 1;
                }
            }
            if(flag == 0)
            JOptionPane.showMessageDialog(null,"This customer is not registered!");
        }
        catch(SQLException z){
            System.out.println(z.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String a = JOptionPane.showInputDialog("Enter product name: ");
        int flag = 0;
        try{
            Statement stmt=conn.createStatement();
            String count1 = ("select * from product");
            ResultSet rs1 = stmt.executeQuery(count1);

            while(rs1.next())
            {
                int n=(rs1.getInt("product_id"));
                String n1 = rs1.getString("product_name");
                if(a.equalsIgnoreCase(n1)){
                    product_id.setText(""+(n));
                    flag = 1;
                }

            }
            if(flag==0)
            JOptionPane.showMessageDialog(null,"This product doesn't exist!");

        }
        catch(SQLException z){
            System.out.println(z.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customer_name_entryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customer_name_entryFocusGained
        // TODO add your handling code here:
        if(customer_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
    }//GEN-LAST:event_customer_name_entryFocusGained

    private void email_entryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_entryFocusGained
        // TODO add your handling code here:
        if(customer_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
    }//GEN-LAST:event_email_entryFocusGained

    private void contact_entryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contact_entryFocusGained
        // TODO add your handling code here:
        if(customer_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
    }//GEN-LAST:event_contact_entryFocusGained

    private void product_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_product_idFocusGained
        // TODO add your handling code here:
        if(customer_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
    }//GEN-LAST:event_product_idFocusGained

    private void quantity1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantity1FocusGained
        // TODO add your handling code here:
        if(customer_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
    }//GEN-LAST:event_quantity1FocusGained

    private void creditFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditFocusGained
        // TODO add your handling code here:
        if(customer_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
        
    }//GEN-LAST:event_creditFocusGained

    private void paidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paidFocusGained
        // TODO add your handling code here:
        if(customer_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
    }//GEN-LAST:event_paidFocusGained

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
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }
     class User1{
       private int product_id;
       private String product_name;
       
       public User1(int product_id, String product_name){
           this.product_id = product_id;
           this.product_name = product_name; 
       }
       
       public int getproduct_id(){
           return product_id;
       }
       
       public String getproduct_name(){
           return product_name;
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel billing_id;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contact_entry;
    private javax.swing.JRadioButton credit;
    private javax.swing.JTextField customer_id;
    private javax.swing.JTextField customer_id_entry;
    private javax.swing.JTextField customer_name_entry;
    private javax.swing.JPanel customer_panel;
    private javax.swing.JTextField email_entry;
    private javax.swing.JButton enter;
    private javax.swing.JLabel head;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton paid;
    private javax.swing.JLabel payment;
    private javax.swing.JTextField product_id;
    private javax.swing.JTable product_table;
    private javax.swing.JSpinner quantity1;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JPanel settings;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
