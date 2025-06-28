// Parent Class
class A {
    void show() {
        System.out.println("Hello from class A");
    }
}

// Child Class
class B extends A {
    void display() {
        System.out.println("Hello from class B");
    }
}

// Main Class
public class SinglelevelInheritance {
    public static void main(String args[]) {
        A a1 = new A(); // Object of class A
        B b1 = new B(); // Object of class B (inherits from A)

        a1.show(); // Call method from class A
        b1.show(); // Call inherited method from class A
        b1.display(); // Call method from class B
    }
}
