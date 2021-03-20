import java.util.*;

public class Decimal_2_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        int base=1;
        int rem=0;
        int binaryValue=0;
        while(decimal>0){
            rem = decimal%2;
            binaryValue += base*rem;
            decimal = decimal/2;
            base = base*10;
        }
        System.out.println(binaryValue + " is the binary value of given decimal value");
    }   
}
