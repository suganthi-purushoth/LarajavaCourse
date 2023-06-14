class Q 
{
	int i;

	public static void main(String[] args) 
	{
		Q q1=new Q();//q1.i=0,q1,q2,q3 obj creating,obj got 3 refe, 
		q1.i=10;//assign 10
		Q q2=q1;//creating ref
		System.out.println(q2.i);
		q2.i=20;
		System.out.println(q1.i);
		Q q3=q2;
		System.out.println(q3.i);
		System.out.println(q1.i);
		System.out.println(q2.i);
	}
}
//1 obj we can any num of reference.

/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes Q
10
20
20
20
20

*/