class B
{
	public static void main(String[] args) 
	{
		int i=10;
		if(i==100)
		{
			System.out.println("from if block");
		}
		else
		{
		System.out.println("from else block");
		}
		System.out.println("main end");
	}
}

/*

D:\app1\src>java -cp ../classes B
from else block
main end

/*