
package model;

/**
 *
 * @author daoquyet
 */
public class QL_BaiLam {
    private String useName;
    private String maDe;
    private String lop;
    private int thoiGian;
    private int soCauDung;
    private int soDiem;

    public QL_BaiLam(String useName, String maDe, String lop, int thoiGian, int soCauDung, int soDiem) {
        this.useName = useName;
        this.maDe = maDe;
        this.lop = lop;
        this.thoiGian = thoiGian;
        this.soCauDung = soCauDung;
        this.soDiem = soDiem;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getMaDe() {
        return maDe;
    }

    public void setMaDe(String maDe) {
        this.maDe = maDe;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getSoCauDung() {
        return soCauDung;
    }

    public void setSoCauDung(int soCauDung) {
        this.soCauDung = soCauDung;
    }

    public int getSoDiem() {
        return soDiem;
    }

    public void setSoDiem(int soDiem) {
        this.soDiem = soDiem;
    }
    
    
}
