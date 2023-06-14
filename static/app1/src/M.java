class M
{
	static int i;

	public static void main(String[] args) 
	{
		boolean i=true;
		System.out.println(i);
		System.out.println(M.i);

	}
}
//global and local having same name but local is important to main()
/*


D:\java-program-lab\static\app1\src>java -cp ../classes M
true
0
*/
