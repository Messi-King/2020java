public class Solution {
    /*
        思路：表示数字的字符串遵循模式：A[.[B]][e|EC]或者.B[e|EC]
        A为整数部分，B为小数部分，C为指数部分
        开头可能有正负号
        两种方法：逐位判断、正则表达式
     */
    public boolean isNumeric(char[] str) {
        //方法一：逐位判断
        if(str==null)
            return false;
        boolean sign=false,decimal=false,hasE=false; //标记符号、小数点、指数符号E是否出现过
        for(int i=0;i<str.length;i++){
            if(str[i]=='e'||str[i]=='E'){ //有E或者e出现
                if(i==str.length-1) //E不能是最后一位，后面必须跟指数
                    return false;
                if(hasE) return false; //E只能出现一次
                hasE=true;
            }else if(str[i]=='.'){
                if(hasE||decimal) //指数不能有.小数点只能出现一次 
                    return false;
                decimal=true;
            }else if(str[i]=='+'||str[i]=='-'){
                //第一次出现，开头或者e之后
                if(!sign && i!=0 && str[i-1]!='e' && str[i-1]!='E') //不在开头也不在e之后
                    return false;
                //第二次出现，E之后
                if(sign && str[i-1]!='E' && str[i-1]!='e')
                    return false;
                sign=true;
            }else if(str[i]>'9'||str[i]<'0') //不合法字符
                return false;
        }
        return true;
    }