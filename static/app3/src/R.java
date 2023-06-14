 class A 
{
	static void test()//test method
	{
		System.out.println("from A.test");
	}
}
class B
{
	static void test()
	{
		System.out.println("from B.test");
	}
}
class R
{		

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

D:\java-program-lab\static\app3\src>java -cp ../classes R
main begin
from A.test
------------
from B.test
-------------
main end
*/

