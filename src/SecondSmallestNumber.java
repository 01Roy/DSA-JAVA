public class SecondSmallestNumber {

    public static void findSecondSmallestNumber(int numbers[]) {
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (max1 <= numbers[i]) {
                max2 = max1;
                max1 = numbers[i];
            }
        }

        System.out.println("the second smallest number is :" + max2);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 4, 5, 6, 2, 7 };
        // Calling the function and passing the array
        findSecondSmallestNumber(numbers);

    }

}
