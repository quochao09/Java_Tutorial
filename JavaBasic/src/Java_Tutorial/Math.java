package Java_Tutorial;

//import java.lang.Math;
import java.util.Scanner;
public class Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		int a,b;
//		System.out.print("a = ");
//		a = sc.nextInt();
//		System.out.print("b = ");
//		b = sc.nextInt();
//		System.out.println("Hau to a++ = ");
//		System.out.println(a++);
//		System.out.println(a);
//		System.out.println("Tien to ++b = ");
//		System.out.println(++b);
//		System.out.println(b);
//		int c = 0, d = 0;
//		c += a;
//		d += b;
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
		System.out.println("--------------------------------");
		System.out.println("GIAI PT BAC 2: Ax^2 + Bx + C = 0");
		int a,b,c;
		float dental, x;
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		System.out.print("c = ");
		c = sc.nextInt();
		if(a == 0) {
			if(b == 0 && c == 0) {
				System.out.println("PT co vs nghiem.");
			}
			else if(b == 0 && c != 0) {
				System.out.println("PT vo nghiem.");
			}
			else if(b != 0) {
				System.out.println("PT co nghiem x = " + (float) -c/b);
			}
		}
		else {
			dental = b*b - 4*a*c;
			if(dental < 0) {
				System.out.println("PT vo nghiem.");
			}
			else if(dental == 0) {
				System.out.println("PT co 2 nghiem x1 = x2 = " + ((float) -b/(2*a)));
			}
			else {
				//System.out.print("x1 = " + ((-b + Math.sqrt(dental))/(2*a)));
				
			}
		}
	}
}
