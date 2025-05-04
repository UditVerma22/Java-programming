// WAP to print Reverse of the given number
public class PrintREVERSEofgivennumber {
    public static void main(String args[]) {
        int n = 153, r;
        while (n != 0) {
            r = n % 10;
            System.out.print(r);
            n = n / 10; // Output 351

        }
    }

}
