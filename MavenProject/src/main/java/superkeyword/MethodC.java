package superkeyword;

public class MethodC extends MethodP{
	void display()
	{
		System.out.println("Child method");
		super.display("helllo");
		
	}

	public static void main(String[] args) {
		MethodC objC=new MethodC();
		objC.display();

	}

}
