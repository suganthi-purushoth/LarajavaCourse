class D
{
	static int i;
	static int j=D.i;//direct read

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*

D:\java-program-lab\static\app3\src>java -cp ../classes D
done
*/