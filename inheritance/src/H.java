class G 
{
	static void test1()
	{
		System.out.println("G-test1");
	}
}
class H extends G
{
	static void test2()//static methods
	{
		System.out.println("H-test2");
	}
	public static void main(String[] args) 
	{
		H.test1();//G.test1()=its not accessing 
		H.test2();
	}
}
//static methos also will be inheriting to the sub class
/*
D:\java-program-lab\inheritance\src>java -cp ../classes H
G-test1
H-test2
*/