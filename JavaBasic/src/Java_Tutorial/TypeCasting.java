package Java_Tutorial;

public class TypeCasting {
	public static void main(String[] args) {
		// Ép kiểu ngầm định (Widening Casting)
		// Converting a smaller type to a larger type size
		// byte -> short -> char -> int -> long -> float -> double
		System.out.println("Xin Chào");
		int a = 9;
		float b = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// Ép kiểu tường minh (Narrowing Casting)
		// Converting a larger type to a smaller type size
		// double -> float -> long -> int -> char -> short -> byte
		float c = 8.0f;
		int d = (int) c;
		System.out.println("c = " + c);
		System.out.println("d = " + d);		
	} 
}
