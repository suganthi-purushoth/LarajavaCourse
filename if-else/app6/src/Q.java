class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String[] elements={"hello","test","123","567","true","#$%"};
		for(String element  :elements)
			{
			System.out.println(element);
			}
			System.out.println("main end");
	}
}



D:\java-program-lab\if-else\app6\src>java -cp ../classes Q
main begin
hello
test
123
567
true
#$%
main end