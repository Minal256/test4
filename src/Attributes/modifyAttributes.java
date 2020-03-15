package Attributes;

public class modifyAttributes {
	int x;  //atrribute/variable/field
	public static void main(String[] args) {
		modifyAttributes obj=new modifyAttributes(); //create object for accessing attributes
		
		System.out.println(obj.x); //output-0 bcoz x having no value if x having any value then print that value as output 
		
		obj.x=40; //assine value to x
		System.out.println(obj.x); //output-40
		
		
		
	}

}
