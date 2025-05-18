// WAP to find out the maximum valued element from the given array?
public class FindoutMAXIMUMvaluedelementfromgivenarray {
    public static void main(String[] args) {
        int a[] = { 50, 60, 70, 20, 40, 10, 100, 30, 80, 90 };
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.println(max);
    }
}
