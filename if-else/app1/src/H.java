class H
{
	public static void main(String[] args) 
	{
		if(true)
		{
			System.out.println("if");
			if(true)
			{
			System.out.println("inner if");
			}
		}
	}
}
/*

D:\app1\src>java -cp ../classes H
if
inner if
/*