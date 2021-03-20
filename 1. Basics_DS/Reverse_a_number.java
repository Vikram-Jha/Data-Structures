import java.util.*;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be reversed: ");
        int number = sc.nextInt();
        int reverse=0;
        int rem=0;
        while(number>0){
            rem=number%10;
            reverse = reverse*10+rem;
            number=number/10;
        }
        System.out.print(reverse + " is reversed number");
    }
}
