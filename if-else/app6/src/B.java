class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1;i<=10;i++)
		{
			System.out.println("loop begin:"+i);
			if(i==7)
			{   return;
				//continue;
			}
			System.out.println("loop end :"+i);
		}
		System.out.println("main end");
	}
}

//Continue                                      
//--------------
//D:\java-program-lab\if-else\app6\src>java -cp ../classes B
//main begin
//loop begin:1
//loop end :1
//loop begin:2
//loop end :2
//loop begin:3
//loop end :3
//loop begin:4
//loop end :4
//loop begin:5
//loop end :5
//loop begin:6
//loop end :6


//loop begin:7  when i became 7 it will move to the next litration


//loop begin:8
//loop end :8
//loop begin:9
//loop end :9
//loop begin:10
//loop end :10
//main end



D:\java-program-lab\if-else\app6\src>java -cp ../classes B
main begin
loop begin:1
loop end :1
loop begin:2
loop end :2
loop begin:3
loop end :3
loop begin:4
loop end :4
loop begin:5
loop end :5
loop begin:6
loop end :6
loop begin:7