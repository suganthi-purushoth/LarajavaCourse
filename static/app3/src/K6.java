class K6
{
	
	static int test()//static method
	{
		return i=90;
	}
	
	static int i;

	public static void main(String[] args) 
	{
		System.out.println("done:"+test());
		
	}
}

/*

D:\java-program-lab\static\app3\src>java -cp ../classes K6
done:90

*/