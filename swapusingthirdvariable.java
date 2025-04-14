// Wap to swap using third variable ?

class swapusingthirdvariable {
    public static void main(String args[]) {
        int a = 10, b = 20, c;
        System.out.println("Before swapping a=" + a + " and b=" + b);
        c = a; // or we can use this also c=b;
        a = b; // b=a;
        b = c; // a=c;
        System.out.println("After swapping a=" + a + " and b=" + b);
    }
}