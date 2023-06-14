class K 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(!false)
		{
			int i=100;
			System.out.println("if block -stmt1");
			System.out.println("if block -stmt2");
			System.out.println("if block -stmt3"+i);
	}
	System.out.println("main end");
	}
}


/*


D:\java-program-lab\app8\src>javac -d ../classes K.java

D:\java-program-lab\app8\src>java -cp ../classes K
main begin
if block -stmt1
if block -stmt2
if block -stmt3100
main end


/*