//旋转数组中最小的数字
public class minNumberInRotateArray {
    public static int minArray(int[] array) {
        if(array.length == 0){
            return 0;
        }
        for (int i = 0; i < array.length-1 ; i++) {
            if(array[i] > array[i+1]) {
                return array[i+1];
            }
        }
        return array[0];
    }