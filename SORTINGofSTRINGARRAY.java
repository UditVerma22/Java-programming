// Sorting of String Array  
public class SORTINGofSTRINGARRAY {
    public static void main(String args[]) {
        String str[] = { "indore", "bhopal", "dewas", "ujjain", "dhar", "india", "indonesia", "bhind" };

        System.out.println("Before Sorting:");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
