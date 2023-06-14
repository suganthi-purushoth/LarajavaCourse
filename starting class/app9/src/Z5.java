class  Z5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if1 begin");
			if(true)
			{
				System.out.println("if 2");
			}
			System.out.println("if1 end");
		}
		System.out.println("main end");
	}
}


/*



D:\java-program-lab\app9\src>java -cp ../classes Z5
main begin
main end


/*