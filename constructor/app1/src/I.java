class I 
{
	public static void main(String[] args) 
	{
		I i1=new I(90);
		System.out.println("done");
	}
}
/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes I.java
I.java:5: error: constructor I in class I cannot be applied to given types;
                I i1=new I(90);
                     ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
1 error
*/