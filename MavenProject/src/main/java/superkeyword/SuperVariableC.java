package superkeyword;

public class SuperVariableC extends SuperVariableP{
	String color="Green";
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		SuperVariableC obj=new SuperVariableC();
		obj.display();

	}

}
