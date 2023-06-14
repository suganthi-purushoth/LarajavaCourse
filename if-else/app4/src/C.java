class C 
{
	public static void main(String[] args) 
	{
		
		if(false)
		{
			int i;
			i=10;
		}
		else
		{
			i=20;
		}
			System.out.println(i);
	}
}

/*

D:\css\app4\src>javac -d ../classes C.java
C.java:13: error: cannot find symbol
                        i=20;
                        ^
  symbol:   variable i
  location: class C
C.java:15: error: cannot find symbol
                        System.out.println(i);
                                           ^
  symbol:   variable i
  location: class C
2 errors
/*