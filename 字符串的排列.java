import java.util.*;
public class Solution {
    ArrayList<String> res=new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
       if(str==null||str.length()==0)
           return res;
       Permutation(str.toCharArray(),0);
       Collections.sort(res);
       return res;
    }

    public void Permutation(char[] strArr,int begin){
        if(begin==strArr.length-1){
            String s=String.valueOf(strArr);
            if(!res.contains(s))
                res.add(s);
        }else{
            for(int i=begin;i<strArr.length;i++){ //依次将后面的与begin交换
                swap(strArr,begin,i);
                Permutation(strArr,begin+1);
                swap(strArr,begin,i);
            }
        }
    }

    public void swap(char[] strArr,int a,int b){
        char temp=strArr[a];
        strArr[a]=strArr[b];
        strArr[b]=temp;
    }
}