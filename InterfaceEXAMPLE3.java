interface first{
    int x = 10;
    void show();

} 
interface second{
    int y = 20;
    void display();
    
}
class A implements first,second{
    public void show(){
        System.out.println("Hello from Show");}
        public void display(){
            System.out.println("Hello from Display");
        } 
        void add(){
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
    }
class InterfaceEXAMPLE3 
{
    public static void main (String args[]){
        A a1 = new A();
        a1.show();
        a1.display();
        a1.add();
    }
    
}
