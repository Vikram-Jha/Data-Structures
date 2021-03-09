import java.util.*;

public class Factorial_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is required: ");
        int num = sc.nextInt();
        if(num<0){System.out.println("Number cann't be Negative"); return;}
        long fact=1;
        for(int i=num;i>1;i--){
            fact*=i;
        }
        System.out.println("The factorial of the no is: " + fact);
    }
}
