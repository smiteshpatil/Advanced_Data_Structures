package day2;

public class RemoveSpecifiedElements {

    public static void main(String[] args) {

        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        // number of elements not equal to val
        int k = removeElement(nums, val);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int removeElement(int[] nums, int val) {

        int i = 0, j = nums.length - 1, k = 0;

        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] == val)
                    j--;
                else {
                    nums[i] = nums[i] ^ nums[j];
                    nums[j] = nums[i] ^ nums[j];
                    nums[i] = nums[i] ^ nums[j];
                }
            } else {
                i++;
                k++;
            }
        }
        return k;
    }

}
