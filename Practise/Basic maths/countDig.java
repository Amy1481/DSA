public class countDig {
    public static int countDigit(int n) {
      //Initialize a counter variable 'c' such that it stores the count of digits
        int c=0;
        //While loop iterates until 'n' becomes 0(no more digits left)
        while(n>0){
         //Increment the counter for each digit encountered 
         c=c+1;
         //Divide 'n' by 10 to remove the last digit
         n = n/10;
        }
        //Return the count of digits
        return c;
     }
     public static void main(String[] args) {
        int num = 329823;
        System.out.println("Number: "+num);
        int digits = countDigit(num);
        System.out.println("Number of digits: " + digits);
     }
}
