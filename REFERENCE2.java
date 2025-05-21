// REFERENCE

/* It is a variable of class type that is capable to hold the hash code of another object of same class */

// If a reference is allowed to make a change in the value of another object then the concept is called Mutability of object

// If a reference is not allowed to make a change in the value of another object then the concept is called Immutability of object

class REFERENCE2 {
    int a = 10;

    public static void main(String args[]) {
        REFERENCE2 t1 = new REFERENCE2(); // Object
        REFERENCE2 t2 = t1; // t2 is a Reference
        System.out.println(t1.a); // 10
        System.out.println(t2.a); // 10
        t1.a++;
        t2.a--;
        System.out.println(t1.a); // 10
        System.out.println(t2.a); // 10

    }

}