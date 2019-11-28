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
        String sql="select * from dapan";
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
   
}
