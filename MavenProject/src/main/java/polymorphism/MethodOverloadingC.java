package polymorphism;

public class MethodOverloadingC extends MethodOverloadingP{
	void calc(int b)
	{
		System.out.println("Value of a: "+b);
	}

	public static void main(String[] args) 
	{
		MethodOverloadingC obj=new MethodOverloadingC();
		obj.calc();
		obj.calc(20);

	}

}
