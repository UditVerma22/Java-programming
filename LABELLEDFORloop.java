public class LABELLEDFORloop {
    public static void main(String args[]) {
        int i, j;
        j = 10; // initialize j before the loop
        for (i = 1; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }
    }
}
