//7.Create an integer array with 14 locations. Store 41 in the mid position. Store 76 in the mid-3 position. Store 65 in the mid+2 position. Display all the elements. Also find the sum of all those elements and display the result
class A7
{
	public static void main(String[] args) 
	{
		int [] arr=new int [14];
		arr[6]=41; //arr[8]=41;
		arr[3]=76; //arr[5]=76;
		arr[8]=65; //arr[10]=65;
		System.out.println("Array elements are.../n"+arr[6]+" "+arr[3]+" "+ arr[8]);
		System.out.println("Sum="+(arr[6]+arr[3]+arr[8]));
	}
}
//(0+13)/2====6 ====>mid
//mid-3=3
//mid+2=8
/*

D:\java-program-lab\arrays-logical-coding\new\src>java -cp ../classes A7
Array elements are.../n41 76 65
Sum=182
*/