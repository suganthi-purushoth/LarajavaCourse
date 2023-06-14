class N 
{
	int i;
	public static void main(String[] args) 
	{
		N n1=new N();
		System.out.println(n1.i);
		N n2=new N();//another obj to the same cls
		System.out.println(n2.i);
		n1.i=10;
		n2.i=20;
		System.out.println(n1.i);
		System.out.println(n2.i);
	}
}
/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes N
0
0
10
20*/
