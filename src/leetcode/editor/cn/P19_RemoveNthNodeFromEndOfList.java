//<p>Given the <code>head</code> of a linked list, remove the <code>n<sup>th</sup></code> node from the end of the list and return its head.</p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg" style="width: 542px; height: 222px;" /> 
//<pre>
//<strong>Input:</strong> head = [1,2,3,4,5], n = 2
//<strong>Output:</strong> [1,2,3,5]
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> head = [1], n = 1
//<strong>Output:</strong> []
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> head = [1,2], n = 1
//<strong>Output:</strong> [1]
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li>The number of nodes in the list is <code>sz</code>.</li> 
// <li><code>1 &lt;= sz &lt;= 30</code></li> 
// <li><code>0 &lt;= Node.val &lt;= 100</code></li> 
// <li><code>1 &lt;= n &lt;= sz</code></li> 
//</ul>
//
//<p>&nbsp;</p> 
//<p><strong>Follow up:</strong> Could you do this in one pass?</p>
//
//<div><div>Related Topics</div><div><li>链表</li><li>双指针</li></div></div><br><div><li>👍 2512</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.List;

/**
 * Remove Nth Node From End of List
 * @author zhangjunhui1999
 */
public class P19_RemoveNthNodeFromEndOfList{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P19_RemoveNthNodeFromEndOfList().new Solution();
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
    /*
    @Solution1:(slower)
    public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode currentNode=head;
		ListNode nextNode=new ListNode();
		ListNode preNode=null;
		while(currentNode!=null) {
			nextNode=currentNode.next;
			currentNode.next=preNode;
			preNode=currentNode;
			currentNode=nextNode;
		}
		head=preNode;
		currentNode=head;
		preNode=null;
		while(currentNode!=null) {
			if(n==1) {
				if(currentNode==head) {
					head=currentNode.next;
					break;
				} else {
					preNode.next=currentNode.next;
					break;
				}
			}
			n--;
			preNode=currentNode;
			currentNode=currentNode.next;
		}
		currentNode=head;
		preNode=null;
		while(currentNode!=null) {
			nextNode=currentNode.next;
			currentNode.next=preNode;
			preNode=currentNode;
			currentNode=nextNode;
		}
		head=preNode;
		return head;
    }
    */
	/*
	@Solution2:(faster)
	*/
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummyNode = new ListNode();
		dummyNode.next = head;
		ListNode slowPointer = dummyNode;
		ListNode fastPointer = head;
		for(int i=0;i<n;i++) fastPointer=fastPointer.next;
		while(fastPointer!=null) {
			fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
		}
		slowPointer.next=slowPointer.next.next;
		head=dummyNode.next;
		return head;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
