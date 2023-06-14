class E 
{
	static int count;
	E()
	{
		count++;
	}
	E(int i)
	{
		count++;
	}
	E(int i,int j)
	{
		count++;
	}
	public static void main(String[] args) 
	{
		E e1=new E();//0 become 1
		E e2=new E(10);//1 become 2
		E e3=new E(10,20);
		E e4=new E(20);
		E e5=new E();//4 become 5
		System.out.println(count);
	}
}
/*

D:\java-program-lab\obj-count\app1\src>java -cp ../classes E
5
*/
