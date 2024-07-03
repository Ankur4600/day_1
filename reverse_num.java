package day_1;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        //we have to find reverse of a given number
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int a =sc.nextInt();
        int rev_num=0;
        while(a!=0){
            int rem =a%10;
            rev_num=rev_num*10+rem;
            a=a/10;
        }
        System.out.println("reversed number is :"+rev_num);
    }
}
