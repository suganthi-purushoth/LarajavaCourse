class N
{
	static int i;

	public static void main(String[] args) 
	{
		
		System.out.println(i);
		System.out.println(N.i);

	}
}
//local not having i but global calling to local val of i()
/*

D:\java-program-lab\static\app1\src>java -cp ../classes N
0
0
*/
