// Type casting program 2
class test2 {
    public static void main(String args[]) {
        byte a = 10, b = 20, c;
        c = (byte) (a + b); // If we remove byte it gives error
        System.out.println(c);
    }
}