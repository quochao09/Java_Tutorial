package Exercise;

public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hsx;
	
	// Hàm khởi tạo Constructor
	public PhuongTienDiChuyen(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	
	// hàm get và set lấy dữ liệu
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	
	public String layTenHangSanXuat() {
		return this.hsx.getTenHangSanXuat();
	}
	
	public abstract double layVanToc();
}
