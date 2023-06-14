class G 
{
	int i;
	public static void main(String[] args) 
	{
		G g1=new G();//object creation......g1-reference name(reference name can be anything you want use)
		System.out.println(g1.i);//by using the reference of G class object we can access the non static var i.
		//this g1 reference is local to main method.
	}
}
//An object is a real world entity,
//class is a blue print to creae the objects
//objects will be having properties or datamembers or attributes and behaviours 

//Ex:Dog object properties or attributes:name,age,color,bread,gender,weiht
                     //Behaviours:bark(),chaseCat(),bite(),chaseVehicle()
//properties=data members
//behaviours=member functions
//for one class you can to create any no of object.
//G g1=G(class name),g1(reference variable name)(name can be anything)
//=assignment operator(left side assignment)
//new is a keyword and also an operator
//G()-calling G class no argument constructor.
//variable,method follow the class link variableNumberOne,methodNumberOne
//variable name should be valid identifier
//while you are refering to the class case must be same(as a standard we will write the class namein camel case like ThisIsTheCamelCase
//Objects are stored inside heap memory
//non-static members are loading to the memory while objects are created.
//all the non-static members are loading to the memory while we are creating objects to that particular class.it can be non-static method or it can be a non static block.


/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes G
0*/