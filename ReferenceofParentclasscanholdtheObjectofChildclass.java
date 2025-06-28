// Reference of Parent class can hold the Object of Child class

class A {
    void show() {
        System.out.println("Hello from A");
    }

}

class B extends A {
    void display() {
        System.out.println("Hello from B");
    }
}

class ReferenceofParentclasscanholdtheObjectofChildclass {
    public static void main(String args[]) {
        A a1;
        B b1 = new B();
        a1 = b1;
        a1.show();
        b1.show();
        b1.display();

    }
}