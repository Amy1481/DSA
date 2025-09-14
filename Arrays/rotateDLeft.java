public class rotateDLeft {
    public static void Rotatetoright(int arr[],int n,int d){
        if(n==0){
            return;
        }
        d=d%n;
        if(d>n){
            return;
        }
        int temp[]=new int[d];
        for(int i=n-d;i<n;i++){
            temp[i-n+d]=arr[i];
        }
        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
          }
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int n=7;
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
        Rotatetoright(arr, n, d);
        System.out.println("After rotating the elements to right: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
