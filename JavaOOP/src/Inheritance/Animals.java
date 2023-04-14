/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;
public class Animals {
	private String name;
	
	public Animals(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("EAT!");
	}
	public void makeSound() {
		System.out.println("......");
	}
}
