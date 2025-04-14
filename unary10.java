// Unary operator
class unary10 {
    public static void main(String args[]) {
        int a = 10, b = 20, c;
        c = a++ + ++b + b++ + ++a;
        System.out.println(a + " " + b + " " + c); // Output 12 22 64

    }
}