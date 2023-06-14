class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		if(true)
		{
			System.out.println("if block");
			return ;
		}
		System.out.println("main end");
	}
}

/*

D:\java-program-lab\method\app1\src>javac -d ../classes O.java

D:\java-program-lab\method\app1\src>java -cp ../classes O
main begin
if block
*/