package Array;

import java.util.Scanner;

/* Java Program for Multiplication of Two Matrices . */
public class Multiply {
    public static void main(String[] args) { 
        
        Scanner in=new Scanner(System.in);
         int m,n,o;
        System.out.println("Enter how many row and column in your first matrix ? : ");
        m=in.nextInt();
        n=in.nextInt();

        int arr[][] = new int[m][n];  // First matrix 
        
        System.out.println("Enter elements of first matrix :  ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print( "Enter element "+(i+1)+", "+(j+1)+ " = ");
                arr[i][j] = in.nextInt();
                
            }
        }
        System.out.println("Enter how many column in your matrices ? : ");
        o=in.nextInt();
        
        int brr[][] = new int[n][o];    // Second matrix
        int mlt[][] = new int[m][o];   


        System.out.println("Enter elements of second matrix :  ");
        for(int i=0;i<n;i++){
            for(int j=0;j<o;j++){
                System.out.print( "Enter element "+(i+1)+", "+(j+1)+ " = ");
                brr[i][j] = in.nextInt();
                
            }
        }
        System.out.println("Multiply of both matrices are : ");
        for(int i=0;i<m;i++){
           
            for(int j=0;j<o;j++){ 
                mlt[i][j]=0;
                for(int k=0;k<n;k++){
                    mlt[i][j]+= arr[i][k]* brr[k][j];
                    
                }
                System.out.print(mlt[i][j]+ " \s\s");
            }
            System.out.print("\n");
        }
    }
    
}
