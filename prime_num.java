package day_1;
import java.util.*;
//program to find prime number
public class prime_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();//taking input
        int m=num/2;
        int flag=0;//counter
        //checking for prime number
        if(m==1||m==0){
            System.out.println("not a prime number");
            return;
        }
        
            
         else {
            for(int i=2; i<=m; i++){
                if(num%i==0){
                    System.out.println("not a prime number");
                    flag=1;
                    break;
                }
            }
            
        }
       if(flag==0){ System.out.println("It is a prime number");
    }
}
}
