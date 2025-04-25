class LeapYear2 {
    public static void main(String args[]) {
        int a = 2025;
        if (a % 400 == 0 && a % 4 == 0) {
            System.out.println(a + " is a Leap Year ");

        } else if (a % 100 == 0) {
            System.out.println(a + " is not a leap year");

        } else {
            System.out.println(a + " is not a leap year");

        }
    }

}
