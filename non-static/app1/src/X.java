class X 
{
	int i;
	static void test(X obj1,X obj2)//X obj1=x1,obj2=x2
	{
		
		int i=obj1.i;
		obj1.i=obj2.i;
		obj2.i=i;//swapping obj1,obj2 values
		
	}

	public static void main(String[] args) 
	{
		X x1=new X(),x2= new X();//2 obj creating and initialization also possible here
		x1.i=10;
		x2.i=20;
		System.out.println(x1.i);
		System.out.println(x2.i);

		test(x1,x2);
		System.out.println(x1.i);
		System.out.println(x2.i);
	}
}
/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes X
10
20
20
10
*/