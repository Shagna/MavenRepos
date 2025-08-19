package accessmodifier1;

import accessmodifier.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		Access1 obj=new Access1();
		obj.display1();
		//obj.display2(); //private
		//obj.display3(); //protected
		//obj.display4();  //void
		Access3 obj1=new Access3();
		obj1.display1();
		obj1.display3();
		//obj1.display2();
		//obj1.display4();

	}

}
