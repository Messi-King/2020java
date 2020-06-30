//连续子数组的最大和
public class FindGreatestSumOfSubArray {
    public  int maxSum(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int total = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (total >= 0) {
                total += array[i];
            } else {
                total = array[i];
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }
}