class C 
{
	static int count;
	C()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		C obj1=new C();
		System.out.println("a:"+obj1.count);//same output
		C obj2=new C();
		System.out.println("b:"+count);
		C obj3=new C();
		System.out.println("c:"+count);
		C obj4=new C();
		System.out.println("d:"+count);
		C obj5=new C();
		System.out.println("e:"+count);
	}
}
/*
D:\java-program-lab\obj-count\app1\src>java -cp ../classes C
a:1
b:2
c:3
d:4
e:5
*/