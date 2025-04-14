// Unary operator
class unary6 {
    public static void main(String args[]) {
        int a = 10, b, c, d;
        b = --a;
        c = b++;
        d = ++c;
        a = d--;
        System.out.println(a + " " + b + " " + c + " " + d); // Output 10 10 10 9
    }
}