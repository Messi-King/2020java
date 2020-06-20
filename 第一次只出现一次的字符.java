import java.util.HashMap;
public class FirstNotRepeatingChar {
1、
    public static int Num(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for (int i = 0; i < s.length() ; i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }


2、
    public static char Nums(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(map.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }

3、
    public static int Num2(String s) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c))
                return i;
        }
        return -1;
    }
}