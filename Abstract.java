abstract class A {
    abstract void show();

    void display() {
        System.out.println("Hello from Display");
    }

}

class B extends A {
    void show() {
        System.out.println("Hello from show");
    }
}

class Abstract {
    public static void main(String args[]) {
        A a1;
        B b1 = new B();
        b1.show();
        b1.display();
    }
}
