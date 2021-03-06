/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author dell
 */
public class Teacher extends javax.swing.JFrame {
String imgpath;
    /**
     * Creates new form Teacher
     */
    public Teacher() {
        initComponents();
        setDefaultImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        teacherid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        street = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        searchbyname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        teacherimg = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        telephone = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Teacher");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Teacher ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel5.setText("Date Of Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel1.add(teacherid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 104, -1));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, -1));

        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel7.setText("No");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 133, -1));

        jLabel8.setText("Street");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));
        jPanel1.add(street, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 137, -1));

        jLabel9.setText("City");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 157, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setText("Save Teacher");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 120, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.setText("Update Teacher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 120, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(0, 255, 255));
        jButton4.setText("Search Teacher by ID");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(0, 255, 255));
        jButton5.setText("Print View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(0, 255, 255));
        jButton6.setText("Load All Teachers");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 153, -1));

        searchbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbynameActionPerformed(evt);
            }
        });
        searchbyname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbynameKeyReleased(evt);
            }
        });
        jPanel1.add(searchbyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 210, -1));

        jLabel10.setText("Search by Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setForeground(new java.awt.Color(0, 255, 255));
        jButton7.setText("All Teacher report");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 186, -1));

        teacherimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(teacherimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 130, 140));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(0, 255, 255));
        jButton8.setText("Browse");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        jLabel12.setText("Telephone");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel13.setText("Mobile");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel14.setText("Email");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 199, -1));
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 199, -1));
        jPanel1.add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 199, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Telephone", "Mobile Phone"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(selectedRow, 0).toString();
        try {
            ResultSet rs = DB.search("select * from teacher where teacherid='"+id+"'");
            if (rs.next()) {
                teacherid.setText(rs.getString("teacherid"));
                fname.setText(rs.getString("fname"));
                lname.setText(rs.getString("lname"));
                jDateChooser1.setDate(rs.getDate("dob"));
                no.setText(rs.getString("no"));
                city.setText(rs.getString("city"));
                street.setText(rs.getString("street"));
                telephone.setText(rs.getString("tp"));
                mobile.setText(rs.getString("mp"));
                email.setText(rs.getString("email"));
                imgpath=rs.getString("imgurl");
                File f = new File(imgpath);
                Image img = ImageIO.read(f);
                img = img.getScaledInstance(teacherimg.getWidth(),
                    teacherimg.getHeight(), Image.SCALE_SMOOTH);
                teacherimg.setIcon(new ImageIcon(img));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        MainPanel m=new MainPanel();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ResultSet rs = stm_1_0.DB.search("select count(teacherid) as x from teacher");
            if (rs.next()) {
                int count = rs.getInt("x");
                ++count;
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

                String id = "TC" + sdf.format(d) + count;
                teacherid.setText(id);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            JFileChooser jf = new JFileChooser();
            int i = jf.showOpenDialog(this);;
            if (i == jf.APPROVE_OPTION) {
                File f = jf.getSelectedFile();
                String path = f.getAbsolutePath();
                imgpath = path.replace("\\", "/");
                f = new File(imgpath);
                Image img = ImageIO.read(f);
                img = img.getScaledInstance(teacherimg.getWidth(), teacherimg.getHeight(), Image.SCALE_SMOOTH);
                teacherimg.setIcon(new ImageIcon(img));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Date d=jDateChooser1.getDate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String dob=sdf.format(d);
            DB.iud("insert into teacher values('"+teacherid.getText()+"','"+fname.getText()+"','"+lname.getText()+"','"+dob+"','"+no.getText()+"','"+street.getText()+"','"+city.getText()+"','"+telephone.getText()+"','"+mobile.getText()+"','"+email.getText()+"','"+imgpath+"')");
            clearField();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Date d=jDateChooser1.getDate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String dob=sdf.format(d);
            DB.iud("update teacher set "
                    + "fname='"+fname.getText()+"',"
                    + "lname='"+lname.getText()+"',"
                    + "dob='"+dob+"',"
                    + "no='"+no.getText()+"',"
                    + "street='"+street.getText()+"',"
                    + "city='"+city.getText()+"',"
                    + "tp='"+telephone.getText()+"',"
                    + "mp='"+mobile.getText()+"',"
                    + "email='"+email.getText()+"',"
                    + "imgurl='"+imgpath+"' "
                    + "where teacherid='"+teacherid.getText()+"'");
            clearField();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
            ResultSet rs = DB.search("select * from teacher where teacherid='"+teacherid.getText()+"'");
            if (rs.next()) {
                fname.setText(rs.getString("fname"));
                lname.setText(rs.getString("lname"));
                jDateChooser1.setDate(rs.getDate("dob"));
                no.setText(rs.getString("no"));
                city.setText(rs.getString("city"));
                street.setText(rs.getString("street"));
                telephone.setText(rs.getString("tp"));
                mobile.setText(rs.getString("mp"));
                email.setText(rs.getString("email"));
                imgpath=rs.getString("imgurl");
                File f = new File(imgpath);
                Image img = ImageIO.read(f);
                img = img.getScaledInstance(teacherimg.getWidth(),
                        teacherimg.getHeight(), Image.SCALE_SMOOTH);
                teacherimg.setIcon(new ImageIcon(img));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            
            String path="C:/stmreport/student.jrxml";
            JasperReport cmpr = JasperCompileManager.compileReport(path);
            Map<String,Object> m=new HashMap<>();
            m.put("stid", teacherid.getText());
            
            JasperPrint fr = JasperFillManager.fillReport(cmpr, m, DB.getDBcon());
            JasperViewer.viewReport(fr, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String path="C:/stmreport/allstudent.jrxml";
            JasperReport cmpr = JasperCompileManager.compileReport(path);
            JasperPrint fr = JasperFillManager.fillReport(cmpr, null, DB.getDBcon());
            JasperViewer.viewReport(fr,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            ResultSet rs = DB.search("select * from teacher");
            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("teacherid"));
                v.add(rs.getString("fname"));
                v.add(rs.getString("lname"));
                v.add(rs.getString("tp"));
                v.add(rs.getString("mp"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void searchbynameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbynameKeyReleased
        try {
            ResultSet rs = stm_1_0.DB.search("select * from teacher where fname like '"+searchbyname.getText()+"%'");
            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("teacherid"));
                v.add(rs.getString("fname"));
                v.add(rs.getString("lname"));
                v.add(rs.getString("tp"));
                v.add(rs.getString("mp"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchbynameKeyReleased

    private void searchbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbynameActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField city;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField no;
    private javax.swing.JTextField searchbyname;
    private javax.swing.JTextField street;
    private javax.swing.JTextField teacherid;
    private javax.swing.JLabel teacherimg;
    private javax.swing.JTextField telephone;
    // End of variables declaration//GEN-END:variables
private void setDefaultImage() {
        try {
            URL resource = getClass().getResource("/img/defimg.png");
            Image img = ImageIO.read(resource);
            img = img.getScaledInstance(teacherimg.getWidth(),
                    teacherimg.getHeight(), Image.SCALE_SMOOTH);
            teacherimg.setIcon(new ImageIcon(img));
        } catch (Exception e) {
        }
    }

    private void clearField() {
        teacherid.setText(null);
        fname.setText(null);
        lname.setText(null);
        jDateChooser1.setDate(null);
        no.setText(null);
        street.setText(null);
        city.setText(null);
        telephone.setText(null);
        mobile.setText(null);
        email.setText(null);
        setDefaultImage();
    }}
