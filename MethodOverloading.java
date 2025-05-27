// Method Overloading (Compile Time Polymorphism)

// For method overloading in a class it is compulsion that their should exist
// more than one method with same name and different signature, it means that
// either their number of parameters or their data type of parameters should be
// different

// Note :- Return type of the method cannot be responsible for method
// overloading process.
public class MethodOverloading {
    void add() {
        System.out.println("Default");
    }

    void add(int p, int q) {
        System.out.println(p + q);
    }

    void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);

    }

    void add(int x, int y, double z) {
        System.out.println(x + y + z);
    }

    public static void main(String args[]) {
        MethodOverloading t1 = new MethodOverloading();
        t1.add();
        t1.add(10, 20);
        t1.add(100, 200, 300);
        t1.add(1, 2, 3, 4);
        t1.add(15, 25, 35.5);
    }

}
/*
 * Output :- 30
 * 600
 * 10
 * 75.5
 */