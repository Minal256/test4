package StaticDemo;

public class method1 {
	int result; //instance var
	static int sum; //static var
   // static int result; ---solution 1
	
	public  void addition(int i,int j) {
		result=i+j;
	}
	public static void addition1(int a,int b)
	{
		sum=a+b;
	}
	
	public static void main(String[] args) {
		method1 obj=new method1();
		
	/*  solution 1	
		System.out.println("before "+result); //error in static method we can not call non static var directly
		obj.addition(5, 6); //--->pass by value
		System.out.println("After "+result); ////error in static method we can not call non static var directly
	*/
		
		//solution 2
		System.out.println("Before "+obj.result); //result 0 bcoz we can not call method addition
		obj.addition(5, 6); //calling addition method
		System.out.println("After "+obj.result); //call method by using object

	}

}
