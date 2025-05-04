// WAP to print Reverse of the given number
public class PrintREVERSEofgivennumber2 {
    public static void main(String args[]) {
        int n = 153, r, sum = 0;
        while (n != 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10; // Output 351

        }
        System.out.print(sum);
    }

}
