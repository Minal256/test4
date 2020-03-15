package ExecutionSequence;

public class executionSequence {
	
		// ---Non-static block--//
		{
			System.out.println("I am Non-static block");
		}

		// --Static block--//---static block start with static keyword.This block
		// executed before main method and only 1 time executed.
		
		static {
			System.out.println("I am Static block");
		}

		// ---Instance Method--//
		public int add(int a, int b){
			System.out.println("I am Instance Method");
			return a+b;
		}

		// ---Static method---//
		public static int multiply(int a, int b) {
			System.out.println("I am Static Method");
			return a*b;
		}

		public static void main(String[] args) {
			System.out.println("I am main Method");

			executionSequence e = new executionSequence();
			//ExecutionSequence f = new ExecutionSequence(); // whenever object is created non-static block will print

			int r = e.add(10, 20);
			System.out.println("r=" + r);
			// --or-->System.out.println(e.add(10, 20)); //--call add method by using
			// object-e. output 30
			
			e.multiply(5, 3);

		}

	}

