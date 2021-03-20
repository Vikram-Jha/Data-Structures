import java.util.*;

public class Greatest_of_three_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers to be compared: ");
        int first = sc.nextInt();
        int second =sc.nextInt();
        int  third = sc.nextInt();
        if(first == second || second == third || third == first){
            System.out.print("Please enter three distinct numbers to be compared");
            return;
        }
        if(first > second && second > third)
            System.out.println(first +" is the greatest");
        else if(second> third && third> first)
            System.out.println(second + " is the greatest");
        else
            System.out.println(third + " is the greatest");
    }
}
