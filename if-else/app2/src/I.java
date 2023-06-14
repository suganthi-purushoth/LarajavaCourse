class  I
{
	public static void main(String[] args) 
	{
			int i=2;
		if(i>10)
		{
			System.out.println("from if");
		}
		
		else if(i>5)
		{
			System.out.println("from else if 1");
		}
		else if(i>100)
		{
			System.out.println("from last else");
		}
		System.out.println("from last else 1");
		else if(i>2)
		{
			System.out.println("from else if 2");

		}
	}
}

/*
D:\css\app2\src>javac -d ../classes I.java
I.java:20: error: 'else' without 'if'
                else if(i>2)
                ^
1 error
/*