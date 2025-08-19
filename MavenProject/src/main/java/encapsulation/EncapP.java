package encapsulation;

public class EncapP {
	private int rollno;
	private String name;
	void setData(int rollno,String name)
	{
		this.name=name;
		this.rollno=rollno;
		
	}
	void getData()
	{
		System.out.println("Name: "+name+"\nRoll no: "+rollno);
	}

}
