
public class sumOfXORofAllPairs {

    public static void main(String[] args) {

        int[] nums = { 5, 9, 7, 6, };
        long sum = sumXOR(nums, 4);
        System.out.println(sum);
    }

    public static long sumXOR(int[] arr, int n) {

        long sum = 0;

        for (int i = 0; i < 32; i++) {
            long one_cnt = 0, zero_cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] % 2 == 0)
                    zero_cnt++;
                else
                    one_cnt++;

                arr[j] /= 2;
            }
            sum += (zero_cnt * one_cnt) * (1 << i);
        }
        return sum;
    }
}