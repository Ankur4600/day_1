package day_1;
import java.util.*;
//program for armstrong number
public class armstrong_num {
    public static void main(String[] args) {
        System.out.print("enter the number: ");
        Scanner sc =new  Scanner(System.in);
        int num= sc.nextInt();
        int temp=num;//for comparision of m
        int m=0;
        while(num!=0){
            int rem=num%10;
            m=m+rem*rem*rem;
            num=num/10;
        }
        //comparing new 'm' with 'temp'
        if(temp==m){
            System.out.println(m+" is armstrong number");
        }
        else{
            System.out.println(temp+" not an armstrong number");
        }
       
        
    }
    
}
