
//二进制中1的个数

public class Solution {
    public int NumberOf1(int n) {
        int num = 0;
        while (n != 0) {
            n = n & (n - 1);
            num++;
        }
        return num;
    }
}
