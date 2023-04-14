// overloading: nạp chồng phương thức, khác với overriding
public class main {
	// Các phương thức cần có static để hoạt động
	public static int sumNumbers(int a, int b)
	{
		return a+b;
	}
	public static double sumNumbers(double d, double e, double f)
	{
		return d+e+f;
	}
	public static void main(String[] args) {
		int result1;
		double result2;
		result1 = sumNumbers(3,4);
		System.out.println("rs1 = " + result1);
		result2 = sumNumbers(3,4,5);
		System.out.println("rs2 = " + result2);
	}
}
