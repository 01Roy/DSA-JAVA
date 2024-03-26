public class BinarySearch {
    public static int BinaryFunction(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparesission
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // search right side
                start = mid + 1;
            } else { // search lef side
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 1;
        System.out.println("index for key is " + BinaryFunction(numbers, key));
    }

}
