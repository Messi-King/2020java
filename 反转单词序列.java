public class Solution {
    public String ReverseSentence(String str) {
        // 注意trim
        if (str == null || str.trim().length() == 0)
            return str;
        String[] strs = str.split(" ");
        // 借用StringBuffer，从后往前append
        StringBuffer sb = new StringBuffer();
        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i]);
            if (i > 0)
                sb.append(" ");
        }
        return sb.toString();
    }
}