
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Payment extends javax.swing.JFrame {

    Connection conn = null;
    String a;
    String b;
    public Payment() {
        initComponents();
    }
    
     public Payment(String c_name,String email){
        initComponents();
        table_seller.setOpaque(false);
        ((DefaultTableCellRenderer)table_seller.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        
        table_buyer.setOpaque(false);
        ((DefaultTableCellRenderer)table_buyer.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
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
        String query1 = "Select * from purchase";
         try{
            Statement stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            User user;
            while(rs.next()){
                user = new User(rs.getInt("buyer_id"), rs.getInt("Purchase_id"),rs.getInt("Payment"),rs.getString("Payment_status"));
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
        ArrayList<User1> usersList1 = new ArrayList<>();
        String query1 = "Select * from billing";
         try{
            Statement stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            User1 user1;
            while(rs.next()){
                user1 = new User1(rs.getInt("customer_id"), rs.getInt("billing_id"),rs.getInt("Payment"),rs.getString("Payment_status"));
                usersList1.add(user1);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
        return usersList1;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        head = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_buyer = new javax.swing.JTable();
        table_buyer_status = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_seller = new javax.swing.JTable();
        table_seller_status = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

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

        table_buyer.setAutoCreateRowSorter(true);
        table_buyer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        table_buyer.setForeground(new java.awt.Color(255, 255, 255));
        table_buyer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_id", "Billing_id", "Payment", "Payment_status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_buyer);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1020, 320, 700, 360);

        table_buyer_status.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        table_buyer_status.setForeground(new java.awt.Color(255, 255, 255));
        table_buyer_status.setText("jLabel2");
        getContentPane().add(table_buyer_status);
        table_buyer_status.setBounds(1020, 700, 700, 40);

        table_seller.setAutoCreateRowSorter(true);
        table_seller.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        table_seller.setForeground(new java.awt.Color(255, 255, 255));
        table_seller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seller_id", "Purchase_id", "Payment", "Payment_status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_seller);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 320, 700, 360);

        table_seller_status.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        table_seller_status.setForeground(new java.awt.Color(255, 255, 255));
        table_seller_status.setText("jLabel2");
        getContentPane().add(table_seller_status);
        table_seller_status.setBounds(210, 700, 700, 40);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        update.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        update.setText("Update Seller");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        update1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        update1.setText("Update Customer");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(update1)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(770, 120, 390, 120);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Teal-Blue-Desktop-Backgrounds-HD.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(1, 0, 1950, 1060);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String status_seller = "";
        int payment_seller = 0;
        int n_seller = 0;
        String status_buyer = "";
        int payment_buyer = 0;
        int n_buyer = 0;
        ArrayList<User> list = userList();
         DefaultTableModel model = (DefaultTableModel) table_seller.getModel();
         Object[] row = new Object[4];
         for(int i = 0 ; i < list.size() ; i++){
             row[0] = list.get(i).getseller_id();
             row[1] = list.get(i).getpurchase_id();
             row[2] = list.get(i).getpayment();
             row[3] = list.get(i).getpayment_status();
             model.addRow(row);
         }
         ArrayList<User1> list1 = userList1();
         DefaultTableModel model1 = (DefaultTableModel) table_buyer.getModel();
         Object[] row1 = new Object[4];
         for(int i = 0 ; i < list1.size() ; i++){
             row1[0] = list1.get(i).getcustomer_id();
             row1[1] = list1.get(i).getbilling_id();
             row1[2] = list1.get(i).getpayment();
             row1[3] = list1.get(i).getpayment_status();
             model1.addRow(row1);
         }
         try{
            Statement stmt=conn.createStatement();
            String count1 = ("select * from purchase");
            ResultSet rs1 = stmt.executeQuery(count1);
            while(rs1.next())
            {
                status_seller = rs1.getString("payment_status");
                if(status_seller.equalsIgnoreCase("Credit")){
                    n_seller=(rs1.getInt("payment"));
                    payment_seller = payment_seller + n_seller;
                }
            }
            table_seller_status.setText("Your total credit is: "+payment_seller);
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
         try{
            Statement stmt=conn.createStatement();
            String count1 = ("select * from billing");
            ResultSet rs1 = stmt.executeQuery(count1);
            while(rs1.next())
            {
                status_buyer = rs1.getString("payment_status");
                if(status_buyer.equalsIgnoreCase("Credit")){
                    n_buyer=(rs1.getInt("payment"));
                    payment_buyer = payment_buyer + n_buyer;
                }
            }
            table_buyer_status.setText("Your total credit is: "+payment_buyer);
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        int row = table_seller.getSelectedRow();
        //String value1 = (String) table.getValueAt(row, 0);
        int value2 = (int) table_seller.getValueAt(row, 1);
        //String value3 = (String) table.getValueAt(row, 2);
        String value4 = (String) table_seller.getValueAt(row, 3);
        try{
            Statement stmt=conn.createStatement();

            stmt.executeUpdate("update purchase set payment_status = "+"'"+value4+"'"+"where purchase_id = "+value2);
            stmt.executeQuery("commit");

            JOptionPane.showMessageDialog(null,"Details successfully updated!");

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
        Payment payment = new Payment(b,a);
        payment.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // TODO add your handling code here:
         int row = table_buyer.getSelectedRow();
        //String value1 = (String) table.getValueAt(row, 0);
        int value2 = (int) table_buyer.getValueAt(row, 1);
        //String value3 = (String) table.getValueAt(row, 2);
        String value4 = (String) table_buyer.getValueAt(row, 3);
        try{
            Statement stmt=conn.createStatement();

            stmt.executeUpdate("update billing set payment_status = "+"'"+value4+"'"+"where billing_id = "+value2);
            stmt.executeQuery("commit");

            JOptionPane.showMessageDialog(null,"Details successfully updated!");

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error!");
        }
        Payment payment = new Payment(b,a);
        payment.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_update1ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
    class User{
       private int seller_id, purchase_id, payment;
       private String payment_status;
       
       public User(int seller_id, int purchase_id, int payment, String payment_status){
           this.seller_id = seller_id;
           this.purchase_id = purchase_id;
           this.payment = payment;
           this.payment_status = payment_status;
       }
       
       public int getseller_id(){
           return seller_id;
       }
       public int getpurchase_id(){
           return purchase_id;
       }
       public int getpayment(){
           return payment;
       }
       public String getpayment_status(){
           return payment_status;
       }
    }
    class User1{
       private int customer_id, billing_id, payment;
       private String payment_status;
       
       public User1(int customer_id, int billing_id, int payment, String payment_status){
           this.customer_id = customer_id;
           this.billing_id = billing_id;
           this.payment = payment;
           this.payment_status = payment_status;
       }
       
       public int getcustomer_id(){
           return customer_id;
       }
       public int getbilling_id(){
           return billing_id;
       }
       public int getpayment(){
           return payment;
       }
       public String getpayment_status(){
           return payment_status;
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout;
    private javax.swing.JTable table_buyer;
    private javax.swing.JLabel table_buyer_status;
    private javax.swing.JTable table_seller;
    private javax.swing.JLabel table_seller_status;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
}
