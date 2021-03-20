import java.util.*;

public class BCD_TO_DECIMAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the BCD the number: ");
        int num = scanner.nextInt();
        int base=1;
        int rem= 0;
        int decimalValue = 0;
        while(num>0){
            rem = num%10;
            decimalValue += base*rem;
            base = base*2;
            num=num/10;
        }
        System.out.println(decimalValue + " is the decimal value of given binary");
       /*USING THE BUILD IN FUNTION SO AS TO CONVERT BINARY TO DECIMAL */
        // String binaryNumber = "1001";
        // System.out.println(Integer.parseInt(binaryNumber, 2));
    }    
}
