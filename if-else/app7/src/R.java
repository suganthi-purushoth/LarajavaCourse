class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		abc:
		while(i<=5)
		{
			System.out.println("loop begin:"+ i);
			for(int j=101;j<=103;j++)

			{
				System.out.println("inner loop begin"+ i+ ","+j);
				if(j==102)
				{
					
					break abc;
				}
				System.out.println("inner loop end"+ i+ ","+j);
				
			}
			System.out.println("loop end:"+i);
			i++;
		}

		System.out.println("main end:"+i);
	}

	
}



/*
D:\java-program-lab\if-else\app7\src>java -cp ../classes R
main begin
loop begin:1
inner loop begin1,101
inner loop end1,101
inner loop begin1,102
main end:1
*/