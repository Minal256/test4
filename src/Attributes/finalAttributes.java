package Attributes;

public class finalAttributes {
	final int x=10; //declar var as final
	 /*
	   if u don't want the ability to over ride existing value declar attribute as final
	  */
	
	public static void main(String[] args) {
		finalAttributes obj=new finalAttributes();
		
	 /* obj.x=25; //error- cannot assine vale to final var
		System.out.println(obj.x);
	*/
		
		System.out.println(obj.x); //output-10 
					
		}
	}
