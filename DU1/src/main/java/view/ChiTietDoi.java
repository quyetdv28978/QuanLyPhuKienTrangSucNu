/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import domaimodel.HoaDon;
import domaimodel.KhachHang;
import domaimodel.SanPham;
import domaimodel.chitiethoadonNoEmbe;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import respon.DoiHangRes;
import respon.resSanPham;
import utility.JframeCheck;

/**
 *
 * @author Admin
 */
public class ChiTietDoi extends javax.swing.JFrame {
    
    DefaultTableModel dtmChiTietDoi = new DefaultTableModel();
    private resSanPham sanPham = new resSanPham();
    private List<SanPham> listcthd;
    private final JframeCheck jcheck = new JframeCheck();
    List<SanPham> temp = new ArrayList<>();
    private DoiHangRes hangRes = new DoiHangRes();
    double tienTra;
    int soLuongDoi;
    DefaultTableModel dtmChiTietDoi2;
    int count = 0;
    float tienKhachMua = 0;

    /**
     * Creates new form ChiTietDoi
     */
    public ChiTietDoi() {
        initComponents();
        setLocationRelativeTo(null);
//        lbTongTien.setText();
    }
    
    public ChiTietDoi(List<SanPham> l, double tongTien, int soLuong) {
        initComponents();
        listcthd = l;
        loadTableSPCungGia(l);
        lbTongTien.setText(tongTien + "");
        tienTra = tongTien;
        soLuongDoi = soLuong;
    }
    
    public void loadTableSPCungGia(List<SanPham> list) {
        dtmChiTietDoi = (DefaultTableModel) tbHienSPCungGia.getModel();
        dtmChiTietDoi.setRowCount(0);
        for (SanPham sanPham : list) {
            dtmChiTietDoi.addRow(sanPham.toRowgia());
        }
    }
    
    public void loadTableSPChon() {
        dtmChiTietDoi = (DefaultTableModel) tbHienThiSPDoi.getModel();
        dtmChiTietDoi.setRowCount(0);
        for (SanPham sanPham : sanPham.getAll123("")) {
            dtmChiTietDoi.addRow(sanPham.toRow1());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbHienSPCungGia = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHienThiSPDoi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbTongTien = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnHoanThanh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        tbHienSPCungGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Dòng SP", "Giá tiền"
            }
        ));
        tbHienSPCungGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHienSPCungGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHienSPCungGia);

        tbHienThiSPDoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Đơn giá"
            }
        ));
        tbHienThiSPDoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHienThiSPDoiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbHienThiSPDoi);

        jLabel1.setText("Tổng tiền trả :");

        lbTongTien.setText("jLabel2");

        btnXoa.setText("Xoá ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnHoanThanh.setText("Hoàn thành");
        btnHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanThanhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57)
                                .addComponent(lbTongTien))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa)
                                .addGap(54, 54, 54)
                                .addComponent(btnHoanThanh))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbTongTien))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(btnHoanThanh))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int checkTongTien = 0;
    private void tbHienSPCungGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHienSPCungGiaMouseClicked
        float tongTien = 0;
        dtmChiTietDoi2 = (DefaultTableModel) tbHienThiSPDoi.getModel();
        int row = tbHienSPCungGia.getSelectedRow();
        if (row >= 0) {
            String soLuong1 = JOptionPane.showInputDialog(this, "Số lượng");
            int soLuongReal = Integer.parseInt(soLuong1);
            int c = Integer.parseInt(tbHienSPCungGia.getValueAt(tbHienSPCungGia.getSelectedRow(), 2).toString());
            
            SanPham sp = listcthd.get(row);
            Float tien = sp.getGiaBan();
            sp.setId(jcheck.createID().toString());
            sp.setSoLuong(soLuongReal);
            temp.add(sp);
            
            dtmChiTietDoi2.setRowCount(count);
            //dơn gia cho 1 sp
            float gia = Float.parseFloat(tbHienSPCungGia.getValueAt(tbHienSPCungGia.getSelectedRow(), 4).toString());
            
            Float giaSPDoi = soLuongReal * gia;
            if(soLuongReal> c || soLuongReal == 0){
                JOptionPane.showMessageDialog(this, "Số lượng sản phẩm nhập vào phải bé hơn hoặc bằng số lượng đã mua");
                return;
            }
            for (int i = 0; i < tbHienThiSPDoi.getRowCount(); i++) {
                if (tbHienThiSPDoi.getValueAt(i, 0).toString().equals(tbHienSPCungGia
                        .getValueAt(tbHienSPCungGia.getSelectedRow(),
                                0).toString())) {
                    tbHienThiSPDoi.setValueAt(soLuongReal + Integer.parseInt(tbHienThiSPDoi.getValueAt(i, 2).toString()),
                            i, 2);
                    tienTra += Float.parseFloat(tbHienSPCungGia.getValueAt(tbHienSPCungGia.getSelectedRow(), 4).toString()) * soLuongReal;
                    lbTongTien.setText(tienTra + "");
                    tienKhachMua += (sp.getGiaBan() * soLuongReal);
                    return;
                }
                
            }
            
            if (tbHienThiSPDoi.getRowCount() == 0) {
                checkTongTien = 0;
            }
            
            if (tienTra == giaSPDoi && checkTongTien == 0) {
                tienTra -= giaSPDoi;
                lbTongTien.setText(tienTra + "");
                checkTongTien = 1;
            } else if (giaSPDoi > tienTra && checkTongTien == 0) {
                tienTra = giaSPDoi - tienTra;
                lbTongTien.setText(tienTra + "");
                tienKhachMua += (sp.getGiaBan() * soLuongReal);
                checkTongTien = 2;
            } else if (giaSPDoi < tienTra && checkTongTien == 0) {
                tienTra = tienTra - giaSPDoi;
                lbTongTien.setText(tienTra + "");
                tienKhachMua += (sp.getGiaBan() * soLuongReal);
                checkTongTien = 2;
            } else {
                tienTra += Float.parseFloat(tbHienSPCungGia.getValueAt(tbHienSPCungGia.getSelectedRow(), 4).toString()) * soLuongReal;
                lbTongTien.setText(tienTra + "");
                tienKhachMua += (sp.getGiaBan() * soLuongReal);
            }
            
//            JOptionPane.showMessageDialog(this, tienTra);
            
            for (SanPham sp2 : temp) {
                int check = 0;
                
                for (int i = 0; i < tbHienThiSPDoi.getRowCount(); i++) {
                    if (tbHienThiSPDoi.getValueAt(i, 0).equals(sp2.getMa())) {
                        check = 1;
                        break;
                    }
                }
                if (check == 1) {
                    continue;
                }
                
//                JOptionPane.showMessageDialog(this, "sp1" + sp2.getMa());
                dtmChiTietDoi2.addRow(sp2.toRow1());
                count++;
            }

//                lbTongTien.setText(tienTra + "");
//            Float giaMoi = 
//            JOptionPane.showMessageDialog(this, giaSPDoi);
            int soLuongConLai = c - soLuongReal;
            tbHienSPCungGia.setValueAt(soLuongConLai, row, 2);
            int slt = c - soLuongReal;
//            Float slback = (soLuongReal * tien) ;
//            tbHienThiSPDoi.setValueAt(slback, row, 3);
//            JOptionPane.showMessageDialog(this, slback);
        }
        tbHienSPCungGia.clearSelection();
    }//GEN-LAST:event_tbHienSPCungGiaMouseClicked
    int checkOXoa = 0;
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row1 = tbHienThiSPDoi.getSelectedRow();
        if (row1 >= 0) {
            String soLuong = JOptionPane.showInputDialog(this, "Số lượng");
            DefaultTableModel dtm = (DefaultTableModel) tbHienThiSPDoi.getModel();
            SanPham sanPhamXoa = temp.get(row1);
            int soLuongRealXoa = Integer.parseInt(soLuong);//số lượng nhập
            int soLuongHienTai = sanPhamXoa.getSoLuong();// số lượng có
            Float sos = Float.parseFloat(DoiTra.tbHienSPHoaDon.getValueAt(DoiTra.tbHienSPHoaDon.getSelectedRow(), 3).toString());
            Float giaCu = sos * soLuongDoi;
            Float tien = sanPhamXoa.getGiaBan();
            int c = Integer.parseInt(tbHienThiSPDoi.getValueAt(tbHienThiSPDoi.getSelectedRow(), 2).toString());
            //số lươgj trong table
            if (soLuongRealXoa > c) {
                JOptionPane.showMessageDialog(this, "Số lượng sản phẩm nhập vào phải bé hơn hoặc bằng số lượng đã mua");
                return;
            }
            tbHienSPCungGia.clearSelection();
            for (int i = 0; i < tbHienSPCungGia.getRowCount(); i++) {
                if (tbHienSPCungGia.getValueAt(i, 0).toString().equals(tbHienThiSPDoi.getValueAt(tbHienThiSPDoi.getSelectedRow(), 0))) {
                    tbHienSPCungGia.setValueAt(soLuongRealXoa + Integer.parseInt(tbHienSPCungGia.getValueAt(i, 2).toString()),
                            i, 2);
                    break;
                }
            }
            Float slback = soLuongRealXoa * tien;
//            JOptionPane.showMessageDialog(this, "slback trong else 2: " + slback);
            tbHienThiSPDoi.setValueAt(slback, row1, 3);
            if (soLuongRealXoa < Double.parseDouble(tbHienThiSPDoi.getValueAt(tbHienThiSPDoi.getSelectedRow(), 2).toString())) {
                if (tienTra == 0) {
//                    JOptionPane.showMessageDialog(this, "tien khach mua trong if dau: " + tienKhachMua);
                    tienTra = tienTra + slback;
                    tienKhachMua -= slback;
                    lbTongTien.setText(tienTra + "");
                } else {
                    tienTra -= slback;
                    if (tienTra < 0) {
                        tienTra = giaCu;
                    }
                    lbTongTien.setText(tienTra + "");
                    tienKhachMua -= slback;
                }
                tbHienThiSPDoi.setValueAt(Integer.parseInt(tbHienThiSPDoi.getValueAt(tbHienThiSPDoi.getSelectedRow(), 2).toString()) - soLuongRealXoa,
                        tbHienThiSPDoi.getSelectedRow(), 2);
            } else {
//                JOptionPane.showMessageDialog(this, "tien khach mua trong else 2: " + tienKhachMua);
//                JOptionPane.showMessageDialog(this, "slback trong else 2: " + slback);
                tienKhachMua -= slback;
                tienTra -= slback;
                if (tienTra < 0) {
                    tienTra = giaCu;
                }
                tbHienThiSPDoi.setValueAt(Integer.parseInt(tbHienThiSPDoi.getValueAt(tbHienThiSPDoi.getSelectedRow(), 2).toString()) - soLuongRealXoa,
                        tbHienThiSPDoi.getSelectedRow(), 2);
                lbTongTien.setText(tienTra + "");
                temp.remove(tbHienThiSPDoi.getSelectedRow());
                dtm.removeRow(row1);
                tbHienThiSPDoi.repaint();
                count--;
            }
            
        }

//   XOA SAN PHAM HOAN TIEN

    }//GEN-LAST:event_btnXoaActionPerformed
    private void btnHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanThanhActionPerformed
        DefaultTableModel dtm2 = (DefaultTableModel) DoiTra.tbHienThiDoiTra.getModel();
        dtm2.setRowCount(DoiTra.tbHienThiDoiTra.getRowCount());
//        JOptionPane.showMessageDialog(this, temp);
        
        if (DoiTra.tbHienThiDoiTra.getRowCount() == 0) {
            for (domaimodel.SanPham dh : temp) {
                dtm2.addRow(dh.toRow1());
            }
        } else {
            for (domaimodel.SanPham dh : temp) {
                int kt = 0;
                for (int i = 0; i < DoiTra.tbHienThiDoiTra.getRowCount(); i++) {
                    if (DoiTra.tbHienThiDoiTra.getValueAt(i, 0).toString().equals(dh.getMa())) {
                        DoiTra.tbHienThiDoiTra.setValueAt(dh.getSoLuong() + Integer.parseInt(
                                DoiTra.tbHienThiDoiTra.getValueAt(i, 2).toString()), i, 2);
                        kt = 1;
                        break;
                    }                    
                    
                }
                if (kt == 1) {
                    continue;
                }
                dtm2.addRow(dh.toRow1());
            }
        }
        if (DoiTra.lbTongTien.getText().trim().length() != 0) {
            DoiTra.lbTongTien.setText(Float.parseFloat(DoiTra.lbTongTien.getText().trim()) + tienTra + "");
        }
        else DoiTra.lbTongTien.setText(tienTra + "");
        temp.removeAll(temp);
        count = 0;
        tienTra = 0;
        tienKhachMua = 0;
        this.dispose();
    }//GEN-LAST:event_btnHoanThanhActionPerformed

    private void tbHienThiSPDoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHienThiSPDoiMouseClicked
//        String soLuong = JOptionPane.showInputDialog(this, "Số lượng");
//            int soLuongReal = Integer.parseInt(soLuong);
//            int c = Integer.parseInt(tbHienSPCungGia.getValueAt(tbHienSPCungGia.getSelectedRow(), 2).toString());

    }//GEN-LAST:event_tbHienThiSPDoiMouseClicked

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
            java.util.logging.Logger.getLogger(ChiTietDoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietDoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietDoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietDoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietDoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoanThanh;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JTable tbHienSPCungGia;
    private javax.swing.JTable tbHienThiSPDoi;
    // End of variables declaration//GEN-END:variables
}
