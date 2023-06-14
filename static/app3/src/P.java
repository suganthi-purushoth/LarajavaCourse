class A 
{
	static int i;
}
class P
{

	public static void main(String[] args) 
	{
		//System.out.println("main :"+ i);
		System.out.println("main :"+A.i);
	}
}
/*
D:\java-program-lab\static\app3\src>java -cp ../classes P
main :0
*/