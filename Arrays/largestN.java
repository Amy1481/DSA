public class largestN {
    static int findLargestElement(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,2};
        System.out.println("The largest element in the array is: "+findLargestElement(arr));
    }
}
