//Abundant numbers :- Abundant number is an number in which the sum 
//of the proper divisors of the number is greater than the number itself.

import java.util.*;
    
public class Abundant_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();
        int sum =0;
        for(int i=1;i<=number/2;i++)
            if(number%i==0)
                sum+=i;
        if(number<sum)
            System.out.println("No is an abundant number");
        else
            System.out.println("No is not an abundant number");
    }    
}
