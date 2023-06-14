class J 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin ");
		if(false)
		{
			System.out.println("if block");
		}
		System.out.println("main end");
	}
}


/*

D:\java-program-lab\app8\src>javac -d ../classes J.java

D:\java-program-lab\app8\src>java -cp ../classes J
main begin
main end


/*