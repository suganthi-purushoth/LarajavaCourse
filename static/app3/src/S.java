 class A 
{
	static void test()//test method
	{
		System.out.println("from A.test");
	}
	static
	{
		System.out.println("from A.SIB");
	}
}

class B
{
	static void test()
	{
		System.out.println("from B.test");
	}
	static
	{
		System.out.println("from B.SIB");
	}
}
class S
{		
	static
	{
		System.out.println("from S.SIB");
	}

	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		A.test();//A cls executing here
		System.out.println("------------");
		B.test();//B cls executing from the memory
		System.out.println("-------------");
		System.out.println("main end");
	}
}
/*

D:\java-program-lab\static\app3\src>java -cp ../classes S
from S.SIB
main begin
from A.SIB
from A.test
------------
from B.SIB
from B.test
-------------
main end
*/

