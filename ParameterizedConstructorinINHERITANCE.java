// Parameterized Constructor in INHERITANCE 

class A {
    A(int x, int y) {
        System.out.println("Hello from A" + x + " " + y);
    }
}

class B extends A {
    B(int p, int q, int r) {
        super(p, q);
        System.out.println("Hello from B" + p + " " + q + " " + r);
    }
}

class ParameterizedConstructorinINHERITANCE {
    public static void main(String args[]) {
        A a1 = new A(10, 20);
        B b1 = new B(100, 200, 300);
    }
}
