import java.util.*;

public class Harshad_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to test: ");
        int number = sc.nextInt();
        int temp=number;
        int sum=0;
        while(temp>0){
            sum+=temp%10;
            temp=temp/10;
        }
        if(number%sum==0)
            System.out.println("Number is Harshad");
        else
            System.out.println("Not a Harshad Number");
    }    
}
