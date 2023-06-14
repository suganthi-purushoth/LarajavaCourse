class EX4 
{
	public static void main(String[] args) 
	{
		int i=24365651;
		int count=0;
		while(i!=0)
		{
			count ++;
			i=i/10;
		}

		System.out.println("number of digits in"+i+ "is"+count);
	}
}
/*

D:\java-program-lab\numbersystem\src>java -cp ../classes EX4
number of digits in0is8

*/