// "this"

// It is a non static reference variable that is capable to hold the current object and it is also allow to access or change the value of object as well.

public class THIS {
    int a, b, c;

    void show() {
        System.out.println(a + " " + b + " " + c);
    }

    void setData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String args[]) {
        THIS t1 = new THIS();
        THIS t2 = new THIS();

        t1.show(); // prints uninitialized values (0 0 0)
        t2.show(); // pri nts uninitialized values (0 0 0)

        t1.setData(10, 20, 30);
        t2.setData(100, 200, 300);

        t1.show(); // prints 10 20 30
        t2.show(); // prints 100 200 300
    }
}
