package Java;
import java.util.*;
class B{
    int a;  String name ;
    B(){
        a=0; name= null;
    }
    void show() {
        System.out.println(a+" "+name);
    }
}
 class Constructor {
    public static void main(String[] args) {
        B ref=new B();
        ref.show();
    
}
    }
    
