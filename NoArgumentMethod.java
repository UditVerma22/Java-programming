public class NoArgumentMethod {
    int a, b, c;

    void show() {
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String args[]) {
        NoArgumentMethod t1 = new NoArgumentMethod();
        NoArgumentMethod t2 = new NoArgumentMethod();
        t1.show();
        t2.show();
        t1.a = 10;
        t1.b = 20;
        t1.c = 30;
        t2.a = 100;
        t2.b = 200;
        t2.c = 300;
        t1.show();
        t2.show();

    }

}
/*
 * 0 0 0
 * 0 0 0
 * 10 20 30
 * 100 200 300
 */
