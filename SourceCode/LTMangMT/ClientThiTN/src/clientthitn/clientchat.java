/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientthitn;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import clientthitn.DataStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import clientthitn.AES;

public class clientchat extends javax.swing.JFrame {

    private Socket client;
    public DataStream dataStream;
    private DataOutputStream dos;
    private DataInputStream dis;
    private Player player;
    String secretKey = "CHAT";

    public clientchat() {

        initComponents();
        setResizable(false);
        setSize(690, 430);
        PhongCho();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        p_chat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msg = new javax.swing.JTextArea();
        p_login = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        online = new javax.swing.JTextArea();
        message = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        btnBXH = new javax.swing.JButton();
        nick = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Thi = new javax.swing.JButton();
        btNhac = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phòng Chờ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        msg.setEditable(false);
        msg.setColumns(20);
        msg.setRows(5);
        jScrollPane1.setViewportView(msg);

        javax.swing.GroupLayout p_chatLayout = new javax.swing.GroupLayout(p_chat);
        p_chat.setLayout(p_chatLayout);
        p_chatLayout.setHorizontalGroup(
            p_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        p_chatLayout.setVerticalGroup(
            p_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        getContentPane().add(p_chat);
        p_chat.setBounds(10, 60, 500, 270);

        online.setEditable(false);
        online.setColumns(20);
        online.setRows(5);
        jScrollPane2.setViewportView(online);

        javax.swing.GroupLayout p_loginLayout = new javax.swing.GroupLayout(p_login);
        p_login.setLayout(p_loginLayout);
        p_loginLayout.setHorizontalGroup(
            p_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_loginLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        p_loginLayout.setVerticalGroup(
            p_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        getContentPane().add(p_login);
        p_login.setBounds(520, 60, 150, 270);
        getContentPane().add(message);
        message.setBounds(10, 340, 380, 50);

        send.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        send.setText("Gửi");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        getContentPane().add(send);
        send.setBounds(400, 340, 90, 50);

        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setText("Xóa");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(500, 340, 70, 50);

        btnBXH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBXH.setText("BXH");
        btnBXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBXHActionPerformed(evt);
            }
        });
        getContentPane().add(btnBXH);
        btnBXH.setBounds(590, 340, 70, 50);
        getContentPane().add(nick);
        nick.setBounds(100, 20, 202, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nick chat");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 79, 30);

        Thi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Thi.setText("Thi");
        Thi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThiActionPerformed(evt);
            }
        });
        getContentPane().add(Thi);
        Thi.setBounds(320, 20, 80, 30);

        btNhac.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNhac.setText("Mở nhạc");
        btNhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhacActionPerformed(evt);
            }
        });
        getContentPane().add(btNhac);
        btNhac.setBounds(410, 20, 79, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Danh Sách online");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 40, 106, 15);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientthitn/taoanhdep--resize.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-6, -6, 690, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void PhongCho() {
        try {
            client = new Socket(thongtinsv.ServerIP, 2107);
            dos = new DataOutputStream(client.getOutputStream());
            dis = new DataInputStream(client.getInputStream());
            if (checkLogin() != false) {
                nick.setEditable(false);
                nick.setText(thongtinsv.masv);
                online.setText(thongtinsv.masv);
                dataStream = new DataStream(this, this.dis);
            } else {
                JOptionPane.showMessageDialog(null, "MÃ SỐ SINH VIÊN ĐÃ TỒN TẠI TRONG PHÒNG CHỜ", "Message Dialog", JOptionPane.WARNING_MESSAGE);
                nick.setEnabled(false);
                online.setEnabled(false);
                message.setEnabled(false);
                btNhac.setEnabled(false);
                btnBXH.setEnabled(false);
                send.setEnabled(false);
                Thi.setEnabled(false);
                clear.setEnabled(false);
                THONGTIN tt = new THONGTIN();
                tt.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "LỖI KẾT NỐI ĐẾN SERVER PHÒNG CHỜ!", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    private void ThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThiActionPerformed

        try {
            dataStream.stopThread();
            exit();
            this.setVisible(false);
            CLIENT_TRACNGHIEM CTN = new CLIENT_TRACNGHIEM();
            CTN.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(clientchat.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(clientchat.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_ThiActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        message.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:

        checkSend(message.getText() + "\n");
        message.setText("");

    }//GEN-LAST:event_sendActionPerformed

    private void btNhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhacActionPerformed
        // TODO add your handling code here:

        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        String DuongDan = "E:\\";
        JFileChooser ThemFileChon = new JFileChooser(DuongDan);
        FileNameExtensionFilter dinhdang = new FileNameExtensionFilter("Excel files", "mp3");
        ThemFileChon.setFileFilter(dinhdang);
        int excelChosser = ThemFileChon.showOpenDialog(null);
        if (excelChosser == JFileChooser.APPROVE_OPTION) {

            try {
                File File = ThemFileChon.getSelectedFile();
                BufferedInputStream bis;
                bis = new BufferedInputStream(new FileInputStream(File));
                player = new Player(bis);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(clientchat.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JavaLayerException ex) {
                Logger.getLogger(clientchat.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        Thread tt = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        tt.start();
    }//GEN-LAST:event_btNhacActionPerformed

    private void btnBXHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBXHActionPerformed
        // TODO add your handling code here:
        BXH b = new BXH();
        b.setVisible(true);
    }//GEN-LAST:event_btnBXHActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        dataStream.stopThread();
        exit();
    }//GEN-LAST:event_formWindowClosing
    private void sendMSG(String data) {
        try {
            data = AES.encrypt(data, secretKey);
            dos.writeUTF(data);
            dos.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "LỖI KẾT NỐI ĐẾN SERVER PHÒNG CHỜ!", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private String getMSG() {
        String data = null;
        try {
            data = dis.readUTF();
            data = AES.decrypt(data, secretKey);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void getMSG(String msg1, String msg2) {
        int stt = Integer.parseInt(msg1);
        switch (stt) {
            // tin nhắn của những người khác
            case 3:
                this.msg.append(msg2);
                break;
            // update danh sách online
            case 4:
                this.online.setText(msg2);
                break;
            // server đóng cửa
            case 5:
                dataStream.stopThread();
                exit();
                break;
            // bổ sung sau
            default:
                break;
        }
    }

    private void checkSend(String msg) {
        if (msg.compareTo("\n") != 0) {
            this.msg.append("Tôi : " + msg);
            sendMSG("1");
            sendMSG(msg);
        }

    }

    private boolean checkLogin() {
        if (thongtinsv.masv.compareTo("") == 0) {
            return false;
        } else if (thongtinsv.masv.compareTo("0") == 0) {
            return false;
        } else {
            sendMSG(thongtinsv.masv);
            int sst = Integer.parseInt(getMSG());
            if (sst == 0) {
                thongtinsv.masv = "";
                thongtinsv.ten = "";
                thongtinsv.sdt = "";
                return false;

            } else {
                return true;
            }
        }
    }

    private void exit() {
        try {
            sendMSG("0");
            dos.close();
            dis.close();
            client.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

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
            java.util.logging.Logger.getLogger(clientchat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientchat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientchat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientchat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientchat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Thi;
    private javax.swing.JButton btNhac;
    private javax.swing.JButton btnBXH;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField message;
    private javax.swing.JTextArea msg;
    private javax.swing.JTextField nick;
    private javax.swing.JTextArea online;
    private javax.swing.JPanel p_chat;
    private javax.swing.JPanel p_login;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables

}
