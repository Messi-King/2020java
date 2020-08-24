在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。

public ListNode deleteDuplicates(ListNode head) {
      ListNode cur = head;
      ListNode newHead = new ListNode(-1);
      ListNode tmp = newHead;
           while(cur != null) {
               if(cur.next != null && cur.val == cur.next.val) {
                   while(cur.next != null && cur.val == cur.next.val) {
                       cur = cur.next;
                   }
                   cur = cur.next;
               }else {
                   tmp.next = cur;
                   tmp = tmp.next;
                   cur = cur.next;
               }
           }
           tmp.next = null;
           return newHead.next;
    }
