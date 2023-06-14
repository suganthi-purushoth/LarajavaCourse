class N
{
	public static void main(String[] args) 
	{
		String i="abc";
		switch(i)
		{
			case "1"://case name data type should be case argument type
				System.out.println("from case xyz");
				
			break;

			case "2":
				System.out.println("from case def");
				
			break;
			case "3":
				System.out.println("from case abc");
				
			break;
	}
	
}
}
/*
compilation success
no geting out put
because no case match
*/