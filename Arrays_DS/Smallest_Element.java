public class Smallest_Element {
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        System.out.println("Smallest element is: " + smallest(arr));

    }

    public static int smallest(int [] arr) {
        int small=arr[0];
        for(int i=0;i<arr.length-1;i++)
            if(arr[i]<arr[i+1])
                small=arr[i];
            else
                small=arr[i+1];
        
        return small;
    }
}