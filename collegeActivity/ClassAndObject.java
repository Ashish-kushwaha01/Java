package collegeActivity;

import java.util.Scanner;

class Mentor{
void disp(){
        System.out.println("Starter Here");
    }
}
class Student {
    int id ;
    String name ;
}

public class ClassAndObject {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter that how many student do you have ? : ");
        int n=sc.nextInt();
    
    Student (int ) S1[] = new Student()int[n];
    Mentor m1 = new Mentor();
        // int S[]=new int[n];
    Student S2 = new Student();
    System.out.println("Enter Id of second student :");
    S2.name=sc.nextLine();
    S2.id=sc.nextInt();
    
    // for(int i=1;i<=n;i++){
        
    //     S[i]= sc.nextInt();
    // }
    // System.out.println(S1.id);
    // System.out.println(S1.name);
    System.out.println("Id of second student is  : "+S2.id);
    System.out.println("Name of second student is  : "+S2.name);

}

}