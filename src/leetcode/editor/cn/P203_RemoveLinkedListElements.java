//<p>Given the <code>head</code> of a linked list and an integer <code>val</code>, remove all the nodes of the linked list that has <code>Node.val == val</code>, and return <em>the new head</em>.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg" style="width: 500px; height: 142px;" /> 
//<pre>
//<strong>Input:</strong> head = [1,2,6,3,4,5,6], val = 6
//<strong>Output:</strong> [1,2,3,4,5]
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> head = [], val = 1
//<strong>Output:</strong> []
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> head = [7,7,7,7], val = 7
//<strong>Output:</strong> []
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li>The number of nodes in the list is in the range <code>[0, 10<sup>4</sup>]</code>.</li> 
// <li><code>1 &lt;= Node.val &lt;= 50</code></li> 
// <li><code>0 &lt;= val &lt;= 50</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>递归</li><li>链表</li></div></div><br><div><li>👍 1233</li><li>👎 0</li></div>

package leetcode.editor.cn;

import org.w3c.dom.Node;

/**
 * Remove Linked List Elements
 * @author zhangjunhui1999
 */
public class P203_RemoveLinkedListElements{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P203_RemoveLinkedListElements().new Solution();
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
    public ListNode removeElements(ListNode head, int val) {
		ListNode currentNode = head;
		ListNode preNode = new ListNode();
		preNode.next = head;
    	while(currentNode!=null) {
    		if(currentNode.val==val) {
    			if(currentNode==head) head=currentNode.next;
    			preNode.next=currentNode.next;
			} else {
    			preNode=currentNode;
			}
    		currentNode=currentNode.next;
		}
    	return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
