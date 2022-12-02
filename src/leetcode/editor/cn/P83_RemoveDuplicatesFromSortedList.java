//<p>给定一个已排序的链表的头
// <meta charset="UTF-8" />&nbsp;<code>head</code>&nbsp;，&nbsp;<em>删除所有重复的元素，使每个元素只出现一次</em>&nbsp;。返回 <em>已排序的链表</em>&nbsp;。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/01/04/list1.jpg" style="height: 160px; width: 200px;" /> 
//<pre>
//<strong>输入：</strong>head = [1,1,2]
//<strong>输出：</strong>[1,2]
//</pre>
//
//<p><strong>示例 2：</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2021/01/04/list2.jpg" style="height: 123px; width: 300px;" /> 
//<pre>
//<strong>输入：</strong>head = [1,1,2,3,3]
//<strong>输出：</strong>[1,2,3]
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li>链表中节点数目在范围 <code>[0, 300]</code> 内</li> 
// <li><code>-100 &lt;= Node.val &lt;= 100</code></li> 
// <li>题目数据保证链表已经按升序 <strong>排列</strong></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>链表</li></div></div><br><div><li>👍 897</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 删除排序链表中的重复元素
 * @author zhangjunhui1999
 */
public class P83_RemoveDuplicatesFromSortedList{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P83_RemoveDuplicatesFromSortedList().new Solution();
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
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return head;
		ListNode currentNode = head;
		while (currentNode != null && currentNode.next != null) {
			if (currentNode.val == currentNode.next.val) {
				currentNode.next = currentNode.next.next;
			} else {
				currentNode = currentNode.next;
			}
		}
		return head;
	}
}
/*class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
		Set<Integer> set = new TreeSet<Integer>();
    	if (head == null) return head;
		while (head != null) {
			set.add(head.val);
			head = head.next;
		}
		int nums[] = new int[303],cnt = 0;
    	//ListNode newNode = new ListNode(iterator);
    	for (Integer num : set) {
			nums[cnt++] = num;
		}
    	ListNode headNode = new ListNode();
		ListNode currentNode = new ListNode(nums[0]);
    	headNode = currentNode;
		for (int i = 1; i < cnt; i++) {
    		currentNode.next = new ListNode(nums[i]);
			currentNode = currentNode.next;
    	}
    	return headNode;
    }
}*/
//leetcode submit region end(Prohibit modification and deletion)

}
