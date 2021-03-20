

public class Sort_an_Array {
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sort(int [] a) {
        for(int i=0; i<a.length;i++){
            for (int j = i+1; j < a.length; j++) {
                int temp=0;
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
}
