public class staticexample {
    static int a = 10;

    static void show() {
        System.out.println(a + 5);
    }

    static {
        a = a * 15;
        System.out.println(a); // This runs before main
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(staticexample.a);
        staticexample.show();
        System.out.println(staticexample.a);
    }
}
