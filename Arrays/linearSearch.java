public class linearSearch {
    public static int ls(int n,int num,int arr[]){
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={6,7,8,4,1};
         int n=arr.length;
         int num=8;
         int res=ls(n, num, arr);
         if(res == -1){
            System.out.println("Element not found");
         }
         else{
            System.out.println("Element found at index: "+res);
         }
    }
}
