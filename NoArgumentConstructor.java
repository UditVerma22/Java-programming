// No-Argument Constructor

public class NoArgumentConstructor {
    NoArgumentConstructor() {
        System.out.println("Hello from Constructor");
    }

    public static void main(String args[]) {
        NoArgumentConstructor t1 = new NoArgumentConstructor();
        NoArgumentConstructor t2 = new NoArgumentConstructor();
        NoArgumentConstructor t3 = new NoArgumentConstructor();
    }

}
/*
 * Output :-
 * Hello from Constructor
 * Hello from Constructor
 * Hello from Constructor
 */
