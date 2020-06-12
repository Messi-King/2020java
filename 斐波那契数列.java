//斐波那契数列
public class Fibonacci {
    public static int fib1(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib1(n-1) + fib1(n-2);
    }
    public static int fib2(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static int fib3(int n) {
        int f1 = 0;
        int f2 = 1;
        for (int i = 0; i < n ; i++) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f1;
    }
    public static int sumFib(int n) {
      int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum = sum + fib2(i);
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(fib2(5));
        System.out.println(sumFib(5));
    }
}
