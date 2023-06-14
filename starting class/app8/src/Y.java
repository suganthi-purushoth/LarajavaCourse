class  Y
{
	public static void main(String[] args) 
	{
		int i=0;
		if(true &&(i++==0))
		{
			System.out.println("if block:"+ i++);
		}
		System.out.println("main end:"+i);
	}
}


/*

D:\java-program-lab\app8\src>java -cp ../classes Y
if block:1
main end:2

/*