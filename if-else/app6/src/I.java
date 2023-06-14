class I 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1;i<=10;i++)
		{
			System.out.println("outer loop begin:"+i);
			for(int j=101;j<=105;j++)
			{
				System.out.println("inner loop begin:"+i +","+j);
			}
			System.out.println("outer loop end:"+i);
		  }
			System.out.println("main end");
	}
}


/*
D:\java-program-lab\if-else\app6\src>java -cp ../classes I
main begin
outer loop begin:1
inner loop begin:1,101
inner loop begin:1,102
inner loop begin:1,103
inner loop begin:1,104
inner loop begin:1,105
outer loop end:1
outer loop begin:2
inner loop begin:2,101
inner loop begin:2,102
inner loop begin:2,103
inner loop begin:2,104
inner loop begin:2,105
outer loop end:2
outer loop begin:3
inner loop begin:3,101
inner loop begin:3,102
inner loop begin:3,103
inner loop begin:3,104
inner loop begin:3,105
outer loop end:3
outer loop begin:4
inner loop begin:4,101
inner loop begin:4,102
inner loop begin:4,103
inner loop begin:4,104
inner loop begin:4,105
outer loop end:4
outer loop begin:5
inner loop begin:5,101
inner loop begin:5,102
inner loop begin:5,103
inner loop begin:5,104
inner loop begin:5,105
outer loop end:5
outer loop begin:6
inner loop begin:6,101
inner loop begin:6,102
inner loop begin:6,103
inner loop begin:6,104
inner loop begin:6,105
outer loop end:6
outer loop begin:7
inner loop begin:7,101
inner loop begin:7,102
inner loop begin:7,103
inner loop begin:7,104
inner loop begin:7,105
outer loop end:7
outer loop begin:8
inner loop begin:8,101
inner loop begin:8,102
inner loop begin:8,103
inner loop begin:8,104
inner loop begin:8,105
outer loop end:8
outer loop begin:9
inner loop begin:9,101
inner loop begin:9,102
inner loop begin:9,103
inner loop begin:9,104
inner loop begin:9,105
outer loop end:9
outer loop begin:10
inner loop begin:10,101
inner loop begin:10,102
inner loop begin:10,103
inner loop begin:10,104
inner loop begin:10,105
outer loop end:10
main end/*