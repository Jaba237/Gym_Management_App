package gymhub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author The_AK
 */
public class Members extends javax.swing.JFrame {

    /**
     * Creates new form Members
     */
    public Members() {
        initComponents();
        displayMembers();
        getCoachs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    //My Methodes
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MNameTXT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MPhoneTXT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MAgeTXT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MAmountTXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MAddressTXT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        AddMemberBTN = new javax.swing.JButton();
        EditBTN = new javax.swing.JButton();
        MGenderCB = new javax.swing.JComboBox<>();
        MTimingCB = new javax.swing.JComboBox<>();
        MCoachCB = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        MemberTbl = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymhub/rsrc/icons8-coach-96.png"))); // NOI18N
        jLabel1.setText("Coaches");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymhub/rsrc/4098153.png"))); // NOI18N
        jLabel2.setText("Payments");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymhub/rsrc/icons8-log-out-96.png"))); // NOI18N
        jLabel5.setText("Log Out");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(44, 44, 44))
        );

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

        MNameTXT.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel6.setText("Memeber Name");

        MPhoneTXT.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel7.setText("Phone Number");

        MAgeTXT.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel8.setText("Age");

        MAmountTXT.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel9.setText("Gender");

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel10.setText("Coach");

        MAddressTXT.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel11.setText("Address");

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel12.setText("Timing");

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel13.setText("Amount");

        Delete.setBackground(new java.awt.Color(234, 15, 15));
        Delete.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        Delete.setText("DELETE");
        Delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        AddMemberBTN.setBackground(new java.awt.Color(51, 255, 51));
        AddMemberBTN.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        AddMemberBTN.setText("ADD");
        AddMemberBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        AddMemberBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMemberBTNMouseClicked(evt);
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

        MGenderCB.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        MGenderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        MTimingCB.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        MTimingCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "04:00 - 06:00", "06:00 - 08:00", "08:00 - 10:00", "10:00 - 12:00", "12:00 - 14:00", "14:00 - 16:00", "16:00 - 18:00", "18:00 - 20:00", "20:00 - 22:00" }));

        MCoachCB.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        MCoachCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Members List");

        jTextField1.setText("jTextField1");

        jToggleButton1.setText("jToggleButton1");

        jButton1.setText("jButton1");

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
        jScrollPane3.setViewportView(MemberTbl);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(MNameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(MCoachCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(MPhoneTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MAddressTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(MTimingCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MAgeTXT, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(355, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(MAmountTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(MGenderCB, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AddMemberBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(EditBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MNameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(2, 2, 2)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MAgeTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                    .addComponent(MGenderCB))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MTimingCB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(MAmountTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(12, 12, 12)
                                .addComponent(MCoachCB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MPhoneTXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MAddressTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMemberBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con = null;
    ResultSet rst = null;
    PreparedStatement pst = null;
    Statement st = null;

    
    
    
    private void displayMembers()
    {
        try
        {
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymhubdb","root","");
          st = con.createStatement();
          rst = st.executeQuery("select * from memberstbl");
          


          MemberTbl.setModel(new DbUtils().resultSetToTableModel(rst));
          con.close();  
        }catch(SQLException e)
        {
           e.printStackTrace();
        }   
    }
    
    //Getting the coaches
    
    private void getCoachs(){
        
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymhubdb","root","");
            st = con.createStatement();
            String query =  "select CName from coachtbl";
            rst = st.executeQuery(query);
            while(rst.next())
            {
                MCoachCB.addItem(rst.getString("CName"));
            }
            
            MCoachCB.setSelectedIndex(2);
            
        }catch(Exception e)
        {
        
        
        }
        
    }

    
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Coach().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Login().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Payment().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked
    int Key = 0;
    private void MemberTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberTblMouseClicked
        
        
        DefaultTableModel model = (DefaultTableModel)MemberTbl.getModel();
        int MyIndex = MemberTbl.getSelectedRow();
        Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        MNameTXT.setText(model.getValueAt(MyIndex, 1).toString());
        MPhoneTXT.setText(model.getValueAt(MyIndex, 2).toString());
        MAddressTXT.setText(model.getValueAt(MyIndex, 3).toString());
        MTimingCB.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
        MCoachCB.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
        MAmountTXT.setText(model.getValueAt(MyIndex, 6).toString());
        MAgeTXT.setText(model.getValueAt(MyIndex, 7).toString());
        MGenderCB.setSelectedItem(model.getValueAt(MyIndex, 8).toString()); 

    }//GEN-LAST:event_MemberTblMouseClicked

    private void AddMemberBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMemberBTNMouseClicked
     
        
     if(MNameTXT.getText().isEmpty()|| MPhoneTXT.getText().isEmpty()||MAgeTXT.getText().isEmpty()||MAddressTXT.getText().isEmpty()||MGenderCB.getSelectedIndex()== -1||MTimingCB.getSelectedIndex()== -1||MTimingCB.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(this,"Missing Information");
          
      }else{
            

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymhubdb","root","");
                PreparedStatement Add = con.prepareStatement("insert into MembersTbl(MName, MPhone, MAddress, MTiming, MCoach,MAmount,MAge,MGender) values(?,?,?,?,?,?,?,?)");
                Add.setString(1, MNameTXT.getText());
                Add.setString(2,MPhoneTXT.getText());
                Add.setString(3,MAddressTXT.getText());
                 Add.setString(4, MTimingCB.getSelectedItem().toString());
                  Add.setString(5, MCoachCB.getSelectedItem().toString());
                  Add.setInt(6, Integer.parseInt(MAmountTXT.getText()));
                Add.setInt(7, Integer.parseInt(MAgeTXT.getText()));
                Add.setString(8,MGenderCB.getSelectedItem().toString());

                int row = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Added successfully");
                con.close();
                displayMembers();
                getCoachs();
                
                
                
            } catch (SQLException ex) {
                
                ex.printStackTrace();
                
                 JOptionPane.showMessageDialog(this,"Unable to add members 😐😑😐😑");
            }
            MNameTXT.setText("");
            MPhoneTXT.setText("");
            MAddressTXT.setText("");
            MGenderCB.setSelectedIndex(1);
            MTimingCB.setSelectedIndex(1);
            MAgeTXT.setText("");
            MAmountTXT.setText("");
        }
    }//GEN-LAST:event_AddMemberBTNMouseClicked

    private void EditBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBTNMouseClicked
             if(MNameTXT.getText().isEmpty()|| MPhoneTXT.getText().isEmpty()||MAgeTXT.getText().isEmpty()||MAddressTXT.getText().isEmpty()||MGenderCB.getSelectedIndex()== -1||MCoachCB.getSelectedIndex()== -1||MTimingCB.getSelectedIndex()==-1||MAmountTXT.getText().isEmpty() || Key==0){
         
            JOptionPane.showMessageDialog(this,"Missing Informations or Member not selected");
          
      }else{
            

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymhubdb","root","");
                PreparedStatement Add = con.prepareStatement("update MembersTbl set MName=?, MPhone=?, MAddress=?, MGender=?, MTiming=?, MAge=?, MAmount=?, MCoach=? where MId=?");
                Add.setString(1, MNameTXT.getText());
                Add.setString(2,MPhoneTXT.getText());
                Add.setString(3,MAddressTXT.getText());
                Add.setString(4,MGenderCB.getSelectedItem().toString());
                Add.setString(5, MTimingCB.getSelectedItem().toString());
                Add.setInt(6, Integer.parseInt(MAgeTXT.getText()));
                 Add.setInt(7, Integer.parseInt(MAmountTXT.getText()));
                Add.setString(8, MCoachCB.getSelectedItem().toString());
                Add.setInt(9,Key);
                	
                
                int row = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Modified successfully");
                con.close();
                displayMembers();
                
                
                
            } catch (SQLException ex) {
                
               ex.printStackTrace();
                
                 JOptionPane.showMessageDialog(this,"Unable to edit coache 😐😑😐😑");
            }
            MNameTXT.setText("");
            MPhoneTXT.setText("");
            MAddressTXT.setText("");
            MGenderCB.setSelectedIndex(1);
            MTimingCB.setSelectedIndex(1);
            MAgeTXT.setText("");
            MAmountTXT.setText("");
            Key = 0;
        }
    }//GEN-LAST:event_EditBTNMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
      
        if(Key==0){
         
            JOptionPane.showMessageDialog(this,"No member was selected");
          
      }else{
            

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymhubdb","root","");
                PreparedStatement Add = con.prepareStatement("delete from memberstbl where MId=?");
                Add.setInt(1,Key);
                int row = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Modified successfully");
                con.close();
                displayMembers();
                
                
                
                
            } catch (SQLException ex) {
                
               ex.printStackTrace();
                
                 JOptionPane.showMessageDialog(this,"Unable to delete member 😐😑😐😑");
            }
            MNameTXT.setText("");
            MPhoneTXT.setText("");
            MAddressTXT.setText("");
            MGenderCB.setSelectedIndex(1);
            MTimingCB.setSelectedIndex(1);
            MAgeTXT.setText("");
            MAmountTXT.setText("");
            Key = 0;
        }
        
    }//GEN-LAST:event_DeleteMouseClicked

    

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
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Members().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMemberBTN;
    private javax.swing.JButton Delete;
    private javax.swing.JButton EditBTN;
    private javax.swing.JTextField MAddressTXT;
    private javax.swing.JTextField MAgeTXT;
    private javax.swing.JTextField MAmountTXT;
    private javax.swing.JComboBox<String> MCoachCB;
    private javax.swing.JComboBox<String> MGenderCB;
    private javax.swing.JTextField MNameTXT;
    private javax.swing.JTextField MPhoneTXT;
    private javax.swing.JComboBox<String> MTimingCB;
    private javax.swing.JTable MemberTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
