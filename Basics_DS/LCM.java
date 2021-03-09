import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers here: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int largerNumber = (firstNumber>secondNumber)
                            ? firstNumber : secondNumber;       
        int lcm = firstNumber* secondNumber;
        for(int i = lcm; i >=largerNumber ; i--){
            if(i%firstNumber==0 && i%secondNumber==0)
                lcm=i;
        }
        System.out.println(lcm + " is the lcm of the numbers");
        sc.close(); //Not necessary but good practice! why?
    }
}
