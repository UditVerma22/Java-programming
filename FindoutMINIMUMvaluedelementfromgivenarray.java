// WAP to find out the minimum valued element from the given array?
public class FindoutMINIMUMvaluedelementfromgivenarray {
    public static void main(String[] args) {
        int a[] = { 50, 60, 70, 20, 40, 10, 100, 30, 80, 90 };
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }

        System.out.println(min);
    }
}
