
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
