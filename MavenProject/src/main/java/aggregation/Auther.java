package aggregation;

public class Auther {
	String place;
	int pincode;
	Auther(String place,int pincode)
	{
		this.pincode=pincode;
		this.place=place;
		
	}
	void display()
	{
		System.out.println("Place: "+place+" Pincode: "+pincode);
	}

}
