package StaticDemo;

public class FirstClass {
	public static void main(String[] args) {

		//System.out.println("Hello Eclipse");

		Methods m = new Methods(); // object create m for use method call
		m.firstMethod(); // firstMethod calling which is present in Methods class

		/*
		 * FirstClass m =new FirstClass(); m.firstMethod();
		 */

		System.out.println(m.i); // instances var call in same package so no need to import that package

	}
}