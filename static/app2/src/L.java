class L 
{
	static int i=test();
	public static int test()
	{
		System.out.println("test bein:"+i);
		i=1;
		main(null);
		System.out.println("test end :"+i);
		i=2;
		return i+2;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
		i+=5;
	}
	static
	{
		System.out.println("SIB begin:"+i);
		i=3;
		main(null);;
		System.out.println("SIB end:"+i);

	}
}

/*

D:\java-program-lab\static\app3\src>java -cp ../classes L
test bein:0
main:1
test end :6
SIB begin:4
main:3
SIB end:8
main:8
*/