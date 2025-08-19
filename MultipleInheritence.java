interface first {
    void show();

}

interface second {
    void display();
}

class A implements first, second {
    public void show() {
        System.out.println("Hello from Show");
    }

    public void display() {
        System.out.println("Hello from Display");
    }
}

class MultipleInheritence {
    public static void main(String args[]) {
        A a1 = new A();
        a1.show();
        a1.display();
    }
}