class U //
{
	int i;
	static U test()//cls name data type
	{
		U u1=new U();
		System.out.println(u1.i);
		u1.i=20;
		System.out.println(u1.i);
		return u1;//test() having U and return u1 val
	}
	public static void main(String[] args) 
	{
		U obj=test();
		System.out.println(obj.i);
		obj.i=40;
		System.out.println(obj.i);

		U kavin=test();
		System.out.println(kavin.i);
		kavin.i=80;
		System.out.println(kavin.i);
		System.out.println(obj.i);
	}
}
//saving U2(file name) but cls name U(cls name),compile U2 and running U
//every time calling test() creating new obj 

/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes U
0
20
20
40
0
20
20
80
40
*/
