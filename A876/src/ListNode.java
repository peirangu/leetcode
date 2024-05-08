import org.w3c.dom.Node;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode middleNode(ListNode head) {
        int nodeNum = 1;
        ListNode current = head;
        while (current.next!=null){
            current = current.next;
            nodeNum++;
        }
        ListNode middleNode = head;
        for (int middle=0;middle<nodeNum/2;middle++){
            middleNode = middleNode.next;
        }
        return middleNode;
    }
}