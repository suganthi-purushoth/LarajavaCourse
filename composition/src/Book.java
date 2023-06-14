class  Publisher
{
	String name;
	String publisherID;
	String city;
	Publisher(String name,String publisherID,String city)
	{
		this.name=name;
		this.publisherID=publisherID;
		this.city=city;
	}
}
class Author
{
	//non static members
	String authorName;//null-default value
	int age;//0-ddefault value
	String place;//null-default value
	//Author class constructor
	Author(String name,int age,String place)
	{
		this.authorName=name;
		this.age=age;
		this.place=place;
	}
}
//Book class has-a Author
//Book class has-a Publisher
class Book
{
	String name;
	int price;
	//author ,publisher details
	Author author;
	//in the book cls we are creating ref var to the different class,not creating a obj here
	Publisher publisher;
	Book(String n,int p,Author author, Publisher publisher)
	{
		this.name=n;
		this.price=p;//non static mem of Book cls
		this.author=author;//
		this.publisher=publisher;
	}
	public static void main(String[] args) 
	{
		Author author=new Author("John",42,"USA");//passing constructor value for author class
		//here using constructor using initialize the author value and constructor value

		Publisher publisher=new Publisher("Sun Publication","JDSR-III4","LA");
		Book b=new Book("Java for begginer",800,author,publisher);
		System.out.println("Book Name:"+b.name); 
		System.out.println("Book price:"+b.price);
		System.out.println("----------Author Details-------------");
		System.out.println("Author Name:"+b.author.authorName);
		System.out.println("Author Age:"+b.author.age);
		System.out.println("Author place:"+b.author.place);
		System.out.println("----------Publisher Details---------");
		System.out.println("Publisher Name:"+b.publisher.name)
			;
		System.out.println("Publisher ID:"+b.publisher.publisherID);
		System.out.println("Publisher City:"+b.publisher.city);
	}
}
/*
D:\java-program-lab\composition\src>java -cp ../classes Book
Book NameJava for begginer
Book price:800
----------Author Details-------------
Author Name:John
Author Age:42
Author place:USA
----------Publisher Details---------
Publisher Name:Sun Publication
Publisher ID:JDSR-III4
Publisher City:LA*/