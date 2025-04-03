import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (is_Prime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }

    /*
     * This method checks whether a given number is a prime number.
     * It uses an iterative approach.
     * Time complexity is O(√n).
     * Starting from 2, it checks if the number is divisible by any integer up to the square root of n.
     * If such a divisor is found, the number is composite; otherwise, it is prime.
     * @param n The number to check for primality
     * @return true if the number is prime, false if it is composite
     */

    public static boolean is_Prime(int n){
        if(n<2) return false;
        for (int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}