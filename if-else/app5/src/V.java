class V 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1,j=20;i<=10;i++,j+=3)
		{
		System.out.println("loop body:"+i+","+j);
		}
	}
}


//D:\java-program-lab\if-else\app5\src>java -cp ../classes V
//main begin
//loop body:1,20
//loop body:2,23
//loop body:3,26
//loop body:4,29
//loop body:5,32
//loop body:6,35
//loop body:7,38
//loop body:8,41
//loop body:9,44
//loop body:10,47