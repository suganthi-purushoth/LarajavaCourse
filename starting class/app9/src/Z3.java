class  Z3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("if1");
		}
		if(false)
		{
			System.out.println("if2");
		}
		if(true)
		{
			System.out.println("if3");
		}
		System.out.println("main end");

	}
}

/*

D:\java-program-lab\app9\src>javac -d ../classes Z3.java

D:\java-program-lab\app9\src>java -cp ../classes Z3
main begin
if1
if3
main end

/*