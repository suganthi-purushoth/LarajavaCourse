class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1;i<=10;i++)
		{
			System.out.println("loop begin:"+i);
			if(i<=4)
			{
				continue;
			}
			System.out.println("loop end:"+i);
		}
			System.out.println("main end");
	}
}


//D:\java-program-lab\if-else\app6\src>java -cp ../classes C
//main begin
//loop begin:1
//loop begin:2
//loop begin:3
//loop begin:4
//loop begin:5
//loop end:5
//loop begin:6
//loop end:6
//loop begin:7
//loop end:7
//loop begin:8
//loop end:8
//loop begin:9
//loop end:9
//loop begin:10
//loop end:10
//main end