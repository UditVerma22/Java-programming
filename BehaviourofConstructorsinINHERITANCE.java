// Behaviour of Constructors in Inheritance

/* Whenever the object of child class will be created it will forward a request of memory allocation to the default constructor of 
 * parent class first
 */

class A {
    A() {
        System.out.println("Hello from class A");
    }

}

class B extends A {
    B() {
        System.out.println("Hello from class B");
    }
}

class BehaviourofConstructorsinINHERITANCE {
    public static void main(String args[]) {
        A a1 = new A();
        B b1 = new B();
    }
}
