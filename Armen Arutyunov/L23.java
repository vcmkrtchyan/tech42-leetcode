class ListNode1 {
    int val;
    ListNode next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class L23a {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        int begin = 0, end = lists.length - 1;
        while (begin < end) {
            int mid = (begin + end - 1) / 2;
            for (int i = 0; i <= mid; i++) {
                lists[i] = merge2list(lists[i], lists[end - i]);
            }
            end = (begin + end) / 2;
        }
        return lists[0];
    }

    public ListNode merge2list(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummy = new ListNode(-1), cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;
        return dummy.next;

    }
}
