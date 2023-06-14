class G
{
	static int i=G.j;
	static int j;//direct read

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*

D:\java-program-lab\static\app3\src>java -cp ../classes G
done
*/