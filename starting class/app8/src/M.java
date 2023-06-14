class  M
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
        int i=100;
		if(true)
		{
			
			System.out.println("if block -stmt1");
			System.out.println("if block -stmt2");
			System.out.println("if block -stmt3:"+i);
		}
		System.out.println("main end:"+i);
	}
}

/*



D:\java-program-lab\app8\src>java -cp ../classes M
main begin
if block -stmt1
if block -stmt2
if block -stmt3:100
main end:100


/*