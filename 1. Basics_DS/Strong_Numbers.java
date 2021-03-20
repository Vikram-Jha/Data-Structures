import java.util.*;

public class Strong_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be checker: ");
        int number = sc.nextInt();
        int temp = number;
        int sum=0;
        int rem=0;
        while(temp>0){
            rem=temp%10;
            int fact=1;
            for(int i=rem;i>0;i--)
                fact*=i;
            sum+=fact;
            temp=temp/10;
        }
        if(number==sum)
            System.out.print(number + " is a strong number");
        else
            System.out.print(number + " not is a strong number");
    }
}
