package OOP;

class Animal{
	void sound(){
		System.out.println("null");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("na~~");
	}
}


public class OopOk {

	public OopOk() {
		Animal cat = new Cat();
		cat.sound();
	}
	
	public static void main(String[] args) {
		new OopNo();
	}

}
