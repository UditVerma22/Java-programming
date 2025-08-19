public class FinalKeywordExample2 {
    final int a;

    FinalKeywordExample2(int x) {
        a = x;
    }

    void show() {
        System.out.println(a);
    }

    public static void main(String args[]) {
        FinalKeywordExample2 t1 = new FinalKeywordExample2(10);
        FinalKeywordExample2 t2 = new FinalKeywordExample2(100);
        t1.show();
        t2.show();
    }

}
