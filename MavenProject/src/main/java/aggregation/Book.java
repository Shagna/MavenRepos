package aggregation;

public class Book {
	String name;
	int id;
	Auther auther;
	Book(String name,int id,Auther auther)
	{
		this.name=name;
		this.id=id;
		this.auther=auther;
		
	}
	void print()
	{
		System.out.println("Name: "+this.name+" Id: "+this.id);
		auther.display();
	}

	public static void main(String[] args) {
		Auther obj1=new Auther("Kannur",670567);
		
		Book  obj2=new Book("Shagna",101,obj1);
		obj2.print();

	}

}
