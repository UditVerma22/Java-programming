// An array of n size

import java.util.Scanner;

class AnARRAYofNsize {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter" + n + " Value:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value at " + (i + 1) + "Position:");
            a[i] = sc.nextInt();
        }
        System.out.println("You have Entered");
        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}