package pack1.com.src.src.src;
public class NestedPackage
{
	public static void main(String[] args) 
	{
		System.out.println("from pack1.com.src.src.src");
	}
}
/*
D:\java-program-lab\pack\src>javac -d ../classes/pack1/com/src/classes pack1/com/src/src/src/NestedPackage.java


D:\java-program-lab\pack\src>java -cp ../classes pack1.com.src.src.src.NestedPackage
from pack1.com.src.src.src
*/