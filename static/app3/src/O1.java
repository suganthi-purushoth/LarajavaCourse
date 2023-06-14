class  O1
{
	static
	{
		System.out.println("in from static");
		System.exit(1000);//its expecting compelsary value na empty like ()
	}
	public static void main(String[] args) 
	{
		System.out.println("in from main");
	}
}
/*

D:\java-program-lab\static\app3\src>java -cp ../classes O1
in from static
*/