interface first {
    void show();
}

interface second {
    void display();
}

class A implements second {
    public void show() {
        System.out.println("Hello from show");
    }

    public void display() {
        System.out.println("Hello from display");
    }
}

public class InterfaceExtendsinterface1interface2 {
    public static void main(String args[]){
        A a1 = new A();
        a1.show();
        a1.display();
    
    }

}
