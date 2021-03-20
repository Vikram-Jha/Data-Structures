import java.util.*;

public class Greatest_of_two_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        if(first>second)
            System.out.println("First Number is greater");
        else if(second>first)
            System.out.println("Second Number is greater");
        else 
            System.out.println("Both are equal");

    }
    
}
