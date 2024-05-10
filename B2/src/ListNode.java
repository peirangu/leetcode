import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
      public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode node = new ListNode(0);
            ListNode firstNode = new ListNode(0);
           char[] num = (getNumber(l1).add(getNumber(l2))).toString().toCharArray();
           for (int i=0;i<num.length;i++){
                 if (i==0){
                       node.val = Character.digit(num[num.length-1],10);
                       firstNode = node;
                 }
                 else {
                       node.next = new ListNode(Character.digit(num[num.length-1-i],10));
                       node = node.next;
                 }
           }
           return firstNode;

      }

      private BigInteger getNumber(ListNode node){
            BigInteger i= BigInteger.valueOf(1);
            BigInteger num= BigInteger.valueOf(0);
            ListNode node1 = node;
            while (node1 !=null){
                  num = BigInteger.valueOf(node1.val).multiply(i).add(num);
                  node1 = node1.next;
                  i=i.multiply(BigInteger.valueOf(10));
            };
            return num;
      }
}
