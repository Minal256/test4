package StaticDemo;

public class myClass1 {
	static void myMethod1()
	{
		System.out.println("Hello world");
	}
	
	public static void main(String[] args) {
	//	myMethod(); // static method of myClass not call directly in myClass1
		
	/*	myClass obj =new myClass();
		System.out.println(obj.myMethod()); -->This also not allowed to call static method in other class
		
		*/
		
		myClass obj=new myClass();//call static method of myClass for creating an object.
		obj.myMethod();  //output-Hello world
	}

}

