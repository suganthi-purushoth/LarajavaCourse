class  B
{
	public static void main(String[] args) 
	{
		if (true)
		{
			System.out.println("from if");
		}
		else if (true)
		{
			System.out.println("from else if");

		}
		else if(true)
		{
		System.out.println("from else if");
		}
	}
}

/*
D:\css\app2\src>javac -d ../classes B.java

D:\css\app2\src>java -cp ../classes B
from if
/*