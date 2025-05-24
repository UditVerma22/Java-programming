class ClassObjectandInstancevariable2 {
    int a, b, c;

    public static void main(String argsp[]) {
        ClassObjectandInstancevariable t1 = new ClassObjectandInstancevariable();
        ClassObjectandInstancevariable t2 = new ClassObjectandInstancevariable();
        System.out.println(t1.a + " " + t1.b + " " + t1.c);
        System.out.println(t2.a + " " + t2.b + " " + t2.c);
        t1.a = 10;
        t1.b = 20;
        t1.c = 30;
        t2.a = 100;
        t2.b = 200;
        t2.c = 300;
        System.out.println(t1.a + " " + t1.b + " " + t1.c);
        System.out.println(t2.a + " " + t2.b + " " + t2.c);
        // 0 0 0
        // 0 0 0
        // 10 20 30
        // 100 200 300

    }
}