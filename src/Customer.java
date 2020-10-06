
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Customer extends javax.swing.JFrame {

     Connection conn = null;
    String a;
    String b;
    
    public Customer() {
        initComponents();
    }
    
    public Customer(String c_name,String email){
        initComponents();
        table.setOpaque(false);
        ((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setOpaque(false);
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
    public ArrayList<User> userList(){
        ArrayList<User> usersList = new ArrayList<>();
        String query1 = "Select * from customer";
         try{
            Statement stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            User user;
            while(rs.next()){
                user = new User(rs.getInt("customer_id"), rs.getString("customer_name"),rs.getString("Email"),rs.getString("Contact"));
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

        jPanel1 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        scrollpane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
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
        head = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        update.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(740, 130, 460, 120);

        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_id", "Customer_name", "Email", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpane1.setViewportView(table);

        getContentPane().add(scrollpane1);
        scrollpane1.setBounds(920, 330, 700, 340);

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

        email_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        contact_entry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

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
                .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(customer_panelLayout.createSequentialGroup()
                        .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customer_panelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(customer_name_entry))
                            .addGroup(customer_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contact_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(email_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 1, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customer_panelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customer_id_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
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
                .addGap(27, 27, 27)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(customer_panel);
        customer_panel.setBounds(270, 310, 540, 360);

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
        back.setBounds(40, 30, 105, 70);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Teal-Blue-Desktop-Backgrounds-HD.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(1, 0, 1950, 1060);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            int c = Integer.parseInt(customer_id_entry.getText());
            String d = customer_name_entry.getText();
            String g = (email_entry.getText());
            String f = contact_entry.getText();
            int flag = 0;
            
        if(d.equals("")||g.equals("")||f.equals("")){
            JOptionPane.showMessageDialog(null,"You can't leave any blank field!");
        }
        
        else{
            try{
            Statement stmt=conn.createStatement();
                    try{
                      

                        ResultSet rs=stmt.executeQuery("select contact from customer");
                        while(rs.next())
                        {
                           String z=rs.getString("contact");
                                           if(z.equals(f)){
                                           JOptionPane.showMessageDialog(null,"This contact is already in use!");
                                           flag = 1;
                                          
                            }              
                        }
                        if(flag==0){
                            
                                stmt.executeQuery("insert into customer values("+c+","+"'"+d+"'"+","+"'"+g+"'"+","+"'"+f+"'"+")");
                                JOptionPane.showMessageDialog(null,"New Customer successfully registered!");
                                Customer customer = new Customer(b,a);
                                customer.setVisible(true);
                                this.setVisible(false);
                                           }

                    }
                    catch(SQLException e)
                    {
                        System.out.println(e.getMessage());
                    }
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"Error!");
            }
            
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        table.setAutoCreateRowSorter(true);
        customer_id_entry.setEditable(false);
        int n = 0;
         try{
            Statement stmt=conn.createStatement();
            String count1 = ("select max(customer_id)from customer");
            ResultSet rs1 = stmt.executeQuery(count1);
            if(rs1.next())
            {
                n=(rs1.getInt("max(customer_id)"));
               customer_id_entry.setText(""+(n+1));
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
         
         ArrayList<User> list = userList();
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         Object[] row = new Object[4];
         for(int i = 0 ; i < list.size() ; i++){
             row[0] = list.get(i).getcustomer_id();
             row[1] = list.get(i).getc_name();
             row[2] = list.get(i).getemail();
             row[3] = list.get(i).getcontact();
             model.addRow(row);
         }
    }//GEN-LAST:event_formWindowOpened

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
         int row = table.getSelectedRow();
         int value1 = (int) table.getValueAt(row, 0);
         String value2 = (String) table.getValueAt(row, 1);
         String value3 = (String) table.getValueAt(row, 2);
         String value4 = (String) table.getValueAt(row, 3);
         try{
            Statement stmt=conn.createStatement();
           
                stmt.executeUpdate("update customer set customer_id = "+value1+","+"customer_name = "+"'"+value2+"'"+","+"email = "+"'"+value3+"'"
                +","+"contact = "+"'"+value4+"'"+"where customer_id = "+value1);
                stmt.executeQuery("commit");
               
                JOptionPane.showMessageDialog(null,"Details successfully updated!");
               
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
       
        int row = table.getSelectedRow();
         int value1 = (int) table.getValueAt(row, 0);
         try{
            Statement stmt=conn.createStatement();
           
                stmt.executeQuery("delete from customer where customer_id = "+value1);
                JOptionPane.showMessageDialog(null,"Customer with customer_id = "+value1+ " successfully deleted!");
            
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
        Customer customer = new Customer(b,a);
        customer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteActionPerformed

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
                    JOptionPane.showMessageDialog(null,"Customer_id is: "+n);
                    flag = 1;
                }
            }
            if(flag == 0)
            JOptionPane.showMessageDialog(null,"This customer is not registered!");
        }
        catch(SQLException z){
            System.out.println(z.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }
    class User{
       private String c_name, email, contact;
       private int customer_id;
       
       public User(int customer_id, String c_name, String email, String contact){
           this.customer_id = customer_id;
           this.c_name = c_name;
           this.email = email;
           this.contact = contact;
       }
       
       public int getcustomer_id(){
           return customer_id;
       }
       public String getc_name(){
           return c_name;
       }
       public String getemail(){
           return email;
       }
       public String getcontact(){
           return contact;
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JTextField contact_entry;
    private javax.swing.JTextField customer_id_entry;
    private javax.swing.JTextField customer_name_entry;
    private javax.swing.JPanel customer_panel;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email_entry;
    private javax.swing.JLabel head;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
