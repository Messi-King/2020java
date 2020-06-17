/**
*变态跳台阶
*/
//非递归
   public static int Floor(int n) {
        if(n == 0) {
           return 0;
       }
       if(n == 1) {
           return 1;
       }
       int ret = 1;
       for (int i = 2; i <= n ; i++) {
           ret = ret*2;
       }
       return ret;
   }
   //递归
   public static int Floor1(int n) {
       if(n == 0) {
           return 0;
       }else if(n == 1) {
           return 1;
       }else {
           return 2*Floor1(n-1);
       }
   }