
    import java.util.Scanner;

public class Paramatrized {
// Parametrized Constructer .
class A{
    A(int a ,int b){
        
        System.out.println("Large no. is : ");
        if(a>b)
        System.out.print(a);
    
    else
    System.out.print(b);
}
}
public class Parametrized {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first no. :");
        a=sc.nextInt();

        System.out.println("Enter your second no. :");
        b=sc.nextInt();

       A ref=new A(a, b)
    }
}

}
