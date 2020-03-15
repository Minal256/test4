package StaticDemo;

public class Methods {
	int i = 100; // instance variable

	public void firstMethod() { // --public method or non-static method
		System.out.println("This is first Method"); // --for understand method is actually call or not
	}

	public static void main(String[] args) {  
			Methods m=new Methods();
		    m.firstMethod();  //----private method / private members are only accessible only inside the class
		    m.firstMethod();
		    m.firstMethod();
		    m.firstMethod();
    }
}
