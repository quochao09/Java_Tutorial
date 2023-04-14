package Java_Tutorial;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b;
		System.out.print("a = ");
		a = sc.nextInt();
		// Syntax condition (condition)?
		System.out.print("b = ");
		b = sc.nextInt();
		String results = (a % 2 == 0)? "So chan" : "So le";
		String check = (b % 3 == 1) ? "Yes" : "No";
		System.out.println("results: " + results);
		System.out.println("Check " + check);
	};
}
