package Java_Tutorial;
import java.util.Scanner; // Câu lệnh để nhập

public class Begin {
	public static void main(String[] agrs) { // main + Ctrl + space + enter
		System.out.println("Hello World !");  // sysout + Ctrl + space + enter
		// KIỂU DỮ LIỆU NGUYÊN THỦY
		// 1. boolean: True or False kiểu dữ liệu đúng sai.
		boolean temp = true;
		// 2. byte: (-128 -> 127)Kích thước bé, tiết kiệm bộ nhớ trong các mảng chính
		// 3. short: (-32k -> 32k) tương tự byte
		// 4. int: (-2b -> 2b) kiểu số nguyên giống byte và short
		int age = 19;
		// 5. long: Kiểu số nguyên có kích thước rất lớn
		// 6. float, double: Kiểu dữ liệu số thực
		// 7. char: Kiểu dữ liệu chứa ký tự
		char tt = '9';
		
		// KIỂU DỮ LIỆU ĐỐI TƯỢNG
		// 1. String: Chuối ký tự, nhưng KHÔNG kết thúc bằng ký tự NULL như c++
		String fullName = "Giang Quoc Hao";
		String fullName2 = new String("Giang Hiep");
		String address = "Ha Noi";
		
		// HẰNG SỐ 
		final int x = 100;
		
		// NHẬP DỮ LIỆU 
		Scanner inPut = new Scanner(System.in); // Cần thư viện import java.util.Scanner;
		String name;
		float age1;
		float marks;
		System.out.print("Nhap ho ten: ");
		name =  inPut.nextLine();
		System.out.print("Nhap tuoi: ");
		age1 = inPut.nextFloat();
		System.out.print("Nhap diem: ");
		marks = inPut.nextFloat();		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age1);
		System.out.println("Diem: " + marks);
		System.out.println("Dia chi: " + address);
	}
}
