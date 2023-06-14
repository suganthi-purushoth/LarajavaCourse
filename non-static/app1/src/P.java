class P
{
	 int i;
	 static void test(P obj)//obj=(assined with)p1
	{
		 System.out.println("test:"+obj.i);
	}

	public static void main(String[] args) 
	{
		P p1=new P();
		System.out.println("main:"+p1.i);
		p1.i=10;
		test(p1);//test()is accepting p type of obj
	}
}

/*

D:\java-program-lab\non-static\app1\src>java -cp ../classes P
main:0
test:10

*/
