// Array is an Argument -

class ArrayisanArgument {

    // Method to calculate and print sum of array elements
    static void add(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        System.out.println("Sum: " + sum);
    }

    // Main method
    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        ArrayisanArgument.add(a); // Sum: 150
        ArrayisanArgument.add(b); // Sum: 55
    }
}
