package inheritence;

public class MultiC extends MultiP {
	void drawing()
	{
		System.out.println("Child drawing");	
	}


	public static void main(String[] args) {
		MultiC obj=new MultiC();
		
		obj.dancing();
		obj.singing();
		obj.drawing();

	}

}
