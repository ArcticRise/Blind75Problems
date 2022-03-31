package LinkedList_Ques;

public class ReverseLinkedList {
    static ListNode head;
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode cur = null;
        while(temp != null){
            ListNode curNode = temp.next;
            temp.next = cur;
            cur = temp;
            temp = curNode;
        }
        return cur;
    }
    void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
    public static void main(String[] args){
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        list.printList(head);
        System.out.println(" ");
        list.printList(reverseList(head));
    }
}
