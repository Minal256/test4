package ReturnType;

public class A {
	public void message() {    //-------void method
		System.out.println("Hello");
	//	return 1; //error- void method can not return any value
		
	//  return statement nahi likhal tri output yete	
		
		return; //---empty return statement is perfectly fine in a void type
	}
	
	public static void main(String[] args) {
		A obj=new A();
		obj.message();
	}

}
