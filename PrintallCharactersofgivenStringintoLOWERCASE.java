// WAP to print all characters of given string into LOWER CASE.

public class PrintallCharactersofgivenStringintoLOWERCASE {
    public static void main(String args[]) {
        String str = new String("HELLO");
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                System.out.print((char) (ch + 32));
            } else {
                System.out.print(ch);
            }
        }
    }

}
