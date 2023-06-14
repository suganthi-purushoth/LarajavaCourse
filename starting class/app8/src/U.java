class U 
{
	public static void main(String[] args) 
	{
		
		int i=0;
		if(i++==i++)
		{
			System.out.println("if block:"+ i++);
		}
		System.out.println("main end:"+i);
	
	}
}


/*


D:\java-program-lab\app8\src>java -cp ../classes U
main end:2

/*