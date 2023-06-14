class N 
{
	public static void main(String[] args) 
	{
		boolean b1=true;
		if(b1)
		{
			System.out.println("if block:"+b1);
		}

		System.out.println("main end"+b1);
	}
}
D:\java-program-lab\app8\src>javac -d ../classes N.java

D:\java-program-lab\app8\src>java -cp ../classes N
if block:true
main endtrue