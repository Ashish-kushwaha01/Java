package Exercise;

import java.util.Scanner;

public class power_Using_Iteration {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your no. (a) : ");
    double a=sc.nextInt();
    System.out.println("Enter your no. (b) : ");
    int b=sc.nextInt();

    double power=1;
    for(int i=1;i<=b;i++){
        power*=a;
    }
    System.out.println("a^b is : "+power);
  }
}
