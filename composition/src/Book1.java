class Publisher
{  
	String name;
	String publisherID;
	String city;
  
	Publisher(String name, String publisherID, String city)
	{
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}
}
class Author
{
	String authorName;
	int age;
	String place;

	// Author class constructor
	Author(String name, int age, String place)
	{
		this.authorName = name;
		this.age = age;
		this.place = place;
	}
}

//Book class has-a Author
//Book class has-a Publisher
class Book1
{
	String name;
	int price;
  
	// author details
	Author auther;
	Publisher publisher;
  
	Book(String n, int p, Author auther, Publisher publisher )
	{
		this.name = n;
		this.price = p;
		this.auther = auther;
		this.publisher = publisher;
	}

	public static void main(String[] args)
	{
		Author auther = new Author("John", 42, "USA");
		Publisher publisher = new Publisher("Sun Publication", "JDSR-III4",  "LA");
		Book b = new Book("Java for Begginer", 800, auther, publisher);
		System.out.println("Book Name: " + b.name);
		System.out.println("Book Price: " + b.price);
		System.out.println("------------Author Details----------");
		System.out.println("Auther Name: " + b.auther.authorName);
		System.out.println("Auther Age: " + b.auther.age);
		System.out.println("Auther place: " + b.auther.place);
		System.out.println("------------Publisher Details-------");
		System.out.println("Publisher Name: " + b.publisher.name);
		System.out.println("Publisher ID: " + b.publisher.publisherID);
		System.out.println("Publisher City: " + b.publisher.city);
	}
}