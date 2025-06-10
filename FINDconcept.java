// Find Concept 

public class FINDconcept {
    public static void main(String args[]) {
        String str = new String("indore is in india");
        int x = 0;
        while (x != -1) {
            x = str.indexOf("in", x);
            if (x >= 0) {
                System.out.println(x);
                x++;
            }
        }
    }

}
