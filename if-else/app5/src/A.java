class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1; i<=5; i++)
		{
			System.out.println("loop body:"+i);
		}
		System.out.println("main end");
	}
}


//D:\java-program-lab\if-else\app5\src>java -cp ../classes A
//main begin
//loop body:1
//loop body:2
//loop body:3
//loop body:4
//loop body:5
//main end