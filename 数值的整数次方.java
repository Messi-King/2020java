public class Main {
    public  double Power(double n,int x) {
        if(x == 0)
            return 1;
        if(x == 1)
            return n;
        if(x == -1)
            return 1.0/n;
        double half = Power(n,x/2);
        return half*half*Power(n,x%2);
    }
}