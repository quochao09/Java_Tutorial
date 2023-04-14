/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

public abstract class Animals {
	protected String nameAnimal;
	
	public Animals(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}
	
	public String getNameAnimal() {
		return this.nameAnimal;
	}
	public void setNameAnimal(String nameAnimals) {
		this.nameAnimal = nameAnimal;
	}
	// Phương thức trong abstract không được viết cụ thể. Các lớp con sẽ cụ thể hóa nó.
	// Phương thức abstract chỉ tồn tại trong class abstract. Nó không có nội dung hàm, mà chỉ có khai báo hàm. 
	// Class con của abstract class phải override hàm abstract bắt buộc
	public abstract void makeSound();
	// Hàm không có abstract thì class con không cần viết lại nó.
	public void eat() {
		System.out.println("Yes");
	}
}

