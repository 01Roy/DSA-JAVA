public class MaxSumSubArray2 {
    public static void MaxSubArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // Prefix array
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Second Approch
        // for (int i = 0; i < prefix.length; i++) {
        // System.out.println(prefix[i]);
        // currSum = prefix[i];
        // if (maxSum <= currSum) {
        // maxSum = currSum;
        // }

        // }
        // System.out.println(maxSum);

        // First approch
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum <= currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Max sub array sum " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        MaxSubArray(numbers);
    }
}
