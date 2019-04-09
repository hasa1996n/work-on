
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
public class AllBooks extends javax.swing.JInternalFrame {

   
    
   Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public AllBooks() {
        initComponents();
        conn=DBConnect.connect();
       
          tablelord();

        
    }
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtsearsh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblallbooks = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(990, 530));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel15.setText("ALL BOOKS");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 360, 40));

        txtsearsh.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        txtsearsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearshActionPerformed(evt);
            }
        });
        txtsearsh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearshKeyReleased(evt);
            }
        });
        jPanel1.add(txtsearsh, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 110, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel4.setText("BOOK NAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 60));

        tblallbooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblallbooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblallbooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblallbooks);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 90, 940, 330));

        jButton1.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, -1, -1));

        jButton2.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 960, 430));

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

    private void tblallbooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblallbooksMouseClicked
      
        
        
        
        
    }//GEN-LAST:event_tblallbooksMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      txtsearsh.setText("");
      tablelord();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsearshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearshActionPerformed
        try {
            String sql="SELECT `bid`, `name`, `b_code`, `date`, `category`, `book_type`, `publisher`, `price` FROM `addbook` where name='%"+txtsearsh.getText()+"%'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblallbooks.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
      
    }//GEN-LAST:event_txtsearshActionPerformed

    private void txtsearshKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearshKeyReleased
        try {
            String sql="SELECT `bid`, `name`, `b_code`, `date`, `category`, `book_type`, `publisher`, `price` FROM `addbook` where name LIKE'%"+txtsearsh.getText()+"%'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblallbooks.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_txtsearshKeyReleased

    
     private void tablelord()
    {
        try {
            String sql="SELECT `bid`, `name`, `b_code`, `date`, `category`, `book_type`, `publisher`, `price` FROM `addbook`";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblallbooks.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
      
    }
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblallbooks;
    private javax.swing.JTextField txtsearsh;
    // End of variables declaration//GEN-END:variables
}
