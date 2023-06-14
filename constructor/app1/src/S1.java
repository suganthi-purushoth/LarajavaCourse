class S1
{
	static void S()//S();line no.14 calling method
	{
		System.out.println("T(int)");
	}

	S1()
	{
		System.out.println("S()");
	}
	S1(int i)
	{
		S();//cannot calling constructor like this ,compiler thinking this is a method
		System.out.println("S(int)");
		
	}

	public static void main(String[] args) 
	{
		S1 s1=new S1();
		System.out.println("-------------");
		S1 s2=new S1(10);
		System.out.println("-------------");
	}
}
/*

D:\java-program-lab\constructor\app1\src>java -cp ../classes S1
S()
-------------
T(int)
S(int)
-------------

*/