class A 
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class U extends A
{
	U(int i)
	{
		super(i);//we are only keeping the argument constructor,super with argument constructor
		System.out.println("U(int)");
	}
	public static void main(String[] args) 
	{
		U u1=new U(90);
		System.out.println("Done");
	}
}
/*
D:\java-program-lab\inheritance\src>java -cp ../classes U
A(int)
U(int)
Done
*/