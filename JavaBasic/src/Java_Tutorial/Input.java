package Java_Tutorial;

import java.util.Scanner; //Câu lệnh để nhập

public class Input {
	public static void main(String[] agrs) {
		// Syntax nhập dữ liệu từ bàn phím
		Scanner inPut = new Scanner(System.in);
		String name;
		int age;
		float diemTb;
		
		// Các phương thức nhập nextInt(), nextLong(), nextDouble(), nextLine(),...
		System.out.print("Get name: ");
		name = inPut.nextLine();
		System.out.print("Get age: ");
		age = inPut.nextInt();
		System.out.print("Get diemTb: ");
		diemTb = inPut.nextFloat();
		System.out.println("Full Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Diem TB = " + diemTb);
		
	}
}
