import java.util.Scanner;

public class Percentage {
    /* Find the percentage of a student whose marks is given . */
    
    public static void main(String[] args) {
        int math_marks;
        int Eng_marks;
        int Chem_marks;
        int Phys_marks;
        int Hindi_marks;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of Maths : ");
        math_marks=sc.nextInt();
         System.out.println("Enter marks of English : ");
         Eng_marks=sc.nextInt();
         System.out.println("Enter marks of Chemistry : ");
        Chem_marks=sc.nextInt();
         System.out.println("Enter marks of Physics : ");
       Phys_marks=sc.nextInt(); 
        System.out.println("Enter marks of Hindi : ");
        Hindi_marks=sc.nextInt();

        int p = (math_marks + Eng_marks+ Chem_marks + Phys_marks + Hindi_marks)/5;

        System.out.println("Your percentage is : "+p+ "%");
    }
}
