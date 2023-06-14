class H 
{
	public static void main(String[] args) 
	{
		for(String s1:args)
		{
		System.out.println(s1);
		}
	}
}
//any type we can supply compiler consider string type only
/*
D:\java-program-lab\command-line-arguments\src>java -cp ../classes H suga puvi kavi purushoth
suga
puvi
kavi
purushoth

D:\java-program-lab\command-line-arguments\src>java -cp ../classes H "suga purushoth" "puvi kavi"
suga purushoth
puvi kavi

D:\java-program-lab\command-line-arguments\src>java -cp ../classes H 123 25.7 "suga" true 'a'
123
25.7
suga
true
'a'

D:\java-program-lab\command-line-arguments\src>java -cp ../classes H 'suga purushoth' 'puvi kavi'
'suga
purushoth'
'puvi
kavi'*/
