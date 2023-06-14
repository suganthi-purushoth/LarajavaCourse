class E 
{
	public static void main(String[] args) 
	{
		String s1=args[0];//string type accepting other types 
		int i=Integer.parseInt(s1);
		int j=i*i;
		System.out.println("square of"+i+"is"+j);
	}
}
/*
D:\java-program-lab\command-line-arguments\src>java -cp ../classes E 4
square of4is16
*/