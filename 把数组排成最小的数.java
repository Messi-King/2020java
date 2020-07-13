import java.util.*;

public class Solution {
    class compareStr implements Comparator<String>{
        @Override
        public int compare(String m,String n) {
            String mn=m+n,nm=n+m;
            return mn.compareTo(nm);  //mn小于nm返回-1，等于返回0，大于返回1
        }
    }
    
    public String PrintMinNumber(int [] numbers) {
        String result="";
        if(numbers==null||numbers.length<=0)
            return result;
        int len=numbers.length;
        String[] str=new String[len];
        for(int i=0;i<len;i++)
            str[i]=String.valueOf(numbers[i]);
        compareStr c=new compareStr();
        Arrays.sort(str,c);
        
        for(String s:str)
            result += s;
        return result;
    }
}