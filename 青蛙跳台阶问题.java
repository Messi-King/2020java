//递归
public static int floor(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        return floor(n-1) + floor(n-2);
    }
//非递归
    public static int floor2(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for(int i=0;i<n;i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f1;
    }