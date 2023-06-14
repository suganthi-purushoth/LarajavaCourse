class  Q
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
					i++;
					continue abc;
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

D:\java-program-lab\if-else\app7\src>java -cp ../classes Q
main begin
loop begin:1
inner loop begin1,101
inner loop end1,101
inner loop begin1,102
loop begin:2
inner loop begin2,101
inner loop end2,101
inner loop begin2,102
loop begin:3
inner loop begin3,101
inner loop end3,101
inner loop begin3,102
loop begin:4
inner loop begin4,101
inner loop end4,101
inner loop begin4,102
loop begin:5
inner loop begin5,101
inner loop end5,101
inner loop begin5,102
main end:6
*/
