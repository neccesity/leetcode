//<p>Given the <code>head</code> of a singly linked list, reverse the list, and return <em>the reversed list</em>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex1.jpg" style="width: 542px; height: 222px;" /> 
//<pre>
//<strong>Input:</strong> head = [1,2,3,4,5]
//<strong>Output:</strong> [5,4,3,2,1]
//</pre>
//
//<p><strong class="example">Example 2:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex2.jpg" style="width: 182px; height: 222px;" /> 
//<pre>
//<strong>Input:</strong> head = [1,2]
//<strong>Output:</strong> [2,1]
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> head = []
//<strong>Output:</strong> []
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li>The number of nodes in the list is the range <code>[0, 5000]</code>.</li> 
// <li><code>-5000 &lt;= Node.val &lt;= 5000</code></li> 
//</ul>
//
//<p>&nbsp;</p> 
//<p><strong>Follow up:</strong> A linked list can be reversed either iteratively or recursively. Could you implement both?</p>
//
//<div><div>Related Topics</div><div><li>递归</li><li>链表</li></div></div><br><div><li>👍 3116</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.List;

/**
 * Reverse Linked List
 * @author zhangjunhui1999
 */
public class P206_ReverseLinkedList{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P206_ReverseLinkedList().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
		ListNode currentNode = head;
		ListNode nextNode = new ListNode();
		ListNode preNode = null;
		while(currentNode!=null) {
			nextNode=currentNode.next;
			currentNode.next=preNode;
			preNode=currentNode;
			currentNode=nextNode;
		}
		head=preNode;
    	return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
