package PublicDemo;

public class instanceMethod {
	public int addition(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println("i am public method");
		
		instanceMethod I=new instanceMethod();
		int r=I.addition(5, 6);
		System.out.println(r);
	}

}
