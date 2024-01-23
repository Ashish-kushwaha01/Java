import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no. : ");
        n=sc.nextInt();
        int i=1;
        int fact=0;
        
        while (n!=i) {
            if(n==0){
                System.out.println("factorial is : 1");
            }
            else{
                fact*=n;
                i--;
            }
        }
        System.out.println("Factorial is : "+fact);
    }
}
