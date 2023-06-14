class A1
{
	private String name;
	private String idNum;
	private int age;
	public int getAge()
	{
		return age;

	}
	public String getName()
	{
		return name;
	}
	public String getIdnum()
	{
		return idNum;
	}
	public void setAge(int newAge)
	{
		this.age=newAge;
	}
	public void setName(String newName)
	{
		this.name=newName;
	}
	public void setIdnum(String newId)
	{
		this.idNum=newId;
	}
}
class MyDriver

{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
