public class Solution {
    public int StrToInt(String str) {
        if(str==null || str.length()<1)
            return 0;
        boolean isVaild=false; //用来标记是否合法
        char c = str.charAt(0);
        int flag=0;
        //通过首位进行判断，并标记
        if(c=='+') //为正数
            flag=1;
        else if(c=='-') //为负数
            flag=-1;
        else if(c>='0'&&c<='9') { //正数
            flag=1;
            str="+"+str; //便于统一处理
        }else { //不是数
            isVaild=true;
             return 0;
        }
           
        int len= str.length();
        
        //计算后续数字
        if(len>11) //最大整数是10位
            return 0;
        long res=0;
        for(int i=1;i<len;i++){
            c=str.charAt(i);
            if(c<'0'||c>'9'){
                isVaild=true;
                return 0;
            }
               
            res=res*10+(c-48); //计算数值大小
        }
        if(flag==1 && res<=Integer.MAX_VALUE)
            return (int)res;
        if(flag==-1 && (-1*res)>=Integer.MIN_VALUE)
            return (int)(-1*res);
        isVaild=true;
        return 0;
    }        
}