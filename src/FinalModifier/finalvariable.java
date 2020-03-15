package FinalModifier;

public class finalvariable {
	int i=10;
	final int j=20;
	public static void main(String[] args) {
		finalvariable F=new finalvariable();
		
		F.i=F.i+5; //modification allowed bcoz variable is not final var 
		
	//	F.j=F.j+5; //error bcoz modification is not allowed in final variable
		
		F.i=F.j+5; //allwed bcoz no change in any final var and result store in other variable
		System.out.println(F.i); //25
		
	}

}
