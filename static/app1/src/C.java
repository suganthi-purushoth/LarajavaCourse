class C
{
	static float i;
	static double j;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		
	}
}

/*

D:\java-program-lab\static\app1\src>javac -d ../classes C.java

D:\java-program-lab\static\app1\src>java -cp ../classes C
0.0
0.0
*/