class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null && fast.next != slow){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null && fast.next == slow){
            int len = 1;
            while(slow != fast){
                slow = slow.next;
                ++len;
            }
            return len;
        }

        return 0;
    }
}