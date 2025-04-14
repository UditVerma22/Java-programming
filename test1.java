// Type Casting Program 1
class test1 {
    public static void main(String args[]) {
        byte a = 10;
        // a=a+5 (Gives error)......
        // Solution =>
        a = (byte) (a + 5);
        System.out.println(a);
    }
}
