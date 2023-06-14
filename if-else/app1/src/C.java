class C 
{
	public static void main(String[] args) 
	{
			if(false)
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

D:\app1\src>java -cp ../classes C
from else block
main end
/*