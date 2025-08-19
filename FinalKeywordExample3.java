public class FinalKeywordExample3 {
    static final int a;
    static {
        a = 10;
    }

    void show() {
        System.out.println(a);
    }

    public static void main(String args[]) {
        FinalKeywordExample3 t1 = new FinalKeywordExample3();
        FinalKeywordExample3 t2 = new FinalKeywordExample3();
        t1.show();
        t2.show();
    }

}
