import java.util.List;

public class AddTwoNumbers {
    //You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

    //You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    //        Example

    //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    //Output: 7 -> 0 -> 8
    //Explanation: 342 + 465 = 807.

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */




    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode l = new ListNode(0);
        ListNode res = l;
        int sum=0;
        while (l1!=null&l2!=null){
            sum = l1.val+l2.val+carry;
            carry = (sum>=10)?1:0;
            l.next = new ListNode(sum%10);
            l = l.next;
            l1=l1.next;
            l2=l2.next;

        }

        while (l1==null&&l2!=null){
            sum = l2.val+carry;
            carry = (sum>=10)?1:0;
            l.next = new ListNode(sum%10);
            l = l.next;
            l2=l2.next;
        }

        while (l1!=null && l2==null){
            sum = l1.val+carry;
            carry = (sum>=10)?1:0;
            l.next = new ListNode(sum%10);
            l = l.next;
            l1=l1.next;
        }

        while (l1==null && l2 ==null && carry ==1){
            sum = 1;
            l.next = new ListNode(1);
            carry = (sum>=10)?1:0;
            l = l.next;


        }
        return res.next;

    }


    public static void main (String[] args){
        ListNode l1 = new ListNode(5);
        //l1.next =new ListNode(4);
        //l1.next.next =new ListNode(3);


        ListNode l2 = new ListNode(5);
        //l2.next =new ListNode(6);
        //l2.next.next =new ListNode(4);

        AddTwoNumbers a = new AddTwoNumbers();
        ListNode l = a.addTwoNumbers(l1, l2);

        while (l!=null){
            System.out.println(l.val);
            l=l.next;
        }



    }





}
