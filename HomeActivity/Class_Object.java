package HomeActivity;

// import java.util.*;

public class Class_Object {

     
        
  
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        
        
        Student s = new Student("Ashish",14,785.32);
        Student s1 = new Student("Aman",10,780.32);
        Student s2 = new Student();
        s2.name="Ashish Kushwaha ";
        s2.marks=785.32;
        // s.percentage = 98.09;
        // System.out.println("Roll no. first of student : "+ s.getRoll());
        System.out.println("Roll no. first of student : "+ s.roll);
        System.out.println("Name  of first student : "+s.name);
        System.out.println("Marks  of first student : "+s.marks );
        System.out.println("");
        System.out.println("Roll no. second of student : "+ s1.roll);
        System.out.println("Name  of second student : "+s1.name);
        System.out.println("Marks  of second student : "+s1.marks );
        
        System.out.println("");
        System.out.println("Roll no. third of student : "+ s2.roll);
        System.out.println("Name  of third student : "+s2.name);
        System.out.println("Marks  of third student : "+s2.marks );
        // System.out.println("Percentage of first student : "+s.percentage );
    }
    
}

