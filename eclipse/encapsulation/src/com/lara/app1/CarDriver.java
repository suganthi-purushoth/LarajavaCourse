package com.lara.app1;
class Car
{
	
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	private String make;
	private String model;
	private int year;
	
	public String getMake() 
	{
		return make;
	}
	public void setMake(String make) 
	{
		this.make = make;
	}
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	/*
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
	}*/
}
public class CarDriver {

	public static void main(String[] args) 
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		
		// TODO Auto-generated method stub
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
