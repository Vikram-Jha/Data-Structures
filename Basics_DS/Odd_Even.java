import java.util.*;

public class Odd_Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no to be checked : ");
        int number = sc.nextInt();
        boolean check = (number%2==0) ? true : false;
        if(check)
            System.out.println("No is even");
        else
            System.out.println("No is odd");
    }
    
}
