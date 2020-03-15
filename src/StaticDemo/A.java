package StaticDemo;

public class A {
	public static void main(String[] args) {
		Test x = new Test();
		
		System.out.println(x.add(1,2)); //output-120
		
		System.out.println(x.add1(5, 6));//output-17 i.e.x=5+2 ,y=7=6+4 
		
	/*	int p = 10;
		int q = 20;

		int r = x.add(p, q); // --non static i.e. public method call by object compulsory
		System.out.println(r); // output 36
		
		int Sum = Test.add1(p, q); // ---static method call by class name(here class name is Test) directly.
		System.out.println(Sum);
*/
	}

}

