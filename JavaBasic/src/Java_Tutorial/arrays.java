package Java_Tutorial;
import java.util.Scanner;
public class arrays {
public static void main(String[] args) {
	Scanner inPut = new Scanner(System.in);
	int []arr; // khai báo mảng
	int n, sum = 0;
	System.out.print("So phan tu: ");
	n = inPut.nextInt();
	arr = new int[n];
	for(int i = 0; i< n; i++)
	{
		System.out.print("num " + i + ": ");
		arr[i] = inPut.nextInt(); 
		sum += arr[i];
	}
	System.out.println("Sum = " + sum);
}
}
