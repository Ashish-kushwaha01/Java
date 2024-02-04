import java.util.Scanner;

public class Integer_Length{
    public static void main(String[] args) {
        int x;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your no. : ");
        x=sc.nextInt();
        int y=0;
        while(x!=0){
            x=x/10;
            y++;
        }
        System.out.println("Total digits in my element is : "+y);
    }
}