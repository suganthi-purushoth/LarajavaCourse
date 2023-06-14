class M 
{
	 static int i;//non-static
	
	public static void main(String[] args) 
	{
		M m1=new M();
		System.out.println(m1.i);//initial value
		m1.i=10;//we re initialized any no.of times.
		System.out.println(m1.i);//re initialized value
	}
}
/*

D:\java-program-lab\non-static\app1\src>java -cp ../classes M
0
10

*/