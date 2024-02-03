package HomeActivity;

 public class Student{
    int roll=23;
    String name;
    double marks ;
    double percentage ;

    // Making Constructor .


    // public Student(String naam,int rollNo,double ank){
    //     name = naam;
    //     roll=rollNo;
    //     marks=ank;
    // }
    public Student(){
        
    }
    
    public Student(String name,int roll,double marks){
        this.roll=roll;
        this.marks=marks;
        this.name =name;
    }

    // using of getter and setter .
    public int getRoll(){
        return roll;
    }

    public void setRoll(int n){
        roll = n;
    }

}
