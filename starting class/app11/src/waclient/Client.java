package waclient;
import server.A;
class Client 
{
	public static void main(String[] args) 
	{
		A.test();
		System.out.println("Hello World!");
	}
}

//Create

//D:\java-program-lab\app11\src>javac -d ../classes -cp ../../app10/classes waclient/Client.java


//D:\java-program-lab\app11\src>java -cp ../../app10/classes;../classes waclient.Client
//I am from server
//Hello World!




//Create jar command 
//-------------------------

//D:\java-program-lab\app11>cd src

//D:\java-program-lab\app11\src>javac -d ../classes -cp ../../app10/lib/test.jar waclient/Client.java

//D:\java-program-lab\app11\src>java -cp ../classes;../../app10/lib/test.jar waclient.Client
//I am from server
//Hello World!