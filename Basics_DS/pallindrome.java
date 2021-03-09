import java.util.*;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int number = sc.nextInt();
        int temp=number;
        int reverse=0;
        int rem;
        while(number>0){
                rem= number%10;
                reverse=reverse*10+rem;
                number=number/10;
        }
        if(temp==reverse)
            System.out.println("Number is a pallindrome");
        else
            System.out.println("Number is not a pallindrome");
    }
    
}
