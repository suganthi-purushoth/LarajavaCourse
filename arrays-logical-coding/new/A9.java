class A9 
{
	public static void main(String[] args) 
	{
		byte [] array = new byte[6];
		int [] arr = new int[7];
		array[(array.length /2) + 1] = 100;
		arr[(arr.length /2) - 1] = array[(array.length /2) + 1] ;
		System.out.println(array[(array.length /2) + 1]);
		System.out.println(arr[(arr.length /2) - 1]);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}
}
