/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientthitn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.Arrays;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;



public class THONGTIN extends javax.swing.JFrame {

    Socket socket;

    public THONGTIN() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);

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
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfMASINHVIEN = new javax.swing.JTextField();
        jtfHOVATEN = new javax.swing.JTextField();
        btnGUI = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfSODIENTHOAI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông Tin Cá Nhân");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientthitn/kekhai.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("THÔNG TIN THÍ SINH");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("HỌ VÀ TÊN:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("MÃ SINH VIÊN:");

        jtfMASINHVIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMASINHVIENActionPerformed(evt);
            }
        });

        btnGUI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGUI.setText("GỬI");
        btnGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUIActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("SỐ ĐIỆN THOẠI:");

        jtfSODIENTHOAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSODIENTHOAIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfHOVATEN, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfSODIENTHOAI, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfMASINHVIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfHOVATEN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMASINHVIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSODIENTHOAI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfMASINHVIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMASINHVIENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMASINHVIENActionPerformed

    private void btnGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUIActionPerformed

        String str = "";
        if (jtfHOVATEN.getText().equals("") || jtfMASINHVIEN.getText().equals("") || jtfSODIENTHOAI.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "VUI LÒNG NHẬP THÔNG TIN ĐẦY ĐỦ ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            if (jtfMASINHVIEN.getText().length() > 10) {
                JOptionPane.showMessageDialog(this, "MÃ SINH VIÊN CHỈ NHẬP 10 KÝ TỰ", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (jtfHOVATEN.getText().equals(thongtinsv.ten) || jtfMASINHVIEN.getText().equals(thongtinsv.masv)) {
                    JOptionPane.showMessageDialog(this, "HỌ TÊN ĐÃ TỒN TẠI", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    str += jtfHOVATEN.getText();
                    str += "///";
                    str += jtfMASINHVIEN.getText();
                    str += "///";
                    str += jtfSODIENTHOAI.getText();
                    str += "///";
                    System.out.println(str);
                    try {

                        socket = new Socket(thongtinsv.ServerIP, 12345);
                        DataInputStream dis = new DataInputStream(socket.getInputStream());
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                        String secretKey = "THONGTIN";
                        str = AES.encrypt(str, secretKey);
                        System.out.println("Mã hóa thông tin" + str);
                        dos.writeUTF(str);
                        String strAthu = dis.readUTF();
                        strAthu = AES.decrypt(strAthu, secretKey);
                        if (strAthu.equals("Success")) {
                            thongtinsv.ten = jtfHOVATEN.getText();
                            thongtinsv.masv = jtfMASINHVIEN.getText();
                            thongtinsv.sdt = jtfSODIENTHOAI.getText();

                            JOptionPane.showMessageDialog(this, "GỬI THÔNG TIN THÀNH CÔNG!", "Information", JOptionPane.INFORMATION_MESSAGE);

                            this.setVisible(false);
                            clientchat cc = new clientchat();
                            cc.setVisible(true);

                            socket.setSoTimeout(10000);
                            socket.close();

                        } else if(strAthu.equals("Fail")){
                            JOptionPane.showMessageDialog(null, " MÃ SINH VIÊN ĐÃ TỒN TẠI!!!", "Information", JOptionPane.INFORMATION_MESSAGE);

                            return;

                        }

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, " LỖI KẾT NỐI TỚI SERVER THÔNG TIN!", "Error", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);

                    }
                }
            }
        }
    }//GEN-LAST:event_btnGUIActionPerformed

    private void jtfSODIENTHOAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSODIENTHOAIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSODIENTHOAIActionPerformed

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
            java.util.logging.Logger.getLogger(THONGTIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(THONGTIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(THONGTIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(THONGTIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new THONGTIN().setVisible(true);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(THONGTIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGUI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtfHOVATEN;
    private javax.swing.JTextField jtfMASINHVIEN;
    private javax.swing.JTextField jtfSODIENTHOAI;
    // End of variables declaration//GEN-END:variables
}
