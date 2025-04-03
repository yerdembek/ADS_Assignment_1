import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(Avg(arr));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/1000000;
        System.out.println(duration);
    }

    /*
     * This method calculates the average value of the elements in the array
     * using a for-each loop.
     * Time complexity is O(n).
     * It iterates through the array, summing all elements,
     * and then divides the total sum by the number of elements.
     * @param array The array whose average is to be calculated
     * @return The average value of the array elements
     */

    public static double Avg(int[] arr){
        double sum = 0;
        for (int elem : arr){
            sum+=elem;
        }
        double res = sum/arr.length;
        return res;
    }
}