class S 
{
	public static void main(String[] args) 
	{
		int i=10;
		if(i==10)
		{
			System.out.println("if block:"+i++);
		}
		System.out.println("main end:"+i);
		
	}
}


/*



D:\java-program-lab\app8\src>javac -d ../classes S.java

D:\java-program-lab\app8\src>java -cp ../classes S
if block:10
main end:11

/*