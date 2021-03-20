
public class Largest_Element {
    public static void main(String[] args) {
        int [] arr ={0,4,6,2,1};
        System.out.println(largest(arr) + 
        " is the largest element in the array");
    }

    public static int largest(int [] a) {
        int large = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>large)
                large=a[i];
        }
        return large;
        
    }
}
