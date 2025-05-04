// WAP to check that the given number is Armstrong or not 
public class CheckgivennumberisARMSTRONGorNOT {
    public static void main(String args[]) {
        int n = 153, r, sum = 0, temp = n;
        while (n != 0) {

            r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is Non Armstrong");
        }
    }

}
