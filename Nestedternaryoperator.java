// Nested Ternary Operator

// WAP to find Maximum Between 3 given Numbers

class Nestedternaryoperator {
    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;
        a = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(a); // Output 30
    }

}
