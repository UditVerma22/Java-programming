// fastest swapping using binary 

class swapusingbinary {
    public static void main(String args[]) {
        int a = 10, b = 20;
        System.out.println("Before swapping a=" + a + " and b=" + b);
        a = a ^ b; // or we can use this also b=a^b;
        b = a ^ b; // a=b^a;
        a = a ^ b; // b=b^a;
        System.out.println("After swapping a=" + a + " and b=" + b);
    }
}