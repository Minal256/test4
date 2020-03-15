package ReturnType;

public class double_Char_Premitive {
	public double returnvalue()
	{
		char c='k';
		return c;
	}
	
	public static void main(String[] args) {
		double_Char_Premitive obj=new double_Char_Premitive();
		
		System.out.println(obj.returnvalue()); //output-k chi ascii value print zali
	}

}
