package tasks.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeToSortedList {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3, new ListNode(4)));
        System.out.println(solution.mergeTwoLists(list1,list2));
    }

    public static class ListNode {
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

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    list1.next = mergeTwoLists(list1.next, list2);
                    return list1;
                } else {
                    list2.next = mergeTwoLists(list1, list2.next);
                    return list2;
                }
            }
            if (list1 == null)
                return list2;
            return list1;
        }
    }
}
