// WAP to find out maximum between 3 given numbers
class Maximumbtw3 {
    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;
        a = a > b ? a : b;
        a = a > c ? a : c;
        System.out.println(a); // Output 30
    }
}