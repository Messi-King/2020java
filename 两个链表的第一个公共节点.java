//代码仅供参考
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode pl = headA;
        ListNode ps = headB;
        int lenA = 0;
        while(pl != null) {
            lenA++;
            pl = pl.next;
        }
        int lenB = 0;
        while(ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        for (int i = 0; i < len ; i++) {
            pl = pl.next;
        }
        while(pl != ps && pl != null && ps != null) {
            pl = pl.next;
            ps = ps.next;
        }
        if(pl == ps && pl != null) {
            return pl;
        }
        return null;
    }
}
