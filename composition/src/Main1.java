// Class A
class A 
	{
    // Static initialization block
    static 
		{
        System.out.println("A-SIB");
    }

    // Constructor
    A() {
        System.out.println("A()");
    }

    // Instance initialization block
    {
        System.out.println("A-IIB");
    }

    // Non-static method
    public void non_static_method() {
        System.out.println("This is a non-static method in class A");
    }

    // Static method
    public static void static_method() {
        System.out.println("This is a static method in class A");
    }
}

// Class B
class B extends A {
    // Static initialization block
    static {
        System.out.println("B-SIB");
    }

    // Constructor
    B() {
        System.out.println("B()");
    }

    // Instance initialization block
    {
        System.out.println("B-IIB");
    }

    // Non-static method
    public void non_static_method() {
        System.out.println("This is a non-static method in class B");
    }

    // Static method
    public static void static_method() {
        System.out.println("This is a static method in class B");
    }
}

// Class C
class C extends B {
    // Static initialization block
    static {
        System.out.println("C-SIB");
    }

    // Constructor
    C() {
        System.out.println("C()");
    }

    // Instance initialization block
    {
        System.out.println("C-IIB");
    }

    // Non-static method
    public void non_static_method() {
        System.out.println("This is a non-static method in class C");
    }

    // Static method
    public static void static_method() {
        System.out.println("This is a static method in class C");
    }
}

// Main class
class Main1 {
    // Static initialization block
    static {
        System.out.println("Main-SIB");
    }

    public static void main(String[] args) {
        System.out.println("main begin");

        // For loop
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop iteration " + i);
        }

        // While loop
        int j = 0;
        while (j < 3) {
            System.out.println("While loop iteration " + j);
            j++;
        }

        // Do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop iteration " + k);
            k++;
        } while (k < 3);

        // Ternary operator
        int x = 5;
        int y = 10;
        String result = (x > y) ? "x is greater than y" : "y is greater than x";
        System.out.println(result);

        // Constructor
        C c1 = new C();

        // Static block
        System.out.println("-----------");
        B b1 = new B();
        System.out.println("-----------");
        A a1 = new A();

        // Static method
        C.static_method();
        B.static_method();
        A.static_method();

        // Non-static method
        c1.non_static_method();
        b1.non_static_method();
        a1.non_static_method();
        System.out.println("main end");
	}
}
/*
D:\java-program-lab\composition\src>java  -cp ../classes Main1
Main-SIB
main begin
For loop iteration 0
For loop iteration 1
For loop iteration 2
While loop iteration 0
While loop iteration 1
While loop iteration 2
Do-while loop iteration 0
Do-while loop iteration 1
Do-while loop iteration 2
y is greater than x
A-SIB
B-SIB
C-SIB
A-IIB
A()
B-IIB
B()
C-IIB
C()
-----------
A-IIB
A()
B-IIB
B()
-----------
A-IIB
A()
This is a static method in class C
This is a static method in class B
This is a static method in class A
This is a non-static method in class C
This is a non-static method in class B
This is a non-static method in class A
main end
*/