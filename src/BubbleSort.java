public class BubbleSort {
    // PRINT THE ARRAY
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // BUBBLE SORT
    public static void BubleSortAlgo(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tem;
                }
            }
        }

    }

    // SELECTION SORT
    public static void SelctionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    // iNSERTION SORT
    public static void InterstionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    // COUNTING SORT
    public static void CountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // finding largest value
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // auxilary array to store the frequnecy of the elements
        int count[] = new int[largest + 1];

        // frequency count
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // BubleSortAlgo(arr);
        // SelctionSort(arr);
        // InterstionSort(arr);
        CountingSort(arr);
        PrintArr(arr);

    }
}
