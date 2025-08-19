package inheritence;

public class HierarC2 extends HierarP{
	void jeep()
	{
		System.out.println("Child c2 jeep");
	}

	public static void main(String[] args) {
		HierarC2 obj1= new HierarC2();
		obj1.jeep();
		obj1.vehicle();

	}

}
