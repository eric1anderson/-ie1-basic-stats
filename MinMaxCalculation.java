import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class MinMaxCalculation{

    public static int max(int[] nums){
        
        return Arrays.stream(nums).max().getAsInt();

    }
    public static int min(int[] nums){
        return Arrays.stream(nums).min().getAsInt();
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = min(numbers);
        int max = max(numbers);

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }

}





