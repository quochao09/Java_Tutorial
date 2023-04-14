
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
