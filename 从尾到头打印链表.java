//利用栈：先进后出
import java.util.*;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         ArrayList<Integer> list=new ArrayList<>();
        if(listNode==null)
            return list;
        Stack<ListNode> stack=new Stack<>();
        while(listNode!=null){  
            stack.push(listNode);
            listNode=listNode.next;
        }
        while(!stack.isEmpty()){ 
            list.add(stack.pop().val);
        }
        return list;
    }
}