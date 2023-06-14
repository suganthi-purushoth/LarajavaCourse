//each and every class will be extending object class either directly or indirectly
//if class is not extending any other class then that class is direct subclass of object class
//if the class is already extending another class then that class is the indirect sub class of object class.
//whether we keep it or not compiler only keeps the extends for all the classes.

class K //extends Object
{
	K()
	{
		super();//if you dont keep any explicit super or this calling statment in the constructor body as afirst stament,
		              //then compiler only keeps the super with no argument calling statement.
		System.out.println("K()");
	}
}
class L extends K
{
	L()
	{
		super();//indirect sub cls of obj cls(calling no argument constructor)
		System.out.println("L()");
	}
	public static void main(String[] args) 
	{
		L obj=new L();
	}
}
/*
D:\java-program-lab\inheritance\src>java -cp ../classes L
K()
L()
*/