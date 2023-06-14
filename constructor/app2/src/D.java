class D 
{
	D()
	{
		System.out.println("D()");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	D(int i)
	{
		System.out.println("D(int)");
	}
	public static void main(String[] args) 
	{
		D d1=new D();
		System.out.println("--------");
		D d2=new D(10);
		System.out.println("--------");
	}
}
/*
D:\java-program-lab\constructor\app2\src>java -cp ../classes D
IIB1
IIB2
D()
--------
IIB1
IIB2
D(int)
--------

*/