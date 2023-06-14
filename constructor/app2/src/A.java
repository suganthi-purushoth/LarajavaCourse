class A 
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("-----------");
		A a2=new A(10);
		System.out.println("-----------");
	}
}
/*

D:\java-program-lab\constructor\app2\src>java -cp ../classes A
A()
-----------
A(int)
-----------

*/
