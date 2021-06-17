public class L23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int [] arr = new int[20001];
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while(temp != null){
                arr[temp.val + 10000]++;
                temp = temp.next;
            }
        }
        ListNode root = new ListNode();
        ListNode p = root;
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]-- != 0) {
                p.next = new ListNode();
                p = p.next;
                p.val = i - 10000;
            }
        }
        return root.next;
    }
}