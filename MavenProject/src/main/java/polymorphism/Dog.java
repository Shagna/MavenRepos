package polymorphism;

public class Dog extends Animal{
	void sound()
	{
		super.sound();
		System.out.println("Dog barks..!");
		
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();

	}

}
