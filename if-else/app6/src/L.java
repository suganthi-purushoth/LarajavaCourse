class L 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1;i<=2;i++)
		{
			System.out.println("outer loop begin:"+i);
			for(int j=101;j<=105;j++)
			{
				System.out.println("inner loop begin:"+i +","+j);
			if(j==103)
			{
				break;
			}
			System.out.println("inner loop end:"+i +","+j);
		}
			System.out.println("outer loop end:"+i);
		  }
			System.out.println("main end");
	}
}


/*
D:\java-program-lab\if-else\app6\src>java -cp ../classes L
main begin
outer loop begin:1
inner loop begin:1,101
inner loop end:1,101
inner loop begin:1,102
inner loop end:1,102
inner loop begin:1,103
outer loop end:1
outer loop begin:2
inner loop begin:2,101
inner loop end:2,101
inner loop begin:2,102
inner loop end:2,102
inner loop begin:2,103
outer loop end:2
main end /*