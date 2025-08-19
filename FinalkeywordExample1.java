public class FinalkeywordExample1 {
    final int a = 10;

    void show()
    {
        a++     // => Error
        System.out.println(a);
    }

    public static void main(String args[]) {
        FinalkeywordExample1 t1 = new FinalkeywordExample1();
        t1.show();
        t1.show();
        t1.show();
    }

}
