/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewclient;

import coreclient.ActionType;
import coreclient.ClientManager;
import coreclient.Result;
import coreclient.ResultCode;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author BVCN 88
 */
public class ChatRoomFrm extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form ChatRoomFrm
     */
    ClientManager clientManager;
    String maPhong = "";
    String tenPhong = "";
    HomeFrm homeFrm;
    int soNguoi = 1;
    public ChatRoomFrm(HomeFrm homeFrm, ClientManager cm, String maPhong, String tenPhong, int soNguoi) {
        initComponents();
        this.homeFrm = homeFrm;
        this.clientManager = cm;
        this.maPhong = maPhong;
        this.soNguoi = soNguoi;
        this.clientManager.addObserver(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMess = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtChat.setEditable(false);
        txtChat.setColumns(20);
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        txtMess.setColumns(20);
        txtMess.setRows(5);
        jScrollPane2.setViewportView(txtMess);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSend)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        if(txtMess.getText().trim().length() == 0)
            return;
        clientManager.SendMess(txtMess.getText().trim());
        txtMess.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setTitle("Nickname: " + clientManager.mNickname + "          Tên phòng: " + tenPhong + "         Mã phòng: " + maPhong + "      Online: " + soNguoi);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        clientManager.LeaveRoom();
        clientManager.deleteObserver(this);
        clientManager.addObserver(homeFrm);
        homeFrm.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ChatRoomFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ChatRoomFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ChatRoomFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ChatRoomFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ChatRoomFrm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextArea txtMess;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        Result result = (Result)arg;
        if(result.mResultCode.equals(ResultCode.ERROR)){
            JOptionPane.showMessageDialog(this, result.mContent, "Thất bại", JOptionPane.ERROR_MESSAGE);
            return;
        }
        switch(result.mActionType){
            case ActionType.SEND_MESSAGE:{
                String[] lines = result.mContent.split(";", -1);
                String sender = lines[0];
                String messContent = lines[1];
                messContent = messContent.replaceAll("<br>", "\n");  //khi tin nhắn gửi đi đã thay ký tự xuống dòng bằng <br> nên khi nhận về thì thay ngược lại
                if(sender.equals(clientManager.mNickname))
                    txtChat.append("You: " + messContent + "\n");
                else
                    txtChat.append(sender + ": " + messContent + "\n");
                break;
            }
            case ActionType.UPDATE_NUMBER_USER:{
                String soNguoii = result.mContent;
                soNguoi = Integer.parseInt(soNguoii);
                this.setTitle("Nickname: " + clientManager.mNickname + "      Tên phòng: " + tenPhong + "     Mã Phòng: " + maPhong + "     Số người: " + soNguoi);
                break;
            }
            case ActionType.NOTIFY_JUST_JOIN_ROOM:{
                String userJoin = result.mContent;
                txtChat.append("<" + userJoin + "> vừa tham gia phòng\n" );
                break;
            }
            case ActionType.NOTIFY_JUST_LEAVE_ROOM:{
                String userJoin = result.mContent;
                txtChat.append("<" + userJoin + "> vừa rời phòng\n" );
                break;
            }
        }
    }
}
