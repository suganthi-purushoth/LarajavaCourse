class Y 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1,j=20;i<=20 && j<=20; i++,j+=3)
		{
		System.out.println("loop body:"+i+","+j);
		}
	}
}

//D:\java-program-lab\if-else\app5\src>java -cp ../classes Y
//main begin
//loop body:1,20