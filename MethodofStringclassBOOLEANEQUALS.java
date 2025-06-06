// Methods of String Class- 

// 1) boolean equals (String str)

class MethodofStringclassBOOLEANEQUALS {
    public static void main(String args[]) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        if (str1.equals(str2)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are Different");
        }
    }
}