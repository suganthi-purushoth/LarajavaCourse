class Z
{
	static//inside the static block also create a obj
	{
		System.out.println("SIB begin");
		Z z1=new Z();
		System.out.println("SIB end");
	}
	Z()
	{
		System.out.println("Z()");
	}
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("-----------");
		Z z1=new Z();//again calling no arg
		System.out.println("-----------");
	}
}
//static block executes only once while creating loading the class
//constructor executes every time while creating the object.

/*

D:\java-program-lab\constructor\app1\src>java -cp ../classes Z
SIB begin
Z()
SIB end
-----------
Z()
-----------
*/