package day8;

import java.util.Scanner;

/**
 * Given a sorted array containing only 0s and 1s, find the transition point,
 * i.e., the first index where 1 was observed, and before that, only 0 was
 * observed.
 */
public class FindTransitionPoint {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter number " + (i + 1) + ":");
                arr[i] = sc.nextInt();
            }

            int answer = transitionPoint(arr, size);
            System.out.println(answer);
        }

    }

    static int transitionPoint(int arr[], int n) {

        int low = 0, high = n - 1, mid = 0;

        int answer = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == 0) {
                low = mid + 1;
            } else if (arr[mid] == 1) {
                answer = mid;
                high = mid - 1;
            }
        }
        if (answer != -1)
            return answer;
        return -1;
    }

}