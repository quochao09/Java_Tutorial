package test;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ptb2 {
	public static int sumNumber(int a)
	{
		int sum = 0;
		while(a != 0)
		{
			sum += (a % 10);
			a /= 10;
		}
		return (sum);
	}
	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		int a,b;
		String test = "01";
		int num = Integer.valueOf(test);
		int kq = num + 1;
		System.out.println(kq);
		int choice;
		do {
			System.out.print("Nhập lựa chọn: ");
			choice = inPut.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Bang cuu chuong can in (1 -> 10): ");
				a = inPut.nextInt();
				while(a < 0 || a > 10)
				{
					System.out.println("NHAP LAI:");
					System.out.print("Bang cuu chuong can in (1 -> 10): ");
					a = inPut.nextInt();
				}
				System.out.println("BANG CUU CHUONG " + a);
				for(int i = 1; i <= 10; i++)
				{
					System.out.println(a + "*" + i + " = " + (a * i));
				}
				break;
			case 2:
				b = inPut.nextInt();
				System.out.print("Sum Num = " + sumNumber(b));
				break;
			case 3:
				System.out.print("Chuyen thap phan -> nhi phan: ");
				a = inPut.nextInt();
				String nhiPhan = "";
				while(a > 0)
				{
					nhiPhan = (a%2) + nhiPhan;
					a /= 2;
				}
				System.out.println("Result = " + nhiPhan);
				break;
			default:
				break;
			}
		} while(choice != 0);
	}
		
}
