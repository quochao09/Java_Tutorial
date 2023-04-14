package String01;

import java.util.Scanner;
// Viết form nhập mật khẩu có điều kiện: có ký tự, có số, số ký tự > 8
public class main {
	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		
		String passWord;
		System.out.println("Nhap pass: ");
		passWord = inPut.nextLine();
		// Hàm length() dùng để lấy độ dài của chuỗi
		// VD: dùng để kiểm tra độ dài mật khẩu,...
		while(passWord.length() < 8) {
			System.out.println("Vui long nhap lai pass: ");
			passWord = inPut.nextLine();
		}
		System.out.println("Do dai chuoi = " + passWord.length());
		System.out.println("Success !");

		// Hàm charAt(vị trí) dùng để lấy ký tự tại vị trí 
		// VD: dùng để kiểm tra sdt VN phải bắt đầu bằng số 0
		String numberPhone;
		System.out.println("Nhap SDT VN: ");
		numberPhone = inPut.nextLine();
		System.out.println("Do dai chuoi = " + numberPhone.length());
		while(numberPhone.length() < 10 || numberPhone.charAt(0) != '0') {
			System.out.println("Vui long nhap lai sdt: ");
			numberPhone = inPut.nextLine();
		}
		System.out.println("Success !");
		
		// Hàm getChars(first, last - 1, arrayCoyy, vị trí bắt đầu lưu);
		// Dùng để coppy 1 mảng con bất kỳ trong mảng sang mảng coppy khác
		String s3;
		System.out.println("Nhap chuoi s3: ");
		s3 = inPut.nextLine();
		char[] arrCoppy = new char[10];
		s3.getChars(0, 10, arrCoppy, 0);
		System.out.println(arrCoppy);
		
		// Hàm getBytes để lấy ra giá trị của ký tự (trong bảng ASCII)
		// 65 < Ký tự In hoa < 90
		// 97 < Ký tự In thường < 122
		// 48 < 0,..,9 < 57
		byte[] value = numberPhone.getBytes();
		System.out.println("Gia tri cac ky tu trong arrCoppy: ");
		for(int i = 0; i < value.length; i++) {
			System.out.print(value[i] + " + ");
		}
	}
}
