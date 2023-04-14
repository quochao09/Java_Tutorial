import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HoaDonCafe hd = new HoaDonCafe(null, 0, 0);
		HoaDonCafe hd1 = new HoaDonCafe(null, 0, 0);
		hd.nhapHoaDon();
		hd1.nhapHoaDon();
		System.out.println("Xuat thong tin: " + hd);
		System.out.println("Xuat thong tin: " + hd1);
		System.out.println("so sanh equals: " + hd.equals(hd1));
		System.out.println("So sanh hascode hd: " + hd.hashCode());
		System.out.println("So sanh hascode hd1: " + hd1.hashCode());
//		System.out.println("Kiem tra khoi luong: " + hd.ktraKhoiLuong(10));
//		System.out.println("Kiem tra tien > 500k ?: " + hd.ktraGiaTien());
//		System.out.println("So tien giam gia: " + hd.tinhTienGiamGia());
//		System.out.println("Tien phai tra: " + hd.tinhTien());
	}
}
