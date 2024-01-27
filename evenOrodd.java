import java.util.*;
public class evenOrodd {
            public static void main(String[] args) {
                int a;
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter your no. : ");
                a=sc.nextInt();

                if (a%2==0) {
                    System.out.println("Your no. is even no.  ");
                } else {
                    System.out.println("Your no. is odd no. ");
                }
            }
     
}