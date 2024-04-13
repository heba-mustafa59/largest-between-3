package q1;

import java.util.*;

public class Q1 {//heba jalil

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n1,n2,n3;
        n1= in.nextInt();
        n2= in.nextInt();
        n3= in.nextInt();
     int max1= Math.max(n1, n2);
     int max2=Math.max(max1, n3);
         System.out.println("the largest between 3 integers is : "+max2);
     }

       
}

