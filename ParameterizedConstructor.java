//  Parameterized Constructor (Constructor Overloading)

public class ParameterizedConstructor {
    int a, b, c;

    ParameterizedConstructor() {

    }

    ParameterizedConstructor(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void show() {
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String args[]) {
        ParameterizedConstructor t1 = new ParameterizedConstructor(10, 20, 30);
        ParameterizedConstructor t2 = new ParameterizedConstructor(100, 200, 300);
        ParameterizedConstructor t3 = new ParameterizedConstructor();
        t1.show();
        t2.show();
        t3.show();
    }

}
/*
 * Output :-
 * 10 20 30
 * 100 200 300
 * 0 0 0
 */