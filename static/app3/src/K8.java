class K8
{
	static 
	{
		i=100;
	}
	static int test()//static method
	{
		return i=90;
	}
	
	static int i;
	static int j=i;

	public static void main(String[] args) 
	{
		System.out.println("done:"+test());
		System.out.println("done:"+j);
		System.out.println("done:"+i);
		
	}
}

/*

D:\java-program-lab\static\app3\src>java -cp ../classes K8
done:90
done:100
done:90


*/