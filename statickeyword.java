// static Keyword

/*
 * static keyword can be used with variable declaration and method declaration,
 * we can also have a staatic block.
 * 
 * If a variable is declared as static then it will be treated as a class
 * variable rather than instance variable.
 * It means that it's memory allocation will be dependent on loading of class
 * rather than creation of an object.
 * It also means that there will exist only a single copy of static variable for
 * all the objects and all the objects will share that commonly allocated
 * memory.
 * 
 * Objects are not allowed to allocate seperate memory for static variable.
 * 
 * As static variables are independent from the object, we can access them without any object,directly through the class name.
 * 
 * static method is also indepentdent from the object and we can access it without any object directly through the class name.
 * It is a compulsion that a static method can have either local variables or static variables in it's defination.
 * 
 * static block is also similar to the static method but it has more priority than the main method.
 */

// Example - 

class statickeyword {
    static int a;

    public static void main(String args[]) {
        statickeyword t1 = new statickeyword();
        statickeyword t2 = new statickeyword();
        statickeyword t3 = new statickeyword();
        t1.a = 10;
        t2.a = 100;
        t3.a = 1000;
        System.out.println(t1.a);
        System.out.println(t2.a);
        System.out.println(a);
        System.out.println(statickeyword.a);
    }
}