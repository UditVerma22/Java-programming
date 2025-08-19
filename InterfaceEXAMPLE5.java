interface first {
    void show();
}

interface second {
    void display();
}

class P {
    void add() {
        System.out.println("Hello from class P");
    }

}

class A extends P implements first, second {
    public void show() {
        System.out.println("Hello from show ");
    }

    public void display() {
        System.out.println("Hello from Display");
    }
}

public class InterfaceEXAMPLE5 {
    public static void main(String args[]) {
        A a1 = new A();
        a1.show();
        a1.display();
        a1.add();
    }
}
     

