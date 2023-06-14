class Z4
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		int i=10+test();
		System.out.println("--------------");
		System.out.println(test()+"in the main@a:");
		System.out.println("--------------");
		System.out.println(i+test()+"in the main@b:");
		System.out.println("---------------");
		System.out.println(i+test()+test()+"in the main@c:");
		System.out.println("---------------");
		System.out.println("@d:"+(i+test()+test()+test()));
		//System.out.println("@d:"+i+test()+test()+test());  concadination o/p is @d:110100100100
		System.out.println("main end");
	}
	public static int test()
	{

		System.out.println("from test");
		return 100;
	}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z4
main begin
from test
--------------
from test
100in the main@a:
--------------
from test
210in the main@b:
---------------
from test
from test
310in the main@c:
---------------
from test
from test
from test
@d:410
main end

*/
