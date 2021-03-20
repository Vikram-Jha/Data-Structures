public class LargestAndSmallestElement {
    public static void main(String[] args) {
        int [] arr ={0,4,6,2,1};
        System.out.println(largest(arr) + " and " + smallest(arr) +
        " are largest and smallest elements of the array");
    }

   public static int largest(int [] a) {
        int large = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>large)
                large=a[i];
        }
        return large;
        
    }

    public static int smallest(int [] arr) {
        int small=arr[0];
        for(int i=1; i<arr.length ;i++)
            if(small>arr[i])
                small=arr[i];        
        return small;
    }
}
