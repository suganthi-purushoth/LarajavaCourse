class M
{
	static int i=test1();
	static int j=test2();
	static
	{
		System.out.println("sib begin:"+i+" ," +j);
		main(null);
		System.out.println("sib end:"+i+" ,"+j);
		i+=1;
		j+=1;
	}
	 static int test1()
	{
		System.out.println("test1 bein:"+i+" ," +j);
	
		main(null);
		System.out.println("test1 end :"+i+ " ," +j);
		i+=j+2;
		j+=i+1;
		return i+j+test2();
	}
	 static int test2()
	{
		System.out.println("test2 bein:"+i+" ," +j);
		i+=j+5;
		j+=i+4;
		main(null);
		System.out.println("test2 end :"+i+ " ," +j);
		i+=j+4;
		j+=i+5;
		return i+j+10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i+ "," +j);
		i+=j+i;
		j+=i+j;
	}
}

/*


D:\java-program-lab\static\app3\src>java -cp ../classes M
test1 bein:0 ,0
main:0,0
test1 end :0 ,0
test2 bein:2 ,3
main:10,17
test2 end :37 ,71
test2 bein:315 ,188
main:508,700
test2 end :1716 ,3116
sib begin:4836 ,12803
main:4836,12803
sib end:22475 ,48081
main:22476,48082
*/