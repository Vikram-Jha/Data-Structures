import java.util.*;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked :");
        int number = sc.nextInt();
        if(number==0)
            System.out.println("Netheir positive nor negative");
        else if(number>0)
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");
        
    }
    
}
