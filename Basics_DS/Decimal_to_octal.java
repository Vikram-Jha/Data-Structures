import java.util.Scanner;
public class Decimal_to_octal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int decimal = scanner.nextInt();
        int rem = 0;
        int base = 1;
        int octalValue = 0;
        while(decimal>0){
            rem= decimal%8;
            octalValue += base*rem;
            decimal=decimal/8;
            base = base*10;
        }
        System.out.println(octalValue + " is the octal equivalent for decimal number");
    }
}
