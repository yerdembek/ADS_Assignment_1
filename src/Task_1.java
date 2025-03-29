import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(Minimum(arr));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }

    /*
     * This method finds the minimum element in the array
     * using an iterative approach.
     * Time complexity is O(n).
     * It goes through each element of the array,
     * continuously updating the current minimum.
     * If a smaller element is found, it replaces the current minimum.
     * @param array The array to search through
     * @return The smallest element in the array
     */

    public static int Minimum(int[] arr){
        int min = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}