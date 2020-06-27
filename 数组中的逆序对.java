//数组中的逆序对
public class test2 {
    public static int count(int[] A) {
        if(A == null || A.length == 0) {
            return 0;
        }
        return mergeSortRecursion(A,0,A.length-1);
    }
    public static int mergeSortRecursion(int[] array,int left,int right) {
        if(left == right) {
            return 0;
        }
        int mid = (right + left)/2;

        return mergeSortRecursion(array,left,mid)+mergeSortRecursion(array,mid+1,right)
                +merge(array,left,mid,right);
    }

    public static int merge(int[] array,int left,int mid,int right) {
        int s1 = left;
        int s2 = mid+1;
        int n = 0;
        int[] tmpArr = new int[right-left+1];
        int k = 0;//数组tmp的下标
        //代表两个段都有数据
        while(s1 <= mid && s2 <= right) {
            if(array[s1] <= array[s2]) {
                tmpArr[k++] = array[s1++];
            }else {
                n += (mid - s1 + 1);//累加逆序对
                tmpArr[k++] = array[s2++];
            }
        }
        //第一个归并段还有若干个数据
        while(s1 <=  mid) {
            tmpArr[k++] = array[s1++];
        }
        while(s2 <=  right) {
            tmpArr[k++] = array[s2++];
        }
        //tmpArr中存放的就是这次归并的有序之后的结果
        for (int i = 0; i < tmpArr.length ; i++) {
            array[left++] = tmpArr[i];
        }
        return n;
    }
}