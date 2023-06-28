import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);

        int sum2 = gaussianSumOfNumbers(number);
        
        System.out.println("sumOfNumbers: " + sum);
        System.out.println("gaussianSumOfNumbers: " + sum2);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    public static int sumOfNumbers(int n) {
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        System.out.println("sumOfNumbers: " + System.currentTimeMillis());
        return sum;
    }
    
    
    public static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    public static int gaussianSumOfNumbers(int n) {
        int sum = 0;
        for(int i=1; i<=(n/2); i++) {
                sum += (n+1);
        }
        System.out.println("gaussianSumOfNumbers: " + System.currentTimeMillis());
        return sum;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.

    // sumOfNumbers was faster only by a few milliseconds.
}
