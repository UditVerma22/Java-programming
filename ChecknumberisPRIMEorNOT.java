// // Har vo natural number jiske sif do factors ho usko prime number bolte h ....
public class ChecknumberisPRIMEorNOT {
    public static void main(String args[]) {
        int n = 10, i;
        boolean f = false;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println(n + " is Non-Prime");
        } else {
            System.out.println(n + " is Prime ");
        }
    }
}
