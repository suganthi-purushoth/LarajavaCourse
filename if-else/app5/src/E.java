class E
{
	public static void main(String[] args) 
	{
			System.out.println("main begin");
		int i=1;
		for(;i<=5;)
		{
			System.out.println("loop body:"+ ( i+=1));
		}
		System.out.println("main end:"+i);
	}
}
//D:\java-program-lab\if-else\app5\src>java -cp ../classes E
//main begin
//loop body:2
//loop body:3
//loop body:4
//loop body:5
//loop body:6
//main end:6
