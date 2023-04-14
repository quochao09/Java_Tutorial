package Java_Tutorial;

import java.util.Scanner;
//Mục đích của try catch là không muốn làm gián đoạn chương trình. Kể cả khi lệnh lỗi thì chương trình còn lại
//vẫn chạy bình thường.
public class tryCatch {
	public static void main(String[] args) {
		int n;
		Scanner inPut = new Scanner(System.in);
		try { // try là câu lệnh mà ta cố muốn thực hiện.
			System.out.println("Nhap n: ");
			n = inPut.nextInt();
		}
		catch(Exception e) {	//Nếu lệnh trong try lỗi thì catch thực hiện.
			System.out.println("Erorr!");
		}
		finally { //Kể cả try có lỗi hay không thì câu lệnh trong finally vẫn chạy.
			System.out.println("Finally!");
		}
	}
}
