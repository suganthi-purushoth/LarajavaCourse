class  H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		while(i++<=5)
		
			System.out.println("loop begin:"+ i);
			System.out.println("loop end:"+i);
			i++;
		System.out.println("main end:"+i);
	}
}

/*


D:\java-program-lab\if-else\app7\src>java -cp ../classes H
main begin
loop begin:2
loop begin:3
loop begin:4
loop begin:5
loop begin:6
loop end:7
main end:8

*/