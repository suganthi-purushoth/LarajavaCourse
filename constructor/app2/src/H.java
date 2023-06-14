class H 
{
	H(int i)
	{
		
		System.out.println("H(int)");
	}
	
	{
		System.out.println("IIB1");
	}
	H()
	{
		this(90);
		System.out.println("H()");
	}
	{
		System.out.println("IIB2");
	}
	
	public static void main(String[] args) 
	{
		H h1=new H();
		System.out.println("--------");
		H h2=new H(10);
		System.out.println("--------");
	}
	
}
//constructor is calling  wise,  IIB is obj wise
/*
D:\java-program-lab\constructor\app2\src>java -cp ../classes H
IIB1
IIB2
H(int)
H()
--------
IIB1
IIB2
H(int)
--------

*/