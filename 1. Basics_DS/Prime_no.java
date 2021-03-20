import java.util.*;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int number = sc.nextInt();
        for(int i = 2; i<number ; i++){
            if(number%i==0){
                System.out.println(number + " is not a prime number");
                return;
            }
        }
        System.out.println(number + " is a prime number");            
    }
}
