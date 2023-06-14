class Z50
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		int i=1;//2,3,4,5,6,7,8,9
		int j=	test1(++i)/*3*/  +  i /*2*/ +  
			  test2(i++) /*2*/+  i /*3*/ +
			  test3(i++)/*3*/  +  i  /*4*/+ 
			  test4(++i) /*4*/ +  i /*5*/ + 
			  test1(i++) /*6*/ +  i/*6*/  +
			  test2(++i)  /*7*/+  i /*7*/ + 
			  test3(++i) /*8*/ +  i  /*8*/+  
			  test4(i++)/*7*/+  i/*9 */;

         //j= 3+ 2+ 2+ 3+ 3+ 4+ 4+ 5+ 6+ 6+ 7+ 7+ 8+ 8+ 7+ 9 
		System.out.println("main end "+i+ "," +j);  
		
	}
	public static int test1(int i)
	{
		return ++i;
		}
		public static int test2(int i)
	{
		return i++;
		}
		public static int test3(int i)
	{
		return i--;
		}
		public static int test4(int i)
	{
		return --i;
		}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z50
main begin
main end 9,84
*/