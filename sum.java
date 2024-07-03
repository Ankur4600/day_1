package day_1;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //taking input from user
        System.out.println("enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("enter second number : ");
        int b =sc.nextInt();
        //sum operation
        int c = a+b;
        //output
        System.out.println("sum of two number is "+c);
    }
}
