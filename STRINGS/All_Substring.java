package STRINGS;

import java.util.Scanner;

public class All_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string : ");
        String s=sc.nextLine();

        int len=s.length();
        for(int i=0;i<len;i++){
            for(int j=i;j<=len;j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
    
}
