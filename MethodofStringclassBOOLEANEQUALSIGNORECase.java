// Methods of String Class
// 2) boolean equals Ignore Case 

public class MethodofStringclassBOOLEANEQUALSIGNORECase{
     public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("Hello");

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are Different");
        }
    }
}

