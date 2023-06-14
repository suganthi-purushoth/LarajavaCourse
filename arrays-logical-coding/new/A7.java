class A7 
{
	public static void main(String[] args) 
	{
		int [] array = new int[14];
		array[array.length /2] = 41;
		array[(array.length /2)-3] = 76;
		array[(array.length /2)+2] = 65;
		System.out.println(array[array.length /2] );
		System.out.println(array[(array.length /2)-3] );
		System.out.println(array[(array.length /2)+2] );
		System.out.println(array[array.length /2]+array[(array.length /2)-3]+array[(array.length /2)+2] );
	}
}
