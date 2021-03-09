import java.util.*;

public class Sum_of_Natural_No {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        int n,sum;
        System.out.print("Enter the limit of number upto which sum is req. : ");
        n=sc.nextInt();
        if(n<=0) {System.out.print("No cann't be zero or negative"); return;}
        sum = (n*(n+1))/2;
        System.out.println("Sum of " + n + " Natural No. is: " + sum);
    }
    
}
