// WAP to print Summation of all individual digits of all given number
public class PrintSUMMATIONofINDIVIDUALDIGIT {
    public static void main(String args[]) {
        int n = 153, r, sum = 0;
        while (n != 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.print(sum); // Output 9
    }

}
