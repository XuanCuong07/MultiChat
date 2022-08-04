/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewserver;

import coreserver.ServerManager;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BVCN 88
 */
public class ServerMultiChatFrm extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form ServerMultiChatFrm
     */
    ServerManager mServerManager;
    public ServerMultiChatFrm() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStatus = new javax.swing.JTextArea();
        btnTurnOn = new javax.swing.JButton();
        btnCountUser = new javax.swing.JButton();
        btnCountRoom = new javax.swing.JButton();
        btnGetHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý server");

        txtStatus.setColumns(20);
        txtStatus.setRows(5);
        jScrollPane1.setViewportView(txtStatus);

        btnTurnOn.setBackground(new java.awt.Color(204, 204, 255));
        btnTurnOn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTurnOn.setForeground(new java.awt.Color(0, 204, 51));
        btnTurnOn.setText("ON");
        btnTurnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnOnActionPerformed(evt);
            }
        });

        btnCountUser.setText("Số lượng online");
        btnCountUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountUserActionPerformed(evt);
            }
        });

        btnCountRoom.setText("Số lượng phòng");
        btnCountRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountRoomActionPerformed(evt);
            }
        });

        btnGetHistory.setText("Lịch sử truy cập");
        btnGetHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTurnOn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnCountRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnGetHistory)
                        .addGap(267, 267, 267)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCountRoom, btnCountUser, btnGetHistory});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCountUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCountRoom, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGetHistory, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTurnOn)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCountUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountUserActionPerformed
        // TODO add your handling code here:
        txtStatus.append("Số người dùng online: " + mServerManager.CountUser()+ "\n");
    }//GEN-LAST:event_btnCountUserActionPerformed

    private void btnCountRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountRoomActionPerformed
        // TODO add your handling code here:
        txtStatus.append("Số phòng đang hoạt động: " + mServerManager.CountRoom()+ "\n");
    }//GEN-LAST:event_btnCountRoomActionPerformed

    private void btnGetHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetHistoryActionPerformed
        // TODO add your handling code here:
        HistoryFrm historyFrm = new HistoryFrm();
        historyFrm.setLocationRelativeTo(this);
        historyFrm.setVisible(true);
    }//GEN-LAST:event_btnGetHistoryActionPerformed

    private void btnTurnOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnOnActionPerformed
        // TODO add your handling code here:
        mServerManager = new ServerManager(this);
        mServerManager.StartServer();
        
    }//GEN-LAST:event_btnTurnOnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try {
            if(mServerManager != null)
                mServerManager.Dispose();
        } catch (IOException ex) {
            Logger.getLogger(ServerMultiChatFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ServerMultiChatFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerMultiChatFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerMultiChatFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerMultiChatFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ServerMultiChatFrm x = new ServerMultiChatFrm();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCountRoom;
    private javax.swing.JButton btnCountUser;
    private javax.swing.JButton btnGetHistory;
    private javax.swing.JButton btnTurnOn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtStatus;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        txtStatus.append(arg.toString() + "\n");
    }
}
