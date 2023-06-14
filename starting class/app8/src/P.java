class P 
{
	public static void main(String[] args) 
	{
		boolean b1=false;
		if(b1==false)
		{
			System.out.println("if block:"+b1);
		}
		System.out.println("main end:"+b1);
	}
}


/*
D:\java-program-lab\app8\src>javac -d ../classes P.java

D:\java-program-lab\app8\src>java -cp ../classes P
if block:false
main end:false
/*