package Interface;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
/**
 *
 * @author Hasan Merzak
 */

public class Borrow extends javax.swing.JInternalFrame {

    
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Borrow() {
        initComponents();
        conn=DBConnect.connect();
        autoId();
        
        LocalDate today=LocalDate.now();
       
        txtidate.setText(today.toString());
        
         LocalDate reday=today.plus(30, ChronoUnit.DAYS);
       //  String rd = txtmtype.getText();
       //  if ("Student".equals(rd)){
        
      //  txtredate.setText(reday.toString());
       //  }
        tablelord();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtmid = new javax.swing.JTextField();
        txtmname = new javax.swing.JTextField();
        txtmtype = new javax.swing.JTextField();
        txtbid = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        txtbtype = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtrno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbllend = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtidate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtredate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(850, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel7.setText("Member ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel8.setText("Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel9.setText("Member Type");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel10.setText("Book ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel11.setText("Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel12.setText("Type");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        txtmid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtmid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmidKeyReleased(evt);
            }
        });
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, -1));

        txtmname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 130, -1));

        txtmtype.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(txtmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, -1));

        txtbid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtbid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbidKeyReleased(evt);
            }
        });
        jPanel1.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 140, -1));

        txtbname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 140, -1));

        txtbtype.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(txtbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 140, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 290, 200));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 200));

        txtrno.setEditable(false);
        txtrno.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        txtrno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 170, 40));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 170, 60));

        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jButton2.setText("Issue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 170, 60));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 190, 260));

        tbllend.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbllend);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 770, 130));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 790, 150));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel14.setText("Issue Date");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txtidate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidateActionPerformed(evt);
            }
        });
        jPanel1.add(txtidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 150, -1));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel15.setText("Return Date");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        txtredate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtredate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 150, -1));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 590, 50));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 440));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 460));

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

    
    private void autoId()
    {
        try {
             String sql="SELECT `record_no` FROM `bookLend` ORDER BY record_no DESC LIMIT 1";
         
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
                String rnno=rs.getString("record_no");
                int co=rnno.length();
               String txt= rnno.substring(0, 2);
               String num=rnno.substring(2, co);
               int n=Integer.parseInt(num);
               n++;
               String snum=Integer.toString(n);
               String ftxt=txt+snum;
               txtrno.setText(ftxt);
            
           }
           else
           {
               txtrno.setText("RN1000");
           }
           
                            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
       
    }
    
    
    
    private void txtidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidateActionPerformed

    private void txtmidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmidKeyReleased
     
        
         try {
             String sql="SELECT `name`, `type` FROM `addmember` WHERE mid='"+txtmid.getText()+"'";
         
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
               txtmname.setText(rs.getString("name"));
               txtmtype.setText(rs.getString("type"));
               
                if("Student".equals(rs.getString("type"))){
                     LocalDate today=LocalDate.now();
                    LocalDate reday=today.plus(30, ChronoUnit.DAYS);
                    txtredate.setText(reday.toString());
                    
                } else if("Teacher".equals(rs.getString("type"))){
                
                LocalDate today=LocalDate.now();
                    LocalDate reday=today.plus(60, ChronoUnit.DAYS);
                    txtredate.setText(reday.toString());
                
                }
               
              
           }
           else
           {
           txtmname.setText("");
           txtmtype.setText("");
           }
           
          
        
         }  
         catch(Exception e)
         {
         JOptionPane.showMessageDialog(rootPane, e);
         }
    }//GEN-LAST:event_txtmidKeyReleased

    private void txtbidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbidKeyReleased
       
        
         try {
             String sql="SELECT `name`, `book_type` FROM `addbook` WHERE bid='"+txtbid.getText()+"'";
         
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
               txtbname.setText(rs.getString("name"));
               txtbtype.setText(rs.getString("book_type"));
           }
           else
           {
           txtbname.setText("");
           txtbtype.setText("");
           }
          
        
         }  
         catch(Exception e)
         {
         JOptionPane.showMessageDialog(rootPane, e);
         }
        
    }//GEN-LAST:event_txtbidKeyReleased

    
      private void tablelord()
    {
        try {
            String sql="SELECT `record_no`, `mid`, `bid`, `i_date`, `r_date` FROM `booklend`";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tbllend.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
      
    }
      private void clear()
      {
      txtbid.setText("");
      txtmid.setText("");
      txtbname.setText("");
      txtbtype.setText("");
      txtmname.setText("");
      txtmtype.setText("");
      
      }
    
      private void update()
      {
          
       try {
            String  sql = "UPDATE `addbook` SET `mark`='1' WHERE bid='"+txtbid.getText()+"'";
         pst=(PreparedStatement) conn.prepareStatement(sql);
         pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Update success");
           // tablelord();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
      
     
      }
      
      
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        String rno=txtrno.getText();
        String mid=txtmid.getText();
        String bid=txtbid.getText();
        String idate=txtidate.getText();
        String rdate=txtredate.getText();
        
        if(!"".equals(bid)&&!"".equals(mid)){
         try {
            
                String sql="INSERT INTO `booklend`(`record_no`, `mid`, `bid`, `i_date`, `r_date`,mark) VALUES ('"+rno+"','"+mid+"','"+bid+"','"+idate+"','"+rdate+"','0')";
            PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
                 JOptionPane.showMessageDialog(rootPane, "Successfully insert");
                
        } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
        }
         update();
         tablelord();
         clear();
         autoId();
        }  
        JOptionPane.showMessageDialog(rootPane, "please fill Member ID and Book ID");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       clear();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTable tbllend;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbtype;
    private javax.swing.JTextField txtidate;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtmname;
    private javax.swing.JTextField txtmtype;
    private javax.swing.JTextField txtredate;
    private javax.swing.JTextField txtrno;
    // End of variables declaration//GEN-END:variables
}
