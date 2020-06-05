public class Solution {
    public int Fibonacci(int n) {
        //递归
         if(n == 1 || n == 2) {
            return n;
        }else {
            return Fibonacci(n-1) + floor(n-2);
        }
       //迭代法
        /*if(n == 1 || n == 2) {
            return n;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;
        for (int i = 3; i <= n ; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;*/
    }
}