/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

public class Cat extends Animals{
	
	public Cat(String nameCat) {
		super(nameCat);
	}

	public String getNameCat() {
		return this.nameAnimal;
	}
	public void setNameCat(String nameCat) {
		this.nameAnimal = nameCat;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meo Meo");
	}
}

