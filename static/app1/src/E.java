class E
{
	static char i;

	public static void main(String[] args) 
	{
		System.out.println(i);  //'\u0000'
	}
}
/*

D:\java-program-lab\static\app1\src>java -cp ../classes E

//its no visible just blank line
*/