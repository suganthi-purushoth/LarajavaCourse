class R
{
	public static void main(String[] args) 
	{
		String i="1";
		switch(i)
		{
			
			case "1"://case name data type should be case argument type
				System.out.println("from case xyz");
				for(int i=1;i<=2;i++)
			{
					System.out.println("from case 1 loop:"+i);
			}
			break;

			case "2":
				System.out.println("from case 1");
				
			break;
			
	}
	
}
}
/*

D:\java-program-lab\switchcase\app1\src>javac -d ../classes R.java
R.java:11: error: variable i is already defined in method main(String[])
                                for(int i=1;i<=2;i++)
                                        ^
1 error
*/