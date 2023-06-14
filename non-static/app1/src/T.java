class T 
{
	int i;
	static T test()//cls name data type
	{
		T t1=new T();
		t1.i=20;
		return t1;
	}
	public static void main(String[] args) 
	{
		T obj=test();
		System.out.println(obj.i);
	}
}
/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes T
20
*/
