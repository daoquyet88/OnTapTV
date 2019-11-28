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
    public static  List<De> getAll() throws SQLException{
        String sql="select * from de";
        List<De> list=null;
        try {
            list=new ArrayList<De>();
            Connection  con=Util.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                

                String maDe=rs.getString("MaDe");
                String noiDung=rs.getString("NoiDung");
                String lop=rs.getString("Lop");    
                String tacGia=rs.getString("TacGia");
                String tieuDe=rs.getString("TieuDe");
                String chuThich=rs.getString("ChuThich");
                De c=new De();
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
   
}
