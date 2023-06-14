class  Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		
			System.out.println("if block stmt1");
			System.out.println("if block stmt2");
			System.out.println("if block stmt3");
		
		System.out.println("main  end");
	}
}


/*

D:\java-program-lab\app9\src>javac -d ../classes Z1.java

D:\java-program-lab\app9\src>java -cp ../classes Z1
main begin
if block stmt2
if block stmt3
main  end

/*