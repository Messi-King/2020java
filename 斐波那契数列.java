public class Solution {
    public int Fibonacci(int n) {
        //递归
         if(n == 1 || n == 2) {
            return 1;
        }else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
       //迭代法
        /*if(n == 1 || n == 2) {
            return 1;
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

class Solution {
   public int fib(int n) {
    int constant = 1000000007;
    int f1 = 0;
    int f2 = 1;
    for(int i=0;i<n;i++) {
        int f3 = f1 + f2;
        f1 = f2 % constant;
        f2 = f3 % constant;
    }
    return f1;
}
}