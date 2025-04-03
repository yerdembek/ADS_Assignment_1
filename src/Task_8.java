import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(isDigits(s,s.length()-1));
        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }

    /*
     * This method checks whether the given string contains only digit characters,
     * using a recursive approach.
     * It starts from the end of the string and checks each character moving toward the beginning.
     * If a non-digit character is found, the method returns false.
     * If all characters are digits, it returns true.
     *
     * @param text The input string to be checked
     * @param curIndex The current index being examined (starts from the end of the string)
     * @return true if the string contains only digits, false otherwise
     */

    public static boolean isDigits(String text,int Curindex){
        if (Curindex==-1){
            return true;
        }
        switch (text.charAt(Curindex)){
            case '1','2','3','4','5','6','7','8','9','0': return isDigits(text, Curindex-1);
            default: return false;
        }
    }
}