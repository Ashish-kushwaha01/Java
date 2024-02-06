import java.util.Scanner;

public class Switch_Case_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        // char ch[]= new char[0];
        System.out.println("Enter your first no. : ");
        a=sc.nextInt();

        // System.out.println("Which operator do you want to use ? : ");
        // ch[0]= sc.next().charAt(0);

        System.out.println("Which operator do you want to perform  : ");
      char ch=sc.next().charAt(0);

        System.out.println("Enter your second no. : ");
        b= sc.nextInt();

        System.out.println("Your answer is : ");
        switch (ch) {
            case('+') :System.out.println(a+b);  // 1= "+"
            break;
            case('-') :System.out.println(a-b);   // 2 =  "-"
            break;
            case('*') :System.out.println(a*b);   // 3 = "*"
            break;
            case ('/'):System.out.println(a/b);   // 4 = "/"
            break;
            case('%') :System.out.println(a%b);   // 5 = "%"
            break;
                
                
        
            default:
                break;
        }
    }
}
