
package qlserver;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class QLData extends javax.swing.JFrame {

    /**
     * Creates new form QLCauHoi
     */
    DefaultTableModel Model;
    ConnectDth dbconn = new ConnectDth();
    Connection dbConnection = null;
    int ThemHang = 0;

    public QLData() {
        initComponents();
        setResizable(false);
        setSize(910, 500);
//        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
      
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
        btnExcel = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản Lý Dữ Liệu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btnExcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-30.png"))); // NOI18N
        btnExcel.setText("Xuất ra Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcel);
        btnExcel.setBounds(560, 420, 160, 39);

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delete-30.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa);
        btnXoa.setBounds(450, 420, 100, 39);

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-edit-30.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua);
        btnSua.setBounds(340, 420, 100, 39);

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-30.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem);
        btnThem.setBounds(210, 420, 120, 39);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-find-30.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(67, 14));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 10, 40, 30);

        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFindKeyPressed(evt);
            }
        });
        getContentPane().add(txtFind);
        txtFind.setBounds(320, 10, 288, 30);

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-exit-30.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setPreferredSize(new java.awt.Dimension(69, 26));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat);
        btnThoat.setBounds(778, 11, 120, 40);

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(813, 423, 80, 30);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Quản Lý Câu Hỏi", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("Quản Lý Sinh Viên", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane1.addTab("Quản lý Admin", jScrollPane3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 43, 888, 371);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlserver/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 910, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
         int index = jTabbedPane1.getSelectedIndex();
        if(index == 0){
            Them t = new Them();
            t.setVisible(true);
        }
        else if(index == 2){
            ThemAd ad = new ThemAd();
            ad.setVisible(true);
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int index = jTabbedPane1.getSelectedIndex();
        if (index == 0) {
            SuaCauHoi sch = new SuaCauHoi();
            sch.setVisible(true);
        } else if (index == 1) {
            SuaThongTinSV ssv = new SuaThongTinSV();
            ssv.setVisible(true);
        } else if(index == 2){
            SuaAd ad = new SuaAd();
            ad.setVisible(true);
        }
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int index = jTabbedPane1.getSelectedIndex();
        if (index == 0) {
            XoaCauHoi xch = new XoaCauHoi();
            xch.setVisible(true);
        } else if (index == 1) {
            XoaThongTinSV xsv = new XoaThongTinSV();
            xsv.setVisible(true);
        } else if( index == 2){
            XoaAd ad = new XoaAd();
            ad.setVisible(true);
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Server1 sv = new Server1();
        sv.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        int index = jTabbedPane1.getSelectedIndex();
        Model = (DefaultTableModel) jTable1.getModel();
        Model.setRowCount(0);
        dbConnection = dbconn.getSqlConnection();
        String qlch = "SELECT * FROM BODE";
        String qlsv = "SELECT * FROM SINHVIEN";
        String qlad = "SELECT * FROM TAIKHOAN";
        if (index == 0) {
            btnThem.setVisible(true);
            try {

                PreparedStatement pst = dbConnection.prepareStatement(qlch);
                ResultSet rs = pst.executeQuery();
                jTable1.removeAll();
                String[] arr = {"Câu hỏi", "Trình Độ", "Nội Dung", "A", "B", "C", "D", "Đáp Án"};
                Model = new DefaultTableModel(arr, 0);
                while (rs.next()) {
                    Vector vec = new Vector();
                    vec.add(rs.getInt("CAUHOI"));
                    vec.add(rs.getString("TRINHDO"));
                    vec.add(rs.getString("NOIDUNG"));
                    vec.add(rs.getString("A"));
                    vec.add(rs.getString("B"));
                    vec.add(rs.getString("C"));
                    vec.add(rs.getString("D"));
                    vec.add(rs.getString("DAP_AN"));
                    Model.addRow(vec);
                }

                jTable1.setModel(Model);
            } catch (SQLException ex) {
                Logger.getLogger(QLData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (index == 1) {
            btnThem.setVisible(false);
            try {
                PreparedStatement pst = dbConnection.prepareStatement(qlsv);
                ResultSet rs = pst.executeQuery();
                jTable2.removeAll();
                String[] arr = {"MSSV", "Họ Tên", "Số Điện Thoại", "Điểm", "Ngày Thi"};
                Model = new DefaultTableModel(arr, 0);
                while (rs.next()) {

                    Vector vec = new Vector();
                    vec.add(rs.getString("MASV"));
                    vec.add(rs.getString("HOTEN"));
                    vec.add(rs.getString("SODIENTHOAI"));
                    vec.add(rs.getFloat("DIEM"));
                    vec.add(rs.getString("NGAYTHI"));
                    Model.addRow(vec);
                }

                jTable2.setModel(Model);
            } catch (SQLException ex) {
                Logger.getLogger(QLData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(index == 2){          
            btnThem.setVisible(true);
            try {
                PreparedStatement pst = dbConnection.prepareStatement(qlad);
                ResultSet rs = pst.executeQuery();
                jTable3.removeAll();
                String[] arr = {"Tên tài khoản", "Mật khẩu"};
                Model = new DefaultTableModel(arr, 0);
                while (rs.next()) {

                    Vector vec = new Vector();
                    vec.add(rs.getString("Username"));
                    vec.add(rs.getString("Password"));
                    Model.addRow(vec);
                }

                jTable3.setModel(Model);
            } catch (SQLException ex) {
                Logger.getLogger(QLData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void txtFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyPressed
        // TODO add your handling code here:
        int index = jTabbedPane1.getSelectedIndex();
        String qlch = "SELECT * FROM BODE WHERE NOIDUNG LIKE '%" + txtFind.getText() + "%'";
        String qlsv = "SELECT * FROM SINHVIEN WHERE HOTEN LIKE '%" + txtFind.getText() + "%'";
        String qlad = "SELECT * FROM TAIKHOAN WHERE Username LIKE '%" + txtFind.getText() + "%'";
        if (index == 0) {
            try {

                PreparedStatement pst = dbConnection.prepareStatement(qlch);
                ResultSet rs = pst.executeQuery();
                jTable1.removeAll();
                String[] arr = {"Câu hỏi", "Trình Độ", "Nội Dung", "A", "B", "C", "D", "Đáp Án"};
                Model = new DefaultTableModel(arr, 0);
                while (rs.next()) {
                    Vector vec = new Vector();
                    vec.add(rs.getInt("CAUHOI"));
                    vec.add(rs.getString("TRINHDO"));
                    vec.add(rs.getString("NOIDUNG"));
                    vec.add(rs.getString("A"));
                    vec.add(rs.getString("B"));
                    vec.add(rs.getString("C"));
                    vec.add(rs.getString("D"));
                    vec.add(rs.getString("DAP_AN"));
                    Model.addRow(vec);
                }

                jTable1.setModel(Model);
            } catch (SQLException ex) {
                Logger.getLogger(QLData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (index == 1) {
            try {
                PreparedStatement pst = dbConnection.prepareStatement(qlsv);
                ResultSet rs = pst.executeQuery();
                jTable2.removeAll();
                String[] arr = {"MSSV", "Họ Tên", "Số Điện Thoại", "Điểm", "Ngày Thi"};
                Model = new DefaultTableModel(arr, 0);
                while (rs.next()) {

                    Vector vec = new Vector();
                    vec.add(rs.getString("MASV"));
                    vec.add(rs.getString("HOTEN"));
                    vec.add(rs.getString("SODIENTHOAI"));
                    vec.add(rs.getFloat("DIEM"));
                    vec.add(rs.getString("NGAYTHI"));
                    Model.addRow(vec);
                }

                jTable2.setModel(Model);
            } catch (SQLException ex) {
                Logger.getLogger(QLData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(index == 2){          
            btnThem.setVisible(true);
            
            try {
                PreparedStatement pst = dbConnection.prepareStatement(qlad);
                ResultSet rs = pst.executeQuery();
                jTable3.removeAll();
                String[] arr = {"Tên tài khoản", "Mật khẩu"};
                Model = new DefaultTableModel(arr, 0);
                while (rs.next()) {

                    Vector vec = new Vector();
                    vec.add(rs.getString("Username"));
                    vec.add(rs.getString("Password"));
                    Model.addRow(vec);
                }

                jTable3.setModel(Model);
            } catch (SQLException ex) {
                Logger.getLogger(QLData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_txtFindKeyPressed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = (Connection) dbconn.getSqlConnection();
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from SINHVIEN");
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("SINHVIEN");
            XSSFRow row = spreadsheet.createRow(1);
            XSSFCell cell;
            cell = row.createCell(0);
            cell.setCellValue("MASV");
            cell = row.createCell(1);
            cell.setCellValue("HOTEN");
            cell = row.createCell(2);
            cell.setCellValue("SODIENTHOAI");
            cell = row.createCell(3);
            cell.setCellValue("DIEM");
            cell = row.createCell(4);
            cell.setCellValue("NGAYTHI");
            int i = 2;
            while (resultSet.next()) {
                row = spreadsheet.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(resultSet.getString("MASV"));
                cell = row.createCell(1);
                cell.setCellValue(resultSet.getString("HOTEN"));
                cell = row.createCell(2);
                cell.setCellValue(resultSet.getString("SODIENTHOAI"));
                cell = row.createCell(3);
                cell.setCellValue(resultSet.getFloat("DIEM"));
                cell = row.createCell(4);
                cell.setCellValue(resultSet.getString("NGAYTHI"));
                i++;
            }

            resultSet = stmt.executeQuery("select * from BODE");
            XSSFSheet spreadsheet1 = workbook.createSheet("BODE");
            row = spreadsheet1.createRow(1);
            cell = row.createCell(0);
            cell.setCellValue("CAUHOI");
            cell = row.createCell(1);
            cell.setCellValue("TRINHDO");
            cell = row.createCell(2);
            cell.setCellValue("NOIDUNG");
            cell = row.createCell(3);
            cell.setCellValue("A");
            cell = row.createCell(4);
            cell.setCellValue("B");
            cell = row.createCell(5);
            cell.setCellValue("C");
            cell = row.createCell(6);
            cell.setCellValue("D");
            cell = row.createCell(7);
            cell.setCellValue("DAP_AN");
            int j = 2;
            while (resultSet.next()) {
                row = spreadsheet1.createRow(j);
                cell = row.createCell(0);
                cell.setCellValue(resultSet.getString("CAUHOI"));
                cell = row.createCell(1);
                cell.setCellValue(resultSet.getString("TRINHDO"));
                cell = row.createCell(2);
                cell.setCellValue(resultSet.getString("NOIDUNG"));
                cell = row.createCell(3);
                cell.setCellValue(resultSet.getString("A"));
                cell = row.createCell(4);
                cell.setCellValue(resultSet.getString("B"));
                cell = row.createCell(5);
                cell.setCellValue(resultSet.getString("C"));
                cell = row.createCell(6);
                cell.setCellValue(resultSet.getString("D"));
                cell = row.createCell(7);
                cell.setCellValue(resultSet.getString("DAP_AN"));
                j++;
            }
            FileOutputStream out = new FileOutputStream(new File("ThiTN.xlsx"));
            workbook.write(out);
            out.close();
            JOptionPane.showMessageDialog(null, "XUẤT FILE EXCEL THÀNH CÔNG","Information",JOptionPane.INFORMATION_MESSAGE);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnExcelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int index = jTabbedPane1.getSelectedIndex();
        Model = (DefaultTableModel) jTable1.getModel();
        Model.setRowCount(0);
        dbConnection = dbconn.getSqlConnection();
        String qlch = "SELECT * FROM BODE";
        String qlsv = "SELECT * FROM SINHVIEN";
        String qlad = "SELECT * FROM TAIKHOAN";
        if (index == 0) {
            btnThem.setVisible(true);
            txtFind.setText("");
            try {
                
                PreparedStatement pst = dbConnection.prepareStatement(qlch);
                ResultSet rs = pst.executeQuery();
                jTable1.removeAll();
                String[] arr = {"Câu hỏi", "Trình Độ", "Nội Dung", "A", "B", "C", "D", "Đáp Án"};
                Model = new DefaultTableModel(arr, 0);
                while (rs.next()) {
                    Vector vec = new Vector();
                    vec.add(rs.getInt("CAUHOI"));
                    vec.add(rs.getString("TRINHDO"));
                    vec.add(rs.getString("NOIDUNG"));
                    vec.add(rs.getString("A"));
                    vec.add(rs.getString("B"));
                    vec.add(rs.getString("C"));
                    vec.add(rs.getString("D"));
                    vec.add(rs.getString("DAP_AN"));
                    Model.addRow(vec);
                }

                jTable1.setModel(Model);
            } catch (SQLException ex) {
                Logger.getLogger(QLData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (index == 1) {
            btnThem.setVisible(false);
            txtFind.setText("");
            try {
                PreparedStatement pst = dbConnection.prepareStatement(qlsv);
                ResultSet rs = pst.executeQuery();
                jTable2.removeAll();
                String[] arr = {"MSSV", "Họ Tên", "Số Điện Thoại", "Điểm", "Ngày Thi"};
                Model = new DefaultTableModel(arr, 0);
                while (rs.next()) {

                    Vector vec = new Vector();
                    vec.add(rs.getString("MASV"));
                    vec.add(rs.getString("HOTEN"));
                    vec.add(rs.getString("SODIENTHOAI"));
                    vec.add(rs.getFloat("DIEM"));
                    vec.add(rs.getString("NGAYTHI"));
                    Model.addRow(vec);
                }

                jTable2.setModel(Model);
            } catch (SQLException ex) {
                Logger.getLogger(QLData.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(index == 2){          
            btnThem.setVisible(true);
            txtFind.setText("");
            try {
                PreparedStatement pst = dbConnection.prepareStatement(qlad);
                ResultSet rs = pst.executeQuery();
                jTable3.removeAll();
                String[] arr = {"Tên tài khoản", "Mật khẩu"};
                Model = new DefaultTableModel(arr, 0);
                while (rs.next()) {

                    Vector vec = new Vector();
                    vec.add(rs.getString("Username"));
                    vec.add(rs.getString("Password"));
                    Model.addRow(vec);
                }

                jTable3.setModel(Model);
            } catch (SQLException ex) {
                Logger.getLogger(QLData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
}
