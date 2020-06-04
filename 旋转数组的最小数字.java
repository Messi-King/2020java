public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] > array[high]) {
                low = mid + 1;
                // high = high - 1;可以避免low，high,mid相等的找不到最小值情况。
                // int[] array={1,0,1,1,1};
            } else if (array[mid] == array[high]) {
                high = high - 1;
            } else {
                high = mid;
            }
        }
        return array[low];
    }
}