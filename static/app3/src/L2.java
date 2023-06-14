class L2
{
	static int test1()
	{
		return j=200;
	}

	static int i=test2();
	
	static int j=test2();
	
	static int test2()
	{
		return i=test1();
	}
	public static void main(String[] args) 
	{
		System.out.println(i+ " , " +j);
	}
}
/*

D:\java-program-lab\static\app3\src>java -cp ../classes L2
200 , 200
*/