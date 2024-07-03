package day_1;

import java.util.Scanner;

//to convert given digit to word
public class digit_to_word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number (integer): ");
        long a = sc.nextLong();
        long rev=0;
        //reversing the given number
        while(a!=0){
            long rem= a%10;
            rev=rev*10+rem;
            a =a/10;
        }
        //converting digit to word with the help of switch case
        while (rev!=0) {
            int rem = (int) (rev%10);
            switch(rem){
                case 0:
                System.out.print("zero ");
                break;
                case 1:
                System.out.print("one ");
                break;
                case 2:
                System.out.print("two ");
                break;
                case 3:
                System.out.print("three ");
                break;
                case 4:
                System.out.print("four ");
                break;
                case 5:
                System.out.print("five ");
                break;
                case 6:
                System.out.print("six ");
                break;
                case 7:
                System.out.print("seven ");
                break;
                case 8:
                System.out.print("eight ");
                break;
                default:
                System.out.print("nine ");
                break;
            }

            rev= rev/10;
        }

    }
}
