package Array;

import java.util.Scanner;

/* Java Program for Subtraction of Two Matrices . */
public class Subtract {
    public static void main(String[] args) { 
        
        Scanner in=new Scanner(System.in);
         int m,n;
        System.out.println("Enter how many row and column in your matrices ? : ");
        m=in.nextInt();
        n=in.nextInt();

        int arr[][] = new int[m][n];  // First matrix 
        int brr[][] = new int[m][n];
        int Subtract[][] = new int[m][n];  // Second matrix 

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
        System.out.println("Subtract of both matrices are : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Subtract[i][j] = arr[i][j] - brr[i][j];
               System.out.print(Subtract[i][j]+"\s\s"); 
            }
            System.out.print("\n");
        }
    }
    
}
