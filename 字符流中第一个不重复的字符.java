public class Solution {
    /*
    思路：用hashmap保存每个字符出现的次数 或者 用长度为256的数组代替哈希表
    还有一种是使用indexof和lastIndexof
    */
    String str="";
    int[] charToCount=new int[256]; //256个字符
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        str+=ch;
        charToCount[ch]+=1;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(charToCount[c]==1)
                return c;
        }
        return '#';
    }
}