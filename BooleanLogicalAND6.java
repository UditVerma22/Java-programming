class BooleanLogicalAND6 {
    public static void main(String args[]) {
        int a = 10, b = 10, c = 10;
        boolean x;
        x = a-- == b-- && b++ == ++c; // Output 9 10 11 false
        System.out.println(a + " " + b + " " + c + " " + x);
    }
}