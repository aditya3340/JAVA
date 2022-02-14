package LeetCode;
//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumber {
    class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }
        public ListNode(int val) {
           this.val = val;
        }
        public ListNode(int val, ListNode next) {
           this.val = val;
           this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // For new LL
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0; //ternary operator
            int y = (q != null) ? q.val : 0;

            int sum = x + y + carry;

            carry = sum/10;  //To check whether the carry is 1 or 0
            //carry cant be greater than 1 because it is given in the question that number is from 0 to 9
            //So if we consider the highest number then the sum will be 9 + 9 + 1 = 19 which gives us remainder of 1


            curr.next = new ListNode(sum%10); //To store the last digit of sum to new LL
            curr = curr.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;

        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
