// Method of String Class
// 3) int compare To ( String str)

public class MethodofSringclassintcompareTo {
    public static void main(String args[]) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        int i = str1.compareTo(str2);
        System.out.println(i);
    }
}

// Hello hello Hello Indore Hello HelloIndore HelloIndore
// hello Hello Indore Hello HELLO hello Hello
// -32 32 -1 1 32 -32 6