package nvh.models;

public class SinhVien {
    private String mssv;
    private String hoten;
    private int namsinh;
    private String gioitinh;

    public SinhVien(String mssv, String hoten, int namsinh, String gioitinh) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
    }

    public String getMssv() {
        return mssv;
    }

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }
}
