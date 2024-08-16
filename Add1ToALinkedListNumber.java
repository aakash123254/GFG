class Solution {
    public Node addOne(Node head) {
        head = reverse(head);
        Node cur = head;
        int carry=1;

        while(carry>0){
            int val = cur.data+carry;
            cur.data = val%10;
            carry=val/10;

            if(cur.next==null)break;
            cur=cur.next;
        }
        if(carry>0){
            cur.next = new Node(1);
        }
        return reverse(head);
    }
    Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node ans=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return ans;
    }
}