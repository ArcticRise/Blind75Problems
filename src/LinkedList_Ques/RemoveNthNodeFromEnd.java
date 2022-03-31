package LinkedList_Ques;

public class RemoveNthNodeFromEnd {
    static ListNode head;
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode rev = head;
        ListNode temp = rev;
        ListNode temp2 = rev;
        for(int i = 0; i < n; ++i){
            temp = temp.next;
        }
        if(temp == null){
            head = head.next;
            return head;
        }
        while(temp.next != null){
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return rev;
    }

    void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
    public static void main(String[] args){
        RemoveNthNodeFromEnd list = new RemoveNthNodeFromEnd();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        list.printList(head);
        System.out.println(" ");
        list.printList(removeNthFromEnd(head,2));
    }
}
