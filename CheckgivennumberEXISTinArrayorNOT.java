// WAP to check that the given number exist in the given array or not ?
public class CheckgivennumberEXISTinArrayorNOT {
    public static void main(String[] args) {
        int a[] = { 50, 60, 40, 70, 20, 10, 100, 30, 80, 90 };
        int n = 80, i;
        boolean f = false;

        for (i = 0; i < a.length; i++) {
            if (a[i] == n) {
                f = true;
                break;
            }
        }

        if (f) {
            System.out.println(n + " Found at " + i + " index");
        } else {
            System.out.println(n + " is not Found");
        }
    }
}
