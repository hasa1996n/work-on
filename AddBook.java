
package Interface;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hasan Merzak
 */


public class AddBook extends javax.swing.JInternalFrame {

    
   
     Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
   
    public AddBook() {
        initComponents();
        conn= DBConnect.connect();
        autoId();
        tablelord();
       
       
        
    }
    
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtbCode = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpub = new javax.swing.JTextArea();
        cmbtype = new javax.swing.JComboBox();
        cmbcategory = new javax.swing.JComboBox();
        datebath = new com.toedter.calendar.JDateChooser();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldetails = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(990, 530));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel15.setText("Books");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 360, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 60));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel5.setText("Book Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel7.setText("B code");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel8.setText("Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel9.setText("Category");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel10.setText("Publisher");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel11.setText("Price");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel13.setText("Book Type");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        txtbid.setEditable(false);
        jPanel1.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, 30));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 30));
        jPanel1.add(txtbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 30));
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 210, 30));

        txtpub.setColumns(20);
        txtpub.setRows(5);
        jScrollPane1.setViewportView(txtpub);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 210, 70));

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "Borrow", "Read Only" }));
        jPanel1.add(cmbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 210, 30));

        cmbcategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select category", "Language", "Technology", "History", "Math", " ", "Other" }));
        jPanel1.add(cmbcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 170, 30));
        jPanel1.add(datebath, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, 30));

        btnadd.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 170, 40));

        btnupdate.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 170, 40));

        btndelete.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, 40));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 210, 190));

        tbldetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbldetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbldetails);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 320, 940, 170));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 940, 230));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 960, 430));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 520));

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

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

         String bid =txtbid.getText();
       String name=txtname.getText();
       String bcode=txtbCode.getText();
       String date=((JTextField)datebath.getDateEditor().getUiComponent()).getText();
       String category=cmbcategory.getSelectedItem().toString();
       String btype=cmbtype.getSelectedItem().toString();
       String pub=txtpub.getText();
       String price=txtprice.getText();
      
       
       
            try {
            
                String sql="INSERT INTO `addbook`(`bid`, `name`, `b_code`, `date`, `category`, `book_type`, `publisher`, `price`, `mark`) VALUES ('"+bid+"','"+name+"','"+bcode+"','"+date+"','"+category+"','"+btype+"','"+pub+"','"+price+"','0')";
            PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
                 JOptionPane.showMessageDialog(rootPane, "Successfully insert");
                
        } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
        }
          clearFild();
            tablelord();
       autoId();
       
      
      
    }//GEN-LAST:event_btnaddActionPerformed

     private void tablelord()
    {
        try {
            String sql="SELECT `bid`, `name`, `b_code`, `date`, `category`, `book_type`, `publisher`, `price` FROM `addbook`";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tbldetails.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
      
    }
    
    private void autoId()
    {
        try {
             String sql="SELECT `bid` FROM `addbook` ORDER BY bid DESC LIMIT 1";
         
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
                String rnno=rs.getString("bid");
                int co=rnno.length();
               String txt= rnno.substring(0, 2);
               String num=rnno.substring(2, co);
               int n=Integer.parseInt(num);
               n++;
               String snum=Integer.toString(n);
               String ftxt=txt+snum;
               txtbid.setText(ftxt);
            
           }
           else
           {
               txtbid.setText("BI1000");
           }
           
                            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
       
    }
    
    private void clearFild()
    {
  //  txtbid.setText("");
    txtname.setText("");
    txtbCode.setText("");
    ((JTextField)datebath.getDateEditor().getUiComponent()).setText("");
    cmbcategory.setSelectedIndex(0);
    cmbtype.setSelectedIndex(0);
    txtpub.setText("");
    txtprice.setText("");
    
    
    }
    
    
    private void tbldetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldetailsMouseClicked
      
         DefaultTableModel tmodel=(DefaultTableModel)tbldetails.getModel();
        int selectrowindex=tbldetails.getSelectedRow();
        
        txtbid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txtname.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        txtbCode.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        ((JTextField)datebath.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 3).toString());
        cmbcategory.setSelectedItem(tmodel.getValueAt(selectrowindex, 4).toString());
        cmbtype.setSelectedItem(tmodel.getValueAt(selectrowindex, 5).toString());
        txtpub.setText(tmodel.getValueAt(selectrowindex, 6).toString());
        txtprice.setText(tmodel.getValueAt(selectrowindex, 7).toString());
        
       
        
        
    }//GEN-LAST:event_tbldetailsMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
      
        String bid =txtbid.getText();
       String name=txtname.getText();
       String bcode=txtbCode.getText();
       String date=((JTextField)datebath.getDateEditor().getUiComponent()).getText();
       String category=cmbcategory.getSelectedItem().toString();
       String btype=cmbtype.getSelectedItem().toString();
       String pub=txtpub.getText();
       String price = txtprice.getText();
        
        try {
            String  sql = "UPDATE `addbook` SET `name`='"+name+"',`b_code`='"+bcode+"',`date`='"+date+"',`category`='"+category+"',`book_type`='"+btype+"',`publisher`='"+pub+"',`price`='"+price+"' WHERE bid='"+bid+"'";
         pst=(PreparedStatement) conn.prepareStatement(sql);
         pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Update success");
            tablelord();
            clearFild();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

           try {
            String sql="DELETE FROM `addbook` WHERE bid='"+txtbid.getText()+"'";
	pst=(PreparedStatement) conn.prepareStatement(sql);
	 pst.execute();
         JOptionPane.showMessageDialog(rootPane, "Delete success");
         tablelord();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        clearFild();
      
        
        
    }//GEN-LAST:event_btndeleteActionPerformed

    
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cmbcategory;
    private javax.swing.JComboBox cmbtype;
    private com.toedter.calendar.JDateChooser datebath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbldetails;
    private javax.swing.JTextField txtbCode;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextArea txtpub;
    // End of variables declaration//GEN-END:variables
}
