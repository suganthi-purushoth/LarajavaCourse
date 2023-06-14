class G 
{
	G()
	{
		System.out.println("G()");
	}
	public static void main(String[] args) 
	{
		G g1=new G(90);//G() no arg constructor but here supply value-
		System.out.println("done");
	}
}

/*
D:\java-program-lab\constructor\app1\src>javac -d ../classes G.java
G.java:9: error: constructor G in class G cannot be applied to given types;
                G g1=new G(90);
                     ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
1 error
*/