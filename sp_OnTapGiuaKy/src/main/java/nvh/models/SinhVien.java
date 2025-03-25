package nvh.models;

public class SinhVien {
	public String maSV;
	public String tenSV;
	public float diem;
	
	public SinhVien() {
	}
	
	public SinhVien(String maSV, String tenSV, float diem) {
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diem = diem;
	}
	
	public String getMaSV() {
		return maSV;
	}
	
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	
	public String getTenSV() {
		return tenSV;
	}
	
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	
	public float getDiem() {
		return diem;
	}
	
	public void setDiem(float diem) {
		this.diem = diem;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSV == null) ? 0 : maSV.hashCode());
		return result;
	}
}
