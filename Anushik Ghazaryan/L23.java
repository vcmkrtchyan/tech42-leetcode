/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int[] arr = new int[20001];
        ListNode root = new ListNode();
        ListNode res = root;

        for(ListNode i : lists) {
            while(i != null) {
                arr[i.val+10000]++;
                i = i.next;
            }
        }

        for(int i = 0; i < 20001; i++) {
            while(arr[i] > 0) {
                res.next = new ListNode();
                res = res.next;
                res.val = i - 10000;
                arr[i]--;
            }

        }

        return root.next;
    }
}