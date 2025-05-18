// WAP to print summation of all elements of given array 
public class PrintSUMMATIONofelementofgivenARRAY {
    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 40, 50 }, sum = 0;
        for (int i = 0; i < a.length; i++) { // for(i:a){
                                             // sum=sum+i;}
            sum = sum + a[i];
        }
        System.out.println(sum);
    }

}
