package String_Exercise;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp;
		//String temp2 = "@gmail.com";
		char[] temp2 = new char[10];
		temp2 = '@gmail.com';
		System.out.println("Nhập: ");
		temp = sc.nextLine();
		int temp1 = 0;
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == '@') {
				temp1 = i;
			}
		}
		System.out.println("index = " + temp1);
		char[] arrCoppy = new char[10];
		temp.getChars(temp1, temp.length(), arrCoppy, 0);
		System.out.println(arrCoppy);
		System.out.println(arrCoppy.equals(temp2));
	}
}
