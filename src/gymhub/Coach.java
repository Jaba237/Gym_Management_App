/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymhub;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;







/**
 *
 * @author The_AK
 */
public class Coach extends javax.swing.JFrame {

    /**
     * Creates new form Coach
     */
    public Coach() {
        initComponents();
        displayCoach();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CNameTXT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CAddressTXT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DeleteBTN = new javax.swing.JButton();
        AddBTN = new javax.swing.JButton();
        EditBTN = new javax.swing.JButton();
        CGender = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemberTbl = new javax.swing.JTable();
        CPhoneTXT = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        MemberLb = new javax.swing.JLabel();
        PaymentLb = new javax.swing.JLabel();
        LogOutLB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GymHub");

        CNameTXT.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel6.setText("Coach Name");

        CAge.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel7.setText("Phone Number");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel9.setText("Gender");

        CAddressTXT.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel11.setText("Address");

        DeleteBTN.setBackground(new java.awt.Color(234, 15, 15));
        DeleteBTN.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        DeleteBTN.setText("DELETE");
        DeleteBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        DeleteBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBTNMouseClicked(evt);
            }
        });

        AddBTN.setBackground(new java.awt.Color(51, 255, 51));
        AddBTN.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        AddBTN.setText("ADD");
        AddBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });

        EditBTN.setBackground(new java.awt.Color(255, 255, 102));
        EditBTN.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        EditBTN.setText("EDIT");
        EditBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        EditBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBTNMouseClicked(evt);
            }
        });

        CGender.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        CGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Coach List");

        MemberTbl.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        MemberTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MemberTbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        MemberTbl.setFocusable(false);
        MemberTbl.setGridColor(new java.awt.Color(255, 255, 255));
        MemberTbl.setMinimumSize(new java.awt.Dimension(100, 80));
        MemberTbl.setRowHeight(25);
        MemberTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MemberTbl);

        CPhoneTXT.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(CNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(CAddressTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CPhoneTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(CAge)
                            .addComponent(CGender, 0, 132, Short.MAX_VALUE))
                        .addContainerGap(197, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AddBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(EditBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CAge, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CPhoneTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CGender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CAddressTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        MemberLb.setBackground(new java.awt.Color(255, 255, 255));
        MemberLb.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        MemberLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MemberLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymhub/rsrc/group.png"))); // NOI18N
        MemberLb.setText("Members");
        MemberLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberLbMouseClicked(evt);
            }
        });

        PaymentLb.setBackground(new java.awt.Color(255, 255, 255));
        PaymentLb.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        PaymentLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PaymentLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymhub/rsrc/4098153.png"))); // NOI18N
        PaymentLb.setText("Payments");
        PaymentLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymentLbMouseClicked(evt);
            }
        });

        LogOutLB.setBackground(new java.awt.Color(255, 255, 255));
        LogOutLB.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        LogOutLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogOutLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymhub/rsrc/icons8-log-out-96.png"))); // NOI18N
        LogOutLB.setText("Log Out");
        LogOutLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutLBMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymhub/rsrc/icons8-treadmill-96.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PaymentLb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LogOutLB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                            .addComponent(MemberLb)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(79, 79, 79)
                .addComponent(MemberLb)
                .addGap(18, 18, 18)
                .addComponent(PaymentLb)
                .addGap(30, 30, 30)
                .addComponent(LogOutLB)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Handling connection to the database
    
    Connection con = null;
    ResultSet rst = null;
    PreparedStatement pst = null;
    Statement st = null;

    
    
    
    private void displayCoach()
    {
        try
        {
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymhubdb","root","");
          st = con.createStatement();
          rst = st.executeQuery("select * from coachtbl");
          ResultSet rst = st.executeQuery("select * from coachtbl");


          MemberTbl.setModel(new DbUtils().resultSetToTableModel(rst));
          con.close();  
        }catch(SQLException e)
        {
            
        }   
    }

    
    
    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTNActionPerformed
      
        if(CNameTXT.getText().isEmpty()|| CPhoneTXT.getText().isEmpty()||CAge.getText().isEmpty()||CAddressTXT.getText().isEmpty()||CGender.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(this,"Missing Information");
          
      }else{
            

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymhubdb","root","");
                PreparedStatement Add = con.prepareStatement("insert into CoachTbl(CName, CPhone, CAddress, CGender,CAge) values(?,?,?,?,?)");
                Add.setString(1, CNameTXT.getText());
                Add.setString(2,CPhoneTXT.getText());
                Add.setString(3,CAddressTXT.getText());
                Add.setString(4, CGender.getSelectedItem().toString());
                Add.setInt(5, Integer.parseInt(CAge.getText()));
                
                int row = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Added successfully");
                con.close();
                displayCoach();
                
                
                
            } catch (SQLException ex) {
                
                ex.printStackTrace();
                
                 JOptionPane.showMessageDialog(this,"Unable to add coache 😐😑😐😑");
            }
            CNameTXT.setText("");
            CPhoneTXT.setText("");
            CAddressTXT.setText("");
            CGender.setSelectedItem(null);
            CAge.setText("");
        }

    }//GEN-LAST:event_AddBTNActionPerformed
////
    private void MemberLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberLbMouseClicked
        new Members().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MemberLbMouseClicked

    private void LogOutLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutLBMouseClicked
        new Members().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutLBMouseClicked

    private void PaymentLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentLbMouseClicked
        new Payment().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentLbMouseClicked

    private void DeleteBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBTNMouseClicked
       
        if(Key == 0){
            JOptionPane.showMessageDialog(this,"Select before you press this button ");
          
      }else{
            

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymhubdb","root","");
                //PreparedStatement Add = con.prepareStatement("insert into CoachTbl(CName, CPhone, CAddress, CGender,CAge) values(?,?,?,?,?)");
                st = con.createStatement();
                st.executeUpdate("delete from coachtbl where CId="+Key);
                 JOptionPane.showMessageDialog(this,"Coach deleted successfully");
                con.close();
                displayCoach();
                
                
                
            } catch (SQLException ex) {
                
                ex.printStackTrace();
                
                 JOptionPane.showMessageDialog(this,"Unable to Delete coache 😐😑😐😑");
            }
            CNameTXT.setText("");
            CPhoneTXT.setText("");
            CAddressTXT.setText("");
            CGender.setSelectedItem(null);
            CAge.setText("");
        }
        
    }//GEN-LAST:event_DeleteBTNMouseClicked
    int Key;
    private void MemberTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberTblMouseClicked
        DefaultTableModel model = (DefaultTableModel)MemberTbl.getModel();
        int MyIndex = MemberTbl.getSelectedRow();
        Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        CNameTXT.setText(model.getValueAt(MyIndex, 1).toString());
        CPhoneTXT.setText(model.getValueAt(MyIndex, 2).toString());
        CAddressTXT.setText(model.getValueAt(MyIndex, 3).toString());
        CGender.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
        CAge.setText(model.getValueAt(MyIndex, 5).toString());    
        
    }//GEN-LAST:event_MemberTblMouseClicked

    private void EditBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBTNMouseClicked
     if(CNameTXT.getText().isEmpty()|| CPhoneTXT.getText().isEmpty()||CAge.getText().isEmpty()||CAddressTXT.getText().isEmpty()||CGender.getSelectedIndex()== -1 || Key==0){
         
            JOptionPane.showMessageDialog(this,"Missing Informations or Coach not selected");
          
      }else{
            

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymhubdb","root","");
                PreparedStatement Add = con.prepareStatement("update CoachTbl set CName=?, CPhone=?, CAddress=?, CGender=?,CAge=? where CId=?");
                Add.setString(1, CNameTXT.getText());
                Add.setString(2,CPhoneTXT.getText());
                Add.setString(3,CAddressTXT.getText());
                Add.setString(4, CGender.getSelectedItem().toString());
                Add.setInt(5, Integer.parseInt(CAge.getText()));
                Add.setInt(6,Key);
                
                int row = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Modified successfully");
                con.close();
                displayCoach();
                
                
                
            } catch (SQLException ex) {
                
               ex.printStackTrace();
                
                 JOptionPane.showMessageDialog(this,"Unable to edit coache 😐😑😐😑");
            }
            CNameTXT.setText("");
            CPhoneTXT.setText("");
            CAddressTXT.setText("");
            CGender.setSelectedItem(null);
            CAge.setText("");
        }
    }//GEN-LAST:event_EditBTNMouseClicked

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
            java.util.logging.Logger.getLogger(Coach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JTextField CAddressTXT;
    private javax.swing.JTextField CAge;
    private javax.swing.JComboBox<String> CGender;
    private javax.swing.JTextField CNameTXT;
    private javax.swing.JTextField CPhoneTXT;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton EditBTN;
    private javax.swing.JLabel LogOutLB;
    private javax.swing.JLabel MemberLb;
    private javax.swing.JTable MemberTbl;
    private javax.swing.JLabel PaymentLb;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
