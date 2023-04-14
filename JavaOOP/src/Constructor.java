import java.util.Scanner;
public class Constructor {
	Scanner inPut = new Scanner(System.in);
	private String fullName;
	private int age;
	
	// Hàm constructor có tên trùng với class và không có giá trị trả về
	public Constructor(String a, int b) {
		this.fullName = a;
		this.age = b;
	}
	public String getName() {
		return fullName;
	}
	public void setName() {
		this.fullName = inPut.nextLine();
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = inPut.nextInt();
	}
	
	// Hàm Main có thể tách hẳn ra 1 file khác.
	public static void main(String[] args) {
		Constructor peoPle = new Constructor(null, 0);
		System.out.println("Nhap ten: ");
		peoPle.setName();
		System.out.println("Nhap tuoi: ");
		peoPle.setAge();
		System.out.println("Full Name: " + peoPle.getName());
		System.out.println("Full Name: " + peoPle.getAge());
	}
}
