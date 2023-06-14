class Z13
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
		return "Hello";
	}
}

/*
D:\java-program-lab\method\app1\src>java -cp ../classes Z13
main begin
from test1
main end: Hello
 
string is a data type and derived data type

 Derived datatype
 -------------------
 1.all classes
 2.all interface
 3.all enums
*/
