class D1 
{
	static int i=10;
	static int j=20;
	static
	{
		System.out.println("SIB");//static initialization block
		//when execute from top to bottom only once 
	}
	static
	{
		System.out.println("SIB");//static initialization block
	}
	
	static
	{
		System.out.println("SIB");//static initialization block
	}
	public static void main(String[] args) 
	{
		System.out.println(i+","+j);
	}
	static
	{
		System.out.println("SIB");//static initialization block
	}
	static
	{
		System.out.println("SIB");//static initialization block
	}
}
/*

D:\java-program-lab\static\app2\src>java -cp ../classes D1
SIB
SIB
SIB
SIB
SIB
10,20
*/