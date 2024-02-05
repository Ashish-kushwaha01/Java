import java.util.Scanner;

public class Switch_Case_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        char ch[]= new char[0];
        System.out.println("Enter your first no. : ");
        a=sc.nextInt();

        // System.out.println("Which operator do you want to use ? : ");
        // ch[0]= sc.next().charAt(0);

        System.out.println("Enter your second no. : ");
        b= sc.nextInt();
        System.out.println("Which operator do you want to perform  : (1 for + ; 2 for - ; 3 for * ; 4 for / ; 5 for %)");
        int n=sc.nextInt();


        System.out.println("Your answer is : ");
        switch (n) {
            case 1:System.out.println(a+b);  // 1= "+"
            break;
            case 2:System.out.println(a-b);   // 2 =  "-"
            break;
            case 3:System.out.println(a*b);   // 3 = "*"
            break;
            case 4:System.out.println(a/b);   // 4 = "/"
            break;
            case 5:System.out.println(a%b);   // 5 = "%"
            break;
                
                
        
            default:
                break;
        }
    }
}
