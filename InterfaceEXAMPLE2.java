interface first{
    void add();
    void show();
}
interface second {
    void add();
    void display();
}
class A implements first,second{
    public void show()
    {
        System.out.println("Hello from Show");
    }
    public void display()
    {
        System.out.println("Hello from Display");
    }
    public void add()
    {
        System.out.println("Hello from Add");
    }
}
class InterfaceEXAMPLE2 {
    public static void main(String args[]){
        A a1 = new A();
        a1.show();
        a1.display();
        a1.add();
    } 
    
}
