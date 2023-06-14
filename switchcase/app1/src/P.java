class P
{
	public static void main(String[] args) 
	{
		String i="abc";
		switch(i="10")
		{
			default:
				System.out.println("from case default 3");
			break;
			case "1"://case name data type should be case argument type
				System.out.println("from case xyz");
				
			break;

			case "2":
				System.out.println("from case def");
				
			break;
			case "3":
				System.out.println("from case abc");
				
			break;
			default:
				System.out.println("from case default 3");
			break;
	}
	
}
}
/*

D:\java-program-lab\switchcase\app1\src>javac -d ../classes P.java
P.java:24: error: duplicate default label
                        default:
                        ^
1 error*/