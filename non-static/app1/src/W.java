class W 
{
	int i;
	static W test(W w1)//test ref w1
	{
		W  w2=new W();//2nd obj w2 ref var
		System.out.println(w2.i);
		w2.i=w1.i;
		return w2;//obj=w1=w2
	}
	public static void main(String[] args) 
	{
		W obj=new W();//1st obj creting ref obj
		obj.i=20;
		W rv=test(obj);//W type of rv ref is test(),test(obj)=w2 ref val

		System.out.println(rv.i);
	}

}
//w2and rv pointing to the same obj
//w1=obj,
/*

D:\java-program-lab\non-static\app1\src>java -cp ../classes W
0
20*/