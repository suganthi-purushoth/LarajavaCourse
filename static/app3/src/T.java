 class A 
{
	static int i;
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
	static int j;
	static void test()
	{
		System.out.println("from B.test");
	}
	static
	{
		System.out.println("from B.SIB");
	}
}
class T
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
		System.out.println("------------");
		System.out.println(A.i);
		System.out.println("------------");
		System.out.println(B.j);
		
		System.out.println("-------------");
		A.test();//no need of execution again only i value is execute
		System.out.println("-------------");
		B.test();
		System.out.println("main end");
	}
}
//when cls will be calling that time only entire cls will be execute not 2nd time
//cls will be executing only once for (entire execution

/*
D:\java-program-lab\static\app3\src>java -cp ../classes T
from S.SIB
main begin
from A.SIB
from A.test
------------
from B.SIB
from B.test
------------
0
------------
0
-------------
from A.test
-------------
from B.test
main end

*/

