/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import javax.swing.JOptionPane;

/**
 *
 * @author XUÂN THÀNH
 */
public class XSKT extends javax.swing.JFrame implements Runnable {

    private boolean XN = false;
    Thread t1 = new Thread(this);
    private int yourNumber = 0, a = 0, b = 0, c = 0;

    public XSKT() {
        initComponents();

        setLocationRelativeTo(null);
        t1.start();
        if (XN == false) {
            btnStart1.setEnabled(XN);
            btnStart2.setEnabled(XN);
            btnStart3.setEnabled(XN);
        } else {
            btnStart1.setEnabled(XN);
            btnStart2.setEnabled(XN);
            btnStart3.setEnabled(XN);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTram = new javax.swing.JTextField();
        txtChuc = new javax.swing.JTextField();
        txtDonVi = new javax.swing.JTextField();
        btnStart1 = new javax.swing.JButton();
        btnStart2 = new javax.swing.JButton();
        btnStart3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtSo = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();
        lblYourNumBer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblKQ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setText(" XỔ SỐ KIẾN THIẾT ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("TRĂM");

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("CHỤC ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("ĐƠN VỊ");

        txtTram.setBackground(new java.awt.Color(0, 0, 0));
        txtTram.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtTram.setForeground(new java.awt.Color(255, 255, 255));
        txtTram.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTram.setText("0");

        txtChuc.setBackground(new java.awt.Color(0, 0, 0));
        txtChuc.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtChuc.setForeground(new java.awt.Color(255, 255, 255));
        txtChuc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtChuc.setText("0");

        txtDonVi.setBackground(new java.awt.Color(0, 0, 0));
        txtDonVi.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtDonVi.setForeground(new java.awt.Color(255, 255, 255));
        txtDonVi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDonVi.setText("0");

        btnStart1.setText("Start");
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });

        btnStart2.setText("Start");
        btnStart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart2ActionPerformed(evt);
            }
        });

        btnStart3.setText("Start");
        btnStart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart3ActionPerformed(evt);
            }
        });

        txtSo.setText("Nhập vào số bạn chọn!!!");
        txtSo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSoMouseClicked(evt);
            }
        });

        btnXacNhan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXacNhan.setText("Xác Nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        lblYourNumBer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblYourNumBer.setForeground(new java.awt.Color(255, 255, 255));
        lblYourNumBer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYourNumBer.setText("000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Số của bạn:");

        lblKQ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblKQ.setForeground(new java.awt.Color(255, 255, 255));
        lblKQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKQ.setText("---");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(39, 39, 39)
                        .addComponent(lblYourNumBer, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSo)
                                .addGap(22, 22, 22)
                                .addComponent(btnXacNhan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(txtTram, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtChuc, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnStart2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(71, 71, 71))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addGap(79, 79, 79)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(9, 9, 9)))
                                            .addComponent(btnStart3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSo)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTram)
                    .addComponent(txtChuc)
                    .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart1)
                    .addComponent(btnStart2)
                    .addComponent(btnStart3))
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYourNumBer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed

        new Thread() {
            @Override
            public void run() {
                int so = 0;
                for (int i = 0; i < 1000; i++) {
                    try {
                        so = (int) Math.round(Math.random() * 9);
                        txtTram.setText(String.valueOf(so));
                        btnStart1.setEnabled(false);
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        break;
                    }

                }
                a = so;
                btnStart1.setEnabled(true);
                int kq = (a * 100) + (b * 10) + c;
                if (kq == yourNumber) {
                    lblKQ.setText("xin chúc mừng");
                } else {
                    lblKQ.setText("chúc may mắn lần sau");
                }
            }
        }.start();


    }//GEN-LAST:event_btnStart1ActionPerformed

    private void btnStart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart2ActionPerformed
        new Thread() {
            @Override
            public void run() {
                int so = 0;
                for (int i = 0; i < 1000; i++) {
                    try {
                        so = (int) Math.round(Math.random() * 9);
                        txtChuc.setText(String.valueOf(so));
                        btnStart2.setEnabled(false);
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        break;
                    }

                }
                b = so;
                btnStart2.setEnabled(true);
                int kq = (a * 100) + (b * 10) + c;
                if (kq == yourNumber) {
                    lblKQ.setText("xin chúc mừng");
                } else {
                    lblKQ.setText("chúc may mắn lần sau");
                }
            }
        }.start();

    }//GEN-LAST:event_btnStart2ActionPerformed

    private void btnStart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart3ActionPerformed
        new Thread() {
            @Override
            public void run() {
                int so = 0;
                for (int i = 0; i < 1000; i++) {
                    try {
                        so = (int) Math.round(Math.random() * 9);
                        txtDonVi.setText(String.valueOf(so));
                        btnStart3.setEnabled(false);
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        break;
                    }

                }
                c = so;
                btnStart3.setEnabled(true);
                int kq = (a * 100) + (b * 10) + c;
                if (kq == yourNumber) {
                    lblKQ.setText("xin chúc mừng");
                } else {
                    lblKQ.setText("chúc may mắn lần sau");
                }

            }
        }.start();

    }//GEN-LAST:event_btnStart3ActionPerformed

    private void txtSoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSoMouseClicked
        this.txtSo.setText("");
    }//GEN-LAST:event_txtSoMouseClicked

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed

        try {
            int yourNum = Integer.parseInt(this.txtSo.getText());

            lblYourNumBer.setText(txtSo.getText());
            if (yourNum > 999 || yourNum < 0) {
                JOptionPane.showMessageDialog(this, "số phải là số nguyên dương có 3 chữ số");
                return;
            }
            yourNumber = yourNum;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "số không hợp lệ");
            return;
        }

        XN = true;
        if (XN == false) {
            btnStart1.setEnabled(XN);
            btnStart2.setEnabled(XN);
            btnStart3.setEnabled(XN);
        } else {
            btnStart1.setEnabled(XN);
            btnStart2.setEnabled(XN);
            btnStart3.setEnabled(XN);
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

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
            java.util.logging.Logger.getLogger(XSKT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XSKT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XSKT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XSKT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XSKT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart1;
    private javax.swing.JButton btnStart2;
    private javax.swing.JButton btnStart3;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblKQ;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYourNumBer;
    private javax.swing.JTextField txtChuc;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtSo;
    private javax.swing.JTextField txtTram;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        String txt = this.lblTitle.getText();

        while (true) {
            txt = txt.substring(1, txt.length()) + txt.charAt(0);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            this.lblTitle.setText(txt);
        }
    }

}