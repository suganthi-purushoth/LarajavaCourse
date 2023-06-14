class Y1
{
	static Y1 y1=new Y1();
	Y1()
	{
		System.out.println("Y()");
	}
	static
	{
		Y1 y1=new Y1();
		System.out.println("SIB");
	}
	public static void main(String[] args) 
	{
		
		System.out.println("-----------");
		Y1 y2=new Y1();//again calling no arg
		System.out.println("-----------");
	}
}
//static block executes only once while creating loading the class
//constructor executes every time while creating the object.

/*

D:\java-program-lab\constructor\app1\src>java -cp ../classes Y1
Y()
Y()
SIB
-----------
Y()
-----------

*/