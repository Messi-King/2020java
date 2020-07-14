public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int first=getFirstIndex(array,k);
        int last=getlastIndex(array,k);
        if(first==-1 || last==-1)
            return 0;
        return last-first+1;
    }
    //二分查找
    public int getFirstIndex(int[] array,int k){
        int res=-1;
        if(array==null||array.length==0)
            return res;
        int low=0,high=array.length-1;
        while(low<=high){ //要有=
            int mid=low+(high-low)/2;
            if(array[mid]<k)
                low=mid+1;
            else if(array[mid]>k)
                high=mid-1;
            else { //相等
                mid=mid-1;
                if(mid<low || array[mid]!=k)
                    return mid+1;
                else 
                    high=mid;
            }
        }
        return res;
    }
    
    public int getlastIndex(int[] array,int k){
        int res=-1;
        if(array==null||array.length==0)
            return res;
        int low=0,high=array.length-1;
        while(low<=high){ //要有=
            int mid=low+(high-low)/2;
            if(array[mid]<k)
                low=mid+1;
            else if(array[mid]>k)
                high=mid-1;
            else { //相等
                mid=mid+1;
                if(mid>high || array[mid]!=k)
                    return mid-1;
                else 
                    low=mid;
            }
        }
        return res;
    }
}