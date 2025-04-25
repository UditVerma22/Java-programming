class LeapYear {
    public static void main(String args[]) {
        int a = 2025;
        if (a % 400 == 0) {
            System.out.println(a + " is a Leap Year");
        } else if (a % 100 == 0) {
            System.out.println(a + " is Not a Leap Year");

        } else if (a % 4 == 0) {
            System.out.println(a + " is a Leap Year");
        } else {
            System.out.println(a + " is Not a Leap Year");

        }
    }

}
