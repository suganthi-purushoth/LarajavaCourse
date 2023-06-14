// Base class
class Vehicle {
    // Static variables
    static String manufacturer = "XYZ Motors";
    static int totalVehicles = 0;
    
    // Non-static variables
    protected String model;
    protected String color;
    protected int year;
    
    // Static initialization block
    static {
        System.out.println("Initializing the Vehicle class...");
        totalVehicles = 100;
    }
    
    // Instance initialization block
    {
        System.out.println("Initializing an instance of Vehicle class...");
        model = "Unknown";
        color = "Unknown";
        year = 2020;
    }
    
    // Default constructor
    Vehicle() {
        System.out.println("Creating a new Vehicle object...");
        totalVehicles++;
    }
    
    // Parameterized constructor
    Vehicle(String model, String color, int year) {
        System.out.println("Creating a new Vehicle object...");
        this.model = model;
        this.color = color;
        this.year = year;
        totalVehicles++;
    }
    
    // Non-static method
    void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
    
    // Static method
    static void displayTotalVehicles() {
        System.out.println("Total Vehicles: " + totalVehicles);
    }
}

// Derived class
class Car extends Vehicle {
    // Static variable
    static String carType = "Sedan";
    
    // Non-static variable
    private boolean isConvertible;
    
    // Static initialization block
    static {
        System.out.println("Initializing the Car class...");
        carType = "SUV";
    }
    
    // Instance initialization block
    {
        System.out.println("Initializing an instance of Car class...");
        isConvertible = false;
    }
    
    // Default constructor
    Car() {
        System.out.println("Creating a new Car object...");
    }
    
    // Parameterized constructor
    Car(String model, String color, int year, boolean isConvertible) {
        super(model, color, year);
        System.out.println("Creating a new Car object...");
        this.isConvertible = isConvertible;
    }
    
    // Non-static method
    void displayCarType() {
        System.out.println("Car Type: " + carType);
    }
    
    // Static method
    static void changeCarType() {
        carType = "Hatchback";
    }
    
    // Overriding the displayInfo() method
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Convertible: " + isConvertible);
    }
}

public class VehicleCar
{
    public static void main(String[] args) {
        // Creating instances of the Vehicle class
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Model X", "Blue", 2022);
        
        // Displaying vehicle information
        vehicle1.displayInfo();
        vehicle2.displayInfo();
        
        // Accessing static variables and method using class name
        System.out.println("Vehicle Manufacturer: " + Vehicle.manufacturer);
        Vehicle.displayTotalVehicles();
        
        // Creating instances of the Car class
        Car car1 = new Car();
        Car car2 = new Car("Model Y", "Red", 2023, true);
        
        // Displaying car information
        car1.displayInfo();
        car1.displayCarType();
        
        car2.displayInfo();
        car2.displayCarType();
        
        // Accessing static variables and method using class name
        System.out.println("Car Manufacturer: " + Car.manufacturer);
        Car.displayTotalVehicles();
        
        // Changing the car type
        Car.changeCarType();
        
        // Displaying car information after changing car type
        car1.displayInfo();
        car1.displayCarType();
        
        car2.displayInfo();
        car2.displayCarType();
	}
}
/*D:\java-program-lab\composition\src>java  -cp ../classes VehicleCar
Initializing the Vehicle class...
Initializing an instance of Vehicle class...
Creating a new Vehicle object...
Initializing an instance of Vehicle class...
Creating a new Vehicle object...
Manufacturer: XYZ Motors
Model: Unknown
Color: Unknown
Year: 2020
Manufacturer: XYZ Motors
Model: Model X
Color: Blue
Year: 2022
Vehicle Manufacturer: XYZ Motors
Total Vehicles: 102
Initializing the Car class...
Initializing an instance of Vehicle class...
Creating a new Vehicle object...
Initializing an instance of Car class...
Creating a new Car object...
Initializing an instance of Vehicle class...
Creating a new Vehicle object...
Initializing an instance of Car class...
Creating a new Car object...
Manufacturer: XYZ Motors
Model: Unknown
Color: Unknown
Year: 2020
Convertible: false
Car Type: SUV
Manufacturer: XYZ Motors
Model: Model Y
Color: Red
Year: 2023
Convertible: true
Car Type: SUV
Car Manufacturer: XYZ Motors
Total Vehicles: 104
Manufacturer: XYZ Motors
Model: Unknown
Color: Unknown
Year: 2020
Convertible: false
Car Type: Hatchback
Manufacturer: XYZ Motors
Model: Model Y
Color: Red
Year: 2023
Convertible: true
Car Type: Hatchback
*/