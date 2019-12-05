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
import model.DapAn;
import model.De;

/**
 *
 * @author daoquyet
 */
public class DapAnDB {
    //ham lay toan bo du lieu
    public static  List<DapAn> getAll() throws SQLException{
        String sql="select * from dapan ORDER BY MaDe,MaDapAn";
        List<DapAn> list=null;
        try {
            list=new ArrayList<DapAn>();
            Connection  con=Util.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                

                String maDe=rs.getString("MaDe");
                String maDapAn=rs.getString("MaDapAn");
                String cauHoi=rs.getString("CauHoi");    
                String tl1=rs.getString("TraLoi1");
                String tl2=rs.getString("TraLoi2");
                String tl3=rs.getString("TraLoi3");
                String dapAn=rs.getString("DapAn");
               DapAn da=new DapAn();
               da.setMaDe(maDe);
               da.setMaDapAn(maDapAn);
               da.setCauHoi(cauHoi);
               da.setTraLoi1(tl1);
               da.setTraLoi2(tl2);
               da.setTraLoi3(tl3);
               da.setDapAn(dapAn);
                list.add(da);
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
            return list;
        
    }
    public static void update(String maDe,int maDapAn, String cauHoi, String traLoi1, String traLoi2, String traLoi3,String dapAn) throws ClassNotFoundException {
        Connection con = Util.getConnection();
        String sql = "update dapan set CauHoi=?,TraLoi1=?,TraLoi2=?,TraLoi3=?,DapAn=?  where MaDe=? and MaDapAn=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cauHoi);
            ps.setString(2, traLoi1);
            ps.setString(3, traLoi2);
            ps.setString(4, traLoi3);
            ps.setString(5, dapAn);
            ps.setString(6,maDe);
            ps.setInt(7,maDapAn);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // ham delete

    public void delete(String maDe,int maDapAn) throws ClassNotFoundException {
        Connection con = Util.getConnection();
        String sql = "delete from dapan where MaDe=? and MaDapAn=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maDe);
             ps.setInt(2,maDapAn);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ham insert
    public void insert(String maDe,int maDapAn, String cauHoi, String traLoi1, String traLoi2, String traLoi3,String dapAn) throws ClassNotFoundException {
        Connection con = Util.getConnection();
        String sql = "insert into dapan values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(2,maDapAn);
            ps.setString(3,cauHoi);
            ps.setString(4, traLoi1);
            ps.setString(5, traLoi2);
            ps.setString(6, traLoi3);
            ps.setString(7, dapAn);
            ps.setString(1, maDe);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
}
