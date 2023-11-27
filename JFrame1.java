package com.mycompany.thegioididong;

import javax.swing.JOptionPane;


public class JFrame1 extends javax.swing.JFrame {


    public JFrame1() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        left = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        nocopyright = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        dangnhap = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THẾ GIỚI DI ĐỘNG");
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        left.setBackground(new java.awt.Color(222, 184, 135));

        logo.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(0, 0, 0));
        logo.setText("THẾ GIỚI DI ĐỘNG");

        nocopyright.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        nocopyright.setForeground(new java.awt.Color(0, 0, 0));
        nocopyright.setText("copyright © by NguyenQuangTien");

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(logo))
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(nocopyright)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(nocopyright)
                .addGap(62, 62, 62))
        );

        getContentPane().add(left);
        left.setBounds(0, 0, 400, 500);

        right.setBackground(new java.awt.Color(255, 255, 255));
        right.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Login.setBackground(new java.awt.Color(192, 192, 102));
        Login.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 102, 102));
        Login.setText("LOGIN");

        dangnhap.setBackground(new java.awt.Color(250, 235, 215));
        dangnhap.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        dangnhap.setForeground(new java.awt.Color(0, 0, 0));
        dangnhap.setText("Đăng Nhập");
        dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangnhapActionPerformed(evt);
            }
        });

        thoat.setBackground(new java.awt.Color(250, 235, 215));
        thoat.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        thoat.setForeground(new java.awt.Color(0, 0, 0));
        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(dangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(Login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Login)
                .addGap(69, 69, 69)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        getContentPane().add(right);
        right.setBounds(400, 0, 400, 500);

        pack();
    }

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {
       JOptionPane.showMessageDialog(this, " Bạn có chắc chắn muốn thoát khỏi cửa hàng "); 
       this.dispose();
        
    }

    private void dangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangnhapActionPerformed
        DienThoai jf2 = new DienThoai();
        jf2.show();
        
        dispose();
    }
    private javax.swing.JLabel Login;
    private javax.swing.JButton dangnhap;
    private javax.swing.JPanel left;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nocopyright;
    private javax.swing.JPanel right;
    private javax.swing.JButton thoat;

}
