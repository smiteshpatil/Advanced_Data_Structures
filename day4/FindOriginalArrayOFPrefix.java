package day4;

/**
 * You are given an integer array pref of size n. Find and return the array arr
 * of size n that satisfies:
 * 
 * pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
 * Note that ^ denotes the bitwise-xor operation.
 */
public class FindOriginalArrayOFPrefix {
    public static void main(String[] args) {
        int[] pref = { 5, 2, 0, 3, 1 };

        int[] array = findArray(pref);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] findArray(int[] pref) {

        int[] arr = new int[pref.length];

        arr[0] = pref[0];

        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }
        return arr;
    }
}