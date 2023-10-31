package day4;

public class MOveAllZeros {
    public static void main(String[] args) {

        int[] array = { 3, 5, 0, 0, 4 };
        int n = 5;
        pushZerosToEnd(array, n);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    static void pushZerosToEnd(int[] arr, int n) {
        int lastNonZeroIdx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, lastNonZeroIdx, i);
                lastNonZeroIdx++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
