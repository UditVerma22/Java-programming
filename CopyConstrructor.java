// Copy Constructor

public class CopyConstrructor {
    int a, b, c;

    CopyConstrructor(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    CopyConstrructor(CopyConstrructor t) {
        a = t.a;
        b = t.b;
        c = t.c;
    }

    void show() {
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String args[]) {
        CopyConstrructor t1 = new CopyConstrructor(10, 20, 30);
        CopyConstrructor t2 = new CopyConstrructor(t1);
        CopyConstrructor t3 = new CopyConstrructor(t2);
        t1.show(); // 10 20 30
        t2.show(); // 10 20 30
        t3.show(); // 10 20 30

    }

}
