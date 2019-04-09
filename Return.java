package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Return extends javax.swing.JInternalFrame {

  /**
 *
 * @author Hasan Merzak
 */
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Return() {
        initComponents();
        conn=DBConnect.connect();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtmid = new javax.swing.JTextField();
        txtlateday = new javax.swing.JTextField();
        txtfine = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(850, 500));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel5.setText("Book ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 110, 62, 21);

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel6.setText("Member ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 170, 88, 21);

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel7.setText("Late days");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 230, 76, 21);

        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel8.setText("Fine");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 300, 34, 21);

        txtbid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbidKeyReleased(evt);
            }
        });
        jPanel1.add(txtbid);
        txtbid.setBounds(160, 110, 170, 23);

        txtmid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtmid);
        txtmid.setBounds(160, 170, 170, 23);

        txtlateday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtlateday);
        txtlateday.setBounds(160, 230, 170, 23);

        txtfine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtfine);
        txtfine.setBounds(160, 300, 170, 23);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 60, 320, 300);

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 790, 40);

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(590, 70, 210, 280);

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(580, 60, 230, 300);

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 370, 320, 60);

        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(580, 370, 230, 60);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 810, 440);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 830, 460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 834, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String bid=txtbid.getText();
        String mid=txtmid.getText();
        String ldate=txtlateday.getText();
        String fine=txtfine.getText();
        
         try {
            
                String sql="INSERT INTO `bookreturn`( `bid`, `mid`, `late_days`, `fine`) VALUES ('"+bid+"','"+mid+"','"+ldate+"','"+fine+"')";
            PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
              pst.execute();
            //  String sqll ="DELETE FROM `booklend` WHERE `bid` ='"+bid+"'";
            // PreparedStatement pstt=(PreparedStatement) conn.prepareStatement(sqll);
           // pst.execute();
            deleteFromBLend(bid);  
            update();
            bill();
            retunMark();
                 JOptionPane.showMessageDialog(rootPane, "Successfully insert");
                
        } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bill()
    {
    txtbill.setText("==================="+"\n"
            +" ADANA BTU Library "+"\n"
            +"No of Date\t"+txtlateday.getText()+"\n"
            +"Amount\t"+txtfine.getText()+"\n"
            +"======================"
    );
    
    
    }
    
    
     private void update()
      {
          
       try {
            String  sql = "UPDATE `addbook` SET `mark`='0' WHERE bid='"+txtbid.getText()+"'";
         pst=(PreparedStatement) conn.prepareStatement(sql);
         pst.execute();
         //   JOptionPane.showMessageDialog(rootPane, "Update success");
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
      
     
      }
     
     
     private void deleteFromBLend(String bid)
      {
          
       try {
            String  sql = "DELETE FROM `booklend` WHERE `bid` ='"+bid+"'";
         pst=(PreparedStatement) conn.prepareStatement(sql);
         pst.execute();
         //   JOptionPane.showMessageDialog(rootPane, "Update success");
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
      
     
      }
     
    
      private void retunMark()
      {
          
       try {
            String  sql = "UPDATE `booklend` SET `mark`='1' WHERE bid='"+txtbid.getText()+"'and mark=0'";
         pst=(PreparedStatement) conn.prepareStatement(sql);
         pst.execute();
         //   JOptionPane.showMessageDialog(rootPane, "Update success");
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
      
     
      }
     
    
    private void txtbidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbidKeyReleased
      
         try {
             String sql="SELECT `mid`, `r_date` FROM `booklend` WHERE bid='"+txtbid.getText()+"'";
         
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
                txtmid.setText(rs.getString("mid"));
                String r_date=rs.getString("r_date");
                LocalDate today=LocalDate.now();
                LocalDate rday=LocalDate.parse(r_date);
                
                Long day_gap=ChronoUnit.DAYS.between(rday, today);
                if(day_gap>0)
                {
                txtlateday.setText(day_gap.toString());
                
                long fine=10*day_gap;
                txtfine.setText(String.valueOf(fine));
                }
                else
                {
                txtlateday.setText("0");
                txtfine.setText("0");
                }
            
           }
        
        
    }//GEN-LAST:event_txtbidKeyReleased
                catch(Exception e)
                {


                }
}
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            txtbill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtfine;
    private javax.swing.JTextField txtlateday;
    private javax.swing.JTextField txtmid;
    // End of variables declaration//GEN-END:variables
}
