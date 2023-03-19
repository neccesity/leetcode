//<p>Given an array of <code>n</code> integers <code>nums</code>, a <strong>132 pattern</strong> is a subsequence of three integers <code>nums[i]</code>, <code>nums[j]</code> and <code>nums[k]</code> such that <code>i &lt; j &lt; k</code> and <code>nums[i] &lt; nums[k] &lt; nums[j]</code>.</p>
//
//<p>Return <code>true</code><em> if there is a <strong>132 pattern</strong> in </em><code>nums</code><em>, otherwise, return </em><code>false</code><em>.</em></p>
//
//<p>&nbsp;</p> 
//<p><strong class="example">Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [1,2,3,4]
//<strong>Output:</strong> false
//<strong>Explanation:</strong> There is no 132 pattern in the sequence.
//</pre>
//
//<p><strong class="example">Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [3,1,4,2]
//<strong>Output:</strong> true
//<strong>Explanation:</strong> There is a 132 pattern in the sequence: [1, 4, 2].
//</pre>
//
//<p><strong class="example">Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [-1,3,2,0]
//<strong>Output:</strong> true
//<strong>Explanation:</strong> There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
//</pre>
//
//<p>&nbsp;</p> 
//<p><strong>Constraints:</strong></p>
//
//<ul> 
// <li><code>n == nums.length</code></li> 
// <li><code>1 &lt;= n &lt;= 2 * 10<sup>5</sup></code></li> 
// <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>栈</li><li>数组</li><li>二分查找</li><li>有序集合</li><li>单调栈</li></div></div><br><div><li>👍 717</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 132 Pattern
 * @author zhangjunhui1999
 */
public class P456_One32Pattern{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P456_One32Pattern().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int findLeft(int[] nums, int l[], int index) {
		if (l[index] != 0) return findLeft(nums, l, l[index]);
		return nums[index];
	}
	public int findRight(int[] nums, int r[], int rr[], int index, int value) {
		if (value >= rr[index]) return nums[index];
		return findRight(nums, r, rr, rr[index], value);
	}
    public boolean find132pattern(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int l[] = new int[200005];
		int r[] = new int[200005];
		int rr[] = new int[200005];
    	for (int i = 0; i < nums.length; i++) {
			while (!stack.isEmpty() && nums[i]<nums[stack.peek()-1]) {
				r[stack.pop()] = i+1;
			}
			stack.push(i+1);
		}
    	stack.clear();
    	for (int i = nums.length - 1; i >= 0; i--) {
    		while (!stack.isEmpty() && nums[i]<nums[stack.peek()-1]) {
    			l[stack.pop()] = i+1;
			}
    		stack.push(i+1);
		}
		for (int i = 0; i < nums.length; i++) {
			while (!stack.isEmpty() && nums[i]>nums[stack.peek()-1]) {
				rr[stack.pop()] = i+1;
			}
			stack.push(i+1);
		}
		int left, right;
    	for (int i = 0; i < nums.length; i++) {
			left = findLeft(nums, l, i);
			right = findRight(nums, r, rr, r[i], nums[i]);
    		if (left!=0 && right!=0 && left<right) return true;
		}
    	return false;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
