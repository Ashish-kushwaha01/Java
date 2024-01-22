package Java;
class A{
    int a; String name ; Boolean c;
    A()    // Default Constructor 
    {
        a=500 ; name = "Ashish "; c=true ; 
    }
    void Display(){
        System.out.println(a+" " +name +" "+c);
    }
}
public class Default {
    public static void main(String[] args) {
        A ref=new A();
        ref.Display();
    }
}
