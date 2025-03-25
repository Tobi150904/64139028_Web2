// SinhVien.java
package nvh.models;

public class SinhVien {
    private String mssv;
    private String ten;
    private double diem;

    public SinhVien() {}

    public SinhVien(String mssv, String ten, double diem) {
        this.mssv = mssv;
        this.ten = ten;
        this.diem = diem;
    }

    // Getters và Setters
    public String getMssv() { return mssv; }
    public void setMssv(String mssv) { this.mssv = mssv; }
    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }
    public double getDiem() { return diem; }
    public void setDiem(double diem) { this.diem = diem; }

    @Override
    public int hashCode() {
        return mssv.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SinhVien sv = (SinhVien) obj;
        return mssv.equals(sv.mssv);
    }
}