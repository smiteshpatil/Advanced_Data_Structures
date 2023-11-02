package day6;

/*
 * You are given an array a, of n elements. Find the minimum index based distance between 
 * two distinct elements of the array, x and y.
 * Return -1, if either x or y does not exist in the array.
 */
public class MinimumDistBetTwoNumbers {
    public static void main(String[] args) {
        int n = 4;
        int[] array = { 1, 2, 3, 2 };
        int x = 1, y = 2;

        int answer = minDist(array, n, x, y);

        System.out.println(answer);
    }

    static int minDist(int a[], int n, int x, int y) {
        // code here
        int ans = Integer.MAX_VALUE;

        int lastX = -1, lastY = -1;

        for (int i = 0; i < n; i++) {

            if (a[i] == x)
                lastX = i;

            if (a[i] == y)
                lastY = i;

            if (lastX != -1 && lastY != -1)
                ans = Math.min(ans, Math.abs(lastY - lastX));
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

}
