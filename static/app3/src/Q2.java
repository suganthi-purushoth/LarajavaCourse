 class A 
{
	static void test()
	{
		System.out.println("from A.test");
	}

}

class Q2
{		

	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		A.test();//A cls executing here
		System.out.println("main end");
	}
}
/*

D:\java-program-lab\static\app3\src>java -cp ../classes Q2
main begin
from A.test
main end
*/

