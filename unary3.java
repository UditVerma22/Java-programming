// Unary operator 
class unary3 {
    public static void main(String args[]) {
        int a = 10, b, c;
        b = a++;
        c = ++b;
        System.out.println(a + " " + b + " " + c); // Output11 11 11
    }
}