class N1
{
	N()
	{
		System.out.println("N()");
		System.out.println("N()");
		System.out.println("N()");
	}
	N(int i)
	{
		this();//using default block constructor fully
		System.out.println("N(int)");
	}

	public static void main(String[] args) 
	{
		N n1=new N();
		System.out.println("-----------");
		N n2=new N(10);
		System.out.println("-----------");
	}
}
//in every constructor body the first statement would be super() calling statement.(if the programmer didnot keep super or this calling statement explicitely)

/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes N.java

D:\java-program-lab\constructor\app1\src>java -cp ../classes N
N()
N()
N()
-----------
N()
N()
N()
N(int)
-----------
*/