public class Solution {
    /*
        思路：用位运算代替加法
        三步走：第一步：不考虑进位加 第二位：考虑进位 第三步：原结果加上进位
    */
    public int Add(int num1,int num2) {
        //非递归实现
        int sum=0,carry=1;
        while(carry!=0){ //进位不等于0就循环加
            sum=num1^num2;
            carry=(num1&num2)<<1;
            num1=sum;
            num2=carry;
        }
        return num1;
    }
    public int Add(int num1,int num2) {
        //递归实现
        if(num2==0)
            return num1;
        int sum=num1^num2;
        int carry=(num1&num2)<<1;
        return Add(sum,carry);
    }
}