class S 
{
	S()
	{
		System.out.println("S()");
	}
	S(int i)
	{
		S();//cannot calling constructor like this ,compiler thinking this is a method
		System.out.println("S(int)");
		
	}

	public static void main(String[] args) 
	{
		S s1=new S();
		System.out.println("-------------");
		S s2=new S(10);
		System.out.println("-------------");
	}
}
/*
D:\java-program-lab\constructor\app1\src>javac -d ../classes S.java
S.java:9: error: cannot find symbol
                S();
                ^
  symbol:   method S()
  location: class S
1 error
*/