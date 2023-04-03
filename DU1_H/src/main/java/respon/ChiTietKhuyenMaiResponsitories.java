/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respon;

import utility.DBConnection;
import domaimodel.ChiTietKhuyenMai;
import domaimodel.KhuyenMai;
import domaimodel.SanPham;
import domaimodel.ChiTietKhuyenMai;
import domaimodel.KhuyenMai;
import domaimodel.SanPham;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Timer;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class ChiTietKhuyenMaiResponsitories implements Iresponsitories<ChiTietKhuyenMai> {

    @Override
    public List<Object[]> getALLJoin(String dk) {
        return DBConnection.selectQueRyJoin("from ChiTietKhuyenMai");
    }

    public List<Object> getALLJoin1(String dk) {
        Query q = DBConnection.getsetFactory().openSession().createQuery("from ChiTietKhuyenMai ct where ct.km.trangThai = :d and ct.sp.ma='" + dk + "'");
        q.setParameter("d", "Còn Hạn");
//        DBConnection.selectQueRy("from ChiTietKhuyenMai ct where ct.km.trangThai = 'Còn Hạn' and ct.sp.ma=' " + dk + "'");
        System.out.println(q.getResultList());
        return q.getResultList();
    }

    public List<Object[]> getALLChiTietKM() {
        return DBConnection.selectQueRyJoin("from ChiTietKhuyenMai ctkm join ctkm.sp join ctkm.km");
    }

    @Override
    public List<ChiTietKhuyenMai> getAll(String dk) {
        return DBConnection.selectQueRy("from ChiTietKhuyenMai");
    }

    @Override
    public int add(ChiTietKhuyenMai q) {
        return DBConnection.executeQuery(q, null);
    }

    @Override
    public int update(ChiTietKhuyenMai q) {

        return DBConnection.executeQuery(q, "update");

    }

    @Override
    public int delete(String q) {
        return DBConnection.delete(q, ChiTietKhuyenMai.class);
    }

    @Override
    public String timID(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ChiTietKhuyenMai timObject(String dk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<KhuyenMai> getALlKM() {
        if (DBConnection.selectQueRy("from KhuyenMai") != null) {
            return DBConnection.selectQueRy("from KhuyenMai");
        }
        return null;
    }

    public List<Object> getAllSP() {
        return DBConnection.selectQueRy("from SanPham");
    }

    public List<ChiTietKhuyenMai> SelectbyNameSP(String tenKM) {
        List<ChiTietKhuyenMai> pas;
        String nameSelect = "%" + tenKM + "%";
        try (Session session = DBConnection.getsetFactory().openSession()) {
            TypedQuery<ChiTietKhuyenMai> query = session.createQuery("SELECT ctkm FROM ChiTietKhuyenMai ctkm \n" +
"JOIN ctkm.sp sp \n" +
"JOIN ctkm.km km \n" +
"WHERE km.tenKM LIKE :key OR sp.tenSanPham LIKE :key");
            query.setParameter("key", nameSelect);
            System.out.println(query);
            pas = query.getResultList();
            session.close();

        }
        return pas;
    }
}
