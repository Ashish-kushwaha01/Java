import java.util.Scanner;

public class Sum {
    
    public static void main(String[] args) {
        int a ,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first and second no. : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.print("Addition of these two is : "+ (a+b));
    }
}
