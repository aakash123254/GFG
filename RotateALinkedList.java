class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        Node cur = head;
        int kCount=1;
        while(kCount<k && cur!=null){
            cur=cur.next;
            kCount++;
        }
        if(cur==null){
            return head;
        }

        Node kthNode = cur;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=head;
        head=kthNode.next;
        kthNode.next=null;
        return head;
    }
}