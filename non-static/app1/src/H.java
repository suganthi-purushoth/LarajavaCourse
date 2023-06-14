class H 
{
	void test()
	{
	}

	public static void main(String[] args) 
	{
		H h1=new H();
		h1.test();
		System.out.println("done");
	}
}
//10=int i; not possible
//non static method test is loading to the memory whenever we are creating an object to the H class.
//by using H class reference h1 we can access test method is non static

/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes H
done*/