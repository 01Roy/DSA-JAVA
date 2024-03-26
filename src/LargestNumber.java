import java.util.*;

public class LargestNumber {
    public static int findLargestNumber(int numbers[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 6, 47, 6 };

        System.out.println("the largest number is " + findLargestNumber(numbers));

    }
}
