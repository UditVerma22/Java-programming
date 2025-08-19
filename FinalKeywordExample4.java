public class FinalKeywordExample4 {
    static final int a = 100;

    void show() {
        System.out.println(a);
    }

    public static void main(String args[]) {
        FinalKeywordExample4 t1 = new FinalKeywordExample4();
        FinalKeywordExample4 t2 = new FinalKeywordExample4();
        t1.show();
        t2.show();
    }

}
