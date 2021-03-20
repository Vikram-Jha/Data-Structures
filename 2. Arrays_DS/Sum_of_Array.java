import java.util.Scanner;

public class Sum_of_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        if(size<=0){
            System.out.print("Enter valid size!");
            return;
        }
        int[] arr =new int[size];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.print("sum of elemnts of the array is " + sum);
}
}