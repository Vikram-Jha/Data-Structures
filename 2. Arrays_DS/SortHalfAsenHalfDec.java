import java.util.Scanner;
public class SortHalfAsenHalfDec {
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
            for (int i = 0; i < (arr.length/2)-1; i++) {
                for (int j = i+1; j < (arr.length/2)+1; j++) {
                    if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    } 
                }
                for (int j = (arr.length/2) ; j > arr.length; j++) {
                    if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    }
                }
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
