import java.util.Scanner;

public class Integer_Length{
    public static void main(String[] args) {
        int x;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your no. : ");
        x=sc.nextInt();
        int y=0;
        int rev=0;
        int n=x;
        while(x!=0){
            int digit = x%10;
            rev = (rev*10)+digit;
            x=x/10;
            
            y++;
        }
        System.out.println("Total digits in my element is : "+y);
        if(y>= 10)
        System.out.println(0);
        else
        System.out.println("Reverse of my integer is : "+rev);
    }
}