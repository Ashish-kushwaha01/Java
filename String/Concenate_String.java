package String;

import java.util.Scanner;

/* Java Program to Append(Concatenate) one string to another string . */
public class Concenate_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,ptr;
        System.out.println("Enter your first string : ");
        str = sc.nextLine();
        System.out.println("Enter your second String : ");
        ptr=sc.nextLine();

        String con = str.concat(ptr);;
        

        System.out.println(con);

    }
}
