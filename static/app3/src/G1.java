class G1
{
	static int i=G1.j;//indirect read
	static int j;//direct read

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}

/*

D:\java-program-lab\static\app3\src>java -cp ../classes G1
0
0
*/