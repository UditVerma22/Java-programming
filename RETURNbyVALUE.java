// return by value

class RETURNbyVALUE {
    int add(int a, int b) {
        int c;
        c = a + b;
        return c;

    }

    public static void main(String args[]) {
        RETURNbyVALUE t1 = new RETURNbyVALUE();
        int c = t1.add(10, 20);
        System.out.println(c); // 30
        System.out.println(t1.add(100, 200)); // 300
    }
}