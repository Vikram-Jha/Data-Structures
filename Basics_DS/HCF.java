import java.util.*;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers here: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int smallerNumber = (firstNumber<secondNumber)
                            ? firstNumber : secondNumber;       
        int hcf = smallerNumber;
        for(int i = hcf; i >=1 ; i--){
            if(firstNumber%i==0 && secondNumber%i==0){
                hcf=i;
                break;
            }
        }
        System.out.println(hcf + " is the hcf/gcd of the numbers");
        sc.close(); //Not necessary but good practice! why?
    }
}
