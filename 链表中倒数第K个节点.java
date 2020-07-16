
public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null)
            return null;
        //思路：快慢指针，快指针先走k步，慢指针从头开始，都向前进，快指针到null时，前一个正好是倒数第k个
        ListNode fast=head,slow=head;
        for(int i=0;i<k;i++){ //快指针先走k步
            if(fast!=null)
                fast=fast.next;
            else
                return null;
        }
        while(fast!=null){ 
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }