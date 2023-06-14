class K 
{
	K()
	{
		System.out.println("K()");
	}
	
	{
		System.out.println("IIB1");
	}
	K(int i)
	{
		this();
		System.out.println("K(int)");
	}
	static
	{
		
		System.out.println("SIB1");
	}
	K(int i,int j)
	{
		this(j);
		System.out.println("K(int,int)");
	}
	static
	{
		
		System.out.println("SIB2");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args) 
	{
		K k1=new K();
		System.out.println("--------");
		K k2=new K(10);
		System.out.println("--------");
		K k3=new K(10,20);
		System.out.println("--------");
	}
	
}
/*
1.SIB
2.IIB
3.this calling statement

D:\java-program-lab\constructor\app2\src>java -cp ../classes K
SIB1
SIB2
IIB1
IIB2
K()
--------
IIB1
IIB2
K()
K(int)
--------
IIB1
IIB2
K()
K(int)
K(int,int)
--------
*/