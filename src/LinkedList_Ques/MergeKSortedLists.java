package LinkedList_Ques;

public class MergeKSortedLists {
    //Merge One by one Appraoch
    // Time Complexity 0(kN) -> k number of lists O(1) space complexity
    static ListNode head;
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeList(ListNode l1, ListNode l2){
        ListNode ans = new ListNode(-1);
        ListNode l3 = ans;
        //Merge the lists
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                l3.next = l1;
                l1 = l1.next;
            }else{
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if(l1 != null){
            l3.next = l1;
        }else{
            l3.next = l2;
        }
        return ans.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        ListNode merged = mergeList(lists[0],lists[1]);
        for(int i = 2; i < lists.length; ++i){
            merged = mergeList(merged,lists[i]);
        }
        return merged;
    }
}
