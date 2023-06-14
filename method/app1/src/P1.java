class P1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		System.out.println("main end"+test());
	}
	public static int test()
	{
		System.out.println("test begin");
		if(true)
		{
			System.out.println("if block");
			return 20;
		}
		System.out.println("test end");
		return 10;
	}
}

/*


D:\java-program-lab\method\app1\src>java -cp ../classes P1
main begin
test begin
if block
main end20


*/