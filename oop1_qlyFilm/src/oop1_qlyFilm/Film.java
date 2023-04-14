package oop1_qlyFilm;

public class Film {
	private String tenFilm;
	private int namSx;
	private HangSx hsx;
	private float giaVe;
	private Date ngayChieu;
// Hàm khởi tạo constructor
	public Film(String tenFilm, int namSx, HangSx hsx, float giaVe, Date ngayChieu) {
		this.tenFilm = tenFilm;
		this.namSx = namSx;
		this.hsx = hsx;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
// Hàm get và set dữ liệu
	public String getTenFilm() {
		return tenFilm;
	}
	public void setTenFilm(String tenFilm) {
		this.tenFilm = tenFilm;
	}
	public int getNamSx() {
		return namSx;
	}
	public void setNamSx(int namSx) {
		this.namSx = namSx;
	}
	public HangSx getHsx() {
		return hsx;
	}
	public void setHsx(HangSx hsx) {
		this.hsx = hsx;
	}
	public float getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(float giaVe) {
		this.giaVe = giaVe;
	}
	public Date getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(Date ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
// Các phương thức của đối tượng
	public boolean ktraGiaVe(Film temp) {
		return this.giaVe < temp.giaVe;
	}
	public String getTen() {
		return this.hsx.getTenHangSx();
	}
	public float giaTien(float x) {
		return this.giaVe * (1 - x/100);
	}
	@Override
	public String toString() {
		return this.tenFilm + " - " + this.namSx + " - " + this.hsx + " - " 
			  +this.giaVe + " - " + this.ngayChieu;
	}
	
}
