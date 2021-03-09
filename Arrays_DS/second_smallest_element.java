public class second_smallest_element {
    public static void main(String[] args) {
        int [] arr ={0,4,3,2,1};
        sort(arr);
            System.out.print(arr[1] +
             " is second smallest element in the array");
    }    
    //Insertion sort --> finding smallest and fitting it 
    //first.
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
