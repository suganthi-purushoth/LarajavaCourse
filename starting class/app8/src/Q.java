class Q 
{
	public static void main(String[] args) 
	{
		boolean b1=false;
		if(b1=true)
		{
			System.out.println("if block:"+b1);
		}
		System.out.println("main end:"+b1);
		
	}
}


/*

D:\java-program-lab\app8\src>javac -d ../classes Q.java

D:\java-program-lab\app8\src>java -cp ../classes Q
main end:false

/*