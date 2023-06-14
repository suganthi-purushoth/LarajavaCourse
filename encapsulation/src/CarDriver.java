class Car
{
	private String make;
	private String model;
	private int year;
	//getters and setters for make,model,year
	public String getMake()
	{
		return make;//this.getName;(both are same)
	}
	public String getModel()
	{
		return model;
	}
	public int getYear()
	{
		return year;
	}

	public void setMake(String make)
	{
		this.make=make;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
}
class CarDriver
{

	public static void main(String[] args) 
	{
		    Car car=new Car();
			car.setMake("toyota");
			car.setModel("camry");
			car.setYear(2020);
			String make=car.getMake();
			String model=car.getModel();
			int year=car.getYear();
			System.out.println("make:"+make);
			System.out.println("Model:"+ model);
			System.out.println("Year:"+year);
		}
}
/*

D:\java-program-lab\encapsulation\src>java -cp ../classes CarDriver
make:toyota
Model:camry
Year:2020*/