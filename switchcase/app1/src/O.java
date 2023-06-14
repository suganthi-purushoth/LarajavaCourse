class O
{
	public static void main(String[] args) 
	{
		String i="abc";
		switch(i="3")
		{
			case "1"://case name data type should be case argument type
				System.out.println("from case xyz");
				
			break;

			case "2":
				System.out.println("from case def");
				
			break;
			case "3":
				System.out.println("from case abc");
				
			break;
	}
	
}
}
/*

D:\java-program-lab\switchcase\app1\src>java -cp ../classes O
from case abc

*/