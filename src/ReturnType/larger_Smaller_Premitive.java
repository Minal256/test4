package ReturnType;

public class larger_Smaller_Premitive {  //int is lager than byte
	byte b=10;
	
	public int returnvalue() {   //-----methodname
		System.out.println("hello");
		return b;
	}
	
	public static void main(String[] args) {
		larger_Smaller_Premitive obj=new larger_Smaller_Premitive();
		
		//obj.returnvalue(); 
		
		System.out.println(obj.returnvalue()); //output- hello 10
 		
		
	}

}
