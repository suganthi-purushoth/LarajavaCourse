//8. Initialize a string array which contains 5 city names. Display only 3rd city by adding prefix "Welcome to"
class A8
{
	public static void main(String[] args) 
	{
		String[] str={"Amaravathi","Hyderabad","Bangalore","Delhi","Kashmir"};//create one string array with 5 string name
		System.out.println("Welcome to"+str[2]);
	}
}
//String[] str=new String [5];

/*

D:\java-program-lab\arrays-logical-coding\new\src>java -cp ../classes A8
Welcome toBangalore

*/