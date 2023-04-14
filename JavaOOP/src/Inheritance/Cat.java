/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

public class Cat extends Animals{
	private String sex;
	
	public Cat(String name, String sex) {
		super(name);
		this.sex = sex;
	}
	protected String temp = super.getName();
	String temp1 = getName();
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void run () {
		System.out.println("RUN!");
	}
// Overriding ghi đè phương thức (Giống hệt phương thức lớp cha)
	@Override
	public void eat() {
		System.out.println("EAT FISH!");
	}
	@Override
	public void makeSound() {
		System.out.println("Meo Meo!");
	}
}

