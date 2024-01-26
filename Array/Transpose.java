package Array;

import java.util.Scanner;

/* Java Program to find Transpose Matrix . */
public class Transpose {
    public static void main(String[] args) { 
        
        Scanner in=new Scanner(System.in);
         int m,n;
        System.out.println("Enter how many row and column in your matrices ? : ");
        m=in.nextInt();
        n=in.nextInt();

        int arr[][] = new int[m][n];  // First matrix 
       
        System.out.println("Enter elements of  matrix :  ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print( "Enter element "+(i+1)+", "+(j+1)+ " = ");
                arr[i][j] = in.nextInt();
                
            }
        }
        System.out.println("My given matrix is :  ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             
                System.out.print (arr[i][j]+ " \s\s");
                
            }
            System.out.print("\n");
        }

        System.out.println("Transpose of your matrix is :  ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+ "\s\s");
                
            }
            System.out.print("\n");
        }
}
}
