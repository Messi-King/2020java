import java.util.LinkedHashMap;
public class Solution {
    // 使用map存储，key为字符，value为出现的次数
    //遍历map，取第一个value为1的key,返回下标
    public int FirstNotRepeatingChar(String str) {
        // 使用 linkedhashmap保持有序
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++)
            if (!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), 1);
            else
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);

        for (int index = 0; index < str.length(); index++)
            if (map.get(str.charAt(index)) == 1)
                return index;

        return -1;
    }
