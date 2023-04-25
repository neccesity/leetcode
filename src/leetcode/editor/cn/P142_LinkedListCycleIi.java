//<p>Given the <code>head</code> of a linked list, return <em>the node where the cycle begins. If there is no cycle, return </em><code>null</code>.</p>
//
//<p>There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the <code>next</code> pointer. Internally, <code>pos</code> is used to denote the index of the node that tail's <code>next</code> pointer is connected to (<strong>0-indexed</strong>). It is <code>-1</code> if there is no cycle. <strong>Note that</strong> <code>pos</code> <strong>is not passed as a parameter</strong>.</p>
//
//<p><strong>Do not modify</strong> the linked list.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png" style="height: 145px; width: 450px;" /> 
//<pre>
//<strong>Input:</strong> head = [3,2,0,-4], pos = 1
//<strong>Output:</strong> tail connects to node index 1
//<strong>Explanation:</strong> There is a cycle in the linked list, where tail connects to the second node.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png" style="height: 105px; width: 201px;" /> 
//<pre>
//<strong>Input:</strong> head = [1,2], pos = 0
//<strong>Output:</strong> tail connects to node index 0
//<strong>Explanation:</strong> There is a cycle in the linked list, where tail connects to the first node.
//</pre>
//
//<p><strong class="example">Example 3:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png" style="height: 65px; width: 65px;" /> 
//<pre>
//<strong>Input:</strong> head = [1], pos = -1
//<strong>Output:</strong> no cycle
//<strong>Explanation:</strong> There is no cycle in the linked list.
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li>The number of the nodes in the list is in the range <code>[0, 10<sup>4</sup>]</code>.</li> 
// <li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li> 
// <li><code>pos</code> is <code>-1</code> or a <strong>valid index</strong> in the linked-list.</li> 
//</ul>
//
//<p>&nbsp;</p> 
//<p><strong>Follow up:</strong> Can you solve it using <code>O(1)</code> (i.e. constant) memory?</p>
//
//<div><div>Related Topics</div><div><li>哈希表</li><li>链表</li><li>双指针</li></div></div><br><div><li>👍 2088</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Linked List Cycle II
 * @author zhangjunhui1999
 */
public class P142_LinkedListCycleIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P142_LinkedListCycleIi().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
		ListNode fastPointer=head;
		ListNode slowPointer=head;
		while(fastPointer!=null) {
			fastPointer=fastPointer.next;
			if(fastPointer==null) break;
			slowPointer=slowPointer.next;
			fastPointer=fastPointer.next;
		}
		if(fastPointer==slowPointer) return true;
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
