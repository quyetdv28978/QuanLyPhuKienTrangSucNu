/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFile

import Utilities.DBConnection;System/Templates/Classes/Class.java to edit this template
 */
package respon;
import utility.DBConnection;
<<<<<<< HEAD
import domaimodel.KhachHang;
=======
import domainmodel.KhachHang;
>>>>>>> 1ec59489d3dc6aa9f89201863f6f7f3b6da6ac81
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class KhachHangResponsitories implements Iresponsitories<KhachHang> {

    @Override
    public List<Object[]> getALLJoin(String dk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhachHang> getAll(String dk) {
        return DBConnection.selectQueRy("from KhachHang where ten = " + "'" + dk+ "'" );
    }

    public List<KhachHang> getAllKH() {
        if (DBConnection.selectQueRy("from KhachHang") != null) {
            return DBConnection.selectQueRy("from KhachHang");
        }
        return null;
    }

    @Override
    public int add(KhachHang q) {
        return DBConnection.executeQuery(q, null);
    }

    @Override
    public int update(KhachHang q) {
        Session s = DBConnection.getseFactory().openSession();
        KhachHang kh = DBConnection.getseFactory().openSession().get(KhachHang.class, q.getId());
        kh.setMa(q.getMa());
        kh.setTen(q.getTen());
        kh.setGioiTinh(q.getGioiTinh());
        kh.setSđt(q.getSđt());
        kh.setNgaySinh(q.getNgaySinh());
        kh.setDiaChi(q.getDiaChi());
        return DBConnection.executeQuery(kh, "update");
    }

    @Override
    public int delete(String q) {
        return DBConnection.delete(q, KhachHang.class);
    }

    @Override
    public String timID(String ma) {
        String a = getAll(ma).toString();
        return a;
    }

    @Override
    public KhachHang timObject(String dk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  public List<KhachHang> SelectbyName(String ten) {
      List<KhachHang> pas;
        String nameSelect = "%" + ten + "%";
        try ( Session session = DBConnection.getseFactory().openSession()) {
            TypedQuery<KhachHang> query = session.createQuery("From KhachHang  WHERE ten like :key");
            query.setParameter("key", nameSelect);
            System.out.println(query);
            pas = query.getResultList();
            session.close();

        }
        return pas;
  }
}
