import java.util.Scanner;
public class Reverse_an_array {
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
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int temp = arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
