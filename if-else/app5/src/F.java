class  F
{
	public static void main(String[] args) 
	{
			System.out.println("main begin");
		int i=1;
		for(;i<=5;)
		{
			System.out.println("loop body:"+ ( i+=2));
		}
		System.out.println("main end:"+i);
	}
}

//D:\java-program-lab\if-else\app5\src>java -cp ../classes F
//main begin
//loop body:3
//loop body:5
//loop body:7
//main end:7