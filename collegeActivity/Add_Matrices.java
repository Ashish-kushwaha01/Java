package collegeActivity;

import java.util.Scanner;

/* Addition of two matrices . */
public class Add_Matrices {
    public static void main(String[] args) {
        Scanner dc=new Scanner(System.in);
        int r,c;
        System.out.print("How many row and column in your matrices ? : ");
        r=dc.nextInt();
        c=dc.nextInt();

        int arr[][]=new int [r][c];
        int brr[][]=new int [r][c];
        int sum[][]=new int [r][c];
        System.out.println("Enter elements of your first matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element "+(i+1)+" "+(j+1)+" : ");
                arr[i][j]=dc.nextInt();
            }
        }
        
        System.out.println("Enter elements of your second matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element "+(i+1)+" "+(j+1)+" : ");
                brr[i][j]=dc.nextInt();
            }
        }

        System.out.println("Sum of my both matrices is : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j] = arr[i][j] + brr[i][j];
                System.out.print(sum[i][j]+" \s");
            }
            System.out.print("\n");
        }
    }

    
}
