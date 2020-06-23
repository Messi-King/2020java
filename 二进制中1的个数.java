public class oneOfBinary {
    //1、
    public static int One(int n) {
        int flag = 1;
        int count = 0;
        while(flag != 0) {
            if((flag&n) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    //2、
    public static int One2(int n) {
        int count = 0;
        while(n != 0) {
            n = n&(n-1);
            count++;
        }
        return count;
    }
}