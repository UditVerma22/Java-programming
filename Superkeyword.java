// Super Keyword

class A {
    int x = 10;

}

class B extends A {
    int x = 20;

    void show() {
        int x = 30;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);

    }
}

class Superkeyword {
    public static void main(String args[]) {
        B b1 = new B();
        b1.show();
    }
}
