// HASH CODE

// It is a uniquely define identifier by which each object can be identified uniquely in the system by jbm

class HashCode {
    public static void main(String args[]) {
        HashCode t1 = new HashCode(); // Object
        HashCode t2 = new HashCode(); // Object
        System.out.println(t1); // HashCode@15db9742
        System.out.println(t2); // HashCode@6d06d69c
        System.out.println(t1.toString()); // HashCode@15db9742
        System.out.println(t2.toString()); // HashCode@6d06d69c
        System.out.println(t1.hashCode()); // 366712642
        System.out.println(t2.hashCode()); // 1829164700

    }
}