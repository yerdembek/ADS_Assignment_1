import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(Fib(n));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }

    /*
     * This method returns the nth number in the Fibonacci sequence
     * using a recursive approach.
     * Time complexity is O(2^n) due to repeated recursive calls —
     * each call branches into two more, leading to exponential growth.
     *
     * @param n The position (index) in the Fibonacci sequence
     * @return The value of the nth Fibonacci number
     */

    public static int Fib(int n){
        if (n==0 || n==1) return n;
        return Fib(n-1)+Fib(n-2);
    }
}