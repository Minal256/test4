package StaticDemo;

public class method2 {
	static int result;
	
	public static void main(String[] args) {
		method1 m=new method1();
		
		method1.addition1(20,30); //static method call directly by using method name
		System.out.println(m.sum);
		
	}

}
