
//Amicable numbers has equal sum of proper divisor equal(Friendly pair)

import java.util.*;

public class Amicable_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count1=0;
        int count2=0;
        for(int i=1;i<=num1/2;i++)
            if(num1%i==0)
                count1=count1+i;
        for(int j=1;j<=num2/2;j++)
            if(num2%j==0)
                count2=count2+j;
        if(count2==num1&& count1==num2)
            System.out.print("Two numbers are Amicable numbers");
        else
            System.out.print("Two numbers are not Amicable numbers");
    }
}
