import java.util.Scanner;

public class Scannerclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First value :");
        int a = sc.nextInt();
        System.out.println("Enter Second value :");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum of " + a + " and " + b + " = " + c + "");
    }

}
