class Q
{
	public static void main(String[] args) 
	{
		String i="abc";
		switch(i)
		{
			
			case "1"://case name data type should be case argument type
				System.out.println("from case xyz");
				
			break;

			case "1":
				System.out.println("from case def");
				
			break;
			
	}
	
}
}
/*

D:\java-program-lab\switchcase\app1\src>javac -d ../classes Q.java
Q.java:14: error: duplicate case label
                        case "1":
                        ^
1 error
*/