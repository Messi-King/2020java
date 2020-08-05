public class Solution {
    public int GetUglyNumber_Solution(int index) {
        /*思路：两种方法：
        （1）依次判断丑数只包含质因子2,3,5，连续除以2，连续处于3，连续除以5，最终得到1说明是丑数
        （2）空间换时间，丑数应该是另外一个丑数乘以2,3,5的结果，因此用一个数组保存排好序的丑数，依次计算下一个丑数 */
        if(index<1)
            return 0;
        int[] pUglyNumbers=new int[index]; //依次保存第n个丑数
        pUglyNumbers[0]=1; //第一个丑数是1
        int pMultiply2=0,pMultiply3=0,pMultiply5=0;
        
        for(int i=1;i<index;i++){
            int min=getMin(pUglyNumbers[pMultiply2]*2,pUglyNumbers[pMultiply3]*3,
                           pUglyNumbers[pMultiply5]*5);
            pUglyNumbers[i]=min;
            while(pUglyNumbers[pMultiply2]*2<=min)
                pMultiply2++;
            while(pUglyNumbers[pMultiply3]*3<=min)
                pMultiply3++;
            while(pUglyNumbers[pMultiply5]*5<=min)
                pMultiply5++;
        }
        return pUglyNumbers[index-1];
    }
    public int getMin(int a,int b,int c){
        int min=a>b?b:a;
        return c<min?c:min;
    }
}