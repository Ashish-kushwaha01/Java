package Array;
/* Write a Java Program for Addition of Two Matrices . */

import java.util.Scanner;

public class Add {
   
    public static void main(String[] args) { 
        
        Scanner in=new Scanner(System.in);
         int m,n;
        System.out.println("Enter how many row and column in your matrices ? : ");
        m=in.nextInt();
        n=in.nextInt();

        int arr[][] = new int[m][n];  // First matrix 
        int brr[][] = new int[m][n];
        int sum[][] = new int[m][n];  // Second matrix 

        System.out.println("Enter elements of first matrix :  ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print( "Enter element "+(i+1)+", "+(j+1)+ " = ");
                arr[i][j] = in.nextInt();
                
            }
        }

        System.out.println("Enter elements of second matrix :  ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print( "Enter element "+(i+1)+", "+(j+1)+ " = ");
                brr[i][j] = in.nextInt();
                
            }
        }
        System.out.println("Sum of both matrices are : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              sum[i][j] = arr[i][j] + brr[i][j];
               System.out.print(sum[i][j]+"\s\s"); 
            }
            System.out.print("\n");
        }
    }
    
}
