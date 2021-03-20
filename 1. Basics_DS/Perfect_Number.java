import java.util.*;

public class Perfect_Number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number req. to be checked: ");
        int number = sc.nextInt();
        int sum=1;
        for(int i=2;i<=number/2;i++){
            if(number%i==0)
                sum+=i;
        }
        if(sum==number)
            System.out.print(number + " is a perfect number"); 
        else
            System.out.print(number + " is not a perfect number"); 
    }
}
