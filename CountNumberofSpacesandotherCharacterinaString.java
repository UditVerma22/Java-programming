// WAP to count number of spaces and other characters in a given string

public class CountNumberofSpacesandotherCharacterinaString {
    public static void main(String args[]) {
        String str = "This is a class of Java at Programming world";
        int Sp = 0, Ch = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { // or // if(str.charAt(i)== 32)
                Sp++;
            } else {
                Ch++;
            }

        }
        System.out.println("Number of Spaces = " + Sp);
        System.out.println("Number of other Characters = " + Ch);

    }

}
