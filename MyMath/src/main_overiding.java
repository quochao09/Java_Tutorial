// overriding: Ghi đè phương thức trong kế thừa. Các lớp con kế thừa phương thức của lớp cha
// nhưng các phương mỗi lớp con lại có 1 cách hành động khác nhau trong phương thức. Vì vậy
// cần ghi đè phương thức (các phương thức trùng tên nhưng hoạt động khác nhau)
public class main_overiding {
	public static void main(String[] args) {
		cat meo = new cat("Meo");
		Dog mic = new Dog("Mic");
		meo.makeSound();
		mic.makeSound();
	}
}
