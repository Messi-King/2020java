public class reOrderArray {
    public  int[] reorder(int[] array) {
        int[] tmpArr = new int[array.length];
        int j = 0;
        for(int i=0;i<array.length;i++) {
            if((array[i]&1)==1) {
                tmpArr[j] = array[i];
                j++;
            }
        }
        for(int i=0;i<array.length;i++) {
            if((array[i]&1)==0) {
                tmpArr[j] = array[i];
                j++;
            }
        }
       return tmpArr;
    }
}