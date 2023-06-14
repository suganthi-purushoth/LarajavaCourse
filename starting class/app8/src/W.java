class  W
{
	public static void main(String[] args) 
	{
		int i=0;
		if(false||(i++==0))
		{
			System.out.println("if block:"+ i++);
		}
		System.out.println("main end:"+i);
		
	}
}


/*

D:\java-program-lab\app8\src>java -cp ../classes W
if block:1
main end:2

/*