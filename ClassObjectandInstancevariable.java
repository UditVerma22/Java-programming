// Class, Object & Instance Variable

class ClassObjectandInstancevariable {
    int a = 10; // Instance Variable

    public static void main(String[] args) {
        ClassObjectandInstancevariable t1 = new ClassObjectandInstancevariable(); // Object

        ClassObjectandInstancevariable t2 = new ClassObjectandInstancevariable(); // Object
        System.out.println(t1.a); // 10
        System.out.println(t2.a); // 10
        t1.a++;
        t2.a--;
        System.out.println(t1.a); // 11
        System.out.println(t1.a); // 11

    }

}
