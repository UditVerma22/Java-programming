// WAP to check that the given number is Palindrome or not
public class CheckgivennumberisPALINDROMEorNOt {
    public static void main(String args[]) {
        int n = 151, r, sum = 0, temp = n;
        while (n != 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("Number is Palindrome");

        } else {
            System.out.println("Number is Non Palindrome");

        }
    }

}
