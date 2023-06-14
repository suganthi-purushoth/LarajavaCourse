class K1
{
	int i;
	static K2 k2=new K2();
	static
	{
		
		System.out.println("static:"+k2.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main"+k2.i);
	}

}
//non static mem cannot be reference with out ref var
//ststic block also comes under static constant or static area


/*

D:\java-program-lab\non-static\app1\src>java -cp ../classes K1
0
static:0
main0
*/
	
