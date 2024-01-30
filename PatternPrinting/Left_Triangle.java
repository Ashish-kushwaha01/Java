package PatternPrinting;

import java.util.Scanner;

/* Left Triangle Star Pattern . */
public class Left_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter that how many lines do you have : ");
        n= sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
