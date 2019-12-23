package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;
import model.De;

/**
 *
 * @author daoquyet
 */
public class DeDB {

    //ham lay toan bo du lieu
    public static List<De> getAll() throws SQLException {
        String sql = "select * from de";
        List<De> list = null;
        try {
            list = new ArrayList<De>();
            Connection con = Util.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maDe = rs.getString("MaDe");
                String noiDung = rs.getString("NoiDung");
                String lop = rs.getString("Lop");
                String tacGia = rs.getString("TacGia");
                String tieuDe = rs.getString("TieuDe");
                String chuThich = rs.getString("ChuThich");
                De c = new De();
                c.setMaDe(maDe);
                c.setNoiDung(noiDung);
                c.setLop(lop);
                c.setChuThich(chuThich);
                c.setTacGia(tacGia);
                c.setTieuDe(tieuDe);
                list.add(c);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
    public static List<De> layDeTheoMaLop(String maLop) throws SQLException {
         String sql = String.format("select * from de where Lop='%s'",maLop);
        List<De> list = null;
        try {
            list = new ArrayList<De>();
            Connection con = Util.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maDe = rs.getString("MaDe");
                String noiDung = rs.getString("NoiDung");
                String lop = rs.getString("Lop");
                String tacGia = rs.getString("TacGia");
                String tieuDe = rs.getString("TieuDe");
                String chuThich = rs.getString("ChuThich");
                De c = new De();
                c.setMaDe(maDe);
                c.setNoiDung(noiDung);
                c.setLop(lop);
                c.setChuThich(chuThich);
                c.setTacGia(tacGia);
                c.setTieuDe(tieuDe);
                list.add(c);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
    public static List<De> layDeTheoMaLopMaDe(String _maDe,String _maLop) throws SQLException {
         String sql = String.format("select * from de where Lop='%s' and MaDe='%s'",_maLop,_maDe);
        List<De> list = null;
        try {
            list = new ArrayList<De>();
            Connection con = Util.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maDe = rs.getString("MaDe");
                String noiDung = rs.getString("NoiDung");
                String lop = rs.getString("Lop");
                String tacGia = rs.getString("TacGia");
                String tieuDe = rs.getString("TieuDe");
                String chuThich = rs.getString("ChuThich");
                De c = new De();
                c.setMaDe(maDe);
                c.setNoiDung(noiDung);
                c.setLop(lop);
                c.setChuThich(chuThich);
                c.setTacGia(tacGia);
                c.setTieuDe(tieuDe);
                list.add(c);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
    //lay de theo ma de bai
    public static List<De> getOne(String maDe1) throws SQLException {
    
        String sql = String.format("select * from de where MaDe='%s'", maDe1);
        List<De> list = null;
        try {
            list = new ArrayList<De>();
            Connection con = Util.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String maDe = rs.getString("MaDe");
                String noiDung = rs.getString("NoiDung");
                String lop = rs.getString("Lop");
                String tacGia = rs.getString("TacGia");
                String tieuDe = rs.getString("TieuDe");
                String chuThich = rs.getString("ChuThich");
                De c = new De();
                c.setMaDe(maDe);
                c.setNoiDung(noiDung);
                c.setLop(lop);
                c.setChuThich(chuThich);
                c.setTacGia(tacGia);
                c.setTieuDe(tieuDe);
                list.add(c);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    // ham update
    public static void update(String maDe, String tieuDe, String noiDung, String tacGia, String lop, String chuThich) throws ClassNotFoundException {
        Connection con = Util.getConnection();
        String sql = "update de set TieuDe=? , NoiDung=?,TacGia=?,Lop=? ,ChuThich=? where MaDe=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tieuDe);
            ps.setString(2, noiDung);
            ps.setString(3, tacGia);
            ps.setString(4, lop);
            ps.setString(5, chuThich);
            ps.setString(6, maDe);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // ham delete

    public void delete(String code) throws ClassNotFoundException {
        Connection con = Util.getConnection();
        String sql = "delete from de where MaDe=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, code);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ham insert
    public void insert(String maDe, String tieuDe, String noiDung, String tacGia, String chuThich, String lop) throws ClassNotFoundException {
        Connection con = Util.getConnection();
        String sql = "insert into de values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2, tieuDe);
            ps.setString(3, noiDung);
            ps.setString(4, tacGia);
            ps.setString(5, lop);
            ps.setString(6, chuThich);
            ps.setString(1, maDe);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
