import java.util.*;
public class Sum_of_no_in_a_given_range {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the upper limit: ");
        int upperLimit = sc.nextInt();
        System.out.print("Enter the lower limit: ");
        int lowerLimit = sc.nextInt();
        if(upperLimit<lowerLimit){ 
            System.out.println("UpperLimit can't be less than LowerLimit");
        return;}
        int sum= 0;
        for(int i = lowerLimit; i<=upperLimit; i++){
            sum += i;
        }
        System.out.println("Sum of the numbers are: "+ sum);
    }
}
