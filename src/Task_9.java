import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(BinomialCef(n,k));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }

    /*
     * This method calculates the binomial coefficient (combinations) C(n, k)
     * using a recursive approach.
     * Base cases: when k == 0 or k == n, the result is 1.
     * Recursive case: C(n, k) = C(n - 1, k - 1) + C(n - 1, k).
     * This represents the number of ways to choose k elements from a set of n.
     *
     * @param n The total number of elements (bottom of the binomial coefficient)
     * @param k The number of elements to choose (top of the binomial coefficient)
     * @return The binomial coefficient C(n, k)
     */

    public static int BinomialCef(int n,int k){
        if(k==0||k==n) return 1;
        return BinomialCef(n-1,k-1)+BinomialCef(n-1,k);
    }
}