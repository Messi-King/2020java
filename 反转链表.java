
public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode first=null; 
        ListNode second=head;
        ListNode third=head.next;
        while(third!=null){ 
            second.next=first; //三指针之间的变换
            first=second;
            second=third;
            third=third.next;
        }
        second.next=first;
        return second;
    }