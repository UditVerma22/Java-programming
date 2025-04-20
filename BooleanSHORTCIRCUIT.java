class BooleanSHORTCIRCUIT {
    public static void main(String args[]) {
        int a = 10, b = 10, c = 10;
        boolean x;
        x = ++a == b++ && b++ == ++c; // Output 11 11 10 false (Short Circuit)
        System.out.println(a + " " + b + " " + c + " " + x);
    }
}