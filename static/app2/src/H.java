class H
{
	
	static int i=test1();
	static int j=test2();
	static
	{
		System.out.println("from SIB:"+i+ "," +j);
		i+=1;
		j+=2;
	}
	static int test1()
	{
		System.out.println("from test1:"+i+ ","+j);
		i+=3; //i=i+3
		j+=4;
		return i+j+10;
	}
	static int test2()
	{
		System.out.println("from test2:"+i+" ,"+j);
		i+=j+5; //i=i+j+5  =17+4+5  =26
		j+=i+6; //j=j+i+6  =4+26+6  =36
		return i+j+20;//26+36+20  =82
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i+","+j);
	}
}
/*


D:\java-program-lab\static\app2\src>java -cp ../classes H
from test1:0,0
from test2:17 ,4
from SIB:26,82
main:27,84
*/