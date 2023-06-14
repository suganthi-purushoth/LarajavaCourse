class L
{
	public static void main(String[] args) 
	{
		String i="abc";
		switch(i)
		{
			case "xyz"://case name data type should be case argument type
				System.out.println("from case xyz");
				
			break;

			case "def":
				System.out.println("from case def");
				
			break;
			case "abc":
				System.out.println("from case abc");
				
			break;
	}
	
}
}
/*

D:\java-program-lab\switchcase\app1\src>java -cp ../classes L
from case abc

*/