class Z14
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		String b1=test1();	
		System.out.println("main end: "+b1);
	}
	public static String test1()
	{
		System.out.println("from test1");
		String str="Hello  to all";
		return str;
	}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z14
main begin
from test1
main end: Hello  to all
*/
