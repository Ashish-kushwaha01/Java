
/* Find cube root of a given  no.  */

import java.util.Scanner;
// import java.math.*;

public class Cube_Root {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter your no. : ");
        n=sc.nextInt();
       double cb = Math.cbrt(n);
        System.out.println(cb);
    }
}
