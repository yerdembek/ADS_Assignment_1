import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ShowR(scan,n);

        System.out.println();
        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }

    /*
     * This method prints a sequence of numbers in reverse order
     * using recursion.
     * Time complexity is O(n), as each recursive call processes one element.
     * It reads input values recursively and prints them after the recursive call returns,
     * effectively reversing the order.
     *
     * @param n The number of elements in the sequence (length of the input)
     * @return None (the method prints the reversed sequence to the output)
     */

    public static void ShowR(Scanner scan, int n){
        if(n==0) return;
        int curNum = scan.nextInt();
        ShowR(scan,n-1);
        System.out.print(curNum+" ");
    }
}