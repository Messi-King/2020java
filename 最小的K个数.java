import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        //方法一：排序
        //方法二：partition分组
        ArrayList<Integer> res=new ArrayList<>();
        if(input==null || input.length<=0 || k>input.length)
            return res;
        int len=input.length;
        int low=0,high=len-1;
        int index=-1;
        while(low<high && index!=k){
            index=partition(input,low,high);
            if(index>k)
                high=index-1;
            else
                low=index+1;
        }

        for(int i=0;i<k;i++)
            res.add(input[i]);
        return res;
    }
    //划分算法，返回的i左边都比他小，右边都比他大
    public int partition(int[] array,int low,int high){
        int i=low,j=high;
        int temp=array[low];
        
        while(i<j){
            while(i<j && array[j]>=temp)
                j--;
            if(i<j){
                array[i]=array[j];
                i++;
            }
            while(i<j && array[i]<temp)
                i++;
            if(i<j){
                array[j]=array[i];
                j--;
            }
        }
        array[i]=temp;
        return i;
    }
}