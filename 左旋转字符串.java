public class Main {
    public String reverseLeftWords(String str, int n) {
        if(str == null || str.length() == 0) {
            return str;
        }
        int len = str.length();
        char[] Arr = str.toCharArray();
        reserves(Arr,0,n-1);
        reserves(Arr,n,len-1);
        reserves(Arr,0,len-1);
        return String.valueOf(Arr);
    }
    public void reserves(char[] Arr,int i,int j) {
        while(i < j) {
            char tmp = Arr[i];
            Arr[i] = Arr[j];
            Arr[j] = tmp;
            i++;
            j--;
        }
    }
}