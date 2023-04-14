import java.util.Objects;
import java.util.Scanner;

public class HoaDonCafe {
	// Khai báo thuộc tính
	private String tenCafe;
	private double giaTien1kg, khoiLuong;
	// Hàm khởi tạo
	public HoaDonCafe(String a, double b, double c) {
		this.tenCafe = a;
		this.giaTien1kg = b;
		this.khoiLuong = c;
	}
	// Các phương thức
	Scanner sc = new Scanner(System.in);
	public String getTenCafe() {
		return tenCafe;
	}
	public double getGiaTien() {
		return giaTien1kg;
	}
	public double getKhoiLuong() {
		return khoiLuong;
	}
	public double tinhTongTien() {
		return this.giaTien1kg * this.khoiLuong;
	}
	public void nhapHoaDon() {
		System.out.print("Ten cafe: ");
		this.tenCafe = sc.nextLine();
		System.out.print("Gia tien 1 kg: ");
		this.giaTien1kg = sc.nextDouble();
		System.out.print("Khoi luong: ");
		this.khoiLuong = sc.nextDouble();
	}
	public boolean ktraKhoiLuong(double temp) {
		return this.khoiLuong > temp;
	}
	public boolean ktraGiaTien() {
		return this.tinhTongTien() > 500000;
	}
	public double tinhTienGiamGia() {
		if(this.ktraGiaTien()) {
			return this.tinhTongTien() * 0.1;
		}
		else {
			return 0;
		}
	}
	public double tinhTien() {
		return this.tinhTongTien() - this.tinhTienGiamGia();
	}
	// Hàm xuất dữ liệu
	public String toString() {
		return this.tenCafe + " - " + this.giaTien1kg + " - " + this.khoiLuong;
	}
	// Phương thức hasCode 
	@Override
	public int hashCode() {
		return Objects.hash(giaTien1kg, khoiLuong, tenCafe);
	}
	//Phương thức equals so sánh 2 đối tượng
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDonCafe other = (HoaDonCafe) obj;
		return (giaTien1kg) == (other.giaTien1kg)
				&& (khoiLuong) == (other.khoiLuong)
				&& Objects.equals(tenCafe, other.tenCafe);
	}
	
}
