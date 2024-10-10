package OOP;


public class OopNo {

	class Dog {
		void sound() {
			System.out.println("wa!");
		}
	}
	
	class Cat{
		void sound() {
			System.out.println("Na");
		}
	}
	
	public OopNo() {
		Dog dog = new Dog();
		Cat cat = new Cat();
		cat.sound();
		dog.sound();
	}
	
	public static void main(String[] args) {
		new OopNo();
	}

}
