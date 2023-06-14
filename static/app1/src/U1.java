class U1
{
	static int i;
	public static void main(String[] args) 
	{
		int i=10;	
		System.out.println("main:"+U.i);
		System.out.println("main:"+i);
		test();
		
		U.test();
	}
	public static void test()
	{
		System.out.println("test:"+i);
	}
}
class V
{
	public static void main(String[]args)
	{
		System.out.println("main:"+U.i);
	}
}

/*

D:\java-program-lab\static\app1\src>java -cp ../classes U1
main:0
main:10
test:0
test:0
*/