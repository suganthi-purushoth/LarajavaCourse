class F 
{
	static int count;
	F()
	{
		count++;
	}
	F(int i)
	{
		count++;
	}
	F(int i,int j)
	{
		count++;
	}
	//common code that we suppose to keep in every constructor body 
	{
		count++;//IIB block
	}
	public static void main(String[] args) 
	{
		F f1=new F();
		F f2=new F(10);
		F f3=new F(10,20);
		F f4=new F(20);
		F f5=new F();
		System.out.println(count);
	}
}
/*
every obj creation IIB block will be executing

D:\java-program-lab\obj-count\app1\src>java -cp ../classes F
10
*/
