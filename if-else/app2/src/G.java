class G 
{
	public static void main(String[] args) 
	{
		int i=2;
		if(i>10)
		{
			System.out.println("from if");
		}
		else
		{
			System.out.println("from last else");
		}
		else if(i>5)
		{
			System.out.println("from else if 1");
		}
		else if(i>2)
		{
			System.out.println("from else if 2");

		}
		
	}
}

/*
D:\css\app2\src>javac -d ../classes G.java
G.java:14: error: 'else' without 'if'
                else if(i>5)
                ^
1 error
/*
