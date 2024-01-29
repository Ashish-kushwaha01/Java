package String;

import java.util.Scanner;

/* Java Program to swap two String using temp variable . */
public class Swap_String_temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,ptr,temp;
        System.out.println("Enter your first String : ");
        str = sc.nextLine();  
         System.out.println("Enter your second String : ");
        ptr = sc.nextLine();

            temp = str;
            str=ptr;
            ptr=temp;

            System.out.println("Your first String is  : "+str);
            System.out.println("Your second String is  : "+ptr);

        
    }
}
