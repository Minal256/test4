package StaticDemo;


public class differenceBetween_Static_Public {
	static void MyStaticMethod()
	{
		System.out.println("Static method can be called without creating an object");
	}
	
	public void MyPublicMethod()
	{
		System.out.println("Public method must be called by creating an object");
	}
	
	public static void main(String[] args) {
		MyStaticMethod();  //static method call directly
		
	//	MyPublicMethod(); //-->error  cannot make sattic Ref.class to non static method
		
		differenceBetween_Static_Public obj=new differenceBetween_Static_Public();
		
		obj.MyPublicMethod(); //call public method

		
	}

}
