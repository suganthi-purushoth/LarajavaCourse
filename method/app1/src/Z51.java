class Z51
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		int i=1;//
		int j=test1(i++,true) /*1*/+ i /*2*/+	
			    test1(++i,true) /*3*/+ i /*3*/ +
			test1(i++,false) /*4*/  +  i /*4*/ +
			test2(i++,false) /*4*/ +  i /*5*/ +
			test2(++i,false)  /*6*/+  i /*6*/+
			test2(i++,true) /*7*/+i/*7*/;
		//  j  = 1 + 2 + 3+ 3 + 4 + 4 + 4 + 5 + 6 + 6 + 7 + 7
		System.out.println(i);
		System.out.println(j);
	}
	static int test1(int i, boolean flag)
	{
		return flag ? i++ : ++i;
	}
	static int test2(int i,boolean flag)
	{
		return flag ? ++i   :  i++;
	}
}

/*


D:\java-program-lab\method\app1\src>java -cp ../classes Z51
main begin
7
52
*/