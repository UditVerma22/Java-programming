// Method of String Class
// 4)int compare To Ignore Case (String str)

public class MethodofStringclassintcompareToIgnorecase {
    public static void main(String args[]) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        int i = str1.compareToIgnoreCase(str2);
        System.out.println(i);
    }
}

// Hello hello Hello Indore Hello HelloIndore HelloIndore
// hello Hello Indore Hello HELLO hello Hello
// 0 0 -1 1 0 6 6