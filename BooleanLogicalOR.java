// Logical Operator
// Logical OR ( || )
class BooleanLogicalOR {
    public static void main(String args[]) {
        int a = 10, b = 10, c = 10;
        boolean x;
        x = ++a == b++ || b++ == ++c; // Output 11 12 11 true
        System.out.println(a + " " + b + " " + c + " " + x);
    }
}