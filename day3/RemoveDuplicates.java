package day3;

public class RemoveDuplicates {
    /*
     * Given an integer array nums sorted in non-decreasing order, remove the
     * duplicates in-place such that each unique element appears only once. The
     * relative order of the elements should be kept the same. Then return the
     * number of unique elements in nums.
     */

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = removeDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[count] = nums[i + 1];
                count++;
            }
        }
        return count;
    }
}
