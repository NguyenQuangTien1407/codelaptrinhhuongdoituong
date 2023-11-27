package com.mycompany.thegioididong;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class DienThoai extends javax.swing.JFrame {
    private javax.swing.JButton banhang;
    DefaultTableModel model;
    JTextField nhapsanpham1, nhapsoluong1, nhapgia1;

    public DienThoai() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Logo1 = new javax.swing.JLabel();
        sanpham1 = new javax.swing.JLabel();
        soluong1 = new javax.swing.JLabel();
        gia1 = new javax.swing.JLabel();
        nhapsanpham1 = new javax.swing.JTextField();
        nhapsoluong1 = new javax.swing.JTextField();
        nhapgia1 = new javax.swing.JTextField();
        them = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        banhang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THE GIOI DI DONG");

        jPanel1.setBackground(new java.awt.Color(222, 184, 135));
        jPanel2.setBackground(new java.awt.Color(222, 184, 135));

        Logo1.setFont(new java.awt.Font("Segoe Script", 1, 24));
        Logo1.setForeground(new java.awt.Color(0, 0, 0));
        Logo1.setText("THẾ GIỚI DI ĐỘNG");

        sanpham1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14));
        sanpham1.setForeground(new java.awt.Color(0, 0, 0));
        sanpham1.setText("Tên Sản Phẩm - Hệ Điều Hành - Nhà Sản Xuất:");

        soluong1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14));
        soluong1.setForeground(new java.awt.Color(0, 0, 0));
        soluong1.setText("Số Lượng:");

        gia1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14));
        gia1.setForeground(new java.awt.Color(0, 0, 0));
        gia1.setText("Giá :");

        them.setText("Thêm");
        them.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        sua.setText("Sửa");
        sua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        xoa.setText("Xóa");
        xoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        jTable1.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Tên Sản phẩm - Hệ Điều Hành - Nhà Sản Xuất", "Số lượng", "Giá"}
        ));
        jScrollPane1.setViewportView(jTable1);

        save.setText("Lưu");
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                luuDuLieuVaoTep();
            }
        });

        thoat.setText("Thoát");
        thoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        



        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 14, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sanpham1)
                                        .addComponent(gia1)
                                        .addComponent(soluong1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nhapsanpham1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nhapsoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nhapgia1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(banhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(thoat)
                                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sanpham1)
                                        .addComponent(nhapsanpham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(them))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nhapsoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(soluong1)
                                        .addComponent(sua))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nhapgia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gia1)
                                        .addComponent(xoa)
                                        .addComponent(save)
                                        .addComponent(thoat)
                                        .addComponent(banhang))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(549, 549, 549))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton them;
    private javax.swing.JLabel sanpham1;
    private javax.swing.JButton sua;
    private javax.swing.JButton xoa;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton save;
    private javax.swing.JButton thoat;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel gia1;
    private javax.swing.JLabel soluong1;

    private int tinhTongTien() {
        int tongTien = 0;
        for (int row = 0; row < model.getRowCount(); row++) {
            int soluong = Integer.parseInt((String) model.getValueAt(row, 1));
            int gia = Integer.parseInt((String) model.getValueAt(row, 2));
            tongTien += soluong * gia;
        }
        return tongTien;
    }

    private void themActionPerformed(ActionEvent evt) {
        if (checkValidateForm()) {
            String sanpham = nhapsanpham1.getText();
            String soluong = nhapsoluong1.getText();
            String gia = nhapgia1.getText();

            model.addRow(new Object[]{sanpham, soluong, gia});
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        }
    }

    private void suaActionPerformed(ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            if (checkValidateForm()) {
                String sanpham = nhapsanpham1.getText();
                String soluong = nhapsoluong1.getText();
                String gia = nhapgia1.getText();

                model.setValueAt(sanpham, selectedRow, 0);
                model.setValueAt(soluong, selectedRow, 1);
                model.setValueAt(gia, selectedRow, 2);
                resetForm();

                int tongTienHienTai = tinhTongTien();
                JOptionPane.showMessageDialog(this, "Sửa thông tin sản phẩm thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm để sửa");
    }
}

    private void xoaActionPerformed(ActionEvent evt) {
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        model.removeRow(selectedRow);
        resetForm();
    } else {
        JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm để xóa");
    }
}


    private void saveActionPerformed(ActionEvent evt) {
        // Lưu dữ liệu vào một tệp hoặc cơ sở dữ liệu ở đây
        int tongTienHienTai = tinhTongTien();
        JOptionPane.showMessageDialog(this, "Tổng tiền sản phẩm là: " + tongTienHienTai);
        
    }
       
private void luuDuLieuVaoTep() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn vị trí để lưu dữ liệu");

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Tệp văn bản (*.txt)", "txt");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            java.io.File fileToSave = fileChooser.getSelectedFile();
            FileWriter writer = null;

            try {
                writer = new FileWriter(fileToSave);

                for (int row = 0; row < model.getRowCount(); row++) {
                    String sanpham = (String) model.getValueAt(row, 0);
                    String soluong = (String) model.getValueAt(row, 1);
                    String gia = (String) model.getValueAt(row, 2);

                    writer.write(sanpham + "," + soluong + "," + gia + "\n");
                }

                int tongTienHienTai = tinhTongTien();
                JOptionPane.showMessageDialog(this, "Dữ liệu đã được lưu vào tệp: " + fileToSave.getAbsolutePath() +
                        ". Tổng tiền sản phẩm là: " + tongTienHienTai);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi lưu dữ liệu vào tệp.");
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
   
    private void thoatActionPerformed(ActionEvent evt) {
        dispose();
    }

    public void resetForm() {
        nhapsanpham1.setText("");
        nhapsoluong1.setText("");
        nhapgia1.setText("");
    }

    public boolean checkValidateForm() {
        if (nhapsanpham1.getText().isEmpty() || nhapsoluong1.getText().isEmpty() || nhapgia1.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DienThoai frame = new DienThoai();
                frame.setVisible(true);
            }
        });
    }

}
