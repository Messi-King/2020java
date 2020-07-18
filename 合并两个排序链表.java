public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        //新建一个头节点，用来存合并的链表。
        ListNode newList = new ListNode(-1);
        ListNode temp = newList;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;

            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }

        }
        //把未结束的链表连接到合并后的链表尾部
        if (list1 != null) {
            temp.next = list1;
        }
        if (list2 != null) {
            temp.next = list2;
        }
        return newList.next;
    }