package nvh.model;

public class SinhVien {
	private String mssv;
	private String ten;
	private int namsinh;
	private String gioitinh;
	
	public SinhVien() {
		super();
	}
	
	public SinhVien(String mssv, String ten, int namsinh, String gioitinh) {
		super();
		this.mssv = mssv;
		this.ten = ten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
	}
	
	public String getMssv() {
		return mssv;
	}
	
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	
	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public int getNamsinh() {
		return namsinh;
	}
	
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	
	public String getGioitinh() {
		return gioitinh;
	}
	
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
}
