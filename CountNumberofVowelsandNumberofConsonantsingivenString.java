// WAP to count number of vowels and no of consonants in given string

class CountNumberofVowelsandNumberofConsonantsingivenString {
    public static void main(String args[]) {
        String str = "This is a class of Java at Programming World";
        int vowels = 0, consonants = 0;

        str = str.toLowerCase(); // Make the string lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of Vowels = " + vowels);
        System.out.println("Number of Consonants = " + consonants);
    }
}
