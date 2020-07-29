import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res=new ArrayList<>();
        int low=0,high=array.length-1;
        while(low<high){
            int curSum=array[low]+array[high];
            if(curSum==sum){ //找到一个解
                res.add(array[low]);
                res.add(array[high]);
                break;
            }
            else if(curSum<sum)
                low++;
            else
                high--;
        }
        return res;
    }
}