import java.util.Scanner;

public class basicmaths {
    public int countDigit(int n) {
        int c=0;
        while(n>0){
         int lastDig = n% 10;
         c=c+1;
         n = n/10;
        }
        return c;
     }
     public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = Sc.nextInt();
        basicmaths bm = new basicmaths();
        int digits = bm.countDigit(num);

        System.out.println("Number of digits: " + digits);
     }
}
