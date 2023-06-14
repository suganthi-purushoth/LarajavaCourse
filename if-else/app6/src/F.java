class  F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1;i<=10;i++)
		{
			System.out.println("loop begin:"+i);
			if(i==4)
			{
				System.out.println("if begin");
				break;
			}
			System.out.println("loop end:"+i);
		  }
			System.out.println("main end");

	}
}


D:\java-program-lab\if-else\app6\src>java -cp ../classes F
main begin
loop begin:1
loop end:1
loop begin:2
loop end:2
loop begin:3
loop end:3
loop begin:4
if begin
main end