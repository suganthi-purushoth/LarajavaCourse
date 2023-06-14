class F 
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
		else if(i>2)
		{
			System.out.println("from else if 2");

		}
		else
		{
			System.out.println("from last else");
		}
	}
}
/*
D:\css\app2\src>java -cp ../classes F
from last else

/*