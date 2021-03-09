import java.util.*;

public class Factos_of_a_number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number whose factor is to be defined: ");
        int number = sc.nextInt();
        System.out.print("Factors are: ");
        for(int i=1;i<=number;i++){
            if(number%i==0)
                System.out.print(i + " ");
        }
    }
}
