// WAP to print all element of given array on seperate line in REVERSE order
public class PrintelementofARRAYonseperatelineinREVERSEorder {
    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 40, 50 };
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

}
