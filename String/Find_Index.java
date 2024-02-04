package String;

import java.util.Scanner;

public class Find_Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,str1;
        System.out.println("Enter your string : ");
        str=sc.nextLine();
         System.out.println("Enter your second string : ");
         str1=sc.nextLine();

        System.out.println("Which character do you want to search ? : ");
        char ch=sc.next().charAt(0);

        System.out.println(str.indexOf(ch));

        System.out.println(str.indexOf(ch,str.indexOf(ch)+1));
        
        System.out.println(str.indexOf(ch, str.indexOf(ch,str.indexOf(ch)+1)+1));
        System.out.println(str.indexOf(ch, str.indexOf(ch, str.indexOf(ch,str.indexOf(ch)+1)+1)+1) );

        System.out.println("Enter the index : ");
        int i=sc.nextInt();
        System.out.println(str.charAt(i)+"  is on the "+i+"th index .");


        // check that both string are same or not .
       

        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str1);// with out trim 

        System.out.println(str1.trim());  // After trim 

        System.out.println("Which character do you want to change :");
       
        char k=sc.next().charAt(0);
        
 System.out.println("Which character do you want to change :");
        char k=sc.next().charAt(0);
    }

    
}
