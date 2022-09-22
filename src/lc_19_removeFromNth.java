public class lc_19_removeFromNth {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {


        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        current = head;

        if (n == length) {
            head = head.next;
            return head;
        }
        if (length == 3 && n == 3) {
            int len = length;
            len = len - n;
            head = head.next;
            return head;
        }

        length = length - n;
        for (int i = 1; i <= length - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;

    }
}