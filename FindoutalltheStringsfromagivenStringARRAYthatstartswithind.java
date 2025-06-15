// WAP to find out all the strings from given string array that starts with ind.

class FindoutalltheStringsfromagivenStringARRAYthatstartswithind {
    public static void main(String args[]) {
        String str[] = { "indore", "bhopal", "dewas", "ujjain", "dhar", "indonesia", "bhind" };
        for (int i = 0; i < str.length; i++) {
            if (str[i].indexOf("ind") == 0) {
                System.out.println(str[i]);
            }
        }

    }
}