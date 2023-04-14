/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

public class Dog extends Animals{
	public Dog(String nameDog) {
		super(nameDog);
	}
	public void setNamDog(String nameDog) {
		this.nameAnimal = nameDog;
	}
	public String getNameDog() {
		return this.nameAnimal;
	}
	@Override
	public void makeSound() {
		System.out.println("Gau Gau");
	}
}

