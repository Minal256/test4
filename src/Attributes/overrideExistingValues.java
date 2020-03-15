package Attributes;

public class overrideExistingValues {
	int x=10; 
	public static void main(String[] args) {
		overrideExistingValues obj=new overrideExistingValues();
		
		obj.x=25; //change value of x into 25
		System.out.println(obj.x);  //output 25 
		
	}

}
