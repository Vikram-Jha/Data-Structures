import java.util.*;

public class Bcd_to_octal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the BCD Number: ");
        int bcd = scanner.nextInt();
        int rem =0;
        int base=1;
        int decimalValue=0;
        int octalValue=0;
        while(bcd>0){
            rem = bcd%10;
            decimalValue += base*rem;
            base = base*2;
            bcd=bcd/10;
        }
        rem=0;
        base=1;
        while(decimalValue>0){
            rem = decimalValue%8;
            octalValue += rem*base;
            decimalValue = decimalValue/8;
            base = base*10; 
        }
        System.out.println(octalValue + " is the octal value of given bcd");
    }
}
