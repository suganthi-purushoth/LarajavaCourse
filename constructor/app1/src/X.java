class X 
{
	static
	{
		System.out.println("SIB1");
	}
	static
	{
		System.out.println("SIB2");
	}
	X()
	{
		System.out.println("X()");
	}
	X(int i)
	{
		this();
		System.out.println("X(int)");
	}
	public static void main(String[] args) 
	{
		X x1=new X();
		System.out.println("-----------");
		X x2=new X(2);//again calling no arg
		System.out.println("-----------");
	}
}
//static block executes only once while creating loading the class
//constructor executes every time while creating the object.

/*

D:\java-program-lab\constructor\app1\src>java -cp ../classes X
SIB1
SIB2
X()
-----------
X()
X(int)
-----------
*/