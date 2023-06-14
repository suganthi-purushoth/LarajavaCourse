class Y
{
	Y()
	{
		System.out.println("Y()");
	}
	static
	{
		Y y1=new Y();
		System.out.println("SIB");
	}
	public static void main(String[] args) 
	{
		
		System.out.println("-----------");
		Y y2=new Y();//again calling no arg
		System.out.println("-----------");
	}
}
//static block executes only once while creating loading the class
//constructor executes every time while creating the object.

/*


D:\java-program-lab\constructor\app1\src>java -cp ../classes Y
Y()
SIB
-----------
Y()
-----------
*/