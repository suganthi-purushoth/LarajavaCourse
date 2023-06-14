 class A 
{
	static void test()//test method
	{
		System.out.println("from A.test");
	}
	static //static block

	{
		System.out.println("from A.SIB1");
	}
}

class Q1
{		

	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		A.test();//A cls executing here
		System.out.println("main end");
	}
}
/*

D:\java-program-lab\static\app3\src>java -cp ../classes Q1
main begin
from A.SIB1
from A.test
main end
*/

