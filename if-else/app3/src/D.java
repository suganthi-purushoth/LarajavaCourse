class  D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=0;
		if(i++==1  || i++==1)
		{
			System.out.println("if:"+i++);
		}
		else
		{
			System.out.println("else:"+i++);
			i++;
		}
		System.out.println("main end:"+i);
	}
}

/*

D:\css\app3\src>java -cp ../classes D
main begin
if:2
main end:3
/*