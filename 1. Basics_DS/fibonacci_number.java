import java.util.*;
public class fibonacci_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms of fibonacci numbers: ");
        int num=sc.nextInt();
        int currentTerm=1;
        int previousTerm=0;
        int temp=0;
        System.out.print(previousTerm + " " + currentTerm + " ");
        for(int i=2;i<num;i++){
            temp=currentTerm+previousTerm;
            previousTerm=currentTerm;
            currentTerm=temp;
            System.out.print(currentTerm + " ");
        }
    }    
}   
