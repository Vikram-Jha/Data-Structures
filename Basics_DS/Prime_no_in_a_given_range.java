import java.util.*;

public class Prime_no_in_a_given_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit and lower limit: ");
        int upperLimit = sc.nextInt();
        int lowerLimit = sc.nextInt();
        while(lowerLimit<=upperLimit){
            int count=0;
            for(int i=1;i<lowerLimit;i++){
                if(lowerLimit%i==0){
                    count++;
                }
            }
            if(count==1)
                System.out.print(lowerLimit + " ");
        lowerLimit++;
        }
    }
}
