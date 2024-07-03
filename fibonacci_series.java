package day_1;
import java.util.*;
//printing fibonacci number ntil given term
public class fibonacci_series {
    public static void main(String[] args) {
        System.out.print("enter the interger value :");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int a,b;
        int temp=0;
        a=0;
        b=1;
        if (num==0){
            System.out.print(a);
        }
        else if(num==1){
        System.out.print(a+" "+b);
        }
        else {
            int i;
            for(i=1; i<=num;i++){
                System.out.print(a+" ");
                temp=b;
                b=b+a;
                a=temp; 
                
            }
        }
    }
    
}
