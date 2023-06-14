class  G17
{
	public static void main(String[] args) 
	{
		{
			{
				int i=10;//inner block
		    System.out.println("Inner NormalBlock:"+i);
			}
			System.out.println("OuterNormalBlock:"+i);//i cannot use outer block
		}
		System.out.println("main end:"+i);
	}
}
/*

D:\java-program-lab\switchcase\app1\src>javac -d ../classes G17.java
G17.java:10: error: cannot find symbol
                        System.out.println("HelloNormalBlock:"+i);
                                                               ^
  symbol:   variable i
  location: class G17
G17.java:12: error: cannot find symbol
                System.out.println("main end:"+i);
                                               ^
  symbol:   variable i
  location: class G17
2 errors
*/