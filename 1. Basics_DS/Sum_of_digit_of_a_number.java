import java.util.*;

public class Sum_of_digit_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum=0;
        while(number>0){
            sum+=number%10;
            number=number/10;
        }
        System.out.println(sum + " is the sum of digits");
    }
}
