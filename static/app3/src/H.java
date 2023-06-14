class H
{
	static int i=test();
	static int j;//direct read

	static int test()
	{
		return j;
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*

D:\java-program-lab\static\app3\src>java -cp ../classes H
done
*/