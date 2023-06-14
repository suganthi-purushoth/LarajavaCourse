class Product
	{
    private String name;
    private double price;
    private int quantity;

    // Getters and setters for name, price, and quantity
     public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	


    public static void main(String[] args)
		{
        Product product = new Product();
        product.setName("Phone");
        product.setPrice(500.0);
        product.setQuantity(10);
        String name = product.getName();
        double price = product.getPrice();
        int quantity = product.getQuantity();
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
/*

D:\java-program-lab\encapsulation\src>java -cp ../classes Product
Name: Phone
Price: 500.0
Quantity: 10
*/