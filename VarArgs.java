// Var args (Variable Argument)

public class VarArgs {
    void add(int... x) { // Ellipse = ...x
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        VarArgs t1 = new VarArgs();
        t1.add(10, 20, 30, 40, 50);
        t1.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

}

// According to the property of Ellipse it must be the last parameter in a
// method.

/*
 * For Example :- void add (int ...x,int n) is an invalid statement but void
 * add(int n,int ...x) these will be the valid statement
 */
