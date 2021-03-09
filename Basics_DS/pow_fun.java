import java.util.Scanner;

public class pow_fun {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double x = sc.nextDouble();
        System.out.print("Enter the Exponential number: ");
        double y =sc.nextDouble();
        System.out.printf("pow(%.3f, %.3f) is %.3f%n", x, y, Math.pow(x, y));
     }
  }