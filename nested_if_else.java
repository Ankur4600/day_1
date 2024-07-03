package day_1;

import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        float a=sc.nextFloat();
        //fixing the range
        if (a<0 || a>100) 
             System.out.println("marks should be in between 0 and 100");
        else if(a<50)
            System.out.println("Grade F");
        else if(a>=50 && a<60)
            System.out.println("Grade D");
        else if(a>=60 && a<70)
            System.out.println("Grade C");
        else if(a>=70 && a<80)
            System.out.println("Grade B");
        else if(a>=80 && a<90)
            System.out.println("Grade A");
        else 
            System.out.println("Grade A+");
    }
}
