/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;
// Abstract: là lớp cha chung chung không có thật, tạo ra để cho các lớp con kế thừa.
// Trong Abstract, các lớp con cần overriding ghi đè cụ thể hóa lại phương thức từ lớp cha.
// Không thể tạo mới sẵn lớp abstract.
// Abstract class là một class chuyên sinh ra để làm class cha, tức là để được kế thừa. 
// Do đặc tính thiết kế trong Java, nên sinh ra các abstract class, vì đôi lúc chúng ta chỉ muốn tạo ra các class mà ko muốn cho tạo đối tượng từ class đó.
// Phương thức abstract chỉ tồn tại trong class abstract. Nó không có nội dung hàm, mà chỉ có khai báo hàm. 
// Class con của abstract class phải override hàm abstract bắt buộc

public class Main {
	public static void main(String[] args) {
		Cat a1 = new Cat(null);
		a1.makeSound();
		a1.setNameCat("meo");
		System.out.println("name cat: " + a1.getNameCat());
		
		Dog a2 = new Dog(null);
		a2.makeSound();
		a2.setNamDog("Mic");
		System.out.println("name dog: " + a2.getNameDog());
		
		Animals a3 = new Cat(null);
		a3.makeSound();
	}
}

