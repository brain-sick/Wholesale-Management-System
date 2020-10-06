
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Purchase extends javax.swing.JFrame {

    Connection conn = null;
    String a;
    String b;
    int c_id_var = 0;
    public Purchase() {
        initComponents();
    }
    public Purchase(String c_name,String email){
        
        
        
        initComponents();
        seller_table.setOpaque(false);
        ((DefaultTableCellRenderer)seller_table.getDefaultRenderer(Object.class)).setOpaque(false);
        scrollpane.setOpaque(false);
        scrollpane.getViewport().setOpaque(false);
        
        product_table.setOpaque(false);
        ((DefaultTableCellRenderer)product_table.getDefaultRenderer(Object.class)).setOpaque(false);
        scrollpane1.setOpaque(false);
        scrollpane1.getViewport().setOpaque(false);
        
        message_table.setOpaque(false);
        ((DefaultTableCellRenderer)message_table.getDefaultRenderer(Object.class)).setOpaque(false);
        scrollpane3.setOpaque(false);
        scrollpane3.getViewport().setOpaque(false);
        
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
        
        message_display.setVisible(false);
        
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        
        logout.setOpaque(false);
        logout.setContentAreaFilled(false);
        logout.setBorderPainted(false);
    }
    public ArrayList<User> userList(){
        ArrayList<User> usersList = new ArrayList<>();
        String query1 = "Select * from buyer";
         try{
            Statement stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            User user;
            while(rs.next()){
                user = new User(rs.getInt("buyer_id"), rs.getString("buyer_name"));
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
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        message_display = new javax.swing.JPanel();
        scrollpane3 = new javax.swing.JScrollPane();
        message_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        seller_panel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        buyer_id_entry = new javax.swing.JTextField();
        buyer_name_entry = new javax.swing.JTextField();
        address_entry = new javax.swing.JTextField();
        contact_entry = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        product_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        product_id_entry = new javax.swing.JTextField();
        product_name_entry = new javax.swing.JTextField();
        price_entry = new javax.swing.JTextField();
        category_entry = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        settings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        purchase_id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buyer_id = new javax.swing.JTextField();
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
        scrollpane1 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        scrollpane = new javax.swing.JScrollPane();
        seller_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        message = new javax.swing.JButton();
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

        message_display.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Message", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        message_display.setOpaque(false);

        message_table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        message_table.setForeground(new java.awt.Color(255, 255, 255));
        message_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpane3.setViewportView(message_table);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout message_displayLayout = new javax.swing.GroupLayout(message_display);
        message_display.setLayout(message_displayLayout);
        message_displayLayout.setHorizontalGroup(
            message_displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(message_displayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane3, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        message_displayLayout.setVerticalGroup(
            message_displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(message_displayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(message_displayLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );

        getContentPane().add(message_display);
        message_display.setBounds(40, 120, 570, 170);

        seller_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Seller entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        seller_panel.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Seller id");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Seller name");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Address");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Contact");

        buyer_id_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        buyer_name_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buyer_name_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buyer_name_entryFocusGained(evt);
            }
        });

        address_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                address_entryFocusGained(evt);
            }
        });

        contact_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contact_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contact_entryFocusGained(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seller_panelLayout = new javax.swing.GroupLayout(seller_panel);
        seller_panel.setLayout(seller_panelLayout);
        seller_panelLayout.setHorizontalGroup(
            seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seller_panelLayout.createSequentialGroup()
                .addGroup(seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(seller_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seller_panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(seller_panelLayout.createSequentialGroup()
                                .addGroup(seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 32, Short.MAX_VALUE)
                                .addGroup(seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buyer_name_entry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address_entry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact_entry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(seller_panelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buyer_id_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        seller_panelLayout.setVerticalGroup(
            seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seller_panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(buyer_id_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(buyer_name_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(address_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(seller_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(contact_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(seller_panel);
        seller_panel.setBounds(60, 510, 500, 370);

        product_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Product entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        product_panel.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Product id");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Product name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Price");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Category");

        product_id_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        product_name_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        product_name_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                product_name_entryFocusGained(evt);
            }
        });

        price_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        price_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                price_entryFocusGained(evt);
            }
        });

        category_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        category_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                category_entryFocusGained(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("Enter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout product_panelLayout = new javax.swing.GroupLayout(product_panel);
        product_panel.setLayout(product_panelLayout);
        product_panelLayout.setHorizontalGroup(
            product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(product_panelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(product_id_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(product_panelLayout.createSequentialGroup()
                        .addGroup(product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(product_panelLayout.createSequentialGroup()
                                .addGroup(product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(category_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(product_name_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        product_panelLayout.setVerticalGroup(
            product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(product_id_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(product_name_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(price_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(category_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(product_panel);
        product_panel.setBounds(1350, 520, 500, 360);

        settings.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Purchase details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        settings.setOpaque(false);
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seller id");
        settings.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 87, -1, -1));

        purchase_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        purchase_id.setForeground(new java.awt.Color(255, 255, 255));
        purchase_id.setText("Purchase id");
        settings.add(purchase_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 310, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Purchase id");
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

        buyer_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buyer_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buyer_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                buyer_idFocusLost(evt);
            }
        });
        settings.add(buyer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 88, 320, 30));

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
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
        settings.setBounds(640, 280, 660, 670);

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
        scrollpane1.setBounds(1350, 360, 500, 140);

        seller_table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        seller_table.setForeground(new java.awt.Color(255, 255, 255));
        seller_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seller id", "Seller name"
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
        scrollpane.setViewportView(seller_table);

        getContentPane().add(scrollpane);
        scrollpane.setBounds(60, 350, 500, 140);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        message.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Search Seller");
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
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(690, 120, 550, 120);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Teal-Blue-Desktop-Backgrounds-HD.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(1, 0, 1940, 1060);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        buyer_id.setText("1");
        paid.setSelected(true);
        product_id.setText("1");
        product_panel.setVisible(false);
        product_id_entry.setEnabled(false);
        buyer_id_entry.setEnabled(false);
        seller_panel.setVisible(false);
        payment.setText("0");
         ArrayList<User> list = userList();
         DefaultTableModel model = (DefaultTableModel) seller_table.getModel();
         Object[] row = new Object[2];
         for(int i = 0 ; i < list.size() ; i++){
             row[0] = list.get(i).getbuyer_id();
             row[1] = list.get(i).getbuyer_name();
             
             model.addRow(row);
         }
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
            String count = ("select max(purchase_id)from purchase");
            String query = "Select * from product";
         
            ResultSet rs = stmt.executeQuery(count);
           
            if(rs.next())
            {
               int n=(rs.getInt("max(purchase_id)"));
               purchase_id.setText(""+(n+1));
            }
            
            ResultSet rs1 = stmt.executeQuery(query);
            int sum = 0;
            while(rs1.next()){
                int quant = rs1.getInt("quantity");
                if(quant <= 2){
                    sum++;
                    int p_id = rs1.getInt("product_id");
                    String name = rs1.getString("product_name");
                    
                     DefaultTableModel model2 = (DefaultTableModel) message_table.getModel();
                    model2.addRow(new Object[]{("The product id with "+p_id+" and name "+name+" has quantity = "+quant+" only.")});
                   
                }
                if(sum > 0){
                    message.setBackground(Color.red);
                }
                else{
                     message.setBackground(new Color(240, 240, 240));
                }
                message.setText("Message ("+sum+")");
            }
           
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
         try{
            Statement stmt=conn.createStatement();
           
            String count1 = ("select max(product_id)from product");
           
            ResultSet rs1 = stmt.executeQuery(count1);
            
            if(rs1.next())
            {
               int n=(rs1.getInt("max(product_id)"));
               product_id_entry.setText(""+(n+1));
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
          try{
            Statement stmt=conn.createStatement();
           
            String count1 = ("select max(buyer_id)from buyer");
           
            ResultSet rs1 = stmt.executeQuery(count1);
            
            if(rs1.next())
            {
               int n=(rs1.getInt("max(buyer_id)"));
               buyer_id_entry.setText(""+(n+1));
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void buyer_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buyer_idFocusLost
        // TODO add your handling code here:
        int b_id = Integer.parseInt(buyer_id.getText());
        
             try{
                        Statement stmt=conn.createStatement();

                        ResultSet rs=stmt.executeQuery("select buyer_id from buyer where buyer_id = "+b_id);
                        if(rs.next())
                        {
                           int z=rs.getInt("buyer_id");
                                           if(z==(b_id)){
                                               seller_panel.setVisible(false);
                                          //     buyer_id.setEnabled(false);
                                               next.setEnabled(true);
                                               enter.setEnabled(true);
                            }              
                        }
                        else{
                                             JOptionPane.showMessageDialog(null,"This seller_id doesn't exist, register for the same!");
                                            seller_panel.setVisible(true);
                                            next.setEnabled(false);
                                            enter.setEnabled(false);
                                           }

                    }
                    catch(SQLException e)
                    {
                        System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(null,"buyer_id");
                    }
        
       
    }//GEN-LAST:event_buyer_idFocusLost

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
           if(n2!=""){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{c,n2,n,d,(n*d)});
        
           }
        int total = n*d;
        int x = Integer.parseInt(payment.getText());
        f = x + total;
        payment.setText(""+f);
        try{
            Statement stmt=conn.createStatement();
            
                int y = n1+d;
                stmt.executeUpdate("update product set quantity = "+y+"where product_id ="+c);
                stmt.executeQuery("commit");
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"update Error!");
        }
    
          
    }//GEN-LAST:event_nextActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            Statement stmt=conn.createStatement();
           int c = Integer.parseInt(buyer_id_entry.getText());
           String d = buyer_name_entry.getText();
           String e = address_entry.getText();
           String f = contact_entry.getText();
                stmt.executeQuery("insert into buyer values("+c+","+"'"+d+"'"+","+"'"+e+"'"+","+"'"+f+"'"+")");
                JOptionPane.showMessageDialog(null,"New seller successfully registered!");
               // conn.close();
                seller_panel.setVisible(false);
                next.setEnabled(true);
                enter.setEnabled(true);
                buyer_name_entry.setText("");
                address_entry.setText("");
                contact_entry.setText("");
                
                 try{
           
                String count1 = ("select max(buyer_id)from buyer");
                ResultSet rs1 = stmt.executeQuery(count1);

                if(rs1.next())
                {
                   int n=(rs1.getInt("max(buyer_id)"));
                   buyer_id_entry.setText(""+(n+1));
                }

            }
            catch(SQLException z)
            {
                System.out.println(z.getMessage());
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
        while (seller_table.getRowCount() > 0) {
	((DefaultTableModel) seller_table.getModel()).removeRow(0);
        }
        ArrayList<User> list = userList();
         DefaultTableModel model = (DefaultTableModel) seller_table.getModel();
         Object[] row = new Object[2];
         for(int i = 0 ; i < list.size() ; i++){
             row[0] = list.get(i).getbuyer_id();
             row[1] = list.get(i).getbuyer_name();
             
             model.addRow(row);
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            Statement stmt=conn.createStatement();
           int c = Integer.parseInt(product_id_entry.getText());
           String d = product_name_entry.getText();
           int e = Integer.parseInt(price_entry.getText());
           String f = category_entry.getText();
           int g = 0;
                stmt.executeQuery("insert into product values("+c+","+"'"+d+"'"+","+e+","+"'"+f+"'"+","+g+")");
                JOptionPane.showMessageDialog(null,"New product successfully registered!");
                product_panel.setVisible(false);
                next.setEnabled(true);
                enter.setEnabled(true);
                product_name_entry.setText("");
                price_entry.setText("");
                category_entry.setText("");
               
                
                 try{
                        String count1 = ("select max(product_id)from product");
                        ResultSet rs1 = stmt.executeQuery(count1);

                    if(rs1.next())
                    {
                       int n=(rs1.getInt("max(product_id)"));
                       product_id_entry.setText(""+(n+1));
                    }
            
        }
                catch(SQLException z)
                {
                    System.out.println(z.getMessage());
                }
            
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

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(model.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Your cart is empty!");
        }
        else{
             try{
            Statement stmt=conn.createStatement();
            String g = "";
           int c = Integer.parseInt(buyer_id.getText());
           int d = Integer.parseInt(purchase_id.getText()); 
           if(credit.isSelected()){
                g = "Credit";
           }
           else
                g = "Paid";
        
           int f = Integer.parseInt(payment.getText());
                stmt.executeQuery("insert into purchase values("+c+","+d+","+f+","+"'"+g+"'"+")");
               // stmt.executeQuery("commit");
                JOptionPane.showMessageDialog(null,"New purchase successfully registered!");
                conn.close();
             
            
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"Error!");
            }
            while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
            }

           Purchase purchase = new Purchase(b,a);
           purchase.setVisible(true);
           this.setVisible(false);
        }
       
    }//GEN-LAST:event_enterActionPerformed

    private void product_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_product_idFocusLost
        // TODO add your handling code here:
        int p_id = Integer.parseInt(product_id.getText());
       // if(p_id.equals(" ")){
         //   product_panel.setVisible(false);
        //}
      //  else{
                try{
                Statement stmt=conn.createStatement();

                ResultSet rs=stmt.executeQuery("select product_id from product where product_id = "+p_id);
                if(rs.next())
                {
                    int z=rs.getInt("product_id");
                    if(z==(p_id)){
                        product_panel.setVisible(false);
                        next.setEnabled(true);
                    enter.setEnabled(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"This product_id doesn't exist, register for the same!");
                    product_panel.setVisible(true);
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        First first = new First(b,a);
        first.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String a = JOptionPane.showInputDialog("Enter Seller name: ");
        int flag = 0;
        try{
                        Statement stmt=conn.createStatement();
                        String count1 = ("select * from buyer");
                        ResultSet rs1 = stmt.executeQuery(count1);

                    while(rs1.next())
                    {
                       int n=(rs1.getInt("buyer_id"));
                       String n1 = rs1.getString("buyer_name");
                       if(a.equalsIgnoreCase(n1)){
                           buyer_id.setText(""+(n));
                           flag = 1;
                       }
                    }
            if(flag == 0)
                JOptionPane.showMessageDialog(null,"This seller doesn't exist!");
        }
        catch(SQLException z){
            System.out.println(z.getMessage());
           }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
        // TODO add your handling code here:
        message_display.setVisible(true);
        
    }//GEN-LAST:event_messageActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        message_display.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void buyer_name_entryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buyer_name_entryFocusGained
        // TODO add your handling code here:
        if(seller_panel.isVisible()){
            enter.setEnabled(false);
            next.setEnabled(false);
        }
    }//GEN-LAST:event_buyer_name_entryFocusGained

    private void address_entryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address_entryFocusGained
        // TODO add your handling code here:
         if(seller_panel.isVisible()){
            enter.setEnabled(false);
            next.setEnabled(false);
        }
    }//GEN-LAST:event_address_entryFocusGained

    private void contact_entryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contact_entryFocusGained
        // TODO add your handling code here:
         if(seller_panel.isVisible()){
            enter.setEnabled(false);
            next.setEnabled(false);
        }
    }//GEN-LAST:event_contact_entryFocusGained

    private void product_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_product_idFocusGained
        // TODO add your handling code here:
         if(seller_panel.isVisible()){
            enter.setEnabled(false);
            next.setEnabled(false);
        }
    }//GEN-LAST:event_product_idFocusGained

    private void product_name_entryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_product_name_entryFocusGained
        // TODO add your handling code here:
        if(product_panel.isVisible()){
            enter.setEnabled(false);
            next.setEnabled(false);
        }
    }//GEN-LAST:event_product_name_entryFocusGained

    private void price_entryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_price_entryFocusGained
        // TODO add your handling code here:
        if(product_panel.isVisible()){
            enter.setEnabled(false);
            next.setEnabled(false);
        }
    }//GEN-LAST:event_price_entryFocusGained

    private void category_entryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_category_entryFocusGained
        // TODO add your handling code here:
        if(product_panel.isVisible()){
            enter.setEnabled(false);
            next.setEnabled(false);
        }
    }//GEN-LAST:event_category_entryFocusGained

    private void buyer_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buyer_idFocusGained
        // TODO add your handling code here:
        if(product_panel.isVisible()){
            enter.setEnabled(false);
            next.setEnabled(false);
        }
    }//GEN-LAST:event_buyer_idFocusGained

    private void quantity1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantity1FocusGained
        // TODO add your handling code here:
        if(seller_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
        if(product_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
    }//GEN-LAST:event_quantity1FocusGained

    private void creditFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditFocusGained
        // TODO add your handling code here:
        if(seller_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
        if(product_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
    }//GEN-LAST:event_creditFocusGained

    private void paidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paidFocusGained
        // TODO add your handling code here:
        if(seller_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
        if(product_panel.isVisible()){
            next.setEnabled(false);
            enter.setEnabled(false);
        }
    }//GEN-LAST:event_paidFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IllegalAccessException {
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
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase().setVisible(true);
            }
        });
    }
    
    class User{
       private int buyer_id;
       private String buyer_name;
       
       public User(int buyer_id, String buyer_name){
           this.buyer_id = buyer_id;
           this.buyer_name = buyer_name; 
       }
       
       public int getbuyer_id(){
           return buyer_id;
       }
       
       public String getbuyer_name(){
           return buyer_name;
       }
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
    private javax.swing.JTextField address_entry;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField buyer_id;
    private javax.swing.JTextField buyer_id_entry;
    private javax.swing.JTextField buyer_name_entry;
    private javax.swing.JTextField category_entry;
    private javax.swing.JTextField contact_entry;
    private javax.swing.JRadioButton credit;
    private javax.swing.JButton enter;
    private javax.swing.JLabel head;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JButton message;
    private javax.swing.JPanel message_display;
    private javax.swing.JTable message_table;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton paid;
    private javax.swing.JLabel payment;
    private javax.swing.JTextField price_entry;
    private javax.swing.JTextField product_id;
    private javax.swing.JTextField product_id_entry;
    private javax.swing.JTextField product_name_entry;
    private javax.swing.JPanel product_panel;
    private javax.swing.JTable product_table;
    private javax.swing.JLabel purchase_id;
    private javax.swing.JSpinner quantity1;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JScrollPane scrollpane3;
    private javax.swing.JPanel seller_panel;
    private javax.swing.JTable seller_table;
    private javax.swing.JPanel settings;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
