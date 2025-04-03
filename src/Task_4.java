import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(Factorial(n));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }

    /*
     * This method calculates the factorial of a given number n
     * using a recursive approach.
     * Time complexity is O(n).
     * The recursion goes from n down to 1.
     * If n equals 0, it returns 1, since 0! is defined as 1.
     * @param n The number for which the factorial is to be calculated
     * @return The factorial of n
     */

    public static int Factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
}