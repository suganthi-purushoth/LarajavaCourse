class W 
{
	static
	{
		System.out.println("SIB");
	}
	W()
	{
		this(2);
		System.out.println("W()");

	}
	W(int i)
	{
		System.out.println("W(int)");
	}
	public static void main(String[] args) 
	{
		W w1=new W();
		System.out.println("-----------");
		W w2=new W();//again calling no arg
		System.out.println("-----------");
	}
}
//static block executes only once while creating loading the class
//constructor executes every time while creating the object.

/*
D:\java-program-lab\constructor\app1\src>java -cp ../classes W
SIB
W(int)
W()
-----------
W(int)
W()
-----------
*/