class R 
{
	int i;
	static void test(R obj)//obj=r1
	{
		obj.i=20;
	}
	public static void main(String[] args) 
	{
		R r1=new R();
		r1.i=10;
		System.out.println("A:"+r1.i);
		//pass by reference/call by reference

		//changes in the destination reflecting to the source.
		test(r1);
		System.out.println("B:"+r1.i);
	}
}
//pass by ref means we are calling test() with ref var
//changing destination reflect to the source
/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes R
A:10
B:20

*/