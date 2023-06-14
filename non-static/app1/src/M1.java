class M1
{
	 static int i=200;//non-static
	static
	{
		System.out.println(i);//initial value
		i=100;//we re initialized any no.of times.
		System.out.println(i);//re initialized value
	}

	public static void main(String[] args) 
	{
	}
		
}
/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes M1
200
100
*/