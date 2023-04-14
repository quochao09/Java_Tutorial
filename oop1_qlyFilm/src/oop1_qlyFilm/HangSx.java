package oop1_qlyFilm;

public class HangSx {
	private String tenHangSx, quocGia;
// Hàm khởi tạo constructor
	public HangSx(String tenHangSx, String quocGia) {
		this.tenHangSx = tenHangSx;
		this.quocGia = quocGia;
	}
// Hàm get và set dữ liệu
	public String getTenHangSx() {
		return tenHangSx;
	}
	public void setTenHangSx(String tenHangSx) {
		this.tenHangSx = tenHangSx;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
// Hàm toString để xuất dữ liệu
	public String toString() {
		return this.tenHangSx + " - " + this.quocGia ;
	}
}
