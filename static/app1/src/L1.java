class L1
{
	static boolean m;

	public static void main(String[] args) 
	{
		boolean m=true;
		System.out.println(L1.m);
		System.out.println(m);

	}
}
//global and local having same name but local is important to main()
/*


D:\java-program-lab\static\app1\src>java -cp ../classes L1
false
true
*/
