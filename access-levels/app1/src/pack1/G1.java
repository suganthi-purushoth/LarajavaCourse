package pack1;
class F 
{
	private static int i=90;
	static void test()//test method not private 


	{
		System.out.println(i);
	}
}
class G1
{
	public static void main(String[] args) 
	{
		//System.out.println(F.i);
		F.test();//here calling test() 
		}
}
//private-static legal combinations
/*

D:\java-program-lab\access-levels\app1\src>java -cp ../classes pack1.G1
90
*/