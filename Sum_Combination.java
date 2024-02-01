// package Java;

import java.util.Scanner;

public class Sum_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter that how many no. do you have ? : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter your no. : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(" Your no. are : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i]+"\s\s");
        }

        System.out.println("Enter a no. which is sum of given three : ");
        int m=sc.nextInt();
         System.out.println("Your combination of three no. are :");
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                for(int k=i+2;k<=n;k++){
                    if (arr[i]+arr[j]+arr[k]==m){
                       
                System.out.print(arr[i]+","+arr[j]+","+arr[k]);
                System.out.println(" ");
                
                    }
                    
                }
            }
            continue ;
                
        }
    }
}
