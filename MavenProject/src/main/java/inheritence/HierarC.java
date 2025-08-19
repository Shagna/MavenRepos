package inheritence;

public class HierarC extends HierarP
{
	void car()
	{
		System.out.println("Child 1 car");
	}

	public static void main(String[] args) {
		HierarC obj1= new HierarC();
		obj1.car();
		obj1.vehicle();
		

	}

}
