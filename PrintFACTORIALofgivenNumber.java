// WAP to print Factorial of given number
public class PrintFACTORIALofgivenNumber {
    public static void main(String args[]) {
        int n = 5, f = 1;
        while (n > 1) {
            f = f * n;
            n--;
        }
        System.out.println(f); // Output 120
    }

}
