class M
{
	public static void main(String[] args) 
	{
		String i="abc";
		switch(i)
		{
			case 1://case name data type should be case argument type
				System.out.println("from case xyz");
				
			break;

			case 2:
				System.out.println("from case def");
				
			break;
			case 3:
				System.out.println("from case abc");
				
			break;
	}
	
}
}
/*


D:\java-program-lab\switchcase\app1\src>javac -d ../classes M.java
M.java:8: error: incompatible types: int cannot be converted to String
                        case 1://case name data type should be case argument type
                             ^
M.java:13: error: incompatible types: int cannot be converted to String
                        case 2:
                             ^
M.java:17: error: incompatible types: int cannot be converted to String
                        case 3:
                             ^
3 errors
*/