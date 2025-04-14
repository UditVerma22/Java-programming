// Unary operator
class unary7 {
    public static void main(String args[]) {
        int a = 10, b;
        b = a++ + ++a + a++;
        System.out.println(a + " " + b); // Output 13 34
    }
}