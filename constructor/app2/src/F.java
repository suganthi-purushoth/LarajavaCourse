class F 
{
	
	{
		System.out.println("F-IIB1");
	}
	
	F(int i)
	{
		this();
		System.out.println("F(int)");
	}
	F()
	{
		System.out.println("F()");
	}
	public static void main(String[] args) 
	{
		F f1=new F();
		System.out.println("--------");
		F f2=new F(10);
		System.out.println("--------");
	}
	
}
//constructor is calling  wise,  IIB is obj wise
/*
D:\java-program-lab\constructor\app2\src>java -cp ../classes F
F-IIB1
F()
--------
F-IIB1
F()
F(int)
--------

*/