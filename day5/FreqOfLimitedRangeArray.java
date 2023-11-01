/*
 Given an array arr[] of N positive integers which can contain integers from 1 to P 
 where elements can be repeated or can be absent from the array. Your task is to count 
 the frequency of all numbers from 1 to N. Make in-place changes in arr[], such that arr[i] = frequency(i).
  Assume 1-based indexing.
 */

import java.util.HashMap;

public class FreqOfLimitedRangeArray {

    public static void main(String[] args) {

        int N = 5, P = 5;
        int[] array = { 2, 3, 2, 3, 5 };

        frequencyCount(array, N, P);

    }

    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (int j = 1; j <= N; j++) {
            arr[j - 1] = map.get(j) == null ? 0 : map.get(j);
        }
    }
}
