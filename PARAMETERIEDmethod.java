class PARAMETERIEDmethod {
    int a, b, c;

    void show() {
        System.out.println(a + " " + b + " " + c);
    }

    void setData(int x, int y, int u) {
        a = x;
        b = y;
        c = u;
    }

    public static void main(String args[]) {
        PARAMETERIEDmethod t1 = new PARAMETERIEDmethod();
        PARAMETERIEDmethod t2 = new PARAMETERIEDmethod();
        t1.show();
        t2.show();
        t1.setData(10, 20, 30);
        t2.setData(100, 200, 300);
        t1.show();
        t2.show();

    }
}
/*
 * 0 0 0
 * 0 0 0
 * 10 20 30
 * 100 200 300
 */