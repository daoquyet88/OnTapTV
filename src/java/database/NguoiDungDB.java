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
import model.NguoiDung;

/**
 *
 * @author daoquyet
 */
public class NguoiDungDB {
    //ham lay toan bo du lieu
    public static  List<NguoiDung> layMotNguoi(String username,String password) throws SQLException{
        String sql="select * from nguoidung where useName=? and passWord=?";
        List<NguoiDung> list=null;
        try {
            list=new ArrayList<NguoiDung>();                  
            Connection  con=Util.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
          
            while(rs.next()){     
                String useName=rs.getString("useName");
                String passWord=rs.getString("passWord");
                String id=rs.getString("id");
                String hoTen=rs.getString("HoTen");
                String diaChi=rs.getString("DiaChi");
                String gioiTinh=rs.getString("GioiTinh");
                String email=rs.getString("Email");
                String ngaySinh=rs.getString("NgaySinh");
                
                NguoiDung nd=new NguoiDung();
                nd.setUseName(useName);
                nd.setPassWord(passWord);
                nd.setId(id);
                nd.setHoTen(hoTen);
                nd.setDiaChi(diaChi);
                nd.setGioiTinh(gioiTinh);
                nd.setNgaySinh(ngaySinh);
                nd.setEmail(email);
                list.add(nd);
            }
            
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeDB.class.getName()).log(Level.SEVERE, null, ex);
        }      
           return list;
        
    }
    public static  List<NguoiDung> loadAll() throws SQLException{
        String sql="select * from nguoidung";
        List<NguoiDung> list=null;
        try {
            list=new ArrayList<NguoiDung>();
            Connection  con=Util.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String useName=rs.getString("useName");
                String passWord=rs.getString("passWord");
                String id=rs.getString("id");
                String hoTen=rs.getString("HoTen");
                String diaChi=rs.getString("DiaChi");
                String gioiTinh=rs.getString("GioiTinh");
                String email=rs.getString("Email");
                String ngaySinh=rs.getString("NgaySinh");
                
                NguoiDung nd=new NguoiDung();
                nd.setUseName(useName);
                nd.setPassWord(passWord);
                nd.setId(id);
                nd.setHoTen(hoTen);
                nd.setDiaChi(diaChi);
                nd.setGioiTinh(gioiTinh);
                nd.setNgaySinh(ngaySinh);
                nd.setEmail(email);
                list.add(nd);
            }
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NguoiDungDB.class.getName()).log(Level.SEVERE, null, ex);
        }
            return list;
        
    }
   // ham insert nguoi dang ky
    public  void themNguoiDangKy(String use,String pass,String id,String hoTen,String diaChi,String gioiTinh,String email,String ngaySinh) throws SQLException{
       try {
           Connection con=Util.getConnection();
           String sql="insert into nguoidung values(?,?,?,?,?,?,?,?)";
           try {
               PreparedStatement ps=con.prepareStatement(sql);
               ps.setString(2,pass);
               ps.setString(3,id);
               ps.setString(4,hoTen);
               ps.setString(5,diaChi);
               ps.setString(1,use);
               ps.setString(6,ngaySinh);
               ps.setString(7,gioiTinh);
               ps.setString(8,email);
               ps.executeUpdate();
               ps.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
          
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(NguoiDungDB.class.getName()).log(Level.SEVERE, null, ex);
       }
    }  
     public static void updateTaiKhoan(String useName,String passWord,String id,String hoTen,String diaChi,String ngaySinh,String gioiTinh,String email) throws ClassNotFoundException{
       Connection con=Util.getConnection();
      // String sql="update nguoidung set passWord=?,id=?,HoTen=?,DiaChi=?,NgaySinh=?,GioiTinh=?,Email=? where useName=?";
        String sql="update nguoidung set passWord=?,id=?,HoTen=?,DiaChi=?,NgaySinh=?,GioiTinh=?,Email=? where useName=?";
      try {
           PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, passWord);
            ps.setString(2,id);
            ps.setString(3,hoTen);
            ps.setString(4,diaChi);
            ps.setString(5,ngaySinh);
            ps.setString(6,gioiTinh);
            ps.setString(7,email);
            ps.setString(8,useName);
            ps.executeUpdate();
            ps.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
     public  void delete(String code) throws ClassNotFoundException {
       Connection con=Util.getConnection();
       String sql="delete from nguoidung where useName=?";
       try {
           PreparedStatement ps=con.prepareStatement(sql);
           
              ps.setString(1,code);
              ps.executeUpdate();
              ps.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
