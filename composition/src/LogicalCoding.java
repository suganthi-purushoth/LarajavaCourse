class LogicalCoding 
{
	public static void main(String[] args) 
	{
		int num=10000;
		int n=num;
		int sum=0;
		int p=1;
		int count=0;
		int d15=0;
		int d19=0;
		int r1=0;
		int r2=0;

		for(int i=1;i<=n;i++)
		{
			if(num%i==0)
			{
				count++;
				System.out.println(i+"\t");
				if(count==15)
				{
					d15=i;
				}
				if(count==19)
				{
					d19=i;
				}
			}
		}
		while(d15!=0)
		{
			r1=d15%10;
			sum=sum+r1;
			d15=d15/10;
		}
		while(d19!=0);
		{
			r2=d19%10;
			p=p*r2;
			d19=d19/10;

		}
		System.out.println("Sum of 15th divisor ="+sum);
		System.out.println("product of 19th divisor="+p);
		if(sum%5==0)
		{
			System.out.println(sum+"is divisible by 5..");
		}
		else if(sum%2==0)
		{
			System.out.println(sum+"is divisible by 2..");
		}
		else
		{
			System.out.println(sum+"is not divisible by 5 or 2..");
	}
}
}