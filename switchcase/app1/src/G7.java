class G7
{
	switch (2)
	{
		default:
				System.out.println("from default");
				break;
			case 2:
				System.out.println("from case 2");
				break;
			case 3:
				System.out.println("from case 3");
				break;
			case 5:
				System.out.println("from case 5");
				break;
		}
	
	}
	public static void main(String[] args) 
	{
				System.out.println("main end");

				
	}
}
/*

D:\java-program-lab\switchcase\app1\src>javac -d ../classes G7.java
G7.java:17: error: <identifier> expected
                }
                 ^
G7.java:20: error: class, interface, enum, or record expected
        public static void main(String[] args)
                      ^
G7.java:25: error: class, interface, enum, or record expected
        }
        ^
3 errors
*/