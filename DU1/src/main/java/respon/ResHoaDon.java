/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respon;

import domaimodel.ChiTietHoaDon;
import domaimodel.HoaDon;
import domaimodel.KhachHang;
import utility.DBConnection;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author yugip
 */
public class ResHoaDon implements IfResponsitoties<HoaDon>{

    @Override
    public List<Object[]> getALLJoin(String dk) {
        return DBConnection.selectQueRyJoin("from ChiTietHoaDon d left join d.hd " + dk);
    }

    @Override
    public List<HoaDon> getAll(String dk) {
        if ( DBConnection.selectQueRy("from HoaDon d " + dk) != null) {
            return DBConnection.selectQueRy("from HoaDon d " + dk);
        }
        return null;
    }
    
   
    
     public List<ChiTietHoaDon> getAllChiTietHoaDon(String dk) {
        return DBConnection.selectQueRy("from ChiTietHoaDon d " + dk);
    }
  

    @Override
    public int add(HoaDon q) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(HoaDon q) {
        return DBConnection.executeQuery(q, "update");
    }

    @Override
    public int delete(String q) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String timID(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDon timObject(String dk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
//    select kh
    public List<KhachHang> getALl(){
        return DBConnection.selectQueRy("from KhachHang");
    }
     public List<HoaDon> SelectbyMaHD(String maHD) {
        List<HoaDon> pas;
        String nameSelect = "%" + maHD + "%";
        try (Session session = DBConnection.getsetFactory().openSession()) {
            TypedQuery<HoaDon> query = session.createQuery("from HoaDon where tinhTrang = 0 and ma like :key");
            query.setParameter("key", nameSelect);
            System.out.println(query);
            pas = query.getResultList();
            session.close();

        }
        return pas;
    }
}