
package Entity;

public class SinhVien {
    private int id;
    private int msv;
    private String hoten;
    private String lop;

 

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
private boolean gioitinh;
private String quequan;
    public SinhVien(int id, int msv, String hoten,boolean gioitinh, String lop,String quequan) {
        this.id = id;
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.gioitinh = gioitinh;
        this.quequan=quequan;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
        
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    
    
}
